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
import condominio.models.ModelProprietario;
import common.interfaces.CRUDable;

public class DAOProprietarios implements CRUDable<ModelProprietario> {  
    @Override  
    public void Inserir(ModelProprietario modelo) {
        String query = "INSERT INTO proprietarios (nome,cpf,telefone,email,data_nascimento,apartamento,bloco) VALUES (?,?,?,?,?,?,?)";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

	    this._stmt.setString(1, modelo.getNome());
	    this._stmt.setString(2, modelo.getCpf());
	    this._stmt.setString(3, modelo.getTelefone());
	    this._stmt.setString(4, modelo.getEmail());
	    this._stmt.setDate(5, modelo.getData());
	    this._stmt.setInt(6, modelo.getApartamento());
	    this._stmt.setInt(7, modelo.getBloco());
	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null,"Dados cadastrados com Sucesso!!!");

	    this._stmt.close();
	} catch (Exception e) { }
    }

    @Override
    public void Alterar(ModelProprietario modelo) {
        String query = "UPDATE proprietarios SET nome=?,cpf=?,telefone=?,email=?,data_nascimento=?,apartamento=?,bloco=? WHERE id_proprietario=?";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

	    this._stmt.setString(1, modelo.getNome());
	    this._stmt.setString(2, modelo.getCpf());
	    this._stmt.setString(3, modelo.getTelefone());
	    this._stmt.setString(4, modelo.getEmail());
	    this._stmt.setDate(5, modelo.getData());
	    this._stmt.setInt(6, modelo.getApartamento());
	    this._stmt.setInt(7, modelo.getBloco());
	    this._stmt.setInt(8, modelo.getIdProprietario());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null,"Dados Alterados com Sucesso!!!");

	    this._stmt.close();
	} catch (Exception e) { }
    }

    @Override
    public void Deletar(ModelProprietario modelo) {
        String query = "DELETE FROM proprietarios WHERE id_proprietario=?";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdProprietario());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAgendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ModelProprietario> Listar() {
        ArrayList<ModelProprietario> listaDados = new ArrayList<>();
	String query = "SELECT * FROM proprietarios";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);
	    this._rs = this._stmt.executeQuery();

	    while(this._rs.next()) {
	        ModelProprietario modelo = new ModelProprietario();

	        modelo.setIdProprietario(this._rs.getInt("id_proprietario"));
	        modelo.setNome(this._rs.getString("nome"));
	        modelo.setCpf(this._rs.getString("cpf"));
	        modelo.setTelefone(this._rs.getString("telefone"));
	        modelo.setEmail(this._rs.getString("email"));
	        modelo.setData(this._rs.getDate("data_nascimento"));
	        modelo.setApartamento(this._rs.getInt("apartamento"));
	        modelo.setBloco(this._rs.getInt("bloco"));

                listaDados.add(modelo);
            }
        } catch (SQLException e) { }

        return listaDados;
    }

    final private Connection _CONEXAO = new HandlerConexao().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
