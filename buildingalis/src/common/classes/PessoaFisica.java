package common.classes;

/**
 *
 * @author Erick Frederick
 */
public class PessoaFisica {
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

    private String _nome;
    private String _cpf;
    private String _telefone;
    private String _email;
}
