
package Login_Register;

import java.awt.Color;
import java.awt.Font;
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
import net.proteanit.sql.DbUtils;

public class Staff_Info_admin extends javax.swing.JFrame {

    public Staff_Info_admin() {
        
        initComponents();
        setBackground(new Color(0,0,0,0));
        
        Table_staff.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,12));
        Table_staff.getTableHeader().setOpaque(false);
        Table_staff.getTableHeader().setBackground(new Color(32,136,203));
        Table_staff.getTableHeader().setForeground(new Color(255,255,255));
        Table_staff.setRowHeight(25);
        
        
        
        Update_table();
    }
    
    
    private void Update_table(){
        try{
            
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/epcobd","root","");
           String sql = "select * from staff_info";
           PreparedStatement pstmt = conn.prepareStatement(sql);
           ResultSet rs = pstmt.executeQuery();
           Table_staff.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, e);
        }
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
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_staffName = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_staff = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        txtfld_phone = new javax.swing.JTextField();
        txtfld_phone2 = new javax.swing.JTextField();

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
        Nav_PassCost.setForeground(new java.awt.Color(255, 255, 255));
        Nav_PassCost.setText("   Passanger Cost");
        Nav_PassCost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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

        Nav_Staff.setBackground(new java.awt.Color(255, 255, 255));
        Nav_Staff.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        Nav_Staff.setForeground(new java.awt.Color(143, 130, 130));
        Nav_Staff.setText("   Staff Info");
        Nav_Staff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Nav_Staff.addMouseListener(new java.awt.event.MouseAdapter() {
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
        jPanel1.add(Log_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 290, 50));

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

        jPanel4.setBackground(new java.awt.Color(77, 45, 113));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   Employees");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 180, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Name : ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Phone Number : ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 140, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Salary : ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 140, 40));
        jPanel2.add(txt_staffName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 430, 30));

        jButton2.setBackground(new java.awt.Color(77, 45, 113));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 120, 40));

        jPanel5.setBackground(new java.awt.Color(77, 45, 113));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("   Add New Employee");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 220, 50));

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setBorder(new javax.swing.border.MatteBorder(null));

        Table_staff.setAutoCreateRowSorter(true);
        Table_staff.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Table_staff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee Name", "Phone Number", "Address", "Salary"
            }
        ));
        Table_staff.setAlignmentX(1.0F);
        Table_staff.setAlignmentY(1.0F);
        Table_staff.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Table_staff.setRowHeight(25);
        Table_staff.setSelectionBackground(new java.awt.Color(232, 57, 95));
        Table_staff.setShowVerticalLines(false);
        Table_staff.setSurrendersFocusOnKeystroke(true);
        Table_staff.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table_staff);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 910, 130));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Address : ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 140, 40));
        jPanel2.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 430, 30));

        txtfld_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfld_phoneKeyTyped(evt);
            }
        });
        jPanel2.add(txtfld_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 430, 30));

        txtfld_phone2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfld_phone2KeyTyped(evt);
            }
        });
        jPanel2.add(txtfld_phone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 430, 30));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1264, 822));
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
        // TODO add your handling code here:
    }//GEN-LAST:event_Nav_StaffMouseEntered

    private void Nav_StaffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_StaffMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Nav_StaffMouseExited

    private void Nav_NewPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_NewPassMouseClicked
        New_Passanger_admin rf = new New_Passanger_admin();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_Nav_NewPassMouseClicked

    private void Nav_PassCostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_PassCostMouseClicked
        Cost_admin rf = new Cost_admin();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_Nav_PassCostMouseClicked

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

    public boolean verifyFields(){
        String staffName = txt_staffName.getText();
        String phone = txtfld_phone.getText();
        String address = txt_address.getText();
        String salary = txtfld_phone2.getText();
        if(staffName.trim().equals("")  || phone.trim().equals("") || address.trim().equals("") || salary.trim().equals("")){
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields", 2);
            return false;
        }
        else{
        return true;
        }
    }
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

    private void txtfld_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfld_phoneKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtfld_phoneKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String staffName = txt_staffName.getText();
        String phone = txtfld_phone.getText();
        String address = txt_address.getText();
        String salary = txtfld_phone2.getText();

        if(verifyFields()){
            PreparedStatement ps;
            ResultSet rs;
            String registerUserQuery = "INSERT INTO `staff_info`(`Name`, `Phone Number`, `Address`, `Salary(tk)`) VALUES (?,?,?,?)";

            try {
                ps = JConn.getConnection().prepareStatement(registerUserQuery);

                ps.setString(1, staffName);
                ps.setString(2, phone);
                ps.setString(3, address);
                ps.setString(4, salary);

                if(ps.executeUpdate() != 0)
                {
                    JOptionPane.showMessageDialog(null, "New Employee Added Successfully!");
                    Update_table();
                }

                else
                {
                    JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Sign_Up.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error: Check Your Information");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.red);
    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jLabel_minimizeMouseExited

    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_minimizeMouseEntered

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void txtfld_phone2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfld_phone2KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtfld_phone2KeyTyped
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Staff_Info_admin().setVisible(true);
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
    private javax.swing.JTable Table_staff;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel2;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_staffName;
    private javax.swing.JTextField txtfld_phone;
    private javax.swing.JTextField txtfld_phone2;
    // End of variables declaration//GEN-END:variables
}
