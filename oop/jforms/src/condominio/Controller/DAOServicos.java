package condominio.Controller;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import condominio.Model.ModelServico;
import interfaces.CRUDable;

/**
 *
 * @author Erick Frederick
 */
public class DAOServicos implements CRUDable<ModelServico> {
    @Override
    public void Inserir(ModelServico modelo) {
        String query = "INSERT INTO servicos (descricao,id_funcionario,localizacao) VALUES (?,?,?)";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getDescricao());
            this._stmt.setInt(2, modelo.getIdFuncionario());
            this._stmt.setString(3, modelo.getLocalizacao());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso!!!");

	    this._stmt.close();
	} catch (Exception e) { }
    }

    @Override
    public void Alterar(ModelServico modelo) {
        String query = "UPDATE servicos SET descricao=?,id_funcionario=?,localizacao=? WHERE id_servico=?";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getDescricao());
            this._stmt.setInt(2, modelo.getIdFuncionario());
            this._stmt.setString(3, modelo.getLocalizacao());
            this._stmt.setInt(4, modelo.getIdServico());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!!!");

	    this._stmt.close();
	} catch (Exception e) { }
    }

    @Override
    public void Deletar(ModelServico modelo) {
        String query = "DELETE FROM servico WHERE id_servico=?";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdServico());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAgendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ModelServico> Listar() {
        ArrayList<ModelServico> listaDados = new ArrayList<>();
	String query = "SELECT * FROM servicos";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);
	    this._rs = this._stmt.executeQuery();

	    while(this._rs.next()) {
	        ModelServico modelo = new ModelServico();

                modelo.setDescricao(this._rs.getString("descricao"));
                modelo.setIdFuncionario(this._rs.getInt("funcionario"));
                modelo.setLocalizacao(this._rs.getString("localizacao"));
                modelo.setIdServico(this._rs.getInt("id_servico"));

                listaDados.add(modelo);
            }
        } catch (SQLException e) { }

        return listaDados;
    }

    final private Connection _CONEXAO = new conecta().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
