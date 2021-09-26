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
import condominio.models.ModelAgenda;

/**
 *
 * @author Erick Frederick
 */
public class DAOAgendas implements CRUDable<ModelAgenda> {
    @Override
    public void Inserir(ModelAgenda modelo) {
        String query = "INSERT INTO agendas (data,id_morador) VALUES (?,?)";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setDate(1, modelo.getData());
            this._stmt.setInt(2, modelo.getIdMorador());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso!!!");

	    this._stmt.close();
	} catch (Exception e) { }
    }

    @Override
    public void Alterar(ModelAgenda modelo) {
        String query = "UPDATE agendas SET data=?,id_morador=? WHERE id_agenda=?";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setDate(1, modelo.getData());
	    this._stmt.setInt(2, modelo.getIdMorador());
            this._stmt.setInt(3, modelo.getIdAgenda());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!!!");

	    this._stmt.close();
	} catch (Exception e) { }
    }

    @Override
    public void Deletar(ModelAgenda modelo) {
        String query = "DELETE FROM agendas WHERE id_agenda=?";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdAgenda());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAgendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ModelAgenda> Listar() {
        ArrayList<ModelAgenda> listaDados = new ArrayList<>();
	String query = "SELECT * FROM agendas";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);
	    this._rs = this._stmt.executeQuery();

	    while(this._rs.next()) {
	        ModelAgenda modelo = new ModelAgenda();

                modelo.setData(this._rs.getDate("data"));
	        modelo.setIdMorador(this._rs.getInt("id_morador"));
                modelo.setIdAgenda(this._rs.getInt("id_agenda"));

                listaDados.add(modelo);
            }
        } catch (SQLException e) { }

        return listaDados;
    }

    final private Connection _CONEXAO = new HandlerConexao().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
