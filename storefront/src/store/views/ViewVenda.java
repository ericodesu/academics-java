package store.views;

import store.common.interfaces.Viewable;
import store.common.handlers.HandlerJanela;
import store.models.ModelVenda;
import store.daos.DAOVenda;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick Frederick
 */
public class ViewVenda extends javax.swing.JFrame implements Viewable {
    public ViewVenda(
        HandlerJanela injectedHandlerJanela,
        ModelVenda injectedModel,
        DAOVenda injectedDao
    ) {
        this._HANDLER_JANELA = injectedHandlerJanela;
        this._MODELO = injectedModel;
        this._DAO = injectedDao;

        initComponents();
        hidrataTabela();
    }

    @Override
    public final void hidrataTabela() {
        DefaultTableModel tabela = (DefaultTableModel) jTabela.getModel();

        tabela.setNumRows(0);

        this._DAO.Listar().forEach((ap) -> {
            tabela.addRow(new Object[]{
                ap.getIdVenda(),
                ap.getIdCliente(),
                ap.getIdProduto(),
                ap.getValorUnitario(),
                ap.getTotal()
            });
        });
    }

    @Override
    public void limpaCamposDeEntrada() {
        this._HANDLER_JANELA.limparListaDeInput(new javax.swing.JTextField[]{
            jTId,
            jTIdCliente,
            jTIdProduto,
            jTValorUnitario,
            jTTotal
        });

        jTIdCliente.requestFocus();
    }

    @Override
    public void atualizaJanela() {
        hidrataTabela();
        limpaCamposDeEntrada();
    }

    @Override
    public void atualizaValoresModelo(Boolean atualizaOId) {
        if(atualizaOId) {
            int idVenda = Integer.parseInt(jTId.getText().trim());

            this._MODELO.setIdVenda(idVenda);
        }

        int idCliente = Integer.parseInt(jTIdCliente.getText().trim());
        int idProduto = Integer.parseInt(jTIdProduto.getText().trim());
        float valorUnitario = Float.parseFloat(jTValorUnitario.getText().trim());
        float total = Float.parseFloat(jTTotal.getText().trim());

        this._MODELO.setIdCliente(idCliente);
        this._MODELO.setIdProduto(idProduto);
        this._MODELO.setValorUnitario(valorUnitario);
        this._MODELO.setTotal(total);
    }

    private final HandlerJanela _HANDLER_JANELA;
    private final ModelVenda _MODELO;
    private final DAOVenda _DAO;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLId = new javax.swing.JLabel();
        jLIdCliente = new javax.swing.JLabel();
        jLIdProduto = new javax.swing.JLabel();
        jLValorUnitario = new javax.swing.JLabel();
        jLTotal = new javax.swing.JLabel();
        jTId = new javax.swing.JTextField();
        jTIdCliente = new javax.swing.JTextField();
        jTIdProduto = new javax.swing.JTextField();
        jTValorUnitario = new javax.swing.JTextField();
        jTTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jBInserir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLId.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLId.setText("ID");

        jLIdCliente.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLIdCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLIdCliente.setText("ID Cliente");

        jLIdProduto.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLIdProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLIdProduto.setText("ID Produto");

        jLValorUnitario.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLValorUnitario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLValorUnitario.setText("Valor Unit??rio");

        jLTotal.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTotal.setText("Total");

        jTId.setEditable(false);
        jTId.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTId.setBorder(null);

        jTIdCliente.setBackground(new java.awt.Color(207, 207, 207));
        jTIdCliente.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTIdCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTIdCliente.setBorder(null);

        jTIdProduto.setBackground(new java.awt.Color(207, 207, 207));
        jTIdProduto.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTIdProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTIdProduto.setBorder(null);

        jTValorUnitario.setBackground(new java.awt.Color(207, 207, 207));
        jTValorUnitario.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTValorUnitario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTValorUnitario.setBorder(null);

        jTTotal.setBackground(new java.awt.Color(207, 207, 207));
        jTTotal.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTTotal.setBorder(null);

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID Cliente", "ID Produto", "Valor Unit??rio", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            jTabela.getColumnModel().getColumn(2).setResizable(false);
            jTabela.getColumnModel().getColumn(3).setResizable(false);
            jTabela.getColumnModel().getColumn(4).setResizable(false);
        }

        jBInserir.setBackground(new java.awt.Color(85, 179, 59));
        jBInserir.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jBInserir.setForeground(new java.awt.Color(232, 232, 232));
        jBInserir.setText("Inserir");
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTId)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTValorUnitario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTIdCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLValorUnitario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLIdCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLIdProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                            .addComponent(jLTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTIdProduto)
                            .addComponent(jTTotal)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBInserir, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addGap(60, 60, 60)
                        .addComponent(jBAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addGap(60, 60, 60)
                        .addComponent(jBDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLId)
                .addGap(18, 18, 18)
                .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIdCliente)
                    .addComponent(jLIdProduto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLValorUnitario)
                    .addComponent(jLTotal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
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
            jTIdCliente,
            jTIdProduto,
            jTValorUnitario,
            jTTotal
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
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBInserir;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLIdCliente;
    private javax.swing.JLabel jLIdProduto;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JLabel jLValorUnitario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTIdCliente;
    private javax.swing.JTextField jTIdProduto;
    private javax.swing.JTextField jTTotal;
    private javax.swing.JTextField jTValorUnitario;
    private javax.swing.JTable jTabela;
    // End of variables declaration//GEN-END:variables
}
