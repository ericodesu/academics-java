package condominio.daos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import common.handlers.HandlerConexao;
import common.interfaces.CRUDable;
import condominio.models.ModelPedido;

/**
 *
 * @author Erick Frederick
 */
public class DAOPedidos implements CRUDable<ModelPedido> {
    @Override
    public void Inserir(ModelPedido modelo) {
        try {
            String query = "INSERT INTO pedidos (numero_pedido,id_produto,id_cliente,endereco,total,forma_pagamento) VALUES (?,?,?,?,?,?)";

	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getNumeroPedido());
            this._stmt.setInt(2, modelo.getIdProduto());
            this._stmt.setInt(3, modelo.getIdCliente());
            this._stmt.setString(4, modelo.getEndereco());
            this._stmt.setDouble(5, modelo.getTotal());
            this._stmt.setString(6, modelo.getFormaPagamento());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso!!!");

	    this._stmt.close();
	} catch (SQLException ex) {
            Logger.getLogger(DAOPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Alterar(ModelPedido modelo) {
        try {
            String query = "UPDATE pedidos SET numero_pedido=?,id_produto=?,id_cliente=?,endereco=?,total=?,forma_pagamento=? WHERE id_pedido=?";

	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getNumeroPedido());
	    this._stmt.setInt(2, modelo.getIdProduto());
            this._stmt.setInt(3, modelo.getIdCliente());
            this._stmt.setString(4, modelo.getEndereco());
	    this._stmt.setDouble(5, modelo.getTotal());
            this._stmt.setString(6, modelo.getFormaPagamento());
            this._stmt.setInt(7, modelo.getIdPedido());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!!!");

	    this._stmt.close();
	} catch (SQLException ex) {
            Logger.getLogger(DAOPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Deletar(ModelPedido modelo) {
        try {
            String query = "DELETE FROM pedidos WHERE id_pedido=?";

            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdPedido());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ModelPedido> Listar() {
        ArrayList<ModelPedido> listaDados = new ArrayList<>();

        try {
            String query = "SELECT * FROM pedidos";

	    this._stmt = this._CONEXAO.prepareStatement(query);
	    this._rs = this._stmt.executeQuery();

	    while(this._rs.next()) {
	        ModelPedido modelo = new ModelPedido();

                modelo.setIdPedido(this._rs.getInt("id_pedido"));
	        modelo.setNumeroPedido(this._rs.getInt("numero_pedido"));
                modelo.setIdProduto(this._rs.getInt("id_produto"));
                modelo.setIdCliente(this._rs.getInt("id_cliente"));
                modelo.setEndereco(this._rs.getString("endereco"));
                modelo.setTotal(this._rs.getDouble("total"));
                modelo.setFormaPagamento(this._rs.getString("forma_pagamento"));

                listaDados.add(modelo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaDados;
    }

    final private Connection _CONEXAO = new HandlerConexao().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
