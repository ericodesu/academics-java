package condominio.views;

import javax.swing.table.DefaultTableModel;

import common.handlers.HandlerJanela;
import common.interfaces.Viewable;
import condominio.models.ModelAreaLazer;
import condominio.daos.DAOAreasLazer;

/**
 *
 * @author Erick Frederick
 */
public class ViewAreaLazer extends javax.swing.JFrame implements Viewable {
    public ViewAreaLazer(
        HandlerJanela injectedHandlerJanela,
        ModelAreaLazer injectedModel,
        DAOAreasLazer injectedDao
    ) {
        this._MODELO = injectedModel;
        this._DAO = injectedDao;

        initComponents();
        hidrataTabela();
    }

    @Override
    public final void hidrataTabela() {
        DefaultTableModel tabela = (DefaultTableModel) jTabela.getModel();

        tabela.setNumRows(0);

        this._DAO.Listar().forEach((registro) -> {
            tabela.addRow(new Object[]{
                registro.getIdAreaLazer(),
                registro.getDescricao()
            });
        });
    }

    @Override
    public void limpaCamposDeEntrada() {
        this._HANDLER_JANELA.limparListaDeInput(new javax.swing.JTextField[]{
            jTId,
            jTDescricao
        });

        jTDescricao.requestFocus();
    }

    @Override
    public void atualizaJanela() {
        hidrataTabela();
        limpaCamposDeEntrada();
    }

    @Override
    public void atualizaValoresModelo(Boolean atualizaOId) {
        if(atualizaOId) {
            int idAreaLazer = Integer.parseInt(jTId.getText().trim());

            this._MODELO.setIdAreaLazer(idAreaLazer);
        }

        String descricao = jTDescricao.getText().trim();

        this._MODELO.setDescricao(descricao);
    }

    private final HandlerJanela _HANDLER_JANELA = new HandlerJanela();
    private final ModelAreaLazer _MODELO;
    private final DAOAreasLazer _DAO;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jLId = new javax.swing.JLabel();
        jLDescricao = new javax.swing.JLabel();
        jTId = new javax.swing.JTextField();
        jTDescricao = new javax.swing.JTextField();
        jBInserir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descri????o"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabela.getTableHeader().setReorderingAllowed(false);
        jTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabela);
        if (jTabela.getColumnModel().getColumnCount() > 0) {
            jTabela.getColumnModel().getColumn(0).setResizable(false);
            jTabela.getColumnModel().getColumn(1).setResizable(false);
        }

        jLId.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLId.setText("ID");

        jLDescricao.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDescricao.setText("Descri????o");

        jTId.setEditable(false);
        jTId.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTId.setBorder(null);

        jTDescricao.setBackground(new java.awt.Color(207, 207, 207));
        jTDescricao.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTDescricao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTDescricao.setBorder(null);

        jBInserir.setBackground(new java.awt.Color(85, 179, 59));
        jBInserir.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jBInserir.setForeground(new java.awt.Color(232, 232, 232));
        jBInserir.setText("Gravar");
        jBInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirActionPerformed(evt);
            }
        });

        jBAlterar.setBackground(new java.awt.Color(82, 82, 82));
        jBAlterar.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jBAlterar.setForeground(new java.awt.Color(232, 232, 232));
        jBAlterar.setText("Alterar");
        jBAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBDeletar.setBackground(new java.awt.Color(140, 42, 42));
        jBDeletar.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jBDeletar.setForeground(new java.awt.Color(232, 232, 232));
        jBDeletar.setText("Deletar");
        jBDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addComponent(jTId)
                    .addComponent(jTDescricao))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed
        atualizaValoresModelo(false);

        this._DAO.Inserir(this._MODELO);

        atualizaJanela();
    }//GEN-LAST:event_jBInserirActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        atualizaValoresModelo(true);

        this._DAO.Alterar(this._MODELO);

        atualizaJanela();
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarActionPerformed
        atualizaValoresModelo(true);

        this._DAO.Deletar(this._MODELO);

        atualizaJanela();
    }//GEN-LAST:event_jBDeletarActionPerformed

    private void jTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaMouseClicked
        this._HANDLER_JANELA.atulizarListaDeInputRelacionadoTabela(new javax.swing.JTextField[]{
            jTId,
            jTDescricao
        }, jTabela);
    }//GEN-LAST:event_jTabelaMouseClicked

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
            java.util.logging.Logger.getLogger(ViewAreaLazer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAreaLazer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAreaLazer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAreaLazer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBInserir;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDescricao;
    private javax.swing.JTextField jTId;
    private javax.swing.JTable jTabela;
    // End of variables declaration//GEN-END:variables
}
