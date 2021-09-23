package condominio.models;

/**
 *
 * @author Marcelo
 */
public class ModelAreaLazer {
    public int getIdAreaLazer() {
        return _idAreaLazer;
    }

    public void setIdAreaLazer(int idAreaLazer) {
        this._idAreaLazer = idAreaLazer;
    }

    public String getDescricao() {
        return _descricao;
    }

    public void setDescricao(String descricao) {
        this._descricao = descricao;
    }

    private int _idAreaLazer;
    private String _descricao;
}
