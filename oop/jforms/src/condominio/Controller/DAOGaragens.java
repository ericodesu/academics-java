package condominio.Controller;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import condominio.Model.ModelGaragem;
import interfaces.CRUDable;

/**
 *
 * @author Erick Frederick
 */
public class DAOGaragens implements CRUDable<ModelGaragem> {
    @Override
    public void Inserir(ModelGaragem modelo) {
        String query = "INSERT INTO garagens (numero,torre) VALUES (?,?)";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getNumero());
            this._stmt.setInt(2, modelo.getTorre());

            this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso!!!");

	    this._stmt.close();
        } catch (Exception e) { }
    }

    @Override
    public void Alterar(ModelGaragem modelo) {
        String query = "UPDATE garagens SET numero=?,torre=? WHERE id_garagem=?";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getNumero());
            this._stmt.setInt(2, modelo.getTorre());
            this._stmt.setInt(3, modelo.getIdGaragem());

            this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!!!");

	    this._stmt.close();
        } catch (Exception e) { }
    }

    @Override
    public void Deletar(ModelGaragem modelo) {
        String query = "DELETE FROM garagens WHERE id_garagem=?";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdGaragem());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAgendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ModelGaragem> Listar() {
        ArrayList<ModelGaragem> listaDados = new ArrayList<>();
	String query = "SELECT * FROM garagens";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);
	    this._rs = this._stmt.executeQuery();

            while(this._rs.next()) {
	        ModelGaragem modelo = new ModelGaragem();

                modelo.setNumero(this._rs.getInt("numero"));
                modelo.setTorre(this._rs.getInt("torre"));
                modelo.setIdGaragem(this._rs.getInt("id_garagem"));

                listaDados.add(modelo);
            }
        } catch (Exception e) { }

        return listaDados;
    }

    final private Connection _CONEXAO = new conecta().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
