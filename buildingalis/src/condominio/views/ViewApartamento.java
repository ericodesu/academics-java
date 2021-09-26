package condominio.views;

import javax.swing.table.DefaultTableModel;

import common.handlers.HandlerJanela;
import common.interfaces.Viewable;
import condominio.models.ModelApartamento;
import condominio.daos.DAOApartamentos;

public class ViewApartamento extends javax.swing.JFrame implements Viewable {
    public ViewApartamento(
        HandlerJanela injectedHandlerJanela,
        ModelApartamento injectedModel,
        DAOApartamentos injectedDao
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

        this._DAO.Listar().forEach((registro) -> {
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
        this._HANDLER_JANELA.limparListaDeInput(new javax.swing.JTextField[]{
            jTId,
            jTNumero,
            jTAndar,
            jTBloco,
            jTQuantidadeQuartos,
            jTMetragem
        });

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
            int idApartamento = Integer.parseInt(jTId.getText().trim());

            this._MODELO.setIdApartamento(idApartamento);
        }

        int numero = Integer.parseInt(jTNumero.getText().trim());
        int andar = Integer.parseInt(jTAndar.getText().trim());
        int bloco = Integer.parseInt(jTBloco.getText().trim());
        int quantidadeQuartos = Integer.parseInt(jTQuantidadeQuartos.getText().trim());
        double metragem = Double.parseDouble(jTMetragem.getText().trim());

        this._MODELO.setNumero(numero);
        this._MODELO.setAndar(andar);
        this._MODELO.setBloco(bloco);
        this._MODELO.setQtdeQuartos(quantidadeQuartos);
        this._MODELO.setMetragem(metragem);
    }

    private final HandlerJanela _HANDLER_JANELA;
    private final ModelApartamento _MODELO;
    private final DAOApartamentos _DAO;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLId = new javax.swing.JLabel();
        jLAndar = new javax.swing.JLabel();
        jLBloco = new javax.swing.JLabel();
        jLQuantidadeQuartos = new javax.swing.JLabel();
        jLMetragem = new javax.swing.JLabel();
        jTId = new javax.swing.JTextField();
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
        jBDeletar = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLId.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLId.setText("ID");

        jLAndar.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLAndar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAndar.setText("Andar");

        jLBloco.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLBloco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBloco.setText("Bloco");

        jLQuantidadeQuartos.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLQuantidadeQuartos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLQuantidadeQuartos.setText("Quantidade Quartos");

        jLMetragem.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLMetragem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMetragem.setText("Metragem");

        jTId.setEditable(false);
        jTId.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTId.setBorder(null);
        jTId.setEnabled(false);

        jTAndar.setBackground(new java.awt.Color(207, 207, 207));
        jTAndar.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTAndar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTAndar.setBorder(null);

        jTBloco.setBackground(new java.awt.Color(207, 207, 207));
        jTBloco.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTBloco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTBloco.setBorder(null);

        jTQuantidadeQuartos.setBackground(new java.awt.Color(207, 207, 207));
        jTQuantidadeQuartos.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTQuantidadeQuartos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTQuantidadeQuartos.setBorder(null);

        jTMetragem.setBackground(new java.awt.Color(207, 207, 207));
        jTMetragem.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTMetragem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTMetragem.setBorder(null);

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
        jTabela.getTableHeader().setReorderingAllowed(false);
        jTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabela);

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

        jLNumero.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNumero.setText("Numero");

        jTNumero.setBackground(new java.awt.Color(207, 207, 207));
        jTNumero.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTNumero.setBorder(null);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(98, 98, 98)
                        .addComponent(jBAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(95, 95, 95)
                        .addComponent(jBDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTId)
                                    .addComponent(jLId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLBloco, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLQuantidadeQuartos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTQuantidadeQuartos, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTBloco)
                                .addGap(382, 382, 382)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTAndar)
                            .addComponent(jTMetragem)
                            .addComponent(jLMetragem, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(jLAndar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId)
                    .addComponent(jLNumero)
                    .addComponent(jLAndar))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTAndar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBloco)
                    .addComponent(jLQuantidadeQuartos)
                    .addComponent(jLMetragem))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQuantidadeQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTMetragem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
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

    private void jTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaMouseClicked
        this._HANDLER_JANELA.atulizarListaDeInputRelacionadoTabela(new javax.swing.JTextField[]{
            jTId,
            jTNumero,
            jTAndar,
            jTBloco,
            jTQuantidadeQuartos,
            jTMetragem
        }, jTabela); 
    }//GEN-LAST:event_jTabelaMouseClicked

    private void jBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarActionPerformed
       atualizaValoresModelo(true);

       this._DAO.Deletar(this._MODELO);

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
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLAndar;
    private javax.swing.JLabel jLBloco;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLMetragem;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLQuantidadeQuartos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAndar;
    private javax.swing.JTextField jTBloco;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTMetragem;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTextField jTQuantidadeQuartos;
    private javax.swing.JTable jTabela;
    // End of variables declaration//GEN-END:variables
}
