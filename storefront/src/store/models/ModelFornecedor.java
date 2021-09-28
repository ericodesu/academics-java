package store.models;

/**
 *
 * @author Erick Frederick
 */
public class ModelFornecedor {
    public int getIdFornecedor() {
        return _idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this._idFornecedor = idFornecedor;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public String getCnpj() {
        return _cnpj;
    }

    public void setCnpj(String cnpj) {
        this._cnpj = cnpj;
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

    private int _idFornecedor;
    private String _nome;
    private String _cnpj;
    private String _telefone;
    private String _email;
}
