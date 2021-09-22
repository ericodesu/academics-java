package condominio.Controller;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import interfaces.CRUDable;
import condominio.Model.ModelApartamento;

/**
 *
 * @author Marcelo
 */
public class DAOApartamentos implements CRUDable<ModelApartamento> {
    @Override
    public void Inserir(ModelApartamento modelo) {
        String query = "INSERT INTO apartamentos (numero,andar,bloco,qtde_quartos,metragem) VALUES (?,?,?,?,?)";
 
        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getNumero());
            this._stmt.setInt(2, modelo.getAndar());
            this._stmt.setInt(3, modelo.getBloco());
            this._stmt.setInt(4, modelo.getQtdeQuartos());
            this._stmt.setDouble(5, modelo.getMetragem());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso!!!");

            this._stmt.close();
        } catch (Exception e) { }
    }

    @Override
    public void Alterar(ModelApartamento modelo)
    {
        String query = "UPDATE apartamentos SET numero=?,andar=?,bloco=?,qtde_quartos=?,metragem=? WHERE id_apartamento=?";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getNumero());
            this._stmt.setInt(2, modelo.getAndar());
            this._stmt.setInt(3, modelo.getBloco());
            this._stmt.setInt(4, modelo.getQtdeQuartos());
            this._stmt.setDouble(5, modelo.getMetragem());
            this._stmt.setInt(6, modelo.getIdApartamento());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOApartamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Deletar(ModelApartamento modelo) {
        String query = "DELETE FROM apartamentos WHERE id_apartamento=?";

        try {
            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdApartamento());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOApartamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    @Override
    public ArrayList<ModelApartamento> Listar() {
       ArrayList<ModelApartamento> apart = new ArrayList<>();
       String query = "SELECT * FROM apartamentos";
 
       try {
            this._stmt = this._CONEXAO.prepareStatement(query);
            this._rs = this._stmt.executeQuery();

            while(_rs.next()) {
                ModelApartamento modelo = new ModelApartamento();

                modelo.setIdApartamento(this._rs.getInt("id_apartamento"));
                modelo.setNumero(this._rs.getInt("numero"));
                modelo.setAndar(this._rs.getInt("andar"));
                modelo.setBloco(this._rs.getInt("bloco"));
                modelo.setQtdeQuartos(this._rs.getInt("qtde_quartos"));
                modelo.setMetragem(this._rs.getDouble("metragem"));

                apart.add(modelo);
            }

            this._stmt.close();
       } catch (SQLException e) { }

        return apart;
   }

    final private Connection _CONEXAO = new conecta().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
