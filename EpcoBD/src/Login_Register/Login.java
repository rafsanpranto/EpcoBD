
package Login_Register;

import java.awt.Color;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class Login extends javax.swing.JFrame {


    public Login() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        //Border jpanel_title_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.red);
        //jPanel_title.setBorder(jpanel_title_border);
        
        Border glob_panel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.orange);
        jPanel1.setBorder(glob_panel_border);
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        jLabel_close.setBorder(label_border);
        
        Border field_border = BorderFactory.createMatteBorder(1, 3, 1, 1, Color.white);
        jTextField_Username.setBorder(field_border);
        jPasswordField_pass.setBorder(field_border);
        

        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField_Username = new javax.swing.JTextField();
        jPasswordField_pass = new javax.swing.JPasswordField();
        jButton_Login = new java.awt.Button();
        label_createAccount = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_createAccount1 = new java.awt.Label();
        label_createAccount2 = new java.awt.Label();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(78, 31, 145));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(55, 9, 119));

        jPanel2.setBackground(new java.awt.Color(55, 9, 119));

        jPanel3.setBackground(new java.awt.Color(230, 230, 230));

        jTextField_Username.setToolTipText("");
        jTextField_Username.setBorder(new javax.swing.border.MatteBorder(null));
        jTextField_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusLost(evt);
            }
        });
        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });

        jPasswordField_pass.setBorder(new javax.swing.border.MatteBorder(null));
        jPasswordField_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_passFocusLost(evt);
            }
        });
        jPasswordField_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_passActionPerformed(evt);
            }
        });

        jButton_Login.setBackground(new java.awt.Color(55, 9, 119));
        jButton_Login.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jButton_Login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Login.setLabel("Login");
        jButton_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseExited(evt);
            }
        });
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        label_createAccount.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_createAccount.setForeground(new java.awt.Color(189, 0, 0));
        label_createAccount.setText(">> Forgot Password ?");
        label_createAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_createAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_createAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_createAccountMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("   Username : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("   Password : ");

        label_createAccount1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_createAccount1.setForeground(new java.awt.Color(55, 9, 119));
        label_createAccount1.setText(">> Already have an account ?");
        label_createAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_createAccount1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_createAccount1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_createAccount1MouseExited(evt);
            }
        });

        label_createAccount2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_createAccount2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        label_createAccount2.setForeground(new java.awt.Color(189, 0, 0));
        label_createAccount2.setText("Sign In");
        label_createAccount2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_createAccount2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_createAccount2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_createAccount2MouseExited(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 9, 119));
        jLabel5.setText("  Admin");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(55, 9, 119));
        jLabel4.setText("User");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 55)); // NOI18N
        jLabel6.setText("I");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(label_createAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(label_createAccount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 254, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_createAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addComponent(label_createAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_createAccount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_createAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

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

        jLabel_minimize.setFont(new java.awt.Font("Blackoak Std", 1, 18)); // NOI18N
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

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Script MT Bold", 2, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EPCO BD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close)
                .addGap(8, 8, 8))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_minimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jTextField_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusGained
        
        if(jTextField_Username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_Username.setText("");
            jTextField_Username.setForeground(Color.black);
        }
        
        
        
    }//GEN-LAST:event_jTextField_UsernameFocusGained

    private void jTextField_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusLost
        if(jTextField_Username.getText().trim().equals("") || 
           jTextField_Username.getText().trim().toLowerCase().equals("username"))
        {
           jTextField_Username.setText("username");
           jTextField_Username.setForeground(new Color(153,153,153));
        }
        
        
    }//GEN-LAST:event_jTextField_UsernameFocusLost

    private void jPasswordField_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_passFocusGained
         
        
        String pass = String.valueOf(jPasswordField_pass.getPassword());
        
        if(pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField_pass.setText("");
            jPasswordField_pass.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordField_passFocusGained

    private void jPasswordField_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_passFocusLost
         
        String pass = String.valueOf(jPasswordField_pass.getPassword());
        
        if(pass.trim().equals("") || 
           pass.trim().toLowerCase().equals("password"))
        {
           jPasswordField_pass.setText("password");
           jPasswordField_pass.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordField_passFocusLost

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        
        PreparedStatement st;
        ResultSet rs;

        String username = jTextField_Username.getText();
        String password = String.valueOf(jPasswordField_pass.getPassword());
        
        String query = "SELECT * FROM `users` WHERE `username` = ? AND `password` = ?";
        
        try {
            st = JConn.getConnection().prepareStatement(query);
            
            st.setString(1, username);
            String key="Bar12345Bar12345";
                        Key aeskey=new SecretKeySpec(key.getBytes(),"AES");
                        Cipher cipher=Cipher.getInstance("AES");

                        cipher.init(Cipher.ENCRYPT_MODE,aeskey);
                        byte[] encrypted=cipher.doFinal(password.getBytes());
                        password=new String(encrypted);
            st.setString(2, password);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                Dashboard menu = new Dashboard();
                menu.setVisible(true);menu.pack();
                menu.setLocationRelativeTo(null);
                
                this.dispose();
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Username / Password", "Login Failed!", 2);
                jTextField_Username.setText("");
                jPasswordField_pass.setText("");
                        
            }
            
        } catch (SQLException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jButton_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseEntered
        jButton_Login.setBackground(new Color(0,84,104));
    }//GEN-LAST:event_jButton_LoginMouseEntered

    private void jButton_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseExited
        jButton_Login.setBackground(new Color(0,101,183));
    }//GEN-LAST:event_jButton_LoginMouseExited

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jPasswordField_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_passActionPerformed

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

    private void label_createAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_createAccountMouseEntered
        
        
    }//GEN-LAST:event_label_createAccountMouseEntered

    private void label_createAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_createAccountMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_label_createAccountMouseExited

    private void label_createAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_createAccountMouseClicked
        Reset rf = new Reset();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_label_createAccountMouseClicked

    private void label_createAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_createAccount1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_createAccount1MouseClicked

    private void label_createAccount1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_createAccount1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_label_createAccount1MouseEntered

    private void label_createAccount1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_createAccount1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_label_createAccount1MouseExited

    private void label_createAccount2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_createAccount2MouseClicked
        Sign_Up rf = new Sign_Up();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_label_createAccount2MouseClicked

    private void label_createAccount2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_createAccount2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_label_createAccount2MouseEntered

    private void label_createAccount2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_createAccount2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_label_createAccount2MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Login_Admin rf = new Login_Admin();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button jButton_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField_pass;
    private javax.swing.JTextField jTextField_Username;
    private java.awt.Label label_createAccount;
    private java.awt.Label label_createAccount1;
    private java.awt.Label label_createAccount2;
    // End of variables declaration//GEN-END:variables
}
