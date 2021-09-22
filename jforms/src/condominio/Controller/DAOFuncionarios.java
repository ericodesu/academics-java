package condominio.Controller;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import condominio.Model.ModelFuncionario;
import interfaces.CRUDable;

/**
 *
 * @author Erick Frederick
 */
public class DAOFuncionarios implements CRUDable<ModelFuncionario> {
    @Override
    public void Inserir(ModelFuncionario modelo) {
        String query = "INSERT INTO funcionarios (nome,cpf,telefone,email,cargo,salario) VALUES (?,?,?,?,?,?)";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getNome());
            this._stmt.setString(2, modelo.getCpf());
            this._stmt.setString(3, modelo.getTelefone());
            this._stmt.setString(4, modelo.getEmail());
            this._stmt.setString(5, modelo.getCargo());
            this._stmt.setDouble(6, modelo.getSalario());

            this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso!!!");

	    this._stmt.close();
        } catch (Exception e) { }
    }

    @Override
    public void Alterar(ModelFuncionario modelo) {
        String query = "UPDATE funcionarios SET cargo=?,cpf=?,email=?,nome=?,telefone=?,salario=?,telefone=? WHERE id_funcionario=?";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getCargo());
            this._stmt.setString(2, modelo.getCpf());
            this._stmt.setString(3, modelo.getEmail());
            this._stmt.setString(4, modelo.getNome());
            this._stmt.setString(5, modelo.getTelefone());
            this._stmt.setDouble(6, modelo.getSalario());
            this._stmt.setString(7, modelo.getTelefone());
            this._stmt.setInt(8, modelo.getIdFuncionario());

            this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!!!");

	    this._stmt.close();
        } catch (Exception e) { }
    }

    @Override
    public void Deletar(ModelFuncionario modelo) {
        String query = "DELETE FROM funcionarios WHERE id_funcionario=?";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdFuncionario());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAgendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ModelFuncionario> Listar() {
        ArrayList<ModelFuncionario> listaDados = new ArrayList<>();
	String query = "SELECT * FROM funcionarios";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);
	    this._rs = this._stmt.executeQuery();

	    while(this._rs.next()) {
	        ModelFuncionario modelo = new ModelFuncionario();

                modelo.setCargo(this._rs.getString("cargo"));
                modelo.setCpf(this._rs.getString("cpf"));
                modelo.setEmail(this._rs.getString("email"));
                modelo.setNome(this._rs.getString("nome"));
                modelo.setTelefone(this._rs.getString("telefone"));
                modelo.setSalario(this._rs.getDouble("salario"));
                modelo.setTelefone(this._rs.getString("telefone"));
                modelo.setIdFuncionario(this._rs.getInt("id_funcionario"));

                listaDados.add(modelo);
            }
        } catch (SQLException e) { }

        return listaDados;
    }

    final private Connection _CONEXAO = new conecta().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
