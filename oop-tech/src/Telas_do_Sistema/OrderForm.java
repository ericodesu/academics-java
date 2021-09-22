package Telas_do_Sistema;
import static Classes_do_Sistema.Home.currentOrders;
import static Classes_do_Sistema.Home.orders;
import static Classes_do_Sistema.Home.currentProduct;
import static Classes_do_Sistema.Home.products;
import Classes_do_Sistema.Order;
import Classes_do_Sistema.ReadNDWrite.InitWriting;
import java.awt.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.DefaultComboBoxModel;

public class OrderForm extends javax.swing.JFrame implements InitWriting {
    String[] listIDProduct = new String[currentProduct];
    
    public OrderForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        fillCBXProductID();
        jIptOrderID.setText(String.valueOf(currentOrders));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBackgroundPane = new javax.swing.JLayeredPane();
        jTitleBar = new javax.swing.JLayeredPane();
        jMinimizeButton = new javax.swing.JButton();
        jCloseButton = new javax.swing.JButton();
        jIptOrderID = new javax.swing.JTextField();
        jCBXOrderProducts = new javax.swing.JComboBox<>();
        jBtnRegOrder = new javax.swing.JButton();
        jLblOrderID = new javax.swing.JLabel();
        jLblOrderProducts = new javax.swing.JLabel();
        jCBoxFileExtensions = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setName("orderFrame"); // NOI18N
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jMinimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jTitleBarLayout.setVerticalGroup(
            jTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMinimizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jCloseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jIptOrderID.setEditable(false);
        jIptOrderID.setBackground(new java.awt.Color(189, 189, 189));
        jIptOrderID.setForeground(new java.awt.Color(102, 102, 102));
        jIptOrderID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jCBXOrderProducts.setBackground(new java.awt.Color(189, 189, 189));
        jCBXOrderProducts.setForeground(new java.awt.Color(102, 102, 102));
        jCBXOrderProducts.setToolTipText("");
        jCBXOrderProducts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jBtnRegOrder.setBackground(new java.awt.Color(139, 139, 139));
        jBtnRegOrder.setForeground(new java.awt.Color(249, 249, 249));
        jBtnRegOrder.setText("Fazer Pedido");
        jBtnRegOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jBtnRegOrder.setPreferredSize(new java.awt.Dimension(53, 17));
        jBtnRegOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegOrderActionPerformed(evt);
            }
        });

        jLblOrderID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLblOrderID.setForeground(new java.awt.Color(249, 249, 249));
        jLblOrderID.setText("Oder ID");

        jLblOrderProducts.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLblOrderProducts.setForeground(new java.awt.Color(249, 249, 249));
        jLblOrderProducts.setText("Products");

        jCBoxFileExtensions.setBackground(new java.awt.Color(179, 179, 179));
        jCBoxFileExtensions.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBoxFileExtensions.setForeground(new java.awt.Color(249, 249, 249));
        jCBoxFileExtensions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".txt", ".doc" }));
        jCBoxFileExtensions.setFocusable(false);

        jBackgroundPane.setLayer(jTitleBar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptOrderID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jCBXOrderProducts, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jBtnRegOrder, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jLblOrderID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jLblOrderProducts, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jCBoxFileExtensions, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jBackgroundPaneLayout = new javax.swing.GroupLayout(jBackgroundPane);
        jBackgroundPane.setLayout(jBackgroundPaneLayout);
        jBackgroundPaneLayout.setHorizontalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBackgroundPaneLayout.createSequentialGroup()
                .addContainerGap(420, Short.MAX_VALUE)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBackgroundPaneLayout.createSequentialGroup()
                        .addComponent(jIptOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jCBXOrderProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(397, 397, 397))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBackgroundPaneLayout.createSequentialGroup()
                        .addComponent(jCBoxFileExtensions, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jBtnRegOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(540, 540, 540))))
            .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                .addGap(482, 482, 482)
                .addComponent(jLblOrderID)
                .addGap(250, 250, 250)
                .addComponent(jLblOrderProducts)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jBackgroundPaneLayout.setVerticalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                .addComponent(jTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblOrderID)
                    .addComponent(jLblOrderProducts))
                .addGap(33, 33, 33)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIptOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBXOrderProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnRegOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBoxFileExtensions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(242, Short.MAX_VALUE))
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

    private void jBtnRegOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegOrderActionPerformed
        Order order = new Order();
        reg(order);
    }//GEN-LAST:event_jBtnRegOrderActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jBackgroundPane;
    private javax.swing.JButton jBtnRegOrder;
    private javax.swing.JComboBox<String> jCBXOrderProducts;
    private javax.swing.JComboBox<String> jCBoxFileExtensions;
    private javax.swing.JButton jCloseButton;
    private javax.swing.JTextField jIptOrderID;
    private javax.swing.JLabel jLblOrderID;
    private javax.swing.JLabel jLblOrderProducts;
    private javax.swing.JButton jMinimizeButton;
    private javax.swing.JLayeredPane jTitleBar;
    // End of variables declaration//GEN-END:variables

    public void fillCBXProductID(){
        for(int i = 0; i < currentProduct; i++)
        {
            listIDProduct[i] = Integer.toString(products[i].getProductID());
        }
        DefaultComboBoxModel listIDProducts = new DefaultComboBoxModel(listIDProduct);
        jCBXOrderProducts.setModel(listIDProducts);
    }
    
    public void reg(Order order){
        order.setOrderID(Integer.parseInt(jIptOrderID.getText()));
        order.setProductID(Integer.parseInt(jCBXOrderProducts.getItemAt(jCBXOrderProducts.getSelectedIndex()))); 
        
        save(order);
        writeFile("Order",(String)jCBoxFileExtensions.getSelectedItem());
        jIptOrderID.setText(String.valueOf(currentOrders));
    }
    
    public void save(Order order){
        orders[currentOrders] = order;
        currentOrders ++;
    }
    
    @Override
    public void writeFile(String fileName,String fileExtension) {
        String filePath = DEFAULT_FILE_PATH + fileName + "s" + fileExtension;
        
        try {
            FileWriter fw = new FileWriter(filePath,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(fileName + "-ID: "+jIptOrderID.getText());

            pw.println(fileName + "-Order-ID: "+ jCBXOrderProducts.getItemAt(jCBXOrderProducts.getSelectedIndex()));
            
            pw.print("---------------------------------------------\n");
            pw.flush();
            pw.close();
            fw.close();
        } 
        catch (Exception e) {
            jBtnRegOrder.setBackground(new java.awt.Color(COLOR_ERROR[0],COLOR_ERROR[1], COLOR_ERROR[2]));
        }
        jBtnRegOrder.setBackground(new java.awt.Color(COLOR_SUCESS[0],COLOR_SUCESS[1], COLOR_SUCESS[2]));
    }
}
