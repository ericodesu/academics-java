package condominio.models;

/**
 *
 * @author Erick Frederick
 */
public class ModelPedido {
    public int getIdPedido() {
        return _idPedido;
    }

    public void setIdPedido(int idPedido) {
        this._idPedido = idPedido;
    }

    public int getNumeroPedido() {
        return _numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this._numeroPedido = numeroPedido;
    }

    public int getIdProduto() {
        return _idProduto;
    }

    public void setIdProduto(int idProduto) {
        this._idProduto = idProduto;
    }

    public int getIdCliente() {
        return _idCliente;
    }

    public void setIdCliente(int idCliente) {
        this._idCliente = idCliente;
    }

    public String getEndereco() {
        return _endereco;
    }

    public void setEndereco(String endereco) {
        this._endereco = endereco;
    }

    public Double getTotal() {
        return _total;
    }

    public void setTotal(Double total) {
        this._total = total;
    }

    public String getFormaPagamento() {
        return _formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this._formaPagamento = formaPagamento;
    }

    private int _idPedido;
    private int _numeroPedido;
    private int _idProduto;
    private int _idCliente;
    private String _endereco;
    private Double _total;
    private String _formaPagamento;
}
