package condominio.models;

/**
 *
 * @author Erick Frederick
 */
public class ModelBloco {
    public int getIdBloco() {
        return _idBloco;
    }

    public void setIdBloco(int idBloco) {
        this._idBloco = idBloco;
    }

    public String getDescricao() {
        return _descricao;
    }

    public void setDescricao(String descricao) {
        this._descricao = descricao;
    }

    public int getQuantidadeAndares() {
        return _quantidadeAndares;
    }

    public void setQuantidadeAndares(int quantidadeAndares) {
        this._quantidadeAndares = quantidadeAndares;
    }

    public int getQuantidadeApartamentoAndares() {
        return _quantidadeApartamentoAndares;
    }

    public void setQuantidadeApartamentoAndares(int quantidadeApartamentoAndares) {
        this._quantidadeApartamentoAndares = quantidadeApartamentoAndares;
    }
    
    private int _idBloco;
    private String _descricao;
    private int _quantidadeAndares;
    private int _quantidadeApartamentoAndares;
}
