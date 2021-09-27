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
import condominio.models.ModelProduto;

/**
 *
 * @author Erick Frederick
 */
public class DAOProdutos implements CRUDable<ModelProduto> {
    @Override
    public void Inserir(ModelProduto modelo) {
        try {
            String query = "INSERT INTO produtos (descricao,fornecedor,qtde_estoque,preco_unitario,preco_venda) VALUES (?,?,?,?,?)";

            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getDescricao());
            this._stmt.setString(2, modelo.getFornecedor());
            this._stmt.setInt(3, modelo.getQuantidadeEstoque());
            this._stmt.setDouble(4, modelo.getPrecoUnitario());
            this._stmt.setDouble(5, modelo.getPrecoVenda());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Alterar(ModelProduto modelo)
    {  
        try {
            String query = "UPDATE produtos SET descricao=?,fornecedor=?,qtde_estoque=?,preco_unitario=?,preco_venda=? WHERE id_produto=?";

            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setString(1, modelo.getDescricao());
            this._stmt.setString(2, modelo.getFornecedor());
            this._stmt.setInt(3, modelo.getQuantidadeEstoque());
            this._stmt.setDouble(4, modelo.getPrecoUnitario());
            this._stmt.setDouble(5, modelo.getPrecoVenda());
            this._stmt.setInt(6, modelo.getIdProduto());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Deletar(ModelProduto modelo) {
        try {
            String query = "DELETE FROM produtos WHERE id_produto=?";

            this._stmt = this._CONEXAO.prepareStatement(query);

            this._stmt.setInt(1, modelo.getIdProduto());

            this._stmt.execute();

            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!!!");

            this._stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    @Override
    public ArrayList<ModelProduto> Listar() {
       ArrayList<ModelProduto> apart = new ArrayList<>();

       try {
            String query = "SELECT * FROM produtos";

            this._stmt = this._CONEXAO.prepareStatement(query);
            this._rs = this._stmt.executeQuery();

            while(_rs.next()) {
                ModelProduto modelo = new ModelProduto();

                modelo.setIdProduto(this._rs.getInt("id_produto"));
                modelo.setDescricao(this._rs.getString("descricao"));
                modelo.setFornecedor(this._rs.getString("fornecedor"));
                modelo.setQuantidadeEstoque(this._rs.getInt("qtde_estoque"));
                modelo.setPrecoUnitario(this._rs.getDouble("preco_unitario"));
                modelo.setPrecoVenda(this._rs.getDouble("preco_venda"));

                apart.add(modelo);
            }

            this._stmt.close();
       } catch (SQLException ex) {
            Logger.getLogger(DAOProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return apart;
   }

    final private Connection _CONEXAO = new HandlerConexao().getConnection();

    private PreparedStatement _stmt = null; 
    private ResultSet _rs = null;
}
