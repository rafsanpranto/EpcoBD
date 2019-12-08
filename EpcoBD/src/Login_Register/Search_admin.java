
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


public class Search_admin extends javax.swing.JFrame {


    public Search_admin() {
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
        jLabel5 = new javax.swing.JLabel();
        txt_slNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_nid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_reff = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_coun = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_profession = new javax.swing.JTextField();
        button_Search = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_flight_date = new javax.swing.JTextField();
        button_Update = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_passName = new javax.swing.JTextField();
        button_Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(77, 45, 113));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nav_NewPass.setBackground(new java.awt.Color(255, 255, 255));
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
        Nav_PassCost.setForeground(new java.awt.Color(255, 255, 255));
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
        Nav_Search.setForeground(new java.awt.Color(143, 130, 130));
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
        jPanel1.add(Log_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 290, 50));

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
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 140, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Enter Passport Number : ");

        txt_passNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("SL No : ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("NID : ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Phone Number : ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("Refferance Name : ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Country : ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Profession : ");

        button_Search.setBackground(new java.awt.Color(77, 45, 113));
        button_Search.setForeground(new java.awt.Color(255, 255, 255));
        button_Search.setText("Search");
        button_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SearchActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Flight Date : ");

        button_Update.setBackground(new java.awt.Color(77, 45, 113));
        button_Update.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        button_Update.setForeground(new java.awt.Color(255, 255, 255));
        button_Update.setText("Update");
        button_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_UpdateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Passanger Name : ");

        button_Delete.setBackground(new java.awt.Color(77, 45, 113));
        button_Delete.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        button_Delete.setForeground(new java.awt.Color(255, 255, 255));
        button_Delete.setText("Delete");
        button_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(txt_nid, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txt_slNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_passName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_passNum, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_reff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_coun, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_profession, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_flight_date, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_passNum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_slNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Update))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_passName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txt_nid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(button_Delete)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_reff, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_coun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txt_profession, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_flight_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1264, 746));
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
        // TODO add your handling code here:
    }//GEN-LAST:event_Nav_SearchMouseClicked

    private void Nav_SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_SearchMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Nav_SearchMouseEntered

    private void Nav_SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_SearchMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Nav_SearchMouseExited

    private void button_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SearchActionPerformed
    String sql = "SELECT * FROM `passanger_details` WHERE `Passport No.` = ?";
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/epcobd","root","");
            PreparedStatement ps = JConn.getConnection().prepareStatement(sql);
            ps.setString(1,txt_passNum.getText());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                txt_slNo.setText(rs.getString("SL No"));
                txt_passName.setText(rs.getString("Name"));
                txt_nid.setText(rs.getString("NID"));
                txt_phone.setText(rs.getString("Phone No."));
                txt_reff.setText(rs.getString("Reff. Name"));
                txt_coun.setText(rs.getString("Country"));
                txt_profession.setText(rs.getString("Profession"));
                txt_flight_date.setText(rs.getString("Flight_date"));
            }
            else {
                JOptionPane.showMessageDialog(null, "Record not found!");
                conn.close();
            }// TODO add your handling code here:
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Search_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button_SearchActionPerformed

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

    private void button_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_UpdateActionPerformed
        
        String slNo = txt_slNo.getText();
        String passport = txt_passNum.getText();
        String passName = txt_passName.getText();
        String nid = txt_nid.getText();
        String phone = txt_phone.getText();
        String reff = txt_reff.getText();
        String country = txt_coun.getText();
        String profession = txt_profession.getText();
        String flight_date = txt_flight_date.getText();
        

        PreparedStatement ps1;
        ResultSet rs;
        String passangerUpdateQuery = "UPDATE `passanger_details` SET `SL No`=?,`Name`=?,`NID`=?,`Phone No.`=?,`Reff. Name`=?,`Country`=?,`Profession`=?,`Flight_date`=? WHERE `Passport No.` = ?";

        int response = JOptionPane.showConfirmDialog(this,"Confirm Update ?", "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );
        
        if(response == JOptionPane.YES_OPTION)
        {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/epcobd","root","");
            ps1 = JConn.getConnection().prepareStatement(passangerUpdateQuery);
            
            ps1.setString(1, slNo);
            ps1.setString(2, passName);
            ps1.setString(3, nid);
            ps1.setString(4, phone);
            ps1.setString(5, reff);
            ps1.setString(6, country);
            ps1.setString(7, profession);
            ps1.setString(8, flight_date);
            ps1.setString(9,txt_passNum.getText());

            if(ps1.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Passanger updated successfully!");
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
    }//GEN-LAST:event_button_UpdateActionPerformed

    private void button_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DeleteActionPerformed
        String passport = txt_passNum.getText();
        String sql = "DELETE FROM `passanger_details` WHERE `Passport No.`=?";
        int response = JOptionPane.showConfirmDialog(this,"Confirm Delete ?", "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );
        
        if(response == JOptionPane.YES_OPTION)
        {
        try {
            
            try (Connection conn = JConn.getConnection()) {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1,Integer.parseInt(passport));
                if(ps.executeUpdate() != 0)
                {
                    JOptionPane.showMessageDialog(null, "Passanger deleted successfully!");
                    
                    txt_slNo.setText("");
                    txt_passNum.setText("");
                    txt_passName.setText("");
                    txt_nid.setText("");
                    txt_phone.setText("");
                    txt_reff.setText("");
                    txt_coun.setText("");
                    txt_profession.setText("");
                    txt_flight_date.setText("");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Search_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
      }// TODO add your handling code here:
    }//GEN-LAST:event_button_DeleteActionPerformed

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

    private void Nav_PassListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_PassListMouseClicked
        Passanger_List_admin rf = new Passanger_List_admin();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_Nav_PassListMouseClicked

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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Search_admin().setVisible(true);
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
    private javax.swing.JButton button_Delete;
    private javax.swing.JButton button_Search;
    private javax.swing.JButton button_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.Panel panel2;
    private javax.swing.JTextField txt_coun;
    private javax.swing.JTextField txt_flight_date;
    private javax.swing.JTextField txt_nid;
    private javax.swing.JTextField txt_passName;
    private javax.swing.JTextField txt_passNum;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_profession;
    private javax.swing.JTextField txt_reff;
    private javax.swing.JTextField txt_slNo;
    // End of variables declaration//GEN-END:variables
}
