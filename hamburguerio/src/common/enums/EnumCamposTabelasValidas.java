package common.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Erick Frederick
 */
public enum EnumCamposTabelasValidas {
    CLIENTES(gerarPessoaFisica(new String[]{
        "id_cliente" + EnumTiposCamposMysql.INT_PK.getNomeTipoCampo(),
        "endereco" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(255)",
        "forma_pagamento" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(10)"
    })),
    PEDIDOS(new String[]{
        "id_pedido" + EnumTiposCamposMysql.INT_PK.getNomeTipoCampo(),
        "numero_pedido" + EnumTiposCamposMysql.INT.getNomeTipoCampo(),
        "id_produto" + EnumTiposCamposMysql.INT.getNomeTipoCampo(),
        "id_cliente" + EnumTiposCamposMysql.INT.getNomeTipoCampo(),
        "endereco" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(255)",
        "total" + EnumTiposCamposMysql.DOUBLE.getNomeTipoCampo(),
        "forma_pagamento" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(10)"
    }),
    PRODUTOS(gerarPessoaFisica(new String[]{
        "id_produto" + EnumTiposCamposMysql.INT_PK.getNomeTipoCampo(),
        "descricao" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(255)",
        "fornecedor" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(255)",
        "qtde_estoque" + EnumTiposCamposMysql.INT.getNomeTipoCampo(),
        "preco_unitario" + EnumTiposCamposMysql.DOUBLE.getNomeTipoCampo(),
        "preco_venda" + EnumTiposCamposMysql.DOUBLE.getNomeTipoCampo()
    }));

    public String[] getCamposTabela() {
        return this._CAMPOS_TABELA;
    }

    private EnumCamposTabelasValidas(final String[] CAMPOS_TABELA) {
        this._CAMPOS_TABELA = CAMPOS_TABELA;
    }

    private static String[] gerarPessoaFisica(String[] campos){
        final String[] _CAMPO_PESSOA_FISICA = {
            "nome" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(50)",
            "cpf" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(11)",
            "telefone" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(11)",
            "email" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(62)"
        };
        List<String> listaCampos = new ArrayList<>(Arrays.asList(campos));

        listaCampos.addAll(1, Arrays.asList(_CAMPO_PESSOA_FISICA));

        String[] pessoaFisica = new String[0];

        return listaCampos.toArray(pessoaFisica);
    }

    private final String[] _CAMPOS_TABELA;
}
