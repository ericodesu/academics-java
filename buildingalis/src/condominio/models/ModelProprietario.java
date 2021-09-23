package condominio.models;

import java.sql.Date;

import common.classes.PessoaFisica;

public class ModelProprietario extends PessoaFisica {
    public int getIdProprietario() {
        return _idProprietario;
    }

    public void setIdProprietario(int idProprietario) {
        this._idProprietario = idProprietario;
    }

    public Date getData() {
        return _data;
    }

    public void setData(Date data) {
        this._data = data;
    }

    public int getApartamento() {
        return _apartamento;
    }

    public void setApartamento(int apartamento) {
        this._apartamento = apartamento;
    }

    public int getBloco() {
        return _bloco;
    }

    public void setBloco(int bloco) {
        this._bloco = bloco;
    }

    private int _idProprietario;
    private Date _data;
    private int _apartamento;
    private int _bloco;
}
