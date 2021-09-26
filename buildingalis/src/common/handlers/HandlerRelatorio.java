package common.handlers;

import java.io.File;
import java.sql.Connection;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Erick Frederick
 */
public class HandlerRelatorio {
    public JasperPrint gerarRelatorioJasper(String nomeRelatorio){
        try {
            String caminhoRelativoPastaRelatorio = "src/resources/relatorios/";

            Connection con = new HandlerConexao().getConnection();
            File arquivoJasper = new File(caminhoRelativoPastaRelatorio + nomeRelatorio + ".jasper");

            return JasperFillManager.fillReport(arquivoJasper.getAbsolutePath(), null, con);
        } catch (Exception e) { }

        return null;
    }

    public void renderizarRelatorio(JasperPrint relatorio){
        try {
            JasperViewer.viewReport(relatorio);
        } catch (Exception e) { }
    }
}
