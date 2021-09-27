package condominio.models;

import common.classes.PessoaFisica;

/**
 *
 * @author Erick Frederick
 */
public class ModelCliente extends PessoaFisica {
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

    public String getFormaPagamento() {
        return _formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this._formaPagamento = formaPagamento;
    }

    private int _idCliente;
    private String _endereco;
    private String _formaPagamento;
}
