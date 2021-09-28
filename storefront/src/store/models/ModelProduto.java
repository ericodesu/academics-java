package store.models;

/**
 *
 * @author Erick Frederick
 */
public class ModelProduto {
    public int getIdProduto() {
        return _idProduto;
    }

    public void setIdProduto(int idProduto) {
        this._idProduto = idProduto;
    }

    public String getDescricao() {
        return _descricao;
    }

    public void setDescricao(String descricao) {
        this._descricao = descricao;
    }

    public int getEstoque() {
        return _estoque;
    }

    public void setEstoque(int estoque) {
        this._estoque = estoque;
    }

    public float getPrecoUnitario() {
        return _precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this._precoUnitario = precoUnitario;
    }

    public int getIdFornecedor() {
        return _idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this._idFornecedor = idFornecedor;
    }

    private int _idProduto;
    private String _descricao;
    private int _estoque;
    private float _precoUnitario;
    private int _idFornecedor;
}
