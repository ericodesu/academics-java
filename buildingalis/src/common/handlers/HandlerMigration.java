package common.handlers;

import java.util.Map;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import common.enums.EnumNomeTabelasValidas;
import common.enums.EnumCamposTabelasValidas;

/**
 *
 * @author Erick Frederick
 */
public class HandlerMigration {
    public HandlerMigration(){
        this.hidratarTabelaValidas();
    }

    public void configurarAmbiente(){
        try{
            for(Map.Entry<EnumNomeTabelasValidas, String> nomeTabelaValida : this._NOME_TABELAS_VALIDAS.entrySet()){
                String query = "CREATE TABLE IF NOT EXISTS " + nomeTabelaValida.getValue();

                for(Map.Entry<EnumCamposTabelasValidas, String[]> campoTabelaValida : this._CAMPOS_TABELAS_VALIDAS.entrySet()){
                    String keyNomeTabelaValida = nomeTabelaValida.getKey().name();
                    String keyCampoTabelaValida = campoTabelaValida.getKey().name();

                    if(keyNomeTabelaValida.equals(keyCampoTabelaValida)){
                        String[] campos = campoTabelaValida.getValue();
                        String divisorTipoCampo = ":";
                        boolean existemCampos = campos.length > 0;

                        if(existemCampos){
                            query += "(";
                        }

                        for(String campo : campos){
                            boolean ePrimeiroCampo = (campos[0] == null ? campo == null : campos[0].equals(campo));
                            boolean eUltimoCampo = (campos[campos.length - 1] == null ? campo == null : campos[campos.length - 1].equals(campo));

                            query += (ePrimeiroCampo ? "" : " ") + campo.replace(divisorTipoCampo, " ") + (eUltimoCampo ? "" : ",");
                        }

                        if(existemCampos){
                            query += ");";
                        }
                    }
                }

                this._stmt = this._CONEXAO.prepareStatement(query);
                this._stmt.execute();
                this._stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(HandlerMigration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void hidratarTabelaValidas(){
        for(EnumNomeTabelasValidas nomeTabelaValida : EnumNomeTabelasValidas.values()){
            this._NOME_TABELAS_VALIDAS.put(nomeTabelaValida, nomeTabelaValida.getNomeTabela());
        }

        for(EnumCamposTabelasValidas campoTabelaValida : EnumCamposTabelasValidas.values()){
            this._CAMPOS_TABELAS_VALIDAS.put(campoTabelaValida, campoTabelaValida.getCamposTabela());
        }
    }

    private final Map<EnumNomeTabelasValidas, String> _NOME_TABELAS_VALIDAS = new HashMap<>();
    private final Map<EnumCamposTabelasValidas, String[]> _CAMPOS_TABELAS_VALIDAS = new HashMap<>();
    private final Connection _CONEXAO = new HandlerConexao().getConnection();

    private PreparedStatement _stmt = null;
}