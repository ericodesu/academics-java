package condominio.Model;

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

    public String getCodDocumento() {
        return _codDocumento;
    }

    public void setCodDocumento(String codDocumento) {
        this._codDocumento = codDocumento;
    }

    public int getIdMorador() {
        return _idMorador;
    }

    public void setIdMorador(int idMorador) {
        this._idMorador = idMorador;
    }

    private int _idCorreio;
    private String _codDocumento;
    private int _idMorador;
}
