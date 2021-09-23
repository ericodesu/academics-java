package common.handlers;

import javax.swing.JFrame;

/**
 *
 * @author Erick Frederick
 */
public class HandlerJanela {
    public void configurarJanela(JFrame janela) {
        janela.setSize(1280, 720);
    }

    public void rederizarJanela(JFrame janela) {
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}
