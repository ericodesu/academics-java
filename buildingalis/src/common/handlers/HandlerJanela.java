package common.handlers;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTable;

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

    public void limparListaDeInput(JTextField[] listaInput){
        for (JTextField jTInput : listaInput) {
            jTInput.setText("");
        }
    }

    public void atulizarListaDeInputRelacionadoTabela(
            JTextField[] listaInput,
            JTable jTabela
    ){
        if(jTabela.getSelectedRow() != -1 && listaInput.length == jTabela.getColumnCount()){
            for(int i = 0; i < listaInput.length; i++){
                JTextField jTInput = listaInput[i];
                String valorDaColuna = jTabela.getValueAt(jTabela.getSelectedRow(), i).toString();

                jTInput.setText(valorDaColuna);
            }
        }
    }
}
