package condominio.models;

import java.sql.Date;

/**
 *
 * @author Marcelo
 */
public class ModelAgenda {
    public int getIdAgenda() {
        return _idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this._idAgenda = idAgenda;
    }

    public Date getData() {
        return _data;
    }

    public void setData(Date data) {
        this._data = data;
    }

    public int getIdMorador() {
        return _idMorador;
    }

    public void setIdMorador(int idMorador) {
        this._idMorador = idMorador;
    }

    private int _idAgenda;
    private Date _data;
    private int _idMorador;
}
