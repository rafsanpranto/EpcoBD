
package Login_Register;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Cost_admin extends javax.swing.JFrame {

    public Cost_admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new java.awt.Panel();
        jPanel1 = new javax.swing.JPanel();
        Nav_NewPass = new javax.swing.JLabel();
        Nav_PassCost = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nav_Staff = new javax.swing.JLabel();
        Nav_Search = new javax.swing.JLabel();
        Log_out = new javax.swing.JLabel();
        Nav_PassList = new javax.swing.JLabel();
        Nav_Accounts = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_passNum = new javax.swing.JTextField();
        button_Search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_passName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_charge = new javax.swing.JTextField();
        button_recieve_due = new javax.swing.JButton();
        txt_present_cost = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        button_Cost = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_recieve = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_due = new javax.swing.JTextField();
        txtfld_cost = new javax.swing.JTextField();
        txt_recieve_due = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(77, 45, 113));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nav_NewPass.setBackground(new java.awt.Color(204, 0, 153));
        Nav_NewPass.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        Nav_NewPass.setForeground(new java.awt.Color(255, 255, 255));
        Nav_NewPass.setText("   New Passanger");
        Nav_NewPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Nav_NewPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nav_NewPassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Nav_NewPassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Nav_NewPassMouseExited(evt);
            }
        });
        jPanel1.add(Nav_NewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 162, 290, 70));

        Nav_PassCost.setBackground(new java.awt.Color(255, 255, 255));
        Nav_PassCost.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        Nav_PassCost.setForeground(new java.awt.Color(143, 130, 130));
        Nav_PassCost.setText("   Passanger Cost");
        Nav_PassCost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Nav_PassCost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Nav_PassCostMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Nav_PassCostMouseExited(evt);
            }
        });
        jPanel1.add(Nav_PassCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 290, 60));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dashboard");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 41, 212, 43));

        Nav_Staff.setBackground(new java.awt.Color(255, 255, 255));
        Nav_Staff.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        Nav_Staff.setForeground(new java.awt.Color(255, 255, 255));
        Nav_Staff.setText("   Staff Info");
        Nav_Staff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Nav_Staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nav_StaffMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Nav_StaffMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Nav_StaffMouseExited(evt);
            }
        });
        jPanel1.add(Nav_Staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 290, 50));

        Nav_Search.setBackground(new java.awt.Color(255, 255, 255));
        Nav_Search.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        Nav_Search.setForeground(new java.awt.Color(255, 255, 255));
        Nav_Search.setText("   Search");
        Nav_Search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Nav_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nav_SearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Nav_SearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Nav_SearchMouseExited(evt);
            }
        });
        jPanel1.add(Nav_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 290, 50));

        Log_out.setBackground(new java.awt.Color(255, 255, 255));
        Log_out.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        Log_out.setForeground(new java.awt.Color(255, 255, 255));
        Log_out.setText("   Logout");
        Log_out.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Log_out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Log_outMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Log_outMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Log_outMouseExited(evt);
            }
        });
        jPanel1.add(Log_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 290, 50));

        Nav_PassList.setBackground(new java.awt.Color(255, 255, 255));
        Nav_PassList.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        Nav_PassList.setForeground(new java.awt.Color(255, 255, 255));
        Nav_PassList.setText("   Passanger List");
        Nav_PassList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Nav_PassList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nav_PassListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Nav_PassListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Nav_PassListMouseExited(evt);
            }
        });
        jPanel1.add(Nav_PassList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 290, 50));

        Nav_Accounts.setBackground(new java.awt.Color(255, 255, 255));
        Nav_Accounts.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        Nav_Accounts.setForeground(new java.awt.Color(255, 255, 255));
        Nav_Accounts.setText("   Accounts");
        Nav_Accounts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Nav_Accounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nav_AccountsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Nav_AccountsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Nav_AccountsMouseExited(evt);
            }
        });
        jPanel1.add(Nav_Accounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 290, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(77, 45, 113));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_minimize.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel_minimize.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_minimize.setText(" - ");
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseExited(evt);
            }
        });
        jPanel3.add(jLabel_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        jLabel_close.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel_close.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_close.setText(" X ");
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });
        jPanel3.add(jLabel_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Script MT Bold", 2, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  EPCO BD");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 140, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Name :");

        txt_passNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button_Search.setBackground(new java.awt.Color(77, 45, 113));
        button_Search.setForeground(new java.awt.Color(255, 255, 255));
        button_Search.setText("Search");
        button_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Enter Passport Number : ");

        txt_passName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Recieve Due :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Charge :");

        txt_charge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button_recieve_due.setBackground(new java.awt.Color(77, 45, 113));
        button_recieve_due.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        button_recieve_due.setForeground(new java.awt.Color(255, 255, 255));
        button_recieve_due.setText("Recieve");
        button_recieve_due.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_recieve_dueActionPerformed(evt);
            }
        });

        txt_present_cost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Present Cost :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Add Cost :");

        button_Cost.setBackground(new java.awt.Color(77, 45, 113));
        button_Cost.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        button_Cost.setForeground(new java.awt.Color(255, 255, 255));
        button_Cost.setText("Add");
        button_Cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CostActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Recieve :");

        txt_recieve.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Due :");

        txt_due.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtfld_cost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtfld_cost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfld_costKeyTyped(evt);
            }
        });

        txt_recieve_due.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_recieve_due.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_recieve_dueKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfld_cost)
                            .addComponent(txt_recieve_due, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_recieve_due, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Cost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_passNum, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                    .addComponent(button_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(txt_charge, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel9)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_recieve, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_due))
                                        .addComponent(txt_passName))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(34, 34, 34)
                                .addComponent(txt_present_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_passNum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_passName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_charge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_recieve, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_due, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_present_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Cost)
                    .addComponent(txtfld_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_recieve_due, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_recieve_due)))
                .addGap(173, 173, 173))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1258, 725));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Nav_NewPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_NewPassMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray);
        Nav_NewPass.setBorder(label_border);
        Nav_NewPass.setForeground(Color.gray); // TODO add your handling code here:
    }//GEN-LAST:event_Nav_NewPassMouseEntered

    private void Nav_NewPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_NewPassMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        Nav_NewPass.setBorder(label_border);
        Nav_NewPass.setForeground(Color.white);// TODO add your handling code here:
    }//GEN-LAST:event_Nav_NewPassMouseExited

    private void Nav_PassCostMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_PassCostMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray);
        Nav_PassCost.setBorder(label_border);
        Nav_PassCost.setForeground(Color.gray);// TODO add your handling code here:
    }//GEN-LAST:event_Nav_PassCostMouseEntered

    private void Nav_PassCostMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_PassCostMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        Nav_PassCost.setBorder(label_border);
        Nav_PassCost.setForeground(Color.white);// TODO add your handling code here:
    }//GEN-LAST:event_Nav_PassCostMouseExited

    private void Nav_StaffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_StaffMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray);
        Nav_Staff.setBorder(label_border);
        Nav_Staff.setForeground(Color.gray);// TODO add your handling code here:
    }//GEN-LAST:event_Nav_StaffMouseEntered

    private void Nav_StaffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_StaffMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        Nav_Staff.setBorder(label_border);
        Nav_Staff.setForeground(Color.white);// TODO add your handling code here:
    }//GEN-LAST:event_Nav_StaffMouseExited

    private void Nav_NewPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_NewPassMouseClicked
        New_Passanger_admin rf = new New_Passanger_admin();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_Nav_NewPassMouseClicked

    private void Nav_StaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_StaffMouseClicked
        Staff_Info_admin rf = new Staff_Info_admin();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_Nav_StaffMouseClicked

    private void Nav_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_SearchMouseClicked
        Search_admin rf = new Search_admin();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_Nav_SearchMouseClicked

    private void Nav_SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_SearchMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray);
        Nav_Search.setBorder(label_border);
        Nav_Search.setForeground(Color.gray);// TODO add your handling code here:
    }//GEN-LAST:event_Nav_SearchMouseEntered

    private void Nav_SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_SearchMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        Nav_Search.setBorder(label_border);
        Nav_Search.setForeground(Color.white);// TODO add your handling code here:
    }//GEN-LAST:event_Nav_SearchMouseExited

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_minimizeMouseEntered

    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jLabel_minimizeMouseExited

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.red);
    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void Log_outMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Log_outMouseClicked
        int response = JOptionPane.showConfirmDialog(this,"Confirm Logout ?", "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );

        if(response == JOptionPane.YES_OPTION){
            Login_Admin rf = new Login_Admin();
            rf.setVisible(true);
            rf.pack();
            rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_Log_outMouseClicked

    private void Log_outMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Log_outMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray);
        Log_out.setBorder(label_border);
        Log_out.setForeground(Color.gray);// TODO add your handling code here:
    }//GEN-LAST:event_Log_outMouseEntered

    private void Log_outMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Log_outMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        Log_out.setBorder(label_border);
        Log_out.setForeground(Color.white);// TODO add your handling code here:
    }//GEN-LAST:event_Log_outMouseExited

    private void button_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SearchActionPerformed
        String sql = "SELECT `Name`,`Charge`,`Cost`,`Recieve`,`Due` FROM `passanger_details` WHERE `Passport No.`=?";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/epcobd","root","");
            PreparedStatement ps = JConn.getConnection().prepareStatement(sql);
            ps.setString(1,txt_passNum.getText());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                txt_charge.setText(rs.getString("Charge"));
                txt_passName.setText(rs.getString("Name"));
                txt_present_cost.setText(rs.getString("Cost"));
                txt_recieve.setText(rs.getString("Recieve"));
                txt_due.setText(rs.getString("Due"));
            }
            else {
                JOptionPane.showMessageDialog(null, "Record not found!");
                conn.close();
            }// TODO add your handling code here:
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Search_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button_SearchActionPerformed

    private void button_recieve_dueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_recieve_dueActionPerformed

        PreparedStatement ps1;

        ResultSet rs;
        String passangerUpdateQuery = "UPDATE `passanger_details` SET `Recieve`=Recieve+? , `Due`=Due-? WHERE `Passport No.`=?";

        int response = JOptionPane.showConfirmDialog(this,"Confirm Update ?", "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );

        if(response == JOptionPane.YES_OPTION)
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/epcobd","root","");
                ps1 = JConn.getConnection().prepareStatement(passangerUpdateQuery);
                

                
                ps1.setInt(1,Integer.parseInt(txt_recieve_due.getText()));
                ps1.setInt(2,Integer.parseInt(txt_recieve_due.getText()));
                ps1.setString(3,txt_passNum.getText());

                if(ps1.executeUpdate() != 0)
                {
                    JOptionPane.showMessageDialog(null, "Passanger's account is Updated!");
                    String sql = "SELECT `Name`,`Charge`,`Cost`,`Recieve`,`Due` FROM `passanger_details` WHERE `Passport No.`=?";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/epcobd","root","");
            PreparedStatement ps = JConn.getConnection().prepareStatement(sql);
            ps.setString(1,txt_passNum.getText());
            ResultSet rs1 = ps.executeQuery();
            if(rs1.next()){
                txt_charge.setText(rs1.getString("Charge"));
                txt_passName.setText(rs1.getString("Name"));
                txt_present_cost.setText(rs1.getString("Cost"));
                txt_recieve.setText(rs1.getString("Recieve"));
                txt_due.setText(rs1.getString("Due"));
                txt_recieve_due.setText("");
            }
            else {
                JOptionPane.showMessageDialog(null, "Record not found!");
                conn1.close();
            }// TODO add your handling code here:
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Search_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
                }

                else
                {
                    JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Sign_Up.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Search_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_button_recieve_dueActionPerformed

    private void Nav_PassListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_PassListMouseClicked
        Passanger_List_admin rf = new Passanger_List_admin();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_Nav_PassListMouseClicked

    private void Nav_PassListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_PassListMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray);
        Nav_PassList.setBorder(label_border);
        Nav_PassList.setForeground(Color.gray);// TODO add your handling code here:
    }//GEN-LAST:event_Nav_PassListMouseEntered

    private void Nav_PassListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_PassListMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        Nav_PassList.setBorder(label_border);
        Nav_PassList.setForeground(Color.white);// TODO add your handling code here:
    }//GEN-LAST:event_Nav_PassListMouseExited

    private void button_CostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CostActionPerformed
        PreparedStatement ps1;
