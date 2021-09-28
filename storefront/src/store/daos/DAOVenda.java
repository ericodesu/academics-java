package store.daos;

import store.common.interfaces.CRUDable;
import store.common.handlers.HandlerConexao;
import store.models.ModelVenda;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Erick Frederick
 */
public class DAOVenda implements CRUDable<ModelVenda> {
    @Override
    public void Inserir(ModelVenda modelo) {
        try {
            String query = "INSERT INTO vendas (id_cliente,id_produto,valor_unitario,total) VALUES (?,?,?,?)";

	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdCliente());
	    this._stmt.setInt(2, modelo.getIdProduto());
            this._stmt.setFloat(3, modelo.getValorUnitario());
            this._stmt.setFloat(4, modelo.getTotal());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso!!!");

	    this._stmt.close();
	} catch (SQLException ex) {
            Logger.getLogger(DAOVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Alterar(ModelVenda modelo) {
        try {
            String query = "UPDATE vendas SET id_cliente=?,id_produto=?,valor_unitario=?,total=? WHERE id_venda=?";

	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdCliente());
	    this._stmt.setInt(2, modelo.getIdProduto());
            this._stmt.setFloat(3, modelo.getValorUnitario());
            this._stmt.setFloat(4, modelo.getTotal());
	    this._stmt.setInt(5, modelo.getIdVenda());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!!!");

	    this._stmt.close();
	} catch (SQLException ex) {
            Logger.getLogger(DAOVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Deletar(ModelVenda modelo) {
        try {
            String query = "DELETE FROM vendas WHERE id_venda=?";

            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdVenda());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ModelVenda> Listar() {
        ArrayList<ModelVenda> listaDados = new ArrayList<>();

        try {
            String query = "SELECT * FROM vendas";

	    this._stmt = this._CONEXAO.prepareStatement(query);
	    this._rs = this._stmt.executeQuery();

	    while(this._rs.next()) {
	        ModelVenda modelo = new ModelVenda();

                modelo.setIdVenda(this._rs.getInt("id_venda"));
                modelo.setIdCliente(this._rs.getInt("id_cliente"));
                modelo.setIdProduto(this._rs.getInt("id_produto"));
                modelo.setValorUnitario(this._rs.getFloat("valor_unitario"));
                modelo.setTotal(this._rs.getFloat("total"));

                listaDados.add(modelo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOVenda.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaDados;
    }

    final private Connection _CONEXAO = new HandlerConexao().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
