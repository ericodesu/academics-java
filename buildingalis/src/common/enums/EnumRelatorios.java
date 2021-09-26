package common.enums;

/**
 *
 * @author Erick Frederick
 */
public enum EnumRelatorios {
    RELATORIO_AGENDA("relatorioAgenda"),
    RELATORIO_APARTAMENTO("relatorioApartamento"),
    RELATORIO_AREA_LAZER("relatorioAreaLazer"),
    RELATORIO_BLOCO("relatorioBloco"),
    RELATORIO_CORREIO("relatorioCorreio"),
    RELATORIO_FUNCIONARIO("relatorioFuncionario"),
    RELATORIO_GARAGEM("relatorioGaragem"),
    RELATORIO_MORADOR("relatorioMorador"),
    RELATORIO_PROPRIETARIO("relatorioProprietario"),
    RELATORIO_SERVICO("relatorioServico"),
    RELATORIO_VEICULO("relatorioVeiculo"),
    RELATORIO_TORRE("relatorioTorre");

    public String getNomeTipoCampo() {
        return this._NOME_RELATORIO;
    }

    private EnumRelatorios(final String nomeRelatorio) {
        this._NOME_RELATORIO = nomeRelatorio;
    }

    private final String _NOME_RELATORIO;
}
