
package Login_Register;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class New_Passanger extends javax.swing.JFrame {

    public New_Passanger() {
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
        Nav_Search = new javax.swing.JLabel();
        Log_out = new javax.swing.JLabel();
        Nav_PassList = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_passName = new javax.swing.JTextField();
        txt_passport = new javax.swing.JTextField();
        txt_nid = new javax.swing.JTextField();
        txt_reff = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_profession = new javax.swing.JTextField();
        button_AddPass = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jComboBox_Country = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        txt_charge = new javax.swing.JTextField();
        txt_rcv = new javax.swing.JTextField();
        txt_due = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(77, 45, 113));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nav_NewPass.setBackground(new java.awt.Color(204, 0, 153));
        Nav_NewPass.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        Nav_NewPass.setForeground(new java.awt.Color(143, 130, 130));
        Nav_NewPass.setText("   New Passanger");
        Nav_NewPass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        Nav_NewPass.addMouseListener(new java.awt.event.MouseAdapter() {
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
        Nav_PassCost.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        Nav_PassCost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nav_PassCostMouseClicked(evt);
            }
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
        jPanel1.add(Log_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 290, 50));

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 80));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Passanger Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Passport No.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("NID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Country");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Phone No.");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("Refferance Name");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));
        jPanel2.add(txt_passName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 430, 30));
        jPanel2.add(txt_passport, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 430, 30));
        jPanel2.add(txt_nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 430, 30));
        jPanel2.add(txt_reff, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 430, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Flight Date");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("Due");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, -1, -1));
        jPanel2.add(txt_profession, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 430, 30));

        button_AddPass.setBackground(new java.awt.Color(77, 45, 113));
        button_AddPass.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        button_AddPass.setForeground(new java.awt.Color(255, 255, 255));
        button_AddPass.setText("ADD");
        button_AddPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AddPassActionPerformed(evt);
            }
        });
        jPanel2.add(button_AddPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 710, 430, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("Profession");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setText("Charge");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setText("Recieve");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, -1, -1));

        jDateChooser.setDateFormatString("yyyy-MM-d");
        jPanel2.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 160, 30));

        jComboBox_Country.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Saudi Arabia", "Quatar", "Malaysia", "Bahrain", "Maldip", " " }));
        jComboBox_Country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_CountryActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox_Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 430, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("*");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 10, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jLabel14.setText("*");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 10, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("*");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 10, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 0, 0));
        jLabel20.setText("*");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 10, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("*");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 10, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("*");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 10, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 0, 0));
        jLabel23.setText("*");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 10, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("*");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 10, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 0, 0));
        jLabel21.setText("*");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 10, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 0, 0));
        jLabel22.setText("*");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, 10, 20));

        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phoneKeyTyped(evt);
            }
        });
        jPanel2.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 430, 30));

        txt_charge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_chargeKeyTyped(evt);
            }
        });
        jPanel2.add(txt_charge, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 220, 30));

        txt_rcv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rcvKeyTyped(evt);
            }
        });
        jPanel2.add(txt_rcv, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 220, 30));

        txt_due.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dueKeyTyped(evt);
            }
        });
        jPanel2.add(txt_due, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 630, 220, 30));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1264, 869));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Nav_NewPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_NewPassMouseEntered
         
    }//GEN-LAST:event_Nav_NewPassMouseEntered

    private void Nav_NewPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_NewPassMouseExited
        
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

    private void Nav_PassCostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_PassCostMouseClicked
        Cost rf = new Cost();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_Nav_PassCostMouseClicked

    
    
    public boolean checkPassport(String Passport)
    {
        PreparedStatement st;
        ResultSet rs;
        boolean passport_exist = false;
        
        String query = "SELECT * FROM `passanger_details` WHERE `Passport No.`=?";
        
        try {
            
            st = JConn.getConnection().prepareStatement(query);
            st.setString(1, Passport);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                passport_exist = true;
                JOptionPane.showMessageDialog(null, "This Passport Id is Already Taken, Choose Another One", "Passport Failed", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Sign_Up.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return passport_exist;
    }
    
    public boolean checkNID(String NID)
    {
        PreparedStatement st;
        ResultSet rs;
        boolean nid_exist = false;
        
        String query = "SELECT * FROM `passanger_details` WHERE `NID`=?";
        
        try {
            
            st = JConn.getConnection().prepareStatement(query);
            st.setString(1, NID);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                nid_exist = true;
                JOptionPane.showMessageDialog(null, "This NID is Already Taken, Choose Another One", "NID Failed", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Sign_Up.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nid_exist;
    }
    
    

    
    private void Nav_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_SearchMouseClicked
        Search rf = new Search();
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
            Login rf = new Login();
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

    public boolean verifyFields(){
        String passport = txt_passport.getText();
        String passName = txt_passName.getText();
        String nid = txt_nid.getText();
        String phone = txt_phone.getText();
        String reff = txt_reff.getText();
        String country = jComboBox_Country.getSelectedItem().toString(); 
        String profession = txt_profession.getText();
        String charge = txt_charge.getText();
        String recieve = txt_rcv.getText();
        String due = txt_due.getText();
        
        if(passName.trim().equals("") || passport.trim().equals("") || nid.trim().equals("") || phone.trim().equals("")
                || reff.trim().equals("") || country.trim().equals("")||profession.trim().equals("")||charge.trim().equals("")||recieve.trim().equals("")||due.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);
            return false;
        }
        
        else
        {
            return true;
        }
    }
    
    private void button_AddPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AddPassActionPerformed

        //String slNo = txt_slNo.getText();
        String passport = txt_passport.getText();
        String passName = txt_passName.getText();
        String nid = txt_nid.getText();
        String phone = txt_phone.getText();
        String reff = txt_reff.getText();
        String country = jComboBox_Country.getSelectedItem().toString(); 
        String profession = txt_profession.getText();
        int charge = Integer.parseInt(txt_charge.getText());
        int recieve = Integer.parseInt(txt_rcv.getText());
        int due = Integer.parseInt(txt_due.getText());

        PreparedStatement ps1;
        ResultSet rs;
        String passangerUpdateQuery = "INSERT INTO `passanger_details`(`Name`, `Passport No.`, `NID`, `Phone No.`, `Reff. Name`, `Country`, `Profession`, `Flight_date`, `Charge`, `Recieve`, `Due`)  VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        int response = JOptionPane.showConfirmDialog(this,"Confirm Passanger ?", "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );

        if(response == JOptionPane.YES_OPTION)
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/epcobd","root","");
                ps1 = JConn.getConnection().prepareStatement(passangerUpdateQuery);

               // ps1.setString(1, slNo);
                ps1.setString(1, passName);
                ps1.setString(2, passport);
                ps1.setString(3, nid);
                ps1.setString(4, phone);
                ps1.setString(5, reff);
                ps1.setString(6, country);
                ps1.setString(7, profession);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String flight_date = sdf.format(jDateChooser.getDate());
                if( flight_date == null)
                {
                    ps1.setString(8, null);
                }
                else
                {
                    ps1.setString(8, flight_date);
                }
                ps1.setInt(9,charge);
                ps1.setInt(10,recieve);
                ps1.setInt(11,due);
                
                
                
                

                if(ps1.executeUpdate() != 0)
                {
                    JOptionPane.showMessageDialog(null, "Passanger added successfully!");
                    
                    //txt_slNo.setText("");
                    txt_passport.setText("");
                    txt_passName.setText("");
                    txt_nid.setText("");
                    txt_phone.setText("");
                    txt_reff.setText("");
                    //txt_coun.setText("");
                    txt_profession.setText("");
                    //jDateChooser.setDate("");
                    txt_charge.setText("");
                }

                else
                {
                    JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                }

            } catch (SQLException ex) {  
                Logger.getLogger(Sign_Up.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Give Valid Information");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Search_admin.class.getName()).log(Level.SEVERE, null, ex);
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid Input");
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_button_AddPassActionPerformed

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
        Passanger_List rf = new Passanger_List();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_Nav_PassListMouseClicked

    private void jComboBox_CountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_CountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_CountryActionPerformed

    private void txt_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txt_phoneKeyTyped

    private void txt_chargeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_chargeKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txt_chargeKeyTyped

    private void txt_rcvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rcvKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txt_rcvKeyTyped

    private void txt_dueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dueKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txt_dueKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new New_Passanger().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Log_out;
    private javax.swing.JLabel Nav_NewPass;
    private javax.swing.JLabel Nav_PassCost;
    private javax.swing.JLabel Nav_PassList;
    private javax.swing.JLabel Nav_Search;
    private javax.swing.JButton button_AddPass;
    private javax.swing.JComboBox jComboBox_Country;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JTextField txt_nid;
    private javax.swing.JTextField txt_passName;
    private javax.swing.JTextField txt_passport;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_profession;
    private javax.swing.JTextField txt_rcv;
    private javax.swing.JTextField txt_reff;
    // End of variables declaration//GEN-END:variables
}