//        PreparedStatement ps2;
        ResultSet rs;
        String passangerUpdateQuery = "UPDATE `passanger_details` SET `Cost`=Cost+? WHERE `Passport No.`=?";

        int response = JOptionPane.showConfirmDialog(this,"Confirm Update ?", "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );

        if(response == JOptionPane.YES_OPTION)
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/epcobd","root","");
                ps1 = JConn.getConnection().prepareStatement(passangerUpdateQuery);
                

                
                ps1.setInt(1,Integer.parseInt(txtfld_cost.getText()));
                ps1.setString(2,txt_passNum.getText());

                if(ps1.executeUpdate() != 0)
                {
                    JOptionPane.showMessageDialog(null, "Passanger Cost is Updated!");
                    String sql = "SELECT `Name`,`Charge`,`Cost`,`Recieve`,`Due` FROM `passanger_details` WHERE `Passport No.`=?";
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/epcobd","root","");
                    PreparedStatement ps = JConn.getConnection().prepareStatement(sql);
                    ps.setString(1,txt_passNum.getText());
                    ResultSet rs2 = ps.executeQuery();
                    if(rs2.next()){
                        txt_charge.setText(rs2.getString("Charge"));
                        txt_passName.setText(rs2.getString("Name"));
                        txt_present_cost.setText(rs2.getString("Cost"));
                        txt_recieve.setText(rs2.getString("Recieve"));
                        txt_due.setText(rs2.getString("Due"));
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Record not found!");
                        conn2.close();
                    }
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(Search_admin.class.getName()).log(Level.SEVERE, null, ex);
                }

                    txt_recieve_due.setText("");
                    txtfld_cost.setText("");

                }

                else
                {
                    JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Sign_Up.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Search_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_button_CostActionPerformed

    private void Nav_AccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_AccountsMouseClicked
        Accounts_admin rf = new Accounts_admin();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_Nav_AccountsMouseClicked

    private void Nav_AccountsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_AccountsMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray);
        Nav_Accounts.setBorder(label_border);
        Nav_Accounts.setForeground(Color.gray);// TODO add your handling code here:
    }//GEN-LAST:event_Nav_AccountsMouseEntered

    private void Nav_AccountsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_AccountsMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        Nav_Accounts.setBorder(label_border);
        Nav_Accounts.setForeground(Color.white);// TODO add your handling code here:
    }//GEN-LAST:event_Nav_AccountsMouseExited

    private void txtfld_costKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfld_costKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtfld_costKeyTyped

    private void txt_recieve_dueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_recieve_dueKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txt_recieve_dueKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Cost_admin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Log_out;
    private javax.swing.JLabel Nav_Accounts;
    private javax.swing.JLabel Nav_NewPass;
    private javax.swing.JLabel Nav_PassCost;
    private javax.swing.JLabel Nav_PassList;
    private javax.swing.JLabel Nav_Search;
    private javax.swing.JLabel Nav_Staff;
    private javax.swing.JButton button_Cost;
    private javax.swing.JButton button_Search;
    private javax.swing.JButton button_recieve_due;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.Panel panel2;
    private javax.swing.JTextField txt_charge;
    private javax.swing.JTextField txt_due;
    private javax.swing.JTextField txt_passName;
    private javax.swing.JTextField txt_passNum;
    private javax.swing.JTextField txt_present_cost;
    private javax.swing.JTextField txt_recieve;
    private javax.swing.JTextField txt_recieve_due;
    private javax.swing.JTextField txtfld_cost;
    // End of variables declaration//GEN-END:variables
}
