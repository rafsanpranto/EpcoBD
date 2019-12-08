
package Login_Register;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
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
        Log_out = new javax.swing.JLabel();
        Nav_Search1 = new javax.swing.JLabel();
        Nav_PassList = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();

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
        jPanel1.add(Log_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 290, 50));

        Nav_Search1.setBackground(new java.awt.Color(255, 255, 255));
        Nav_Search1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        Nav_Search1.setForeground(new java.awt.Color(255, 255, 255));
        Nav_Search1.setText("   Search");
        Nav_Search1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Nav_Search1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nav_Search1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Nav_Search1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Nav_Search1MouseExited(evt);
            }
        });
        jPanel1.add(Nav_Search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 290, 50));

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
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(77, 45, 113));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 2, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EPCO BD");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 310, 130));

        jLabel2.setFont(new java.awt.Font("Algerian", 2, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("     WELCOME ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 450, 90));

        jLabel4.setFont(new java.awt.Font("Algerian", 2, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TO");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 80, 90));

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

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 690));

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        setSize(new java.awt.Dimension(1264, 691));
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

    private void Nav_NewPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_NewPassMouseClicked
        New_Passanger rf = new New_Passanger();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_Nav_NewPassMouseClicked

    private void Nav_PassCostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_PassCostMouseClicked
        Cost rf = new Cost();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_Nav_PassCostMouseClicked

    private void Log_outMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Log_outMouseClicked
        int response = JOptionPane.showConfirmDialog(this,"Confirm Logout ?", "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );
        
        if(response == JOptionPane.YES_OPTION){
            System.exit(0);
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

    private void Nav_Search1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_Search1MouseClicked
        // TODO add your handling code here:
        Search rf = new Search();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_Nav_Search1MouseClicked

    private void Nav_Search1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_Search1MouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray);
        Nav_Search1.setBorder(label_border);
        Nav_Search1.setForeground(Color.gray);
    }//GEN-LAST:event_Nav_Search1MouseEntered

    private void Nav_Search1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nav_Search1MouseExited
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        Nav_Search1.setBorder(label_border);
        Nav_Search1.setForeground(Color.white);
    }//GEN-LAST:event_Nav_Search1MouseExited

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


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Log_out;
    private javax.swing.JLabel Nav_NewPass;
    private javax.swing.JLabel Nav_PassCost;
    private javax.swing.JLabel Nav_PassList;
    private javax.swing.JLabel Nav_Search1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
