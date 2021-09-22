package condominio.Model;

/**
 *
 * @author Marcelo
 */
public class ModelGaragem {
    public int getIdGaragem() {
        return _idGaragem;
    }

    public void setIdGaragem(int idGaragem) {
        this._idGaragem = idGaragem;
    }

    public int getNumero() {
        return _numero;
    }

    public void setNumero(int numero) {
        this._numero = numero;
    }

    public int getTorre() {
        return _torre;
    }

    public void setTorre(int torre) {
        this._torre = torre;
    }

    private int _idGaragem;
    private int _numero;
    private int _torre;
}
