package Telas_do_Sistema;
import Classes_do_Sistema.ReadNDWrite.InitWriting;
import static Classes_do_Sistema.ReadNDWrite.InitWriting.COLOR_ERROR;
import static Classes_do_Sistema.ReadNDWrite.InitWriting.COLOR_SUCESS;
import static Classes_do_Sistema.ReadNDWrite.InitWriting.DEFAULT_FILE_PATH;
import java.awt.*;
import java.io.FileWriter;
import java.io.PrintWriter;

public class IncomeInfluxForm extends javax.swing.JFrame implements InitWriting {

    boolean isInflux;
    
    
    public IncomeInfluxForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBackgroundPane = new javax.swing.JLayeredPane();
        jTitleBar = new javax.swing.JLayeredPane();
        jMinimizeButton = new javax.swing.JButton();
        jCloseButton = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLblTitleInflux = new javax.swing.JLabel();
        jLbltSoldProducts = new javax.swing.JLabel();
        jLblTotalProfit = new javax.swing.JLabel();
        jIptSoldProducts = new javax.swing.JTextField();
        jIptTotalProfit = new javax.swing.JTextField();
        jBtnInfluxReg = new javax.swing.JButton();
        jCBoxFileExtensions = new javax.swing.JComboBox<>();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLblTitleOutflux = new javax.swing.JLabel();
        jLblStockedProducts = new javax.swing.JLabel();
        jLblTotalLoss = new javax.swing.JLabel();
        jIptTotalLoss = new javax.swing.JTextField();
        jIptStockedProducts = new javax.swing.JTextField();
        jBtnOutfluxReg = new javax.swing.JButton();
        jCBoxFileExtensions1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setName("incomeInfluxFrame"); // NOI18N
        setUndecorated(true);

        jBackgroundPane.setBackground(new java.awt.Color(139, 139, 139));
        jBackgroundPane.setOpaque(true);

