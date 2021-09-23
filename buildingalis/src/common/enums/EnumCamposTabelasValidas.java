package common.enums;

/**
 *
 * @author Erick Frederick
 */
public enum EnumCamposTabelasValidas {
    AGENDAS(new String[]{
        "id_agenda" + EnumTiposCamposMysql.INT_PK.getNomeTipoCampo(),
        "data" + EnumTiposCamposMysql.DATE.getNomeTipoCampo(),
        "id_morador" + EnumTiposCamposMysql.INT.getNomeTipoCampo()
    }),
    APARTAMENTOS(new String[]{
        "id_apartamento" + EnumTiposCamposMysql.INT_PK.getNomeTipoCampo(),
        "numero" + EnumTiposCamposMysql.INT.getNomeTipoCampo(),
        "andar" + EnumTiposCamposMysql.INT.getNomeTipoCampo(),
        "bloco" + EnumTiposCamposMysql.INT.getNomeTipoCampo(),
        "qtde_quartos" + EnumTiposCamposMysql.INT.getNomeTipoCampo(),
        "metragem" + EnumTiposCamposMysql.DOUBLE.getNomeTipoCampo()
    }),
    AREAS_LAZER(new String[]{
        "id_area_lazer" + EnumTiposCamposMysql.INT_PK.getNomeTipoCampo(),
        "descricao" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(200)"
    }),
    BLOCOS(new String[]{
        "id_bloco" + EnumTiposCamposMysql.INT_PK.getNomeTipoCampo(),
        "descricao" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(20)",
        "qtde_andares" + EnumTiposCamposMysql.INT.getNomeTipoCampo(),
        "qtde_apartamento_andares" + EnumTiposCamposMysql.INT.getNomeTipoCampo()
    }),
    CARROS(new String[]{
        "id_carro" + EnumTiposCamposMysql.INT_PK.getNomeTipoCampo(),
        "marca" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(20)",
        "modelo" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(20)",
        "placa" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(7)",
        "cor" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(20)",
        "id_apartamento" + EnumTiposCamposMysql.INT.getNomeTipoCampo()
    }),
    CORREIOS(new String[]{
        "id_correio" + EnumTiposCamposMysql.INT_PK.getNomeTipoCampo(),
        "cod_documento" + EnumTiposCamposMysql.INT.getNomeTipoCampo(),
        "id_morador" + EnumTiposCamposMysql.INT.getNomeTipoCampo()
    }),
    FUNCIONARIOS(new String[]{
        "id_funcionario" + EnumTiposCamposMysql.INT_PK.getNomeTipoCampo(),
        "cargo" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(20)",
        "salario" + EnumTiposCamposMysql.DOUBLE.getNomeTipoCampo()
    }),
    GARAGENS(new String[]{
        "id_garagem" + EnumTiposCamposMysql.INT_PK.getNomeTipoCampo(),
        "numero" + EnumTiposCamposMysql.INT.getNomeTipoCampo(),
        "torre" + EnumTiposCamposMysql.INT.getNomeTipoCampo()
    }),
    MORADORES(new String[]{
        "id_morador" + EnumTiposCamposMysql.INT_PK.getNomeTipoCampo(),
        "apartamento" + EnumTiposCamposMysql.INT.getNomeTipoCampo(),
        "torre" + EnumTiposCamposMysql.INT.getNomeTipoCampo()
    }),
    PROPRIETARIOS(new String[]{
        "id_proprietario" + EnumTiposCamposMysql.INT_PK.getNomeTipoCampo(),
        "nome" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(200)",
        "cpf" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(14)",
        "telefone" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(20)",
        "email" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(150)",
        "data_nascimento" + EnumTiposCamposMysql.DATE.getNomeTipoCampo(),
        "apartamento" + EnumTiposCamposMysql.INT.getNomeTipoCampo(),
        "bloco" + EnumTiposCamposMysql.INT.getNomeTipoCampo()
    }),
    SERVICOS(new String[]{
        "id_servico" + EnumTiposCamposMysql.INT_PK.getNomeTipoCampo(),
        "descricao" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(20)",
        "id_funcionario" + EnumTiposCamposMysql.INT.getNomeTipoCampo(),
        "localizacao" + EnumTiposCamposMysql.VAR_CHAR.getNomeTipoCampo() + "(20)"
    }),
    TORRES(new String[]{
        "id_torre" + EnumTiposCamposMysql.INT_PK.getNomeTipoCampo(),
        "numero" + EnumTiposCamposMysql.INT.getNomeTipoCampo()
    });

    public String[] getCamposTabela() {
        return this._camposTabela;
    }

    private EnumCamposTabelasValidas(final String[] camposTabela) {
        this._camposTabela = camposTabela;
    }

    private final String[] _camposTabela;
}
