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
import condominio.models.ModelCarro;

/**
 *
 * @author Erick Frederick
 */
public class DAOCarros implements CRUDable<ModelCarro> {
    @Override
    public void Inserir(ModelCarro modelo) {
        String query = "INSERT INTO carros (marca,modelo,placa,cor,id_apartamento) VALUES (?,?,?,?,?)";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getMarca());
            this._stmt.setString(2, modelo.getModelo());
            this._stmt.setString(3, modelo.getPlaca());
            this._stmt.setString(4, modelo.getCor());
            this._stmt.setInt(5, modelo.getIdApartamento());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso!!!");

	    this._stmt.close();
	} catch (Exception e) { }
    }

    @Override
    public void Alterar(ModelCarro modelo) {
        String query = "UPDATE carros SET marca=?,modelo=?,placa=?,cor=?,id_apartamento=? WHERE id_carro=?";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getMarca());
            this._stmt.setString(2, modelo.getModelo());
            this._stmt.setString(3, modelo.getPlaca());
            this._stmt.setString(4, modelo.getCor());
            this._stmt.setInt(5, modelo.getIdApartamento());
            this._stmt.setInt(6, modelo.getIdCarro());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!!!");

	    this._stmt.close();
	} catch (Exception e) { }
    }

    @Override
    public void Deletar(ModelCarro modelo) {
        String query = "DELETE FROM carros WHERE id_carro=?";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdCarro());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAgendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ModelCarro> Listar() {
        ArrayList<ModelCarro> listaDados = new ArrayList<>();
	String query = "SELECT * FROM carros";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);
	    this._rs = this._stmt.executeQuery();

	    while(this._rs.next()) {
	        ModelCarro modelo = new ModelCarro();

                modelo.setMarca(this._rs.getString("marca"));
                modelo.setModelo(this._rs.getString("modelo"));
                modelo.setPlaca(this._rs.getString("placa"));
                modelo.setCor(this._rs.getString("cor"));
                modelo.setIdApartamento(this._rs.getInt("id_apartamento"));
                modelo.setIdCarro(this._rs.getInt("id_carro"));

                listaDados.add(modelo);
            }
        } catch (SQLException e) { }

        return listaDados;
    }

    final private Connection _CONEXAO = new HandlerConexao().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
