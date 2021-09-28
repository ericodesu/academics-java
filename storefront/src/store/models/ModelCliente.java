package store.models;

/**
 *
 * @author Erick Frederick
 */
public class ModelCliente {
    public int getIdCliente() {
        return _idCliente;
    }

    public void setIdCliente(int idCliente) {
        this._idCliente = idCliente;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public String getCpf() {
        return _cpf;
    }

    public void setCpf(String cpf) {
        this._cpf = cpf;
    }

    public String getTelefone() {
        return _telefone;
    }

    public void setTelefone(String telefone) {
        this._telefone = telefone;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        this._email = email;
    }

    public float getLimiteCredito() {
        return _limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this._limiteCredito = limiteCredito;
    }

    private int _idCliente;
    private String _nome;
    private String _cpf;
    private String _telefone;
    private String _email;
    private float _limiteCredito;
}
