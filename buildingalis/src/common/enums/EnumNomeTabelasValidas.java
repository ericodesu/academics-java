package common.enums;

/**
 *
 * @author Erick Frederick
 */
public enum EnumNomeTabelasValidas {
    AGENDAS("agendas"),
    APARTAMENTOS("apartamentos"),
    AREAS_LAZER("areas_lazer"),
    BLOCOS("blocos"),
    CARROS("carros"),
    CORREIOS("correios"),
    FUNCIONARIOS("funcionarios"),
    GARAGENS("garagens"),
    MORADORES("moradores"),
    PROPRIETARIOS("proprietarios"),
    SERVICOS("servicos"),
    TORRES("torres");

    public String getNomeTabela() {
        return this._nomeTabela;
    }

    private EnumNomeTabelasValidas(final String nomeTabela) {
        this._nomeTabela = nomeTabela;
    }

    private final String _nomeTabela;
}