        jTitleBar.setPreferredSize(new java.awt.Dimension(640, 50));

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
                .addGap(0, 1182, Short.MAX_VALUE)
                .addComponent(jMinimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jTitleBarLayout.setVerticalGroup(
            jTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMinimizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jCloseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLayeredPane1.setBackground(new java.awt.Color(249, 249, 249));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(560, 686));

        jLblTitleInflux.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLblTitleInflux.setForeground(new java.awt.Color(139, 139, 139));
        jLblTitleInflux.setText("Entrada");

        jLbltSoldProducts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLbltSoldProducts.setText("Produtos Vendidos");

        jLblTotalProfit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblTotalProfit.setText("Total de Lucro");

        jIptSoldProducts.setForeground(new java.awt.Color(189, 189, 189));
        jIptSoldProducts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)));
        jIptSoldProducts.setOpaque(false);

        jIptTotalProfit.setForeground(new java.awt.Color(189, 189, 189));
        jIptTotalProfit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)));
        jIptTotalProfit.setOpaque(false);

        jBtnInfluxReg.setBackground(new java.awt.Color(139, 139, 139));
        jBtnInfluxReg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtnInfluxReg.setForeground(new java.awt.Color(249, 249, 249));
        jBtnInfluxReg.setText("Enviar");
        jBtnInfluxReg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)));
        jBtnInfluxReg.setFocusable(false);
        jBtnInfluxReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInfluxRegActionPerformed(evt);
            }
        });

        jCBoxFileExtensions.setBackground(new java.awt.Color(179, 179, 179));
        jCBoxFileExtensions.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBoxFileExtensions.setForeground(new java.awt.Color(249, 249, 249));
        jCBoxFileExtensions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".txt", ".doc" }));
        jCBoxFileExtensions.setFocusable(false);

        jLayeredPane1.setLayer(jLblTitleInflux, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLbltSoldProducts, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblTotalProfit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jIptSoldProducts, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jIptTotalProfit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBtnInfluxReg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jCBoxFileExtensions, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLblTitleInflux))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbltSoldProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblTotalProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jIptTotalProfit, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jIptSoldProducts)
                            .addComponent(jBtnInfluxReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBoxFileExtensions, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLblTitleInflux)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbltSoldProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIptSoldProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblTotalProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIptTotalProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnInfluxReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBoxFileExtensions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jLayeredPane2.setBackground(new java.awt.Color(249, 249, 249));
        jLayeredPane2.setOpaque(true);

        jLblTitleOutflux.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLblTitleOutflux.setForeground(new java.awt.Color(139, 139, 139));
        jLblTitleOutflux.setText("Saida");

        jLblStockedProducts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblStockedProducts.setText("Produtos Estocados");

        jLblTotalLoss.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblTotalLoss.setText("Total de Negatividade");

        jIptTotalLoss.setForeground(new java.awt.Color(189, 189, 189));
        jIptTotalLoss.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)));
        jIptTotalLoss.setOpaque(false);

        jIptStockedProducts.setForeground(new java.awt.Color(189, 189, 189));
        jIptStockedProducts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)));
        jIptStockedProducts.setOpaque(false);

        jBtnOutfluxReg.setBackground(new java.awt.Color(139, 139, 139));
        jBtnOutfluxReg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtnOutfluxReg.setForeground(new java.awt.Color(249, 249, 249));
        jBtnOutfluxReg.setText("Enviar");
        jBtnOutfluxReg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 189, 189)));
        jBtnOutfluxReg.setFocusable(false);
        jBtnOutfluxReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOutfluxRegActionPerformed(evt);
            }
        });

        jCBoxFileExtensions1.setBackground(new java.awt.Color(179, 179, 179));
        jCBoxFileExtensions1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBoxFileExtensions1.setForeground(new java.awt.Color(249, 249, 249));
        jCBoxFileExtensions1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".txt", ".doc" }));
        jCBoxFileExtensions1.setFocusable(false);

        jLayeredPane2.setLayer(jLblTitleOutflux, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLblStockedProducts, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLblTotalLoss, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jIptTotalLoss, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jIptStockedProducts, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jBtnOutfluxReg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jCBoxFileExtensions1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jCBoxFileExtensions1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnOutfluxReg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jIptTotalLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLblTotalLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLblTitleOutflux)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jIptStockedProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLblStockedProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLblTitleOutflux)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLblStockedProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIptStockedProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblTotalLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIptTotalLoss, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnOutfluxReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBoxFileExtensions1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jBackgroundPane.setLayer(jTitleBar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jBackgroundPaneLayout = new javax.swing.GroupLayout(jBackgroundPane);
        jBackgroundPane.setLayout(jBackgroundPaneLayout);
        jBackgroundPaneLayout.setHorizontalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jBackgroundPaneLayout.setVerticalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                .addComponent(jTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2))
                .addContainerGap(262, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackgroundPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackgroundPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMinimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMinimizeButtonActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jMinimizeButtonActionPerformed

    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_jCloseButtonActionPerformed

    private void jBtnInfluxRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInfluxRegActionPerformed
        isInflux = true;
        writeFile("Influx",(String)jCBoxFileExtensions.getSelectedItem());
    }//GEN-LAST:event_jBtnInfluxRegActionPerformed

    private void jBtnOutfluxRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOutfluxRegActionPerformed
        isInflux = false;
        writeFile("Outflux",(String)jCBoxFileExtensions1.getSelectedItem());
    }//GEN-LAST:event_jBtnOutfluxRegActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IncomeInfluxForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncomeInfluxForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncomeInfluxForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncomeInfluxForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IncomeInfluxForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jBackgroundPane;
    private javax.swing.JButton jBtnInfluxReg;
    private javax.swing.JButton jBtnOutfluxReg;
    private javax.swing.JComboBox<String> jCBoxFileExtensions;
    private javax.swing.JComboBox<String> jCBoxFileExtensions1;
    private javax.swing.JButton jCloseButton;
    private javax.swing.JTextField jIptSoldProducts;
    private javax.swing.JTextField jIptStockedProducts;
    private javax.swing.JTextField jIptTotalLoss;
    private javax.swing.JTextField jIptTotalProfit;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLabel jLblStockedProducts;
    private javax.swing.JLabel jLblTitleInflux;
    private javax.swing.JLabel jLblTitleOutflux;
    private javax.swing.JLabel jLblTotalLoss;
    private javax.swing.JLabel jLblTotalProfit;
    private javax.swing.JLabel jLbltSoldProducts;
    private javax.swing.JButton jMinimizeButton;
    private javax.swing.JLayeredPane jTitleBar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void writeFile(String fileName, String fileExtension) {
        String filePath = DEFAULT_FILE_PATH + fileName + "es" + fileExtension;
        
        if(isInflux == true){
            try {
                FileWriter fw = new FileWriter(filePath,true);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(fileName + "-Sold-Products: "+ jIptSoldProducts.getText());

                pw.println(fileName + "-Total-Profit: "+ jIptTotalProfit.getText());

                pw.print("---------------------------------------------\n");
                pw.flush();
                pw.close();
                fw.close();
            } 
            catch (Exception e) {
                jBtnInfluxReg.setBackground(new java.awt.Color(COLOR_ERROR[0],COLOR_ERROR[1], COLOR_ERROR[2]));
            }
            jBtnInfluxReg.setBackground(new java.awt.Color(COLOR_SUCESS[0],COLOR_SUCESS[1], COLOR_SUCESS[2]));            
        }else{
            try {
                FileWriter fw = new FileWriter(filePath,true);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(fileName + "-Stocked-Products: "+ jIptStockedProducts.getText());

                pw.println(fileName + "-Total-Loss: "+ jIptTotalLoss.getText());

                pw.print("---------------------------------------------\n");
                pw.flush();
                pw.close();
                fw.close();
            } 
            catch (Exception e) {
                jBtnOutfluxReg.setBackground(new java.awt.Color(COLOR_ERROR[0],COLOR_ERROR[1], COLOR_ERROR[2]));
            }
            jBtnOutfluxReg.setBackground(new java.awt.Color(COLOR_SUCESS[0],COLOR_SUCESS[1], COLOR_SUCESS[2]));            
        }
    }
}
