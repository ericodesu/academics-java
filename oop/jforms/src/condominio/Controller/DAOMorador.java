package condominio.Controller;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import condominio.Model.ModelMorador;
import interfaces.CRUDable;

/**
 *
 * @author Erick Frederick
 */
public class DAOMorador implements CRUDable<ModelMorador> {
    @Override
    public void Inserir(ModelMorador modelo) {
        String query = "INSERT INTO moradores (nome,cpf,telefone,email,apartamento,torre) VALUES (?,?,?,?,?,?)";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getNome());
            this._stmt.setString(2, modelo.getCpf());
            this._stmt.setString(3, modelo.getTelefone());
            this._stmt.setString(4, modelo.getEmail());
            this._stmt.setInt(5, modelo.getApartamento());
            this._stmt.setInt(6, modelo.getTorre());

            this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso!!!");

	    this._stmt.close();
        } catch (Exception e) { }
    }

    @Override
    public void Alterar(ModelMorador modelo) {
        String query = "UPDATE moradores SET nome=?,cpf=?,telefone=?,email=?,apartamento=?,torre=? WHERE id_morador=?";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getNome());
            this._stmt.setString(2, modelo.getCpf());
            this._stmt.setString(3, modelo.getTelefone());
            this._stmt.setString(4, modelo.getEmail());
            this._stmt.setInt(5, modelo.getApartamento());
            this._stmt.setInt(6, modelo.getTorre());
            this._stmt.setInt(7, modelo.getIdMorador());

            this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!!!");

	    this._stmt.close();
        } catch (Exception e) { }
    }

    @Override
    public void Deletar(ModelMorador modelo) {
        String query = "DELETE FROM moradores WHERE id_morador=?";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdMorador());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAgendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ModelMorador> Listar() {
        ArrayList<ModelMorador> listaDados = new ArrayList<>();
	String query = "SELECT * FROM moradores";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);
	    this._rs = this._stmt.executeQuery();

	    while(this._rs.next()) {
	        ModelMorador modelo = new ModelMorador();

                modelo.setNome(this._rs.getString("nome"));
                modelo.setCpf(this._rs.getString("cpf"));
                modelo.setTelefone(this._rs.getString("telefone"));
                modelo.setEmail(this._rs.getString("email"));
                modelo.setApartamento(this._rs.getInt("apartamento"));
                modelo.setTorre(this._rs.getInt("torre"));
                modelo.setIdMorador(this._rs.getInt("id_morador"));

                listaDados.add(modelo);
            }
        } catch (SQLException e) { }

        return listaDados;
    }

    final private Connection _CONEXAO = new conecta().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
