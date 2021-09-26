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
import condominio.models.ModelTorre;

/**
 *
 * @author Erick Frederick
 */
public class DAOTorres implements CRUDable<ModelTorre> {
    @Override
    public void Inserir(ModelTorre modelo) {
        String query = "INSERT INTO torres (numero) VALUES (?)";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getNumero());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso!!!");

	    this._stmt.close();
	} catch (Exception e) { }
    }

    @Override
    public void Alterar(ModelTorre modelo) {
        String query = "UPDATE torres SET numero=? WHERE id_torre=?";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getNumero());
            this._stmt.setInt(2, modelo.getIdTorre());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!!!");

	    this._stmt.close();
	} catch (Exception e) { }
    }

    @Override
    public void Deletar(ModelTorre modelo) {
        String query = "DELETE FROM torres WHERE id_torre=?";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdTorre());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAgendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ModelTorre> Listar() {
        ArrayList<ModelTorre> listaDados = new ArrayList<>();
	String query = "SELECT * FROM torres";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);
	    this._rs = this._stmt.executeQuery();

	    while(this._rs.next()) {
	        ModelTorre modelo = new ModelTorre();

	        modelo.setNumero(this._rs.getInt("numero"));
                modelo.setIdTorre(this._rs.getInt("id_torre"));

                listaDados.add(modelo);
            }
        } catch (SQLException e) { }

        return listaDados;
    }

    final private Connection _CONEXAO = new HandlerConexao().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;   
}
