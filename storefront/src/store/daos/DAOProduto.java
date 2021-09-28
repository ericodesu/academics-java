package store.daos;

import store.common.interfaces.CRUDable;
import store.common.handlers.HandlerConexao;
import store.models.ModelProduto;

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
public class DAOProduto implements CRUDable<ModelProduto> {
    @Override
    public void Inserir(ModelProduto modelo) {
        try {
            String query = "INSERT INTO produtos (descricao,estoque,preco_unitario,id_fornecedor) VALUES (?,?,?,?)";

	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getDescricao());
	    this._stmt.setInt(2, modelo.getEstoque());
            this._stmt.setFloat(3, modelo.getPrecoUnitario());
            this._stmt.setInt(4, modelo.getIdFornecedor());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso!!!");

	    this._stmt.close();
	} catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Alterar(ModelProduto modelo) {
        try {
            String query = "UPDATE produtos SET descricao=?,estoque=?,preco_unitario=?,id_fornecedor=? WHERE id_produto=?";

	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getDescricao());
	    this._stmt.setInt(2, modelo.getEstoque());
            this._stmt.setFloat(3, modelo.getPrecoUnitario());
            this._stmt.setInt(4, modelo.getIdFornecedor());
	    this._stmt.setInt(5, modelo.getIdProduto());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!!!");

	    this._stmt.close();
	} catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Deletar(ModelProduto modelo) {
        try {
            String query = "DELETE FROM produtos WHERE id_produto=?";

            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdProduto());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ModelProduto> Listar() {
        ArrayList<ModelProduto> listaDados = new ArrayList<>();

        try {
            String query = "SELECT * FROM produtos";

	    this._stmt = this._CONEXAO.prepareStatement(query);
	    this._rs = this._stmt.executeQuery();

	    while(this._rs.next()) {
	        ModelProduto modelo = new ModelProduto();

                modelo.setIdProduto(this._rs.getInt("id_produto"));
                modelo.setDescricao(this._rs.getString("descricao"));
                modelo.setEstoque(this._rs.getInt("estoque"));
                modelo.setPrecoUnitario(this._rs.getFloat("preco_unitario"));
                modelo.setIdFornecedor(this._rs.getInt("id_fornecedor"));

                listaDados.add(modelo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaDados;
    }

    final private Connection _CONEXAO = new HandlerConexao().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
