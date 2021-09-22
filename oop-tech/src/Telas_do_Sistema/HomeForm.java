package Telas_do_Sistema;
import java.awt.*;

public class HomeForm extends javax.swing.JFrame {
    int coordX, coordY;
    
    public HomeForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBackgroundPane = new javax.swing.JLayeredPane();
        jTitleBar = new javax.swing.JPanel();
        jMinimizeButton = new javax.swing.JButton();
        jCloseButton = new javax.swing.JButton();
        jTitlePane = new javax.swing.JLayeredPane();
        jTitleLabel = new javax.swing.JLabel();
        jProductButton = new javax.swing.JButton();
        jClientButton = new javax.swing.JButton();
        jOrderButton = new javax.swing.JButton();
        jIventoryButton = new javax.swing.JButton();
        jIncomeInfluxButton = new javax.swing.JButton();
        jSaleButton = new javax.swing.JButton();
        jBudgetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OOP Tech");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(249, 249, 249));
        setName("homeFrame"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jBackgroundPane.setBackground(new java.awt.Color(149, 149, 149));
        jBackgroundPane.setOpaque(true);
        jBackgroundPane.setPreferredSize(new java.awt.Dimension(1280, 734));

        jTitleBar.setBackground(new java.awt.Color(249, 249, 249));
        jTitleBar.setOpaque(false);
        jTitleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTitleBarMouseDragged(evt);
            }
        });
        jTitleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTitleBarMousePressed(evt);
            }
        });

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

        jTitlePane.setBackground(new java.awt.Color(249, 249, 249));
        jTitlePane.setOpaque(true);

        jTitleLabel.setBackground(new java.awt.Color(249, 249, 249));
        jTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jTitleLabel.setForeground(new java.awt.Color(130, 130, 130));
        jTitleLabel.setText("OOP TECH");

        jTitlePane.setLayer(jTitleLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jTitlePaneLayout = new javax.swing.GroupLayout(jTitlePane);
        jTitlePane.setLayout(jTitlePaneLayout);
        jTitlePaneLayout.setHorizontalGroup(
            jTitlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTitlePaneLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jTitlePaneLayout.setVerticalGroup(
            jTitlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTitlePaneLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        jProductButton.setBackground(new java.awt.Color(149, 149, 149));
        jProductButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jProductButton.setForeground(new java.awt.Color(249, 249, 249));
        jProductButton.setText("Produtos");
        jProductButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jProductButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jProductButton.setFocusPainted(false);
        jProductButton.setOpaque(false);
        jProductButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProductButtonMouseClicked(evt);
            }
        });

        jClientButton.setBackground(new java.awt.Color(149, 149, 149));
        jClientButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jClientButton.setForeground(new java.awt.Color(249, 249, 249));
        jClientButton.setText("Clientes");
        jClientButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jClientButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jClientButton.setFocusPainted(false);
        jClientButton.setOpaque(false);
        jClientButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jClientButtonMouseClicked(evt);
            }
        });

        jOrderButton.setBackground(new java.awt.Color(149, 149, 149));
        jOrderButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jOrderButton.setForeground(new java.awt.Color(249, 249, 249));
        jOrderButton.setText("Pedidos");
        jOrderButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jOrderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jOrderButton.setFocusPainted(false);
        jOrderButton.setOpaque(false);
        jOrderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jOrderButtonMouseClicked(evt);
            }
        });

        jIventoryButton.setBackground(new java.awt.Color(149, 149, 149));
        jIventoryButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIventoryButton.setForeground(new java.awt.Color(249, 249, 249));
        jIventoryButton.setText("Iventario");
        jIventoryButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jIventoryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jIventoryButton.setFocusPainted(false);
        jIventoryButton.setOpaque(false);
        jIventoryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIventoryButtonMouseClicked(evt);
            }
        });
        jIventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIventoryButtonActionPerformed(evt);
            }
        });

        jIncomeInfluxButton.setBackground(new java.awt.Color(149, 149, 149));
        jIncomeInfluxButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIncomeInfluxButton.setForeground(new java.awt.Color(249, 249, 249));
        jIncomeInfluxButton.setText("Fluxo Do Caixa");
        jIncomeInfluxButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jIncomeInfluxButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jIncomeInfluxButton.setFocusPainted(false);
        jIncomeInfluxButton.setOpaque(false);
        jIncomeInfluxButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIncomeInfluxButtonMouseClicked(evt);
            }
        });

        jSaleButton.setBackground(new java.awt.Color(149, 149, 149));
        jSaleButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSaleButton.setForeground(new java.awt.Color(249, 249, 249));
        jSaleButton.setText("Vendas");
        jSaleButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jSaleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSaleButton.setFocusPainted(false);
        jSaleButton.setOpaque(false);
        jSaleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSaleButtonMouseClicked(evt);
            }
        });

        jBudgetButton.setBackground(new java.awt.Color(149, 149, 149));
        jBudgetButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBudgetButton.setForeground(new java.awt.Color(249, 249, 249));
        jBudgetButton.setText("Orçamentos");
        jBudgetButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jBudgetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBudgetButton.setFocusPainted(false);
        jBudgetButton.setOpaque(false);
        jBudgetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBudgetButtonMouseClicked(evt);
            }
        });

        jBackgroundPane.setLayer(jTitleBar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jTitlePane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jProductButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jClientButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jOrderButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIventoryButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIncomeInfluxButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jSaleButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jBudgetButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jBackgroundPaneLayout = new javax.swing.GroupLayout(jBackgroundPane);
        jBackgroundPane.setLayout(jBackgroundPaneLayout);
        jBackgroundPaneLayout.setHorizontalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                .addComponent(jTitlePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBudgetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                        .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jIncomeInfluxButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jBackgroundPaneLayout.setVerticalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                .addComponent(jTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBudgetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIncomeInfluxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addComponent(jSaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTitlePane))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackgroundPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBackgroundPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_jCloseButtonActionPerformed

    private void jMinimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMinimizeButtonActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jMinimizeButtonActionPerformed

    private void jTitleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTitleBarMousePressed
        coordX = evt.getX();
        coordY = evt.getY();
    }//GEN-LAST:event_jTitleBarMousePressed

    private void jTitleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTitleBarMouseDragged

        this.setLocation(this.getLocation().x + evt.getX() - coordX,this.getLocation().y + evt.getY() - coordY);
    }//GEN-LAST:event_jTitleBarMouseDragged

    private void jProductButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductButtonMouseClicked
        ProductForm productForm = new ProductForm();
        productForm.setVisible(true);
    }//GEN-LAST:event_jProductButtonMouseClicked

    private void jClientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jClientButtonMouseClicked
        ClientForm clientForm = new ClientForm();
        clientForm.setVisible(true);
    }//GEN-LAST:event_jClientButtonMouseClicked

    private void jOrderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOrderButtonMouseClicked
        OrderForm orderForm = new OrderForm();
        orderForm.setVisible(true);
    }//GEN-LAST:event_jOrderButtonMouseClicked

    private void jBudgetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBudgetButtonMouseClicked
        BudgetForm budgetForm = new BudgetForm();
        budgetForm.setVisible(true);
    }//GEN-LAST:event_jBudgetButtonMouseClicked

    private void jIventoryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIventoryButtonMouseClicked
        IventoryForm iventoryForm = new IventoryForm();
        iventoryForm.setVisible(true);
    }//GEN-LAST:event_jIventoryButtonMouseClicked

    private void jIncomeInfluxButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIncomeInfluxButtonMouseClicked
        IncomeInfluxForm incomeInfluxForm = new IncomeInfluxForm();
        incomeInfluxForm.setVisible(true);
    }//GEN-LAST:event_jIncomeInfluxButtonMouseClicked

    private void jSaleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSaleButtonMouseClicked
        SaleForm saleForm = new SaleForm();
        saleForm.setVisible(true);
    }//GEN-LAST:event_jSaleButtonMouseClicked

    private void jIventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIventoryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIventoryButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jBackgroundPane;
    private javax.swing.JButton jBudgetButton;
    private javax.swing.JButton jClientButton;
    private javax.swing.JButton jCloseButton;
    private javax.swing.JButton jIncomeInfluxButton;
    private javax.swing.JButton jIventoryButton;
    private javax.swing.JButton jMinimizeButton;
    private javax.swing.JButton jOrderButton;
    private javax.swing.JButton jProductButton;
    private javax.swing.JButton jSaleButton;
    private javax.swing.JPanel jTitleBar;
    private javax.swing.JLabel jTitleLabel;
    private javax.swing.JLayeredPane jTitlePane;
    // End of variables declaration//GEN-END:variables
}
