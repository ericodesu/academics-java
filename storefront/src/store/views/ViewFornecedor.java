package store.views;

import store.common.interfaces.Viewable;
import store.common.handlers.HandlerJanela;
import store.models.ModelFornecedor;
import store.daos.DAOFornecedor;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick Frederick
 */
public class ViewFornecedor extends javax.swing.JFrame implements Viewable {
    public ViewFornecedor(
        HandlerJanela injectedHandlerJanela,
        ModelFornecedor injectedModel,
        DAOFornecedor injectedDao
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
                ap.getIdFornecedor(),
                ap.getNome(),
                ap.getCnpj(),
                ap.getTelefone(),
                ap.getEmail()
            });
        });
    }

    @Override
    public void limpaCamposDeEntrada() {
        this._HANDLER_JANELA.limparListaDeInput(new javax.swing.JTextField[]{
            jTId,
            jTNome,
            jTCnpj,
            jTTelefone,
            jTEmail
        });

        jTNome.requestFocus();
    }

    @Override
    public void atualizaJanela() {
        hidrataTabela();
        limpaCamposDeEntrada();
    }

    @Override
    public void atualizaValoresModelo(Boolean atualizaOId) {
        if(atualizaOId) {
            int idFornecedor = Integer.parseInt(jTId.getText().trim());

            this._MODELO.setIdFornecedor(idFornecedor);
        }

        String nome = jTNome.getText().trim();
        String cnpj = jTCnpj.getText().trim();
        String telefone = jTTelefone.getText().trim();
        String email = jTEmail.getText().trim();

        this._MODELO.setNome(nome);
        this._MODELO.setCnpj(cnpj);
        this._MODELO.setTelefone(telefone);
        this._MODELO.setEmail(email);
    }

    private final HandlerJanela _HANDLER_JANELA;
    private final ModelFornecedor _MODELO;
    private final DAOFornecedor _DAO;

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
        jTId = new javax.swing.JTextField();
        jLNome = new javax.swing.JLabel();
        jLCnpj = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jTCnpj = new javax.swing.JTextField();
        jTTelefone = new javax.swing.JTextField();
        jLEmail = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jBInserir = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CNPJ", "Telefone", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jLId.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLId.setText("ID");

        jTId.setEditable(false);
        jTId.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jTId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTId.setBorder(null);

        jLNome.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNome.setText("Nome");

        jLCnpj.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLCnpj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCnpj.setText("CNPJ");

        jLTelefone.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLTelefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTelefone.setText("Telefone");

        jTNome.setBackground(new java.awt.Color(207, 207, 207));
        jTNome.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jTNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTNome.setBorder(null);

        jTCnpj.setBackground(new java.awt.Color(207, 207, 207));
        jTCnpj.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jTCnpj.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCnpj.setBorder(null);

        jTTelefone.setBackground(new java.awt.Color(207, 207, 207));
        jTTelefone.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jTTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTTelefone.setBorder(null);

        jLEmail.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLEmail.setText("E-mail");

        jTEmail.setBackground(new java.awt.Color(207, 207, 207));
        jTEmail.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jTEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTEmail.setBorder(null);

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

        jBModificar.setBackground(new java.awt.Color(82, 82, 82));
        jBModificar.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(232, 232, 232));
        jBModificar.setText("Modificar");
        jBModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
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
                    .addComponent(jTId)
                    .addComponent(jLId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNome)
                            .addComponent(jLNome, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCnpj)
                            .addComponent(jLCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBInserir, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(jBModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(jBDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTTelefone)
                            .addComponent(jLTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTEmail)
                            .addComponent(jLEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLId)
                .addGap(18, 18, 18)
                .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jLCnpj))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmail)
                    .addComponent(jLTelefone))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed
        atualizaValoresModelo(false);

        this._DAO.Inserir(this._MODELO);

        atualizaJanela();
    }//GEN-LAST:event_jBInserirActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        atualizaValoresModelo(true);

        this._DAO.Alterar(this._MODELO);

        atualizaJanela();
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarActionPerformed
        atualizaValoresModelo(true);

        this._DAO.Deletar(this._MODELO);

        atualizaJanela();
    }//GEN-LAST:event_jBDeletarActionPerformed

    private void jTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaMouseClicked
        this._HANDLER_JANELA.atulizarListaDeInputRelacionadoTabela(new javax.swing.JTextField[]{
            jTId,
            jTNome,
            jTCnpj,
            jTTelefone,
            jTEmail
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
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBInserir;
    private javax.swing.JButton jBModificar;
    private javax.swing.JLabel jLCnpj;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCnpj;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTTelefone;
    private javax.swing.JTable jTabela;
    // End of variables declaration//GEN-END:variables
}