package condominio.views;

import javax.swing.table.DefaultTableModel;

import common.handlers.HandlerJanela;
import common.interfaces.Viewable;
import condominio.models.ModelFuncionario;
import condominio.daos.DAOFuncionarios;

/**
 *
 * @author Erick Frederick
 */
public class ViewFuncionario extends javax.swing.JFrame implements Viewable {
    public ViewFuncionario(ModelFuncionario injectedModel, DAOFuncionarios injectedDao) {
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
                ap.getIdFuncionario(),
                ap.getNome(),
                ap.getCpf(),
                ap.getTelefone(),
                ap.getEmail(),
                ap.getCargo(),
                ap.getSalario()
            });
        });
    }

    @Override
    public void limpaCamposDeEntrada() {
        this._HANDLER_JANELA.limparListaDeInput(new javax.swing.JTextField[]{
            jTId,
            jTNome,
            jTCpf,
            jTTelefone,
            jTEmail,
            jTCargo,
            jTSalario
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
            int idFuncionario = Integer.parseInt(jTId.getText().trim());

            this._MODELO.setIdFuncionario(idFuncionario);
        }

        String nome = jTNome.getText().trim();
        String cpf = jTCpf.getText().trim();
        String telefone = jTTelefone.getText().trim();
        String email = jTEmail.getText().trim();
        String cargo = jTCargo.getText().trim();
        double salario = Double.parseDouble(jTSalario.getText().trim());

        this._MODELO.setNome(nome);
        this._MODELO.setCpf(cpf);
        this._MODELO.setTelefone(telefone);
        this._MODELO.setEmail(email);
        this._MODELO.setCargo(cargo);
        this._MODELO.setSalario(salario);
        
    }

    private final HandlerJanela _HANDLER_JANELA = new HandlerJanela();
    private final ModelFuncionario _MODELO;
    private final DAOFuncionarios _DAO;

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
        jLNome = new javax.swing.JLabel();
        jLCpf = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jLCargo = new javax.swing.JLabel();
        jLSalario = new javax.swing.JLabel();
        jTId = new javax.swing.JTextField();
        jTNome = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jTCargo = new javax.swing.JTextField();
        jTSalario = new javax.swing.JTextField();
        jBInserir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBDeletar = new javax.swing.JButton();
        jTCpf = new javax.swing.JFormattedTextField();
        jTTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone", "E-mail", "Cargo", "Salário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            jTabela.getColumnModel().getColumn(6).setResizable(false);
        }

        jLId.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLId.setText("ID");

        jLNome.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNome.setText("Nome");

        jLCpf.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLCpf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCpf.setText("CPF");

        jLTelefone.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLTelefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTelefone.setText("Telefone");

        jLEmail.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLEmail.setText("E-mail");

        jLCargo.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCargo.setText("Cargo");

        jLSalario.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLSalario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSalario.setText("Salário");

        jTId.setEditable(false);
        jTId.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTId.setBorder(null);

        jTNome.setBackground(new java.awt.Color(207, 207, 207));
        jTNome.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTNome.setBorder(null);
        jTNome.setPreferredSize(new java.awt.Dimension(59, 40));

        jTEmail.setBackground(new java.awt.Color(207, 207, 207));
        jTEmail.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTEmail.setBorder(null);
        jTEmail.setPreferredSize(new java.awt.Dimension(59, 40));

        jTCargo.setBackground(new java.awt.Color(207, 207, 207));
        jTCargo.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTCargo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCargo.setBorder(null);

        jTSalario.setBackground(new java.awt.Color(207, 207, 207));
        jTSalario.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTSalario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTSalario.setBorder(null);

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

        jTCpf.setBackground(new java.awt.Color(207, 207, 207));
        jTCpf.setBorder(null);
        try {
            jTCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCpf.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jTTelefone.setBackground(new java.awt.Color(207, 207, 207));
        jTTelefone.setBorder(null);
        try {
            jTTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTTelefone.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addComponent(jTId)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTCargo)
                            .addComponent(jTCpf))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTSalario)
                            .addComponent(jTTelefone)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(90, 90, 90)
                        .addComponent(jBAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(90, 90, 90)
                        .addComponent(jBDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLId)
                .addGap(18, 18, 18)
                .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jLCpf)
                    .addComponent(jLTelefone))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTelefone, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmail)
                    .addComponent(jLCargo)
                    .addComponent(jLSalario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
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
            jTNome,
            jTCpf,
            jTTelefone,
            jTEmail,
            jTCargo,
            jTSalario
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
            java.util.logging.Logger.getLogger(ViewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBInserir;
    private javax.swing.JLabel jLCargo;
    private javax.swing.JLabel jLCpf;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLSalario;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCargo;
    private javax.swing.JFormattedTextField jTCpf;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTSalario;
    private javax.swing.JFormattedTextField jTTelefone;
    private javax.swing.JTable jTabela;
    // End of variables declaration//GEN-END:variables
}