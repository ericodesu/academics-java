package condominio.models;

/**
 *
 * @author Marcelo
 */
public class ModelCarro {
    public int getIdCarro() {
        return _idCarro;
    }

    public void setIdCarro(int idCarro) {
        this._idCarro = idCarro;
    }

    public String getMarca() {
        return _marca;
    }

    public void setMarca(String marca) {
        this._marca = marca;
    }

    public String getModelo() {
        return _modelo;
    }

    public void setModelo(String modelo) {
        this._modelo = modelo;
    }

    public String getPlaca() {
        return _placa;
    }

    public void setPlaca(String placa) {
        this._placa = placa;
    }

    public String getCor() {
        return _cor;
    }

    public void setCor(String cor) {
        this._cor = cor;
    }

    public int getIdApartamento() {
        return _idApartamento;
    }

    public void setIdApartamento(int idApartamento) {
        this._idApartamento = idApartamento;
    }

    private int _idCarro;
    private String _marca;
    private String _modelo;
    private String _placa;
    private String _cor;
    private int _idApartamento;
}
