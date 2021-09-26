package condominio.models;

/**
 *
 * @author Marcelo
 */
public class ModelCorreio {
    public int getIdCorreio() {
        return _idCorreio;
    }

    public void setIdCorreio(int idCorreio) {
        this._idCorreio = idCorreio;
    }

    public int getCodigoDocumento() {
        return _codigoDocumento;
    }

    public void setCodigoDocumento(int codigoDocumento) {
        this._codigoDocumento = codigoDocumento;
    }

    public int getIdMorador() {
        return _idMorador;
    }

    public void setIdMorador(int idMorador) {
        this._idMorador = idMorador;
    }

    private int _idCorreio;
    private int _codigoDocumento;
    private int _idMorador;
}
