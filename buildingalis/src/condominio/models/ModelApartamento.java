package condominio.models;

public class ModelApartamento {
    public int getIdApartamento() {
        return _idApartamento;
    }

    public void setIdApartamento(int idApartamento) {
        this._idApartamento = idApartamento;
    }

    public int getNumero() {
        return _numero;
    }

    public void setNumero(int numero) {
        this._numero = numero;
    }

    public int getAndar() {
        return _andar;
    }

    public void setAndar(int andar) {
        this._andar = andar;
    }

    public int getBloco() {
        return _bloco;
    }

    public void setBloco(int bloco) {
        this._bloco = bloco;
    }

    public int getQtdeQuartos() {
        return _qtdeQuartos;
    }

    public void setQtdeQuartos(int qtdeQuartos) {
        this._qtdeQuartos = qtdeQuartos;
    }

    public double getMetragem() {
        return _metragem;
    }

    public void setMetragem(double metragem) {
        this._metragem = metragem;
    }

    private int _idApartamento;
    private int _numero;
    private int _andar;
    private int _bloco;
    private int _qtdeQuartos;
    private double _metragem;
}
