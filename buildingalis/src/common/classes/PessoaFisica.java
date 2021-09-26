package common.classes;

import common.handlers.HandlerInput;

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
        this._cpf = this._HANDLER_INPUT.higienizarCpf(cpf);
    }

    public String getTelefone() {
        return _telefone;
    }

    public void setTelefone(String telefone) {
        this._telefone = this._HANDLER_INPUT.higienizarTelefone(telefone);
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
    private final HandlerInput _HANDLER_INPUT = new HandlerInput();
}
