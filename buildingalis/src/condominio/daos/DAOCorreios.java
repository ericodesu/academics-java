package condominio.daos;

import common.handlers.HandlerConexao;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import condominio.models.ModelCorreio;
import common.interfaces.CRUDable;

/**
 *
 * @author Erick Frederick
 */
public class DAOCorreios implements CRUDable<ModelCorreio> {
    @Override
    public void Inserir(ModelCorreio modelo) {
        String query = "INSERT INTO correios (cod_documento, id_morador) VALUES (?,?)";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getCodDocumento());
            this._stmt.setInt(2, modelo.getIdMorador());

            this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso!!!");

	    this._stmt.close();
        } catch (Exception e) { }
    }

    @Override
    public void Alterar(ModelCorreio modelo) {
        String query = "UPDATE correios SET cod_documento=?,id_morador=? WHERE id_correio=?";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getCodDocumento());
            this._stmt.setInt(2, modelo.getIdMorador());
            this._stmt.setInt(3, modelo.getIdCorreio());

            this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso!!!");

	    this._stmt.close();
        } catch (Exception e) { }
    }

    @Override
    public void Deletar(ModelCorreio modelo) {
        String query = "DELETE FROM correios WHERE id_correio=?";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);
            
            this._stmt.setInt(1, modelo.getIdCorreio());

            this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados deletados com Sucesso!!!");

	    this._stmt.close();
        } catch (Exception ex) {
            Logger.getLogger(DAOAgendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ModelCorreio> Listar() {
        ArrayList<ModelCorreio> listaDados = new ArrayList<>();
	String query = "SELECT * FROM correios";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);
	    this._rs = this._stmt.executeQuery();

            while(this._rs.next()) {
	        ModelCorreio modelo = new ModelCorreio();

                modelo.setCodDocumento(this._rs.getString("documento"));
	        modelo.setIdMorador(this._rs.getInt("id_morador"));
                modelo.setIdCorreio(this._rs.getInt("id_correio"));

                listaDados.add(modelo);
            }
        } catch (SQLException e) { }

        return listaDados;
    }

    final private Connection _CONEXAO = new HandlerConexao().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
