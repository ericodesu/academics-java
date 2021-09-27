package common.enums;

/**
 *
 * @author Erick Frederick
 */
public enum EnumTiposCamposMysql {
    INT(":int"),
    INT_PK(":int not null primary key auto_increment"),
    DOUBLE(":double"),
    VAR_CHAR(":varchar"),
    DATE(":date");

    public String getNomeTipoCampo() {
        return this._nomeTipoCampo;
    }

    private EnumTiposCamposMysql(final String nomeTipoCampo) {
        this._nomeTipoCampo = nomeTipoCampo;
    }

    private final String _nomeTipoCampo;
}