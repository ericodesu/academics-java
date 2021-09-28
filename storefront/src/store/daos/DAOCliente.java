package store.daos;

import store.common.interfaces.CRUDable;
import store.common.handlers.HandlerConexao;
import store.models.ModelCliente;

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
public class DAOCliente implements CRUDable<ModelCliente> {
    @Override
    public void Inserir(ModelCliente modelo) {
        try {
            String query = "INSERT INTO clientes (nome,cpf,telefone,email,limite_credito) VALUES (?,?,?,?,?)";

	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getNome());
	    this._stmt.setString(2, modelo.getCpf());
            this._stmt.setString(3, modelo.getTelefone());
            this._stmt.setString(4, modelo.getEmail());
	    this._stmt.setFloat(5, modelo.getLimiteCredito());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso!!!");

	    this._stmt.close();
	} catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Alterar(ModelCliente modelo) {
        try {
            String query = "UPDATE clientes SET nome=?,cpf=?,telefone=?,email=?,limite_credito=? WHERE id_cliente=?";

	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getNome());
	    this._stmt.setString(2, modelo.getCpf());
            this._stmt.setString(3, modelo.getTelefone());
            this._stmt.setString(4, modelo.getEmail());
	    this._stmt.setFloat(5, modelo.getLimiteCredito());
            this._stmt.setInt(6, modelo.getIdCliente());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!!!");

	    this._stmt.close();
	} catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Deletar(ModelCliente modelo) {
        try {
            String query = "DELETE FROM clientes WHERE id_cliente=?";

            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdCliente());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ModelCliente> Listar() {
        ArrayList<ModelCliente> listaDados = new ArrayList<>();

        try {
            String query = "SELECT * FROM clientes";

	    this._stmt = this._CONEXAO.prepareStatement(query);
	    this._rs = this._stmt.executeQuery();

	    while(this._rs.next()) {
	        ModelCliente modelo = new ModelCliente();

                modelo.setIdCliente(this._rs.getInt("id_cliente"));
                modelo.setNome(this._rs.getString("nome"));
                modelo.setCpf(this._rs.getString("cpf"));
                modelo.setTelefone(this._rs.getString("telefone"));
                modelo.setEmail(this._rs.getString("email"));
                modelo.setLimiteCredito(this._rs.getFloat("limite_credito"));

                listaDados.add(modelo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaDados;
    }

    final private Connection _CONEXAO = new HandlerConexao().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
