package store.models;

/**
 *
 * @author Erick Frederick
 */
public class ModelVenda {
    public int getIdVenda() {
        return _idVenda;
    }

    public void setIdVenda(int idVenda) {
        this._idVenda = idVenda;
    }

    public int getIdCliente() {
        return _idCliente;
    }

    public void setIdCliente(int idCliente) {
        this._idCliente = idCliente;
    }

    public int getIdProduto() {
        return _idProduto;
    }

    public void setIdProduto(int idProduto) {
        this._idProduto = idProduto;
    }

    public float getValorUnitario() {
        return _valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this._valorUnitario = valorUnitario;
    }

    public float getTotal() {
        return _total;
    }

    public void setTotal(float total) {
        this._total = total;
    }

    private int _idVenda;
    private int _idCliente;
    private int _idProduto;
    private float _valorUnitario;
    private float _total;
}
