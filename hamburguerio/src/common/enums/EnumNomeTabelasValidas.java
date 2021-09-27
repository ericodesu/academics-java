package common.enums;

/**
 *
 * @author Erick Frederick
 */
public enum EnumNomeTabelasValidas {
    CLIENTES("clientes"),
    PEDIDOS("pedidos"),
    PRODUTOS("produtos");

    public String getNomeTabela() {
        return this._nomeTabela;
    }

    private EnumNomeTabelasValidas(final String nomeTabela) {
        this._nomeTabela = nomeTabela;
    }

    private final String _nomeTabela;
}
