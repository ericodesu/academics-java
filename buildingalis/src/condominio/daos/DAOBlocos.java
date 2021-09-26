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
import condominio.models.ModelBloco;

/**
 *
 * @author Erick Frederick
 */
public class DAOBlocos implements CRUDable<ModelBloco> {
    @Override
    public void Inserir(ModelBloco modelo) {
        String query = "INSERT INTO blocos (descricao,qtde_andares,qtde_apartamento_andares) VALUES (?,?,?)";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getDescricao());
            this._stmt.setInt(2, modelo.getQuantidadeAndares());
            this._stmt.setInt(3, modelo.getQuantidadeApartamentoAndares());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso!!!");

	    this._stmt.close();
	} catch (Exception e) { }
    }

    @Override
    public void Alterar(ModelBloco modelo) {
        String query = "UPDATE blocos SET descricao=?,qtde_andares=?,qtde_apartamento_andares=? WHERE id_bloco=?";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getDescricao());
            this._stmt.setInt(2, modelo.getQuantidadeAndares());
            this._stmt.setInt(3, modelo.getQuantidadeApartamentoAndares());
            this._stmt.setInt(4, modelo.getIdBloco());

	    this._stmt.execute();

	    JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!!!");

	    this._stmt.close();
	} catch (Exception e) { }
    }

    @Override
    public void Deletar(ModelBloco modelo) {
        String query = "DELETE FROM blocos WHERE id_bloco=?";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdBloco());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAgendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ModelBloco> Listar() {
        ArrayList<ModelBloco> listaDados = new ArrayList<>();
	String query = "SELECT * FROM blocos";

        try {
	    this._stmt = this._CONEXAO.prepareStatement(query);
	    this._rs = this._stmt.executeQuery();

	    while(this._rs.next()) {
	        ModelBloco modelo = new ModelBloco();

                modelo.setDescricao(this._rs.getString("descricao"));
                modelo.setQuantidadeAndares(this._rs.getInt("qtde_andares"));
                modelo.setQuantidadeApartamentoAndares(this._rs.getInt("qtde_apartamento_andares"));
                modelo.setIdBloco(this._rs.getInt("id_bloco"));

                listaDados.add(modelo);
            }
        } catch (SQLException e) { }

        return listaDados;
    }

    final private Connection _CONEXAO = new HandlerConexao().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
