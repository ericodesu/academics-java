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

import common.interfaces.CRUDable;
import condominio.models.ModelAreaLazer;

/**
 *
 * @author Erick Frederick
 */
public class DAOAreasLazer implements CRUDable<ModelAreaLazer> {
    @Override
    public void Inserir(ModelAreaLazer modelo) {
        String query = "INSERT INTO areas_lazer (descricao) VALUES (?)";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getDescricao());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso!!!");

	    this._stmt.close();
	} catch (Exception e) { }
    }

    @Override
    public void Alterar(ModelAreaLazer modelo) {
        String query = "UPDATE areas_lazer SET descricao=? WHERE id_area_lazer=?";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getDescricao());
            this._stmt.setInt(2, modelo.getIdAreaLazer());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!!!");

	    this._stmt.close();
	} catch (Exception e) { }
    }

    @Override
    public void Deletar(ModelAreaLazer modelo) {
        String query = "DELETE FROM areas_lazer WHERE id_area_lazer=?";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdAreaLazer());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAreasLazer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ModelAreaLazer> Listar() {
        ArrayList<ModelAreaLazer> listaDados = new ArrayList<>();
	String query = "SELECT * FROM areas_lazer";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);
	    this._rs = this._stmt.executeQuery();

	    while(this._rs.next()) {
	        ModelAreaLazer modelo = new ModelAreaLazer();

                modelo.setDescricao(this._rs.getString("descricao"));
	        modelo.setIdAreaLazer(this._rs.getInt("id_area_lazer"));

                listaDados.add(modelo);
            }
        } catch (SQLException e) { }

        return listaDados;
    }

    final private Connection _CONEXAO = new HandlerConexao().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
