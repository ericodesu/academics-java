package condominio.models;

/**
 *
 * @author Erick Frederick
 */
public class ModelProduto {
    public int getIdProduto() {
        return _idProduto;
    }

    public void setIdProduto(int _idProduto) {
        this._idProduto = _idProduto;
    }

    public String getDescricao() {
        return _descricao;
    }

    public void setDescricao(String descricao) {
        this._descricao = descricao;
    }

    public String getFornecedor() {
        return _fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this._fornecedor = fornecedor;
    }

    public int getQuantidadeEstoque() {
        return _quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this._quantidadeEstoque = quantidadeEstoque;
    }

    public Double getPrecoUnitario() {
        return _precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this._precoUnitario = precoUnitario;
    }

    public Double getPrecoVenda() {
        return _precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this._precoVenda = precoVenda;
    }

    private int _idProduto;
    private String _descricao;
    private String _fornecedor;
    private int _quantidadeEstoque;
    private Double _precoUnitario;
    private Double _precoVenda;
}
