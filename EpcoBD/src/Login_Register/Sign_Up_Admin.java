
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
import java.util.regex.Pattern;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
public class Sign_Up_Admin extends javax.swing.JFrame {


    public Sign_Up_Admin() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        Border jpanel_title_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.red);
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        jLabel_close.setBorder(label_border);
        
        Border field_border = BorderFactory.createMatteBorder(1, 3, 1, 1, Color.white);
        txtfld_fullname.setBorder(field_border);
        txtfld_email.setBorder(field_border);
        txtfld_phone.setBorder(field_border);
        passfld_pass.setBorder(field_border);
        passfld_confirmpass.setBorder(field_border);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txtfld_email = new javax.swing.JTextField();
        passfld_confirmpass = new javax.swing.JPasswordField();
        jButton_signup = new java.awt.Button();
        txtfld_phone = new javax.swing.JTextField();
        passfld_pass = new javax.swing.JPasswordField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        txtfld_fullname = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        label_haveAccount = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        label7 = new java.awt.Label();
        jComboBox = new javax.swing.JComboBox();
        label8 = new java.awt.Label();
        txtfld_answer = new javax.swing.JTextField();
        txtfld_username1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel7.setBackground(new java.awt.Color(55, 9, 119));

        jPanel8.setBackground(new java.awt.Color(55, 9, 119));

        txtfld_email.setToolTipText("");
        txtfld_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfld_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfld_emailFocusLost(evt);
            }
        });

        passfld_confirmpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passfld_confirmpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passfld_confirmpassFocusLost(evt);
            }
        });
        passfld_confirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passfld_confirmpassActionPerformed(evt);
            }
        });

        jButton_signup.setActionCommand("SignUp");
        jButton_signup.setBackground(new java.awt.Color(157, 27, 27));
        jButton_signup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_signup.setForeground(new java.awt.Color(255, 255, 254));
        jButton_signup.setLabel("Submit");
        jButton_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_signupMouseExited(evt);
            }
        });
        jButton_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signupActionPerformed(evt);
            }
        });

        txtfld_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfld_phoneKeyTyped(evt);
            }
        });

        label1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label1.setText("Full Name :");

        label2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label2.setText("Username :");

        label3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label3.setText("Email Id :");

        label4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label4.setText("Password :");

        label5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label5.setText("Answer :");

        label6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label6.setText("Phone Number :");

        label_haveAccount.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_haveAccount.setForeground(new java.awt.Color(0, 153, 0));
        label_haveAccount.setText(">> Already Have an Account? Go to Login Page!");
        label_haveAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_haveAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_haveAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_haveAccountMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(89, 4, 11));
        jLabel3.setText("Sign Up");

        jSeparator1.setForeground(new java.awt.Color(97, 15, 15));

        label7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label7.setText("Security Question :");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What was the house number and street name you lived in as a child?", "What were the last four digits of your childhood telephone number?", "What primary school did you attend?", "In what town or city was your first full time job?", "In what town or city did you meet your spouse/partner?", "What is the middle name of your oldest child?", "What are the last five digits of your driver's licence number?", "What is your grandmother's (on your mother's side) maiden name?", "What is your spouse or partner's mother's maiden name?", "In what town or city did your mother and father meet?" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        label8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label8.setText("Confirm Password :");

        txtfld_answer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfld_answerKeyTyped(evt);
            }
        });

        txtfld_username1.setToolTipText("");
        txtfld_username1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfld_username1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfld_username1FocusLost(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 9, 119));
        jLabel5.setText("  Admin");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 55)); // NOI18N
        jLabel6.setText("I");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(55, 9, 119));
        jLabel4.setText("User");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("*");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("*");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("*");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("*");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("*");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("*");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("*");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jLabel14.setText("*");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(230, 230, 230)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_haveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(229, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfld_fullname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfld_email, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfld_phone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passfld_pass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passfld_confirmpass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfld_answer)
                            .addComponent(txtfld_username1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfld_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfld_username1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfld_email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfld_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passfld_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passfld_confirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(jLabel13)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfld_answer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(label_haveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
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
        jLabel2.setFont(new java.awt.Font("Script MT Bold", 2, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EPCO BD");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259)
                .addComponent(jLabel_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close)
                .addGap(8, 8, 8))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_minimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 809, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfld_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfld_emailFocusGained

        if(txtfld_email.getText().trim().toLowerCase().equals("username"))
        {
            txtfld_email.setText("");
            txtfld_email.setForeground(Color.black);
        }

    }//GEN-LAST:event_txtfld_emailFocusGained

    private void txtfld_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfld_emailFocusLost
        if(txtfld_email.getText().trim().equals("") ||
            txtfld_email.getText().trim().toLowerCase().equals("username"))
        {
            txtfld_email.setText("username");
            txtfld_email.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_txtfld_emailFocusLost

    private void passfld_confirmpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passfld_confirmpassFocusGained

        String pass = String.valueOf(passfld_pass.getPassword());

        if(pass.trim().toLowerCase().equals("password"))
        {
            passfld_pass.setText("");
            passfld_pass.setForeground(Color.black);
        }
    }//GEN-LAST:event_passfld_confirmpassFocusGained

    private void passfld_confirmpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passfld_confirmpassFocusLost

        String pass = String.valueOf(passfld_pass.getPassword());

        if(pass.trim().equals("") ||
            pass.trim().toLowerCase().equals("password"))
        {
            passfld_pass.setText("password");
            passfld_pass.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_passfld_confirmpassFocusLost

    private void passfld_confirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passfld_confirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passfld_confirmpassActionPerformed

    private void jButton_signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_signupMouseEntered
        jButton_signup.setBackground(new Color(225,20,2));
    }//GEN-LAST:event_jButton_signupMouseEntered

    private void jButton_signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_signupMouseExited
        jButton_signup.setBackground(new Color(235,47,6));
    }//GEN-LAST:event_jButton_signupMouseExited

    private void jButton_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signupActionPerformed

        String fname = txtfld_fullname.getText();
        String username = txtfld_username1.getText();
        String email = txtfld_email.getText();
        String phone = txtfld_phone.getText();
        String pass = String.valueOf(passfld_pass.getPassword());
        String ques = jComboBox.getSelectedItem().toString();      
        String answer = txtfld_answer.getText();
        
        
        if(verifyFields())
        {
            if(!checkUsername(username))
            {
                PreparedStatement ps;
                ResultSet rs;
                String registerUserQuery = "INSERT INTO `admin_users`(`full_name`, `username`, `email`, `password`, `phone number`, `Security Question`, `Answer`) VALUES (?,?,?,?,?,?,?)";
                
                try {
                    ps = JConn.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, fname);
                    ps.setString(2, username);
                    ps.setString(3, email);
                        String key="Bar12345Bar12345";
                        Key aeskey=new SecretKeySpec(key.getBytes(),"AES");
                        Cipher cipher=Cipher.getInstance("AES");

                        cipher.init(Cipher.ENCRYPT_MODE,aeskey);
                        byte[] encrypted=cipher.doFinal(pass.getBytes());
                        pass=new String(encrypted);
                    ps.setString(4, pass);
                    ps.setString(5, phone);
                    ps.setString(6, ques);
                    ps.setString(7, answer);
                    
                    //ps.setNull(6, java.sql.Types.NULL);
                    if(ps.executeUpdate() != 0)
                    {
                        JOptionPane.showMessageDialog(null, "Your Account Has Been Created ");
                    }
                    
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                    }
                    registerUserQuery = "INSERT INTO `admin_reset_password`(`Username`, `Password`) VALUES (?,?)";
                    ps = JConn.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, username);
                    ps.setString(2, pass);
                    if(ps.executeUpdate() != 0)
                    {
                        JOptionPane.showMessageDialog(null, "Your Password Has Been Saved ");
                        
                        Login_Admin rf = new Login_Admin();
                        rf.setVisible(true);
                        rf.pack();
                        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                        }
                    
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                    }
                    
                    
                } catch (SQLException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException ex) {
                    Logger.getLogger(Sign_Up_Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        
        

    }//GEN-LAST:event_jButton_signupActionPerformed

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

    private void txtfld_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfld_phoneKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtfld_phoneKeyTyped

    private void label_haveAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_haveAccountMouseClicked
        Login rf = new Login();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_label_haveAccountMouseClicked

    private void label_haveAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_haveAccountMouseEntered

    }//GEN-LAST:event_label_haveAccountMouseEntered

    private void label_haveAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_haveAccountMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_label_haveAccountMouseExited

    
    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void txtfld_answerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfld_answerKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfld_answerKeyTyped

    private void txtfld_username1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfld_username1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfld_username1FocusGained

    private void txtfld_username1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfld_username1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfld_username1FocusLost

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Sign_Up rf = new Sign_Up();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    
    public boolean verifyFields()
    {
    
        String fname = txtfld_fullname.getText();
        String uname = txtfld_email.getText();
        String email = txtfld_email.getText();
        String phone = txtfld_phone.getText();
        String pass = String.valueOf(passfld_pass.getPassword());
        String cpass = String.valueOf(passfld_confirmpass.getPassword());
        
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        
        
        if(fname.trim().equals("") || uname.trim().equals("") || email.trim().equals("") || phone.trim().equals("")
                || pass.trim().equals("") || cpass.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);
            return false;
        }
        else if((!Pattern.matches(".*{7,}",pass))){
                passfld_pass.setText("");
                JOptionPane.showMessageDialog(null,"Password must contain at least 7 characters");
                return false;
            }  
           if((!Pattern.matches(".*[A-Za-z]+.*",pass))|(!Pattern.matches(".*[0-9]+.*",pass))|(!Pattern.matches(".*[^0-9A-Za-z]+.*",pass))){
                passfld_confirmpass.setText("");passfld_pass.setText("");
                JOptionPane.showMessageDialog(null,"Password must contain alphabet, number and symbol");
                return false;
            } 
        else if(!pass.equals(cpass))
        {
            JOptionPane.showMessageDialog(null, "Password Doesn't Match","Confirm Password",2);
            return false;
        }else if(checkUserid(email)){
        JOptionPane.showMessageDialog(null, "This user ID already exists use another");
        return false;
        
        }
        else if(!email.matches(regex))
        {
            JOptionPane.showMessageDialog(null, "Email is not valid","Confirm Email",2);
            return false;
        }
        
        else
        {
            return true;
        }
    }
    
    
    public boolean checkUsername(String username)
    {
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `users` WHERE 'username' = ?" ;
        
        try {
            
            st = JConn.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another One", "Username Failed", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Sign_Up_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return username_exist;
    }
    
    public boolean checkUserid(String UserID){
    PreparedStatement ps;
    ResultSet rs;
    boolean checkUser = false;
    String query ="SELECT * FROM epcobd.`users` WHERE `email`=?";
    
    try{
    ps=JConn.getConnection().prepareStatement(query);
    ps.setString(1, UserID);
    rs=ps.executeQuery();
    if(rs.next()){
    checkUser=true;
    }  
    }  
    
    catch(SQLException ex){
    Logger.getLogger(Sign_Up_Admin.class.getName()).log(Level.SEVERE,null,ex);
    
    }
    return checkUser;
    
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Sign_Up_Admin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button jButton_signup;
    private javax.swing.JComboBox jComboBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label_haveAccount;
    private javax.swing.JPasswordField passfld_confirmpass;
    private javax.swing.JPasswordField passfld_pass;
    private javax.swing.JTextField txtfld_answer;
    private javax.swing.JTextField txtfld_email;
    private javax.swing.JTextField txtfld_fullname;
    private javax.swing.JTextField txtfld_phone;
    private javax.swing.JTextField txtfld_username1;
    // End of variables declaration//GEN-END:variables
}
