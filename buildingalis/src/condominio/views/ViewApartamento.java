package condominio.views;

import javax.swing.table.DefaultTableModel;

import common.interfaces.Viewable;
import condominio.models.ModelApartamento;
import condominio.daos.DAOApartamentos;

public class ViewApartamento extends javax.swing.JFrame implements Viewable {
    public ViewApartamento(ModelApartamento injectedModel, DAOApartamentos injectedDao) {
        this._modelo = injectedModel;
        this._dao = injectedDao;

        initComponents();   
        hidrataTabela();
    }

    @Override
    public final void hidrataTabela() {
        DefaultTableModel tabela = (DefaultTableModel) jTabela.getModel();

        tabela.setNumRows(0);

        this._dao.Listar().forEach((registro) -> {
            tabela.addRow(new Object[]{
                registro.getIdApartamento(),
                registro.getNumero(),
                registro.getAndar(),
                registro.getBloco(),
                registro.getQtdeQuartos(),
                registro.getMetragem()
            });
        });
    }

    @Override
    public void limpaCamposDeEntrada() {
        jTCodigo.setText("");
        jTNumero.setText("");
        jTAndar.setText("");
        jTBloco.setText("");
        jTQuantidadeQuartos.setText("");
        jTMetragem.setText("");
        jTNumero.requestFocus();
    }

    @Override
    public void atualizaJanela() {
        hidrataTabela();
        limpaCamposDeEntrada();
    }

    @Override
    public void atualizaValoresModelo(Boolean atualizaOId) {
        if(atualizaOId) {
            int idApartamento = Integer.parseInt(jTCodigo.getText().trim());

            this._modelo.setIdApartamento(idApartamento);
        }

        int numero = Integer.parseInt(jTNumero.getText().trim());
        int andar = Integer.parseInt(jTAndar.getText().trim());
        int bloco = Integer.parseInt(jTBloco.getText().trim());
        int quantidadeQuartos = Integer.parseInt(jTQuantidadeQuartos.getText().trim());
        double metragem = Double.parseDouble(jTMetragem.getText().trim());

        this._modelo.setNumero(numero);
        this._modelo.setAndar(andar);
        this._modelo.setBloco(bloco);
        this._modelo.setQtdeQuartos(quantidadeQuartos);
        this._modelo.setMetragem(metragem);
    }

    private final ModelApartamento _modelo;
    private final DAOApartamentos _dao;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLCodigo = new javax.swing.JLabel();
        jLAndar = new javax.swing.JLabel();
        jLBloco = new javax.swing.JLabel();
        jLQuantidadeQuartos = new javax.swing.JLabel();
        jLMetragem = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jTAndar = new javax.swing.JTextField();
        jTBloco = new javax.swing.JTextField();
        jTQuantidadeQuartos = new javax.swing.JTextField();
        jTMetragem = new javax.swing.JTextField();
        jBInserir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jBAlterar = new javax.swing.JButton();
        jLNumero = new javax.swing.JLabel();
        jTNumero = new javax.swing.JTextField();
        jBSair = new javax.swing.JButton();
        jBDeletar = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLCodigo.setText("Codigo");
        getContentPane().add(jLCodigo);
        jLCodigo.setBounds(50, 60, 33, 14);

        jLAndar.setText("Andar");
        getContentPane().add(jLAndar);
        jLAndar.setBounds(290, 60, 29, 14);

        jLBloco.setText("Bloco");
        getContentPane().add(jLBloco);
        jLBloco.setBounds(50, 130, 25, 14);

        jLQuantidadeQuartos.setText("Quantidade Quartos");
        getContentPane().add(jLQuantidadeQuartos);
        jLQuantidadeQuartos.setBounds(140, 130, 98, 14);

        jLMetragem.setText("Metragem");
        getContentPane().add(jLMetragem);
        jLMetragem.setBounds(290, 130, 80, 14);

        jTCodigo.setEnabled(false);
        getContentPane().add(jTCodigo);
        jTCodigo.setBounds(50, 90, 40, 20);
        getContentPane().add(jTAndar);
        jTAndar.setBounds(280, 90, 100, 20);
        getContentPane().add(jTBloco);
        jTBloco.setBounds(40, 160, 90, 20);
        getContentPane().add(jTQuantidadeQuartos);
        jTQuantidadeQuartos.setBounds(140, 160, 90, 20);
        getContentPane().add(jTMetragem);
        jTMetragem.setBounds(290, 160, 90, 20);

        jBInserir.setText("Gravar");
        jBInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirActionPerformed(evt);
            }
        });
        getContentPane().add(jBInserir);
        jBInserir.setBounds(680, 10, 90, 50);

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Numero", "Andar", "Bloco", "Qtde_Quartos", "Metragem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabela);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 420, 760, 120);

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jBAlterar);
        jBAlterar.setBounds(680, 110, 90, 50);

        jLNumero.setText("Numero");
        getContentPane().add(jLNumero);
        jLNumero.setBounds(170, 60, 60, 14);
        getContentPane().add(jTNumero);
        jTNumero.setBounds(160, 90, 100, 20);

        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/condominio/views/exit.png"))); // NOI18N
        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });
        getContentPane().add(jBSair);
        jBSair.setBounds(680, 340, 90, 60);

        jBDeletar.setText("Deletar");
        jBDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(jBDeletar);
        jBDeletar.setBounds(680, 220, 90, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed
       atualizaValoresModelo(false);

       this._dao.Inserir(this._modelo);

       atualizaJanela();
    }//GEN-LAST:event_jBInserirActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
       atualizaValoresModelo(true);

       this._dao.Alterar(this._modelo);

       atualizaJanela();
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaMouseClicked
        if (jTabela.getSelectedRow() != -1) {
            jTCodigo.setText(jTabela.getValueAt(jTabela.getSelectedRow(),0).toString());
            jTNumero.setText(jTabela.getValueAt(jTabela.getSelectedRow(),1).toString());
            jTAndar.setText(jTabela.getValueAt(jTabela.getSelectedRow(),2).toString());
            jTBloco.setText(jTabela.getValueAt(jTabela.getSelectedRow(),3).toString());
            jTQuantidadeQuartos.setText(jTabela.getValueAt(jTabela.getSelectedRow(),4).toString());
            jTMetragem.setText(jTabela.getValueAt(jTabela.getSelectedRow(),5).toString());
        } 
    }//GEN-LAST:event_jTabelaMouseClicked

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
       dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarActionPerformed
       atualizaValoresModelo(true);

       this._dao.Deletar(this._modelo);

       atualizaJanela();
    }//GEN-LAST:event_jBDeletarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModelApartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModelApartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModelApartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModelApartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBInserir;
    private javax.swing.JButton jBSair;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLAndar;
    private javax.swing.JLabel jLBloco;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLMetragem;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLQuantidadeQuartos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAndar;
    private javax.swing.JTextField jTBloco;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTMetragem;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTextField jTQuantidadeQuartos;
    private javax.swing.JTable jTabela;
    // End of variables declaration//GEN-END:variables
}
