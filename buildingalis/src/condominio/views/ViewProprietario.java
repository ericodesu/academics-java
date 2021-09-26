package condominio.views;

import java.sql.Date;
import javax.swing.table.DefaultTableModel;

import common.handlers.HandlerJanela;
import common.interfaces.Viewable;
import condominio.models.ModelProprietario;
import condominio.daos.DAOProprietarios;

public class ViewProprietario extends javax.swing.JFrame implements Viewable {
    public ViewProprietario(ModelProprietario injectedModel, DAOProprietarios injectedDao) {
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
            tabela.addRow(new Object[] {
                registro.getIdProprietario(),
                registro.getNome(),
                registro.getCpf(),
                registro.getTelefone(),
                registro.getEmail(),
                registro.getData(),
                registro.getApartamento(),
                registro.getBloco()  
            });
        });
    }

    @Override
    public void limpaCamposDeEntrada() {
        this._HANDLER_JANELA.limparListaDeInput(new javax.swing.JTextField[]{
            jTcodigo,
            jTNome,
            jTCpf,
            jTTelefone,
            jTemail,
            jTDataNascimento,
            jTApartamento,
            jTBloco
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
            int codigo = Integer.parseInt(jTcodigo.getText().trim());
            
            this._MODELO.setIdProprietario(codigo);
        }

        String nome = jTNome.getText().trim();
        String cpf = jTCpf.getText().trim();
        String telefone = jTTelefone.getText().trim();
        String email = jTemail.getText().trim();
        Date data = Date.valueOf(jTDataNascimento.getText());
        int apartamento = Integer.parseInt(jTApartamento.getText().trim());
        int bloco = Integer.parseInt(jTBloco.getText().trim());

        this._MODELO.setNome(nome);
        this._MODELO.setCpf(cpf);
        this._MODELO.setTelefone(telefone);
        this._MODELO.setEmail(email);
        this._MODELO.setData(data);
        this._MODELO.setApartamento(apartamento);
        this._MODELO.setBloco(bloco);
    }

    private final HandlerJanela _HANDLER_JANELA = new HandlerJanela();
    private final ModelProprietario _MODELO;
    private final DAOProprietarios _DAO;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLNome = new javax.swing.JLabel();
        jLCpf = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jLDataNascimento = new javax.swing.JLabel();
        jLApartamento = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jTemail = new javax.swing.JTextField();
        jTApartamento = new javax.swing.JTextField();
        jLBloco = new javax.swing.JLabel();
        jTBloco = new javax.swing.JTextField();
        jBInserir = new javax.swing.JButton();
        jBDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jBAlterar = new javax.swing.JButton();
        jTcodigo = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
        jTCpf = new javax.swing.JFormattedTextField();
        jTTelefone = new javax.swing.JFormattedTextField();
        jTDataNascimento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLDataNascimento.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLDataNascimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDataNascimento.setText("Data Nascimento");

        jLApartamento.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLApartamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLApartamento.setText("Apartamento");

        jTNome.setBackground(new java.awt.Color(207, 207, 207));
        jTNome.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTNome.setBorder(null);

        jTemail.setBackground(new java.awt.Color(207, 207, 207));
        jTemail.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTemail.setBorder(null);

        jTApartamento.setBackground(new java.awt.Color(207, 207, 207));
        jTApartamento.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTApartamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTApartamento.setBorder(null);

        jLBloco.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLBloco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBloco.setText("Bloco");

        jTBloco.setBackground(new java.awt.Color(207, 207, 207));
        jTBloco.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTBloco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTBloco.setBorder(null);

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

        jTabela.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Cpf", "Telefone", "E-mail", "Data_Nascimento", "Apartamento", "Bloco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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

        jTcodigo.setEditable(false);
        jTcodigo.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTcodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTcodigo.setBorder(null);
        jTcodigo.setEnabled(false);

        jLCodigo.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCodigo.setText("Codigo");

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

        jTDataNascimento.setBackground(new java.awt.Color(207, 207, 207));
        jTDataNascimento.setBorder(null);
        try {
            jTDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTDataNascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTDataNascimento.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70)
                        .addComponent(jBAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70)
                        .addComponent(jBDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTcodigo))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTNome)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(jLCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTCpf)
                            .addComponent(jTDataNascimento))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTApartamento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLApartamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(jTTelefone))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(jTemail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLBloco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTBloco, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(jLNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone)
                    .addComponent(jLCpf)
                    .addComponent(jLEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTemail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDataNascimento)
                    .addComponent(jLApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLBloco))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarActionPerformed
        atualizaValoresModelo(true);

        this._DAO.Deletar(this._MODELO);

        atualizaJanela();
    }//GEN-LAST:event_jBDeletarActionPerformed

    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed
        atualizaValoresModelo(false);

        this._DAO.Inserir(this._MODELO);

        atualizaJanela();
    }//GEN-LAST:event_jBInserirActionPerformed

    private void jTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaMouseClicked
        this._HANDLER_JANELA.atulizarListaDeInputRelacionadoTabela(new javax.swing.JTextField[]{
                jTcodigo,
                jTNome,
                jTCpf,
                jTTelefone,
                jTemail,
                jTDataNascimento,
                jTApartamento,
                jTBloco
            }, jTabela);
    }//GEN-LAST:event_jTabelaMouseClicked

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        atualizaValoresModelo(true);

        this._DAO.Alterar(this._MODELO);

        atualizaJanela();
    }//GEN-LAST:event_jBAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBInserir;
    private javax.swing.JLabel jLApartamento;
    private javax.swing.JLabel jLBloco;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLCpf;
    private javax.swing.JLabel jLDataNascimento;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTApartamento;
    private javax.swing.JTextField jTBloco;
    private javax.swing.JFormattedTextField jTCpf;
    private javax.swing.JFormattedTextField jTDataNascimento;
    private javax.swing.JTextField jTNome;
    private javax.swing.JFormattedTextField jTTelefone;
    private javax.swing.JTable jTabela;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTemail;
    // End of variables declaration//GEN-END:variables
}
