package Telas_do_Sistema;
import java.awt.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import Classes_do_Sistema.Product;
import Classes_do_Sistema.ReadNDWrite.InitWriting;
import static Classes_do_Sistema.Home.currentProduct;
import static Classes_do_Sistema.Home.products;

public class ProductForm extends javax.swing.JFrame implements InitWriting {
    
    public ProductForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        jIptProdID.setText(String.valueOf(currentProduct));
    }
    
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBackgroundPane = new javax.swing.JLayeredPane();
        jTitleBar = new javax.swing.JLayeredPane();
        jMinimizeButton = new javax.swing.JButton();
        jCloseButton = new javax.swing.JButton();
        jIptProdName = new javax.swing.JTextField();
        jBtnRegProduct = new javax.swing.JButton();
        jIptProdProductionPrice = new javax.swing.JTextField();
        jIptProdID = new javax.swing.JTextField();
        jIptProdDescription = new javax.swing.JTextField();
        jIptProdSellingPrice = new javax.swing.JTextField();
        jIptProdIDLabel = new javax.swing.JLabel();
        jIptProdNameLabel = new javax.swing.JLabel();
        jIptProdDescriptionLabel = new javax.swing.JLabel();
        jIptProdSellingPriceLabel = new javax.swing.JLabel();
        jIptProdProductionPriceLabel = new javax.swing.JLabel();
        jCBoxFileExtensions = new javax.swing.JComboBox<>();
        jIptProdStock = new javax.swing.JTextField();
        jIptProdStockLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));

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

        jIptProdName.setBackground(new java.awt.Color(189, 189, 189));
        jIptProdName.setForeground(new java.awt.Color(102, 102, 102));
        jIptProdName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jBtnRegProduct.setBackground(new java.awt.Color(139, 139, 139));
        jBtnRegProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBtnRegProduct.setForeground(new java.awt.Color(249, 249, 249));
        jBtnRegProduct.setText("Cadastrar");
        jBtnRegProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jBtnRegProduct.setFocusable(false);
        jBtnRegProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegProductActionPerformed(evt);
            }
        });

        jIptProdProductionPrice.setBackground(new java.awt.Color(189, 189, 189));
        jIptProdProductionPrice.setForeground(new java.awt.Color(102, 102, 102));
        jIptProdProductionPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jIptProdID.setEditable(false);
        jIptProdID.setBackground(new java.awt.Color(189, 189, 189));
        jIptProdID.setForeground(new java.awt.Color(102, 102, 102));
        jIptProdID.setText("0");
        jIptProdID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jIptProdDescription.setBackground(new java.awt.Color(189, 189, 189));
        jIptProdDescription.setForeground(new java.awt.Color(102, 102, 102));
        jIptProdDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jIptProdSellingPrice.setBackground(new java.awt.Color(189, 189, 189));
        jIptProdSellingPrice.setForeground(new java.awt.Color(102, 102, 102));
        jIptProdSellingPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jIptProdIDLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIptProdIDLabel.setForeground(new java.awt.Color(249, 249, 249));
        jIptProdIDLabel.setText("ID Produto");

        jIptProdNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIptProdNameLabel.setForeground(new java.awt.Color(249, 249, 249));
        jIptProdNameLabel.setText("Nome Produto");

        jIptProdDescriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIptProdDescriptionLabel.setForeground(new java.awt.Color(249, 249, 249));
        jIptProdDescriptionLabel.setText("Descricação Produto");

        jIptProdSellingPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIptProdSellingPriceLabel.setForeground(new java.awt.Color(249, 249, 249));
        jIptProdSellingPriceLabel.setText("Preço de Venda do Produto");

        jIptProdProductionPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIptProdProductionPriceLabel.setForeground(new java.awt.Color(249, 249, 249));
        jIptProdProductionPriceLabel.setText("Preço de Produção do Produto");

        jCBoxFileExtensions.setBackground(new java.awt.Color(179, 179, 179));
        jCBoxFileExtensions.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBoxFileExtensions.setForeground(new java.awt.Color(249, 249, 249));
        jCBoxFileExtensions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".txt", ".doc" }));
        jCBoxFileExtensions.setFocusable(false);

        jIptProdStock.setBackground(new java.awt.Color(189, 189, 189));
        jIptProdStock.setForeground(new java.awt.Color(102, 102, 102));
        jIptProdStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jIptProdStockLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIptProdStockLabel.setForeground(new java.awt.Color(249, 249, 249));
        jIptProdStockLabel.setText("Estoque Produto");

        jBackgroundPane.setLayer(jTitleBar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jBtnRegProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdProductionPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdSellingPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdIDLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdNameLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdDescriptionLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdSellingPriceLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdProductionPriceLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jCBoxFileExtensions, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdStock, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdStockLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jBackgroundPaneLayout = new javax.swing.GroupLayout(jBackgroundPane);
        jBackgroundPane.setLayout(jBackgroundPaneLayout);
        jBackgroundPaneLayout.setHorizontalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTitleBar)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBackgroundPaneLayout.createSequentialGroup()
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jIptProdIDLabel)
                        .addGap(112, 112, 112)
                        .addComponent(jIptProdNameLabel)
                        .addGap(93, 93, 93)
                        .addComponent(jIptProdDescriptionLabel)
                        .addGap(57, 57, 57)
                        .addComponent(jIptProdSellingPriceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jIptProdProductionPriceLabel))
                    .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                        .addContainerGap(178, Short.MAX_VALUE)
                        .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBackgroundPaneLayout.createSequentialGroup()
                                .addComponent(jIptProdID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jIptProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCBoxFileExtensions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnRegProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jIptProdDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jIptProdStock, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jIptProdSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jIptProdProductionPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(180, 180, 180))
            .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                .addGap(594, 594, 594)
                .addComponent(jIptProdStockLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jBackgroundPaneLayout.setVerticalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                .addComponent(jTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIptProdIDLabel)
                    .addComponent(jIptProdNameLabel)
                    .addComponent(jIptProdDescriptionLabel)
                    .addComponent(jIptProdSellingPriceLabel)
                    .addComponent(jIptProdProductionPriceLabel))
                .addGap(18, 18, 18)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIptProdID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIptProdDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIptProdSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIptProdProductionPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIptProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jIptProdStockLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jIptProdStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnRegProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBoxFileExtensions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 192, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jBackgroundPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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
        this.dispose();
    }//GEN-LAST:event_jCloseButtonActionPerformed

    private void jBtnRegProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegProductActionPerformed
        Product product = new Product();
        reg(product);
    }//GEN-LAST:event_jBtnRegProductActionPerformed

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
    private javax.swing.JButton jBtnRegProduct;
    private javax.swing.JComboBox<String> jCBoxFileExtensions;
    private javax.swing.JButton jCloseButton;
    private javax.swing.JTextField jIptProdDescription;
    private javax.swing.JLabel jIptProdDescriptionLabel;
    private javax.swing.JTextField jIptProdID;
    private javax.swing.JLabel jIptProdIDLabel;
    private javax.swing.JTextField jIptProdName;
    private javax.swing.JLabel jIptProdNameLabel;
    private javax.swing.JTextField jIptProdProductionPrice;
    private javax.swing.JLabel jIptProdProductionPriceLabel;
    private javax.swing.JTextField jIptProdSellingPrice;
    private javax.swing.JLabel jIptProdSellingPriceLabel;
    private javax.swing.JTextField jIptProdStock;
    private javax.swing.JLabel jIptProdStockLabel;
    private javax.swing.JButton jMinimizeButton;
    private javax.swing.JLayeredPane jTitleBar;
    // End of variables declaration//GEN-END:variables

    public void reg(Product product){      
        save(product);
        writeFile("Product",(String)jCBoxFileExtensions.getSelectedItem());
        
        jIptProdID.setText(String.valueOf(currentProduct));  
        jIptProdName.setText("");
        jIptProdDescription.setText("");
        jIptProdSellingPrice.setText("");
        jIptProdProductionPrice.setText("");
        jIptProdStock.setText("");
    }
    
    public void save(Product product){
        product.setProductID(Integer.parseInt(jIptProdID.getText()));
        product.setProductName(jIptProdName.getText());
        product.setProductDescription(jIptProdDescription.getText());
        product.setProductSellingPrice(Double.parseDouble(jIptProdSellingPrice.getText()));
        product.setProductProductionPrice(Double.parseDouble(jIptProdProductionPrice.getText()));
        product.setProductStock(Integer.parseInt(jIptProdStock.getText()));
        
        products[currentProduct] = product;
        currentProduct ++;
    }
    
    @Override
    public void writeFile(String fileName,String fileExtension) {
        String filePath = DEFAULT_FILE_PATH + fileName + "s" + fileExtension;
        
        try {
            FileWriter fw = new FileWriter(filePath,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(fileName + "-ID: "+jIptProdID.getText());

            pw.println(fileName + "-Name: "+jIptProdName.getText());

            pw.println(fileName + "-Description: "+jIptProdDescription.getText());
            
            pw.println(fileName + "-Production-Price: "+jIptProdProductionPrice.getText());

            pw.println(fileName + "-Selling-Price: "+jIptProdSellingPrice.getText());
            
            pw.println(fileName + "-Stock: "+jIptProdStock.getText());
            
            pw.print("---------------------------------------------\n");
            pw.flush();
            pw.close();
            fw.close();
        } 
        catch (Exception e) {
            jBtnRegProduct.setBackground(new java.awt.Color(COLOR_ERROR[0],COLOR_ERROR[1], COLOR_ERROR[2]));
        }
        jBtnRegProduct.setBackground(new java.awt.Color(COLOR_SUCESS[0],COLOR_SUCESS[1], COLOR_SUCESS[2]));
    }
}
