package Telas_do_Sistema;
import java.awt.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import Classes_do_Sistema.Client;
import Classes_do_Sistema.ReadNDWrite.InitWriting;
import static Classes_do_Sistema.Home.currentClient;
import static Classes_do_Sistema.Home.totalClients;
import static Classes_do_Sistema.Home.clients;



public class ClientForm extends javax.swing.JFrame implements InitWriting {
    
    int coordX, coordY;
    
    public ClientForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        jIptClientID.setText(String.valueOf(currentClient));
    }
    
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBackgroundPane = new javax.swing.JLayeredPane();
        jTitleBar = new javax.swing.JLayeredPane();
        jMinimizeButton = new javax.swing.JButton();
        jCloseButton = new javax.swing.JButton();
        jIptClientName = new javax.swing.JTextField();
        jRegProduct = new javax.swing.JButton();
        jIptClientID = new javax.swing.JTextField();
        jIptClientIDLabel = new javax.swing.JLabel();
        jIptClientNameLabel = new javax.swing.JLabel();
        jCBoxFileExtensions = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setName("clientFrame"); // NOI18N
        setUndecorated(true);

        jBackgroundPane.setBackground(new java.awt.Color(139, 139, 139));
        jBackgroundPane.setOpaque(true);
        jBackgroundPane.setPreferredSize(new java.awt.Dimension(1280, 720));
        jBackgroundPane.setRequestFocusEnabled(false);

        jMinimizeButton.setBackground(new java.awt.Color(249, 249, 249));
        jMinimizeButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jMinimizeButton.setForeground(new java.awt.Color(249, 249, 249));
        jMinimizeButton.setText("-");
        jMinimizeButton.setBorderPainted(false);
        jMinimizeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMinimizeButton.setFocusPainted(false);
        jMinimizeButton.setOpaque(false);
        jMinimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMinimizeButtonActionPerformed(evt);
            }
        });

        jCloseButton.setBackground(new java.awt.Color(249, 249, 249));
        jCloseButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCloseButton.setForeground(new java.awt.Color(249, 249, 249));
        jCloseButton.setText("X");
        jCloseButton.setBorderPainted(false);
        jCloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCloseButton.setFocusPainted(false);
        jCloseButton.setOpaque(false);
        jCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseButtonActionPerformed(evt);
            }
        });

        jTitleBar.setLayer(jMinimizeButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTitleBar.setLayer(jCloseButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jTitleBarLayout = new javax.swing.GroupLayout(jTitleBar);
        jTitleBar.setLayout(jTitleBarLayout);
        jTitleBarLayout.setHorizontalGroup(
            jTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTitleBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jMinimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jTitleBarLayout.setVerticalGroup(
            jTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMinimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCloseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jIptClientName.setBackground(new java.awt.Color(189, 189, 189));
        jIptClientName.setForeground(new java.awt.Color(102, 102, 102));
        jIptClientName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jRegProduct.setBackground(new java.awt.Color(139, 139, 139));
        jRegProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRegProduct.setForeground(new java.awt.Color(249, 249, 249));
        jRegProduct.setText("Cadastrar");
        jRegProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jRegProduct.setFocusable(false);
        jRegProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegProductActionPerformed(evt);
            }
        });

        jIptClientID.setEditable(false);
        jIptClientID.setBackground(new java.awt.Color(189, 189, 189));
        jIptClientID.setForeground(new java.awt.Color(102, 102, 102));
        jIptClientID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jIptClientIDLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIptClientIDLabel.setForeground(new java.awt.Color(249, 249, 249));
        jIptClientIDLabel.setText("Client ID");

        jIptClientNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIptClientNameLabel.setForeground(new java.awt.Color(249, 249, 249));
        jIptClientNameLabel.setText("Client Name");

        jCBoxFileExtensions.setBackground(new java.awt.Color(179, 179, 179));
        jCBoxFileExtensions.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBoxFileExtensions.setForeground(new java.awt.Color(249, 249, 249));
        jCBoxFileExtensions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".txt", ".doc" }));
        jCBoxFileExtensions.setFocusable(false);

        jBackgroundPane.setLayer(jTitleBar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptClientName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jRegProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptClientID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptClientIDLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptClientNameLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jCBoxFileExtensions, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jBackgroundPaneLayout = new javax.swing.GroupLayout(jBackgroundPane);
        jBackgroundPane.setLayout(jBackgroundPaneLayout);
        jBackgroundPaneLayout.setHorizontalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTitleBar)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBackgroundPaneLayout.createSequentialGroup()
                .addContainerGap(461, Short.MAX_VALUE)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBackgroundPaneLayout.createSequentialGroup()
                            .addComponent(jIptClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jIptClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(jIptClientIDLabel)
                            .addGap(136, 136, 136)
                            .addComponent(jIptClientNameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                        .addComponent(jCBoxFileExtensions, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRegProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(461, 461, 461))
        );
        jBackgroundPaneLayout.setVerticalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                .addComponent(jTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIptClientIDLabel)
                    .addComponent(jIptClientNameLabel))
                .addGap(18, 18, 18)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIptClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIptClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRegProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBoxFileExtensions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 247, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jBackgroundPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackgroundPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMinimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMinimizeButtonActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jMinimizeButtonActionPerformed

    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseButtonActionPerformed
        totalClients = currentClient -1;
        this.dispose();
    }//GEN-LAST:event_jCloseButtonActionPerformed

    private void jRegProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegProductActionPerformed
        Client client = new Client();
        reg(client);
    }//GEN-LAST:event_jRegProductActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jBackgroundPane;
    private javax.swing.JComboBox<String> jCBoxFileExtensions;
    private javax.swing.JButton jCloseButton;
    private javax.swing.JTextField jIptClientID;
    private javax.swing.JLabel jIptClientIDLabel;
    private javax.swing.JTextField jIptClientName;
    private javax.swing.JLabel jIptClientNameLabel;
    private javax.swing.JButton jMinimizeButton;
    private javax.swing.JButton jRegProduct;
    private javax.swing.JLayeredPane jTitleBar;
    // End of variables declaration//GEN-END:variables

    public void reg(Client client){
        client.setClientID(Integer.parseInt(jIptClientID.getText()));
        client.setClientName(jIptClientName.getText());
        
        save(client);
        writeFile("Client",(String)jCBoxFileExtensions.getSelectedItem());
        jIptClientID.setText(String.valueOf(currentClient)); 
        jIptClientName.setText("");
    }
    
    public void save(Client client){
        clients[currentClient] = client;
        currentClient ++;
    }
    
    @Override
    public void writeFile(String fileName,String fileExtension) {
        String filePath = DEFAULT_FILE_PATH + fileName + "s" + fileExtension;
        
        try {
            FileWriter fw = new FileWriter(filePath,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(fileName + "-ID: "+jIptClientID.getText());

            pw.println(fileName + "-Name: "+jIptClientName.getText());
            
            pw.print("---------------------------------------------\n");
            pw.flush();
            pw.close();
            fw.close();
        } 
        catch (Exception e) {
            jRegProduct.setBackground(new java.awt.Color(COLOR_ERROR[0],COLOR_ERROR[1], COLOR_ERROR[2]));
        }
        jRegProduct.setBackground(new java.awt.Color(COLOR_SUCESS[0],COLOR_SUCESS[1], COLOR_SUCESS[2]));
    }
}
