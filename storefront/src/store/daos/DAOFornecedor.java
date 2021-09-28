package store.daos;

import store.common.interfaces.CRUDable;
import store.common.handlers.HandlerConexao;
import store.models.ModelFornecedor;

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
public class DAOFornecedor implements CRUDable<ModelFornecedor> {
    @Override
    public void Inserir(ModelFornecedor modelo) {
        try {
            String query = "INSERT INTO fornecedores (nome,cnpj,telefone,email) VALUES (?,?,?,?)";

	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getNome());
	    this._stmt.setString(2, modelo.getCnpj());
            this._stmt.setString(3, modelo.getTelefone());
            this._stmt.setString(4, modelo.getEmail());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso!!!");

	    this._stmt.close();
	} catch (SQLException ex) {
            Logger.getLogger(DAOFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Alterar(ModelFornecedor modelo) {
        try {
            String query = "UPDATE fornecedores SET nome=?,cnpj=?,telefone=?,email=? WHERE id_fornecedor=?";

	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getNome());
	    this._stmt.setString(2, modelo.getCnpj());
            this._stmt.setString(3, modelo.getTelefone());
            this._stmt.setString(4, modelo.getEmail());
	    this._stmt.setInt(5, modelo.getIdFornecedor());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!!!");

	    this._stmt.close();
	} catch (SQLException ex) {
            Logger.getLogger(DAOFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Deletar(ModelFornecedor modelo) {
        try {
            String query = "DELETE FROM fornecedores WHERE id_fornecedor=?";

            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdFornecedor());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ModelFornecedor> Listar() {
        ArrayList<ModelFornecedor> listaDados = new ArrayList<>();

        try {
            String query = "SELECT * FROM fornecedores";

	    this._stmt = this._CONEXAO.prepareStatement(query);
	    this._rs = this._stmt.executeQuery();

	    while(this._rs.next()) {
	        ModelFornecedor modelo = new ModelFornecedor();

                modelo.setIdFornecedor(this._rs.getInt("id_fornecedor"));
                modelo.setNome(this._rs.getString("nome"));
                modelo.setCnpj(this._rs.getString("cnpj"));
                modelo.setTelefone(this._rs.getString("telefone"));
                modelo.setEmail(this._rs.getString("email"));

                listaDados.add(modelo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaDados;
    }

    final private Connection _CONEXAO = new HandlerConexao().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
