
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 919920 */
public class CREATE_USERS extends javax.swing.JFrame {

    /**
     * Creates new form CreateUsers
     */
    public CREATE_USERS() {
        initComponents();
    }

    /**
     
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectUserRole = new javax.swing.JComboBox<>();
        usernameTextfield = new javax.swing.JTextField();
        userSubmit = new javax.swing.JButton();
        passwordTextfield = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectUserRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Owner", "Client", "Lawyer", "Sales", "Manager", "Lister", "Insurance" }));
        selectUserRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectUserRoleActionPerformed(evt);
            }
        });

        usernameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextfieldActionPerformed(evt);
            }
        });

        userSubmit.setText("Submit");
        userSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSubmitActionPerformed(evt);
            }
        });

        passwordTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(userSubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameTextfield)
                            .addComponent(selectUserRole, 0, 142, Short.MAX_VALUE)
                            .addComponent(passwordTextfield))))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(selectUserRole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(userSubmit)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextfieldActionPerformed

    private void selectUserRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectUserRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectUserRoleActionPerformed

    private void passwordTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextfieldActionPerformed

    private void userSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSubmitActionPerformed
        // TODO add your handling code here:
        String username = usernameTextfield.getText();
        String password = String.valueOf(passwordTextfield.getPassword());
        String userRole = selectUserRole.getSelectedItem().toString();
        PreparedStatement ps;
        int rs;
        
        String insertquery = "INSERT INTO `users` (USERNAME, PASSWORD, ROLE) VALUES (?,?,?)" ;
        if( username.trim().equals("") || password.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter The Required User Information","Empty Field", 2);
        }
        
        
        // check the fields value
        if(username.trim().toLowerCase().equals("username") || 
           password.trim().toLowerCase().equals("password"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Username and Password","Empty Field",2);
        }
        else{
          
            try {
                
                ps = THE_CONNECTION.getTheConnection().prepareStatement(insertquery);
                
                ps.setString(1, username);
                ps.setString(2, password);
                ps.setString(3, userRole);
                
                rs = ps.executeUpdate();
               JOptionPane.showMessageDialog(null, "User Successfully created!","Empty Field",2);
               usernameTextfield.setText("");
               passwordTextfield.setText("");
                
            } catch (SQLException ex) {
                Logger.getLogger(LOGIN_WINDOW.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
       
    }//GEN-LAST:event_userSubmitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CREATE_USERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CREATE_USERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CREATE_USERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CREATE_USERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CREATE_USERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField passwordTextfield;
    private javax.swing.JComboBox<String> selectUserRole;
    private javax.swing.JButton userSubmit;
    private javax.swing.JTextField usernameTextfield;
    // End of variables declaration//GEN-END:variables
}
