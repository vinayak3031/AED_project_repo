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
 * @author Divya
 */
public class CREATE_USERS extends javax.swing.JFrame {

    /**
     * Creates new form CreateUsers
     */
    public CREATE_USERS() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectUserRole = new javax.swing.JComboBox<>();
        usernameTextfield = new javax.swing.JTextField();
        userSubmit = new javax.swing.JButton();
        passwordTextfield = new javax.swing.JPasswordField();
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectUserRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lawyer", "Sales", "Manager", "Lister", "Insurance" }));
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

        userSubmit.setBackground(new java.awt.Color(0, 153, 255));
        userSubmit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        userSubmit.setForeground(new java.awt.Color(255, 255, 255));
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

        jPanel_Title.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Users");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel1)
                .addContainerGap(312, Short.MAX_VALUE))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameTextfield, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selectUserRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(userSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(selectUserRole, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(userSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JPasswordField passwordTextfield;
    private javax.swing.JComboBox<String> selectUserRole;
    private javax.swing.JButton userSubmit;
    private javax.swing.JTextField usernameTextfield;
    // End of variables declaration//GEN-END:variables
}
