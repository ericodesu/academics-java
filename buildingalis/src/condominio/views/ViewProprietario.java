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
            jTBloco,
            jTNome
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
        jTCpf = new javax.swing.JTextField();
        jTTelefone = new javax.swing.JTextField();
        jTemail = new javax.swing.JTextField();
        jTDataNascimento = new javax.swing.JTextField();
        jTApartamento = new javax.swing.JTextField();
        jLBloco = new javax.swing.JLabel();
        jTBloco = new javax.swing.JTextField();
        jBInserir = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jBAlterar = new javax.swing.JButton();
        jTcodigo = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLNome.setText("Nome");
        getContentPane().add(jLNome);
        jLNome.setBounds(180, 100, 27, 14);

        jLCpf.setText("Cpf");
        getContentPane().add(jLCpf);
        jLCpf.setBounds(460, 100, 17, 14);

        jLTelefone.setText("Telefone");
        getContentPane().add(jLTelefone);
        jLTelefone.setBounds(580, 100, 60, 14);

        jLEmail.setText("Email");
        getContentPane().add(jLEmail);
        jLEmail.setBounds(170, 170, 60, 14);

        jLDataNascimento.setText("Data_Nascimento");
        getContentPane().add(jLDataNascimento);
        jLDataNascimento.setBounds(340, 170, 130, 14);

        jLApartamento.setText("Apartamento");
        getContentPane().add(jLApartamento);
        jLApartamento.setBounds(470, 160, 100, 20);
        getContentPane().add(jTNome);
        jTNome.setBounds(170, 130, 250, 20);
        getContentPane().add(jTCpf);
        jTCpf.setBounds(440, 130, 110, 20);
        getContentPane().add(jTTelefone);
        jTTelefone.setBounds(570, 130, 120, 20);
        getContentPane().add(jTemail);
        jTemail.setBounds(160, 190, 160, 20);
        getContentPane().add(jTDataNascimento);
        jTDataNascimento.setBounds(340, 190, 110, 20);
        getContentPane().add(jTApartamento);
        jTApartamento.setBounds(470, 190, 80, 20);

        jLBloco.setText("Bloco");
        getContentPane().add(jLBloco);
        jLBloco.setBounds(600, 160, 25, 14);
        getContentPane().add(jTBloco);
        jTBloco.setBounds(590, 190, 60, 20);

        jBInserir.setText("Gravar");
        jBInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirActionPerformed(evt);
            }
        });
        getContentPane().add(jBInserir);
        jBInserir.setBounds(10, 480, 130, 60);

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });
        getContentPane().add(jBSair);
        jBSair.setBounds(660, 480, 120, 60);

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

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 280, 770, 180);

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jBAlterar);
        jBAlterar.setBounds(330, 480, 130, 60);

        jTcodigo.setEnabled(false);
        getContentPane().add(jTcodigo);
        jTcodigo.setBounds(80, 130, 50, 20);

        jLCodigo.setText("Codigo");
        getContentPane().add(jLCodigo);
        jLCodigo.setBounds(80, 110, 33, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
       dispose();
    }//GEN-LAST:event_jBSairActionPerformed

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
                jTBloco,
                jTNome
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
    private javax.swing.JButton jBInserir;
    private javax.swing.JButton jBSair;
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
    private javax.swing.JTextField jTCpf;
    private javax.swing.JTextField jTDataNascimento;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTTelefone;
    private javax.swing.JTable jTabela;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTemail;
    // End of variables declaration//GEN-END:variables
}
