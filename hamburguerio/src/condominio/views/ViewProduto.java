package condominio.views;

import javax.swing.table.DefaultTableModel;

import common.handlers.HandlerJanela;
import common.interfaces.Viewable;
import condominio.models.ModelProduto;
import condominio.daos.DAOProdutos;

public class ViewProduto extends javax.swing.JFrame implements Viewable {
    public ViewProduto(
        HandlerJanela injectedHandlerJanela,
        ModelProduto injectedModel,
        DAOProdutos injectedDao
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
                registro.getIdProduto(),
                registro.getDescricao(),
                registro.getFornecedor(),
                registro.getQuantidadeEstoque(),
                registro.getPrecoUnitario(),
                registro.getPrecoVenda()
            });
        });
    }

    @Override
    public void limpaCamposDeEntrada() {
        this._HANDLER_JANELA.limparListaDeInput(new javax.swing.JTextField[]{
            jTId,
            jTDescricao,
            jTFornecedor,
            jTQuantidadeEstoque,
            jTPrecoUnitario,
            jTPrecoVenda
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
            int idProduto = Integer.parseInt(jTId.getText().trim());

            this._MODELO.setIdProduto(idProduto);
        }

        String descricao = jTDescricao.getText().trim();
        String forcenedor = jTFornecedor.getText().trim();
        int quantidadeEstoque = Integer.parseInt(jTQuantidadeEstoque.getText().trim());
        double precoUnitario = Double.parseDouble(jTPrecoUnitario.getText().trim());
        double precoVenda = Double.parseDouble(jTPrecoVenda.getText().trim());

        this._MODELO.setDescricao(descricao);
        this._MODELO.setFornecedor(forcenedor);
        this._MODELO.setQuantidadeEstoque(quantidadeEstoque);
        this._MODELO.setPrecoUnitario(precoUnitario);
        this._MODELO.setPrecoVenda(precoVenda);
    }

    private final HandlerJanela _HANDLER_JANELA;
    private final ModelProduto _MODELO;
    private final DAOProdutos _DAO;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLId = new javax.swing.JLabel();
        jLFornecedor = new javax.swing.JLabel();
        jLQuantidadeEstoque = new javax.swing.JLabel();
        jLPrecoUnitario = new javax.swing.JLabel();
        jLPrecoVenda = new javax.swing.JLabel();
        jTId = new javax.swing.JTextField();
        jTFornecedor = new javax.swing.JTextField();
        jTQuantidadeEstoque = new javax.swing.JTextField();
        jTPrecoUnitario = new javax.swing.JTextField();
        jTPrecoVenda = new javax.swing.JTextField();
        jBInserir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jBAlterar = new javax.swing.JButton();
        jLDescricao = new javax.swing.JLabel();
        jTDescricao = new javax.swing.JTextField();
        jBDeletar = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLId.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLId.setText("ID");

        jLFornecedor.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLFornecedor.setText("Fornecedor");

        jLQuantidadeEstoque.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLQuantidadeEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLQuantidadeEstoque.setText("Quantidade");

        jLPrecoUnitario.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLPrecoUnitario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPrecoUnitario.setText("Preço Unitário");

        jLPrecoVenda.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLPrecoVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPrecoVenda.setText("Preço Venda");

        jTId.setEditable(false);
        jTId.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTId.setBorder(null);
        jTId.setEnabled(false);

        jTFornecedor.setBackground(new java.awt.Color(207, 207, 207));
        jTFornecedor.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTFornecedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFornecedor.setBorder(null);

        jTQuantidadeEstoque.setBackground(new java.awt.Color(207, 207, 207));
        jTQuantidadeEstoque.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTQuantidadeEstoque.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTQuantidadeEstoque.setBorder(null);

        jTPrecoUnitario.setBackground(new java.awt.Color(207, 207, 207));
        jTPrecoUnitario.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTPrecoUnitario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTPrecoUnitario.setBorder(null);

        jTPrecoVenda.setBackground(new java.awt.Color(207, 207, 207));
        jTPrecoVenda.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTPrecoVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTPrecoVenda.setBorder(null);

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
                "ID", "Numero", "Fornecedor", "Quantidade", "Preço Unitário", "Preço Venda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            jTabela.getColumnModel().getColumn(5).setResizable(false);
        }

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

        jLDescricao.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDescricao.setText("Numero");

        jTDescricao.setBackground(new java.awt.Color(207, 207, 207));
        jTDescricao.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTDescricao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTDescricao.setBorder(null);

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTQuantidadeEstoque)
                                .addComponent(jLQuantidadeEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTDescricao)
                            .addComponent(jLDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTPrecoUnitario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLPrecoUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTPrecoVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLPrecoVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId)
                    .addComponent(jLDescricao)
                    .addComponent(jLFornecedor))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLQuantidadeEstoque)
                    .addComponent(jLPrecoUnitario)
                    .addComponent(jLPrecoVenda))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
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
            jTDescricao,
            jTFornecedor,
            jTQuantidadeEstoque,
            jTPrecoUnitario,
            jTPrecoVenda
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
            java.util.logging.Logger.getLogger(ModelProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModelProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModelProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModelProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBInserir;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLFornecedor;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLPrecoUnitario;
    private javax.swing.JLabel jLPrecoVenda;
    private javax.swing.JLabel jLQuantidadeEstoque;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDescricao;
    private javax.swing.JTextField jTFornecedor;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTPrecoUnitario;
    private javax.swing.JTextField jTPrecoVenda;
    private javax.swing.JTextField jTQuantidadeEstoque;
    private javax.swing.JTable jTabela;
    // End of variables declaration//GEN-END:variables
}
