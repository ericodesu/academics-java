package condominio.Model;

/**
 *
 * @author Marcelo
 */
public class ModelServico {
    public int getIdServico() {
        return _idServico;
    }

    public void setIdServico(int idServico) {
        this._idServico = idServico;
    }

    public String getDescricao() {
        return _descricao;
    }

    public void setDescricao(String descricao) {
        this._descricao = descricao;
    }

    public int getIdFuncionario() {
        return _idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this._idFuncionario = idFuncionario;
    }

    public String getLocalizacao() {
        return _localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this._localizacao = localizacao;
    }

    private int _idServico;
    private String _descricao;
    private int _idFuncionario;
    private String _localizacao;
}
