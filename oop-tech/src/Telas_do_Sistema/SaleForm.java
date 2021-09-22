package Telas_do_Sistema;
import Classes_do_Sistema.Sale;
import static Classes_do_Sistema.Home.clients;
import static Classes_do_Sistema.Home.currentClient;
import static Classes_do_Sistema.Home.currentProduct;
import static Classes_do_Sistema.Home.products;
import static Classes_do_Sistema.Home.currentBudget;
import static Classes_do_Sistema.Home.totalBudget;
import Classes_do_Sistema.ReadNDWrite.InitWriting;
import java.awt.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class SaleForm extends javax.swing.JFrame implements InitWriting{
    Sale sale = new Sale();
    
    String[] listNameClient = new String[currentClient];
    String[] listIDProduct = new String[currentProduct];
    
    int item = 0;
    
    public SaleForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        fillCBXClientName();
        fillCBXProductID();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnGroupPayment = new javax.swing.ButtonGroup();
        jBackgroundPane = new javax.swing.JLayeredPane();
        jTitleBar = new javax.swing.JLayeredPane();
        jMinimizeButton = new javax.swing.JButton();
        jCloseButton = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLblID = new javax.swing.JLabel();
        jIptID = new javax.swing.JTextField();
        jBtnStart = new javax.swing.JButton();
        jBtnReg = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblCart = new javax.swing.JTable();
        jLblClient = new javax.swing.JLabel();
        jIptSeller = new javax.swing.JTextField();
        jLblSeller = new javax.swing.JLabel();
        jLblDescription = new javax.swing.JLabel();
        jIptDescription = new javax.swing.JTextField();
        jCBXClient = new javax.swing.JComboBox<>();
        jCBXProductID = new javax.swing.JComboBox<>();
        jLblProductID = new javax.swing.JLabel();
        jLblTotal = new javax.swing.JLabel();
        jTxtTotal = new javax.swing.JTextField();
        jRBtnPaymentMoney = new javax.swing.JRadioButton();
        jRBtnPaymentDebitC = new javax.swing.JRadioButton();
        jRBtnPaymentCreditC = new javax.swing.JRadioButton();
        jLblPaymentMoney = new javax.swing.JLabel();
        jLblPaymentCreditC = new javax.swing.JLabel();
        jLblPaymentDebitC = new javax.swing.JLabel();
        jCBoxFileExtensions = new javax.swing.JComboBox<>();
        jIptQuantity = new javax.swing.JTextField();
        jLblQuantity = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setName("saleFrame"); // NOI18N
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

        jLayeredPane1.setBackground(new java.awt.Color(249, 249, 249));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(960, 480));

        jLblID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblID.setForeground(new java.awt.Color(1, 1, 1));
        jLblID.setText("ID Venda");
        jLblID.setEnabled(false);

        jIptID.setEditable(false);
        jIptID.setBackground(new java.awt.Color(139, 139, 139));
        jIptID.setForeground(new java.awt.Color(139, 139, 139));
        jIptID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 139, 139)));
        jIptID.setEnabled(false);
        jIptID.setOpaque(false);

        jBtnStart.setBackground(new java.awt.Color(139, 139, 139));
        jBtnStart.setForeground(new java.awt.Color(249, 249, 249));
        jBtnStart.setText("Nova Venda");
        jBtnStart.setBorder(null);
        jBtnStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnStartActionPerformed(evt);
            }
        });

        jBtnReg.setBackground(new java.awt.Color(139, 139, 139));
        jBtnReg.setForeground(new java.awt.Color(249, 249, 249));
        jBtnReg.setText("Finalizar Venda");
        jBtnReg.setBorder(null);
        jBtnReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnReg.setEnabled(false);
        jBtnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegActionPerformed(evt);
            }
        });

        jTblCart.setBackground(new java.awt.Color(249, 249, 249));
        jTblCart.setForeground(new java.awt.Color(109, 109, 109));
        jTblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID da Venda", "Nome do Cliente", "Nome do Vendedor", "ID do Produto", "Descrição do Produto", "Quantidade do Produto", "Preço Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTblCart.setGridColor(new java.awt.Color(109, 109, 109));
        jTblCart.setSelectionBackground(new java.awt.Color(139, 139, 139));
        jTblCart.setSelectionForeground(new java.awt.Color(249, 249, 249));
        jScrollPane1.setViewportView(jTblCart);

        jLblClient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblClient.setForeground(new java.awt.Color(1, 1, 1));
        jLblClient.setText("Cliente");

        jIptSeller.setBackground(new java.awt.Color(139, 139, 139));
        jIptSeller.setForeground(new java.awt.Color(139, 139, 139));
        jIptSeller.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 139, 139)));
        jIptSeller.setEnabled(false);
        jIptSeller.setOpaque(false);

        jLblSeller.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblSeller.setForeground(new java.awt.Color(1, 1, 1));
        jLblSeller.setText("Vendedor");
        jLblSeller.setEnabled(false);

        jLblDescription.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblDescription.setForeground(new java.awt.Color(1, 1, 1));
        jLblDescription.setText("Descrição do Produto");
        jLblDescription.setEnabled(false);

        jIptDescription.setEditable(false);
        jIptDescription.setBackground(new java.awt.Color(139, 139, 139));
        jIptDescription.setForeground(new java.awt.Color(139, 139, 139));
        jIptDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 139, 139)));
        jIptDescription.setEnabled(false);
        jIptDescription.setOpaque(false);

        jCBXClient.setBackground(new java.awt.Color(189, 189, 189));
        jCBXClient.setForeground(new java.awt.Color(102, 102, 102));
        jCBXClient.setMaximumRowCount(5);
        jCBXClient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jCBXProductID.setBackground(new java.awt.Color(189, 189, 189));
        jCBXProductID.setForeground(new java.awt.Color(102, 102, 102));
        jCBXProductID.setMaximumRowCount(5);
        jCBXProductID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jLblProductID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblProductID.setForeground(new java.awt.Color(1, 1, 1));
        jLblProductID.setText("ID Produto");

        jLblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblTotal.setForeground(new java.awt.Color(139, 139, 139));
        jLblTotal.setText("TOTAL");

        jTxtTotal.setBackground(new java.awt.Color(139, 139, 139));
        jTxtTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTxtTotal.setForeground(new java.awt.Color(139, 139, 139));
        jTxtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtTotal.setText("0");
        jTxtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 139, 139)));
        jTxtTotal.setOpaque(false);

        jBtnGroupPayment.add(jRBtnPaymentMoney);
        jRBtnPaymentMoney.setForeground(new java.awt.Color(139, 139, 139));
        jRBtnPaymentMoney.setText("Boleto");
        jRBtnPaymentMoney.setEnabled(false);
        jRBtnPaymentMoney.setOpaque(false);
        jRBtnPaymentMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtnPaymentMoneyActionPerformed(evt);
            }
        });

        jBtnGroupPayment.add(jRBtnPaymentDebitC);
        jRBtnPaymentDebitC.setForeground(new java.awt.Color(139, 139, 139));
        jRBtnPaymentDebitC.setText("Cartão de Débito");
        jRBtnPaymentDebitC.setEnabled(false);
        jRBtnPaymentDebitC.setOpaque(false);
        jRBtnPaymentDebitC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtnPaymentDebitCActionPerformed(evt);
            }
        });

        jBtnGroupPayment.add(jRBtnPaymentCreditC);
        jRBtnPaymentCreditC.setForeground(new java.awt.Color(139, 139, 139));
        jRBtnPaymentCreditC.setText("Cartão de Crédito");
        jRBtnPaymentCreditC.setEnabled(false);
        jRBtnPaymentCreditC.setOpaque(false);
        jRBtnPaymentCreditC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtnPaymentCreditCActionPerformed(evt);
            }
        });

        jLblPaymentMoney.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblPaymentMoney.setForeground(new java.awt.Color(1, 1, 1));
        jLblPaymentMoney.setText("20% de Desconto");
        jLblPaymentMoney.setEnabled(false);

        jLblPaymentCreditC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblPaymentCreditC.setForeground(new java.awt.Color(1, 1, 1));
        jLblPaymentCreditC.setText("12x Sem juros");
        jLblPaymentCreditC.setEnabled(false);

        jLblPaymentDebitC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblPaymentDebitC.setForeground(new java.awt.Color(1, 1, 1));
        jLblPaymentDebitC.setText("12x Sem juros");
        jLblPaymentDebitC.setEnabled(false);

        jCBoxFileExtensions.setBackground(new java.awt.Color(179, 179, 179));
        jCBoxFileExtensions.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBoxFileExtensions.setForeground(new java.awt.Color(249, 249, 249));
        jCBoxFileExtensions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".txt", ".doc" }));
        jCBoxFileExtensions.setFocusable(false);

        jIptQuantity.setBackground(new java.awt.Color(139, 139, 139));
        jIptQuantity.setForeground(new java.awt.Color(139, 139, 139));
        jIptQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 139, 139)));
        jIptQuantity.setEnabled(false);
        jIptQuantity.setOpaque(false);

        jLblQuantity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblQuantity.setForeground(new java.awt.Color(1, 1, 1));
        jLblQuantity.setText("Quantidade");
        jLblQuantity.setEnabled(false);

        jLayeredPane1.setLayer(jLblID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jIptID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBtnStart, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBtnReg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblClient, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jIptSeller, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblSeller, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jIptDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jCBXClient, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jCBXProductID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblProductID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTxtTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRBtnPaymentMoney, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRBtnPaymentDebitC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRBtnPaymentCreditC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblPaymentMoney, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblPaymentCreditC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblPaymentDebitC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jCBoxFileExtensions, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jIptQuantity, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblQuantity, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLblID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jIptID, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCBoxFileExtensions, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBXProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblProductID))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jIptDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblDescription))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblQuantity)
                                    .addComponent(jIptQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRBtnPaymentDebitC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRBtnPaymentCreditC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRBtnPaymentMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblPaymentMoney)
                                    .addComponent(jLblPaymentDebitC)
                                    .addComponent(jLblPaymentCreditC))
                                .addGap(38, 38, 38)
                                .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBXClient, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblClient))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLblSeller)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jIptSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLblTotal)
                                        .addGap(86, 86, 86))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblID)
                    .addComponent(jIptID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBoxFileExtensions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblClient)
                    .addComponent(jLblSeller))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblTotal)
                    .addComponent(jCBXClient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIptSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(0, 31, Short.MAX_VALUE)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLblDescription)
                                            .addComponent(jLblQuantity))
                                        .addGap(18, 18, 18)
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jIptDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jIptQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLblProductID)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBXProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(63, 63, 63))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jTxtTotal)
                                .addGap(52, 52, 52)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBtnPaymentMoney)
                            .addComponent(jLblPaymentMoney))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBtnPaymentDebitC)
                            .addComponent(jLblPaymentDebitC))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBtnPaymentCreditC)
                            .addComponent(jLblPaymentCreditC))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jBackgroundPane.setLayer(jTitleBar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jBackgroundPaneLayout = new javax.swing.GroupLayout(jBackgroundPane);
        jBackgroundPane.setLayout(jBackgroundPaneLayout);
        jBackgroundPaneLayout.setHorizontalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        jBackgroundPaneLayout.setVerticalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                .addComponent(jTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackgroundPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackgroundPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMinimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMinimizeButtonActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jMinimizeButtonActionPerformed

    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_jCloseButtonActionPerformed

    private void jBtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnStartActionPerformed
        if(jCBXClient.getItemAt(jCBXClient.getSelectedIndex()) != null && jCBXProductID.getItemAt(jCBXProductID.getSelectedIndex()) != null){
             enable();
        }     
    }//GEN-LAST:event_jBtnStartActionPerformed

    private void jRBtnPaymentMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtnPaymentMoneyActionPerformed
        calcFullPrice("Money");
    }//GEN-LAST:event_jRBtnPaymentMoneyActionPerformed

    private void jRBtnPaymentDebitCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtnPaymentDebitCActionPerformed
        calcFullPrice("DebitC");
    }//GEN-LAST:event_jRBtnPaymentDebitCActionPerformed

    private void jRBtnPaymentCreditCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtnPaymentCreditCActionPerformed
        calcFullPrice("CreditC");
    }//GEN-LAST:event_jRBtnPaymentCreditCActionPerformed

    private void jBtnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegActionPerformed
        reg();
    }//GEN-LAST:event_jBtnRegActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaleForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jBackgroundPane;
    private javax.swing.ButtonGroup jBtnGroupPayment;
    private javax.swing.JButton jBtnReg;
    private javax.swing.JButton jBtnStart;
    private javax.swing.JComboBox<String> jCBXClient;
    private javax.swing.JComboBox<String> jCBXProductID;
    private javax.swing.JComboBox<String> jCBoxFileExtensions;
    private javax.swing.JButton jCloseButton;
    private javax.swing.JTextField jIptDescription;
    private javax.swing.JTextField jIptID;
    private javax.swing.JTextField jIptQuantity;
    private javax.swing.JTextField jIptSeller;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel jLblClient;
    private javax.swing.JLabel jLblDescription;
    private javax.swing.JLabel jLblID;
    private javax.swing.JLabel jLblPaymentCreditC;
    private javax.swing.JLabel jLblPaymentDebitC;
    private javax.swing.JLabel jLblPaymentMoney;
    private javax.swing.JLabel jLblProductID;
    private javax.swing.JLabel jLblQuantity;
    private javax.swing.JLabel jLblSeller;
    private javax.swing.JLabel jLblTotal;
    private javax.swing.JButton jMinimizeButton;
    private javax.swing.JRadioButton jRBtnPaymentCreditC;
    private javax.swing.JRadioButton jRBtnPaymentDebitC;
    private javax.swing.JRadioButton jRBtnPaymentMoney;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblCart;
    private javax.swing.JLayeredPane jTitleBar;
    private javax.swing.JTextField jTxtTotal;
    // End of variables declaration//GEN-END:variables

    public void updateOrderID(){
        item = Integer.parseInt(jCBXProductID.getItemAt(jCBXProductID.getSelectedIndex()));
        
        totalBudget ++;
        sale.Hash(Integer.parseInt(jCBXProductID.getItemAt(jCBXProductID.getSelectedIndex())), totalBudget);
        
        jIptID.setText(sale.getSaleID());
    }
    
    public void fillCBXClientName(){      
        for(int i = 0; i < currentClient; i++)
        {
            listNameClient[i] = clients[i].getClientName();
        }
        DefaultComboBoxModel listNameClients = new DefaultComboBoxModel(listNameClient);
        jCBXClient.setModel(listNameClients);
    }
    
    public void fillCBXProductID(){
        for(int i = 0; i < currentProduct; i++)
        {
            listIDProduct[i] = Integer.toString(products[i].getProductID());
        }
        DefaultComboBoxModel listIDProducts = new DefaultComboBoxModel(listIDProduct);
        jCBXProductID.setModel(listIDProducts);
    }
    
    public void enable(){
        updateOrderID();
        
        jIptDescription.setText(products[item].getProductName()+ " - " + products[item].getProductDescription());

        jRBtnPaymentMoney.setEnabled(true);
        jRBtnPaymentDebitC.setEnabled(true);
        jRBtnPaymentCreditC.setEnabled(true);
        jLblID.setEnabled(true);
        jIptID.setEnabled(true);
        jLblSeller.setEnabled(true);
        jIptSeller.setEnabled(true);
        jLblDescription.setEnabled(true);
        jIptDescription.setEnabled(true);
        jLblQuantity.setEnabled(true);
        jIptQuantity.setEnabled(true);
    }
    
    public void reset(){
        //Buttons
        jBtnGroupPayment.clearSelection();  
        jLblPaymentMoney.setEnabled(false);
        jRBtnPaymentMoney.setEnabled(false);
        jLblPaymentDebitC.setEnabled(false);
        jRBtnPaymentDebitC.setEnabled(false);
        jLblPaymentCreditC.setEnabled(false);
        jRBtnPaymentCreditC.setEnabled(false);
        
        //Inputs
        jLblID.setEnabled(false);
        jIptID.setEnabled(false);
        jIptID.setText("");
        jLblSeller.setEnabled(false);
        jIptSeller.setEnabled(false);
        jIptSeller.setText("");
        jLblDescription.setEnabled(false);
        jIptDescription.setEnabled(false);
        jIptDescription.setText("");
        jLblQuantity.setEnabled(false);
        jIptQuantity.setEnabled(false);
        jIptQuantity.setText("");
        
        //Outputs
        jTxtTotal.setText("0");      
    }
    
    public void calcFullPrice(String paymentType){
        if(paymentType.equals("Money")){
            jLblPaymentMoney.setEnabled(true);
            jLblPaymentDebitC.setEnabled(false);
            jLblPaymentCreditC.setEnabled(false);
            getFullPrice(0.2);           
        }else{
            if(paymentType.equals("DebitC")){
                jLblPaymentMoney.setEnabled(false);
                jLblPaymentDebitC.setEnabled(true);
                jLblPaymentCreditC.setEnabled(false);
                getFullPrice(0);                
            }else{
                jLblPaymentMoney.setEnabled(false);
                jLblPaymentDebitC.setEnabled(false);
                jLblPaymentCreditC.setEnabled(true);
                getFullPrice(0);                
            }
        }
    }
    
    public void getFullPrice(double discountPercentage) {
        jTxtTotal.setText(String.valueOf((products[item].getProductSellingPrice() - (products[item].getProductSellingPrice() * discountPercentage)) * Integer.parseInt(jIptQuantity.getText()))); 
        jBtnReg.setEnabled(true);
    }
    public void reg(){        
        insertToCart();
        writeFile("Sale",(String)jCBoxFileExtensions.getSelectedItem());
        
        currentBudget ++;
        
        reset();
    }
    
    public void insertToCart(){
        DefaultTableModel cart = (DefaultTableModel) jTblCart.getModel();
        Object[] cart_data = {
            jIptID.getText(),
            jCBXClient.getItemAt(jCBXClient.getSelectedIndex()),
            jIptSeller.getText(),
            jCBXProductID.getItemAt(jCBXProductID.getSelectedIndex()),
            jIptDescription.getText(),
            jIptQuantity.getText(),
            jTxtTotal.getText()
        };
        cart.addRow(cart_data);
    }
    
    @Override
    public void writeFile(String fileName, String fileExtension) {
        String filePath = DEFAULT_FILE_PATH + fileName + "s" + fileExtension;
        
        try {
            FileWriter fw = new FileWriter(filePath,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(fileName + "-ID: "+ jIptID.getText());

            pw.println(fileName + "-Client-Name: "+ jCBXClient.getItemAt(jCBXClient.getSelectedIndex()));
            
            pw.println(fileName + "-Seller: "+ jIptSeller.getText());
            
            pw.println(fileName + "-Product-ID: "+ jCBXProductID.getItemAt(jCBXProductID.getSelectedIndex()));
            
            pw.println(fileName + "-Production-Description: "+ jIptDescription.getText());
            
            pw.println(fileName + "-Production-Quantity: "+ jIptQuantity.getText());
            
            pw.println(fileName + "-Total-Price: "+ jTxtTotal.getText());
            
            pw.print("---------------------------------------------\n");
            pw.flush();
            pw.close();
            fw.close();
        } 
        catch (Exception e) {
            jBtnReg.setBackground(new java.awt.Color(COLOR_ERROR[0],COLOR_ERROR[1], COLOR_ERROR[2]));
        }
        jBtnReg.setBackground(new java.awt.Color(COLOR_SUCESS[0],COLOR_SUCESS[1], COLOR_SUCESS[2]));
    }
}
