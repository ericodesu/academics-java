package common.enums;

/**
 *
 * @author Erick Frederick
 */
public enum EnumRelatorios {
    RELATORIO_CLIENTE("relatorioCliente"),
    RELATORIO_PEDIDO("relatorioPedido"),
    RELATORIO_PRODUTO("relatorioProduto");

    public String getNomeTipoCampo() {
        return this._NOME_RELATORIO;
    }

    private EnumRelatorios(final String nomeRelatorio) {
        this._NOME_RELATORIO = nomeRelatorio;
    }

    private final String _NOME_RELATORIO;
}
