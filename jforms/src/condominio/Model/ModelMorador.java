package condominio.Model;

import common.PessoaFisica;

/**
 *
 * @author Marcelo
 */
public class ModelMorador extends PessoaFisica {
    public int getIdMorador() {
        return _idMorador;
    }

    public void setIdMorador(int idMorador) {
        this._idMorador = idMorador;
    }

    public int getApartamento() {
        return _apartamento;
    }

    public void setApartamento(int apartamento) {
        this._apartamento = apartamento;
    }

    public int getTorre() {
        return _torre;
    }

    public void setTorre(int torre) {
        this._torre = torre;
    }

    private int _idMorador;
    private int _apartamento;
    private int _torre;
}
