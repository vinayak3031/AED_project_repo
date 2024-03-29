
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diksharawat
 */
public class MANAGER_WINDOW extends javax.swing.JFrame {
    
    private String user_id;

    public MANAGER_WINDOW() {
        initComponents();
        fillJtableSales();
        jTable_Sales.setSelectionBackground(new Color(0,70,0));
    }
    
    public void fillJtableSales()
    {
        P_SALE sale = new P_SALE();
        ArrayList<P_SALE> salesList = sale.salesListIntrested();
        
        String[] colNames = {"Sale ID","Property ID","Client ID","Final Price","Sale Date"};
        
        Object[][] rows = new Object[salesList.size()][5];
        
        for(int i = 0; i < salesList.size(); i++)
        {
            rows[i][0] = salesList.get(i).getId();
            rows[i][1] = salesList.get(i).getPropertyId();
            rows[i][2] = salesList.get(i).getClientId();
            rows[i][3] = salesList.get(i).getFinalPrice();
            rows[i][4] = salesList.get(i).getSellingDate();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Sales.setModel(model);
        jTable_Sales.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Sales = new javax.swing.JTable();
        jButton_Approve_Sale = new javax.swing.JButton();
        jButton_Remove_Sale = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1018, 565));

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setText("UnApproved Sales");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable_Sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sale ID", "Property ID", "Client ID", "Final Price", "Sale Date"
            }
        ));
        jScrollPane1.setViewportView(jTable_Sales);

        jButton_Approve_Sale.setBackground(new java.awt.Color(0, 153, 51));
        jButton_Approve_Sale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Approve_Sale.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Approve_Sale.setText("Approve");
        jButton_Approve_Sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Approve_Sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Approve_SaleActionPerformed(evt);
            }
        });

        jButton_Remove_Sale.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Remove_Sale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Remove_Sale.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Remove_Sale.setText("Reject");
        jButton_Remove_Sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_SaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jButton_Remove_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_Approve_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Approve_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Remove_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Approve_SaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Approve_SaleActionPerformed

        try
        {
            approveSale();
            removeFromListing();
            fillJtableSales();
            changeClientToOwner();

        }catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Select The Property Id, Client Id and The Sale Date", "Add Sale Error", 2);
        }

    }//GEN-LAST:event_jButton_Approve_SaleActionPerformed

    private void jButton_Remove_SaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_SaleActionPerformed

        try{
            rejectSale();
            fillJtableSales();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Select The Sale Id", "Delete Sale Error", 2);
        }
    }//GEN-LAST:event_jButton_Remove_SaleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MANAGER_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Approve_Sale;
    private javax.swing.JButton jButton_Remove_Sale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Sales;
    // End of variables declaration//GEN-END:variables

    private void approveSale() {
        PreparedStatement ps;
        int rs;
        int selectedRowIndex = jTable_Sales.getSelectedRow();
        user_id = jTable_Sales.getValueAt(selectedRowIndex, 2).toString();
        String insertquery = "UPDATE `sale` SET flg_auth = ? WHERE property_id = ?" ;
            try {
                
                ps = THE_CONNECTION.getTheConnection().prepareStatement(insertquery);
                ps.setString(1, "A");
                ps.setString(2, jTable_Sales.getValueAt(selectedRowIndex, 1).toString());
                System.out.println(jTable_Sales.getValueAt(selectedRowIndex, 1));
                rs = ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Sale Successfully created!","Empty Field",2);     
            } catch (SQLException ex) {
                Logger.getLogger(LOGIN_WINDOW.class.getName()).log(Level.SEVERE, null, ex);
            }       
    }
    
    private void removeFromListing() {
        PreparedStatement ps;
        int rs;
        int selectedRowIndex = jTable_Sales.getSelectedRow();
        user_id = jTable_Sales.getValueAt(selectedRowIndex, 2).toString();
        String insertquery = "UPDATE `the_property` SET listed = 'S' WHERE id = ?" ;
            try {
                
                ps = THE_CONNECTION.getTheConnection().prepareStatement(insertquery);
                ps.setString(1, jTable_Sales.getValueAt(selectedRowIndex, 1).toString());
                rs = ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Sale Successfully created!","Empty Field",2);     
            } catch (SQLException ex) {
                Logger.getLogger(LOGIN_WINDOW.class.getName()).log(Level.SEVERE, null, ex);
            }       
    }

    private void changeClientToOwner() {
        PreparedStatement ps;
        int rs;
        int selectedRowIndex = jTable_Sales.getSelectedRow();
        String insertquery = "UPDATE `users` SET role = 'Owner' WHERE id = ?" ;
            try {
                
                ps = THE_CONNECTION.getTheConnection().prepareStatement(insertquery);
                System.out.println("Rishabh " + user_id);
                ps.setString(1, user_id);
                
                rs = ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Sale Successfully created!","Empty Field",2);     
            } catch (SQLException ex) {
                Logger.getLogger(LOGIN_WINDOW.class.getName()).log(Level.SEVERE, null, ex);
            }  
    }
    


    private void rejectSale() {
        PreparedStatement ps;
        int rs;
        int selectedRowIndex = jTable_Sales.getSelectedRow();
        String insertquery = "DELETE FROM `sale` WHERE id = ?" ;
            try {
                
                ps = THE_CONNECTION.getTheConnection().prepareStatement(insertquery);
                ps.setString(1, user_id);
                System.out.println(jTable_Sales.getValueAt(selectedRowIndex, 1));
                rs = ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Sale Request Rejected","Empty Field",2);     
            } catch (SQLException ex) {
                Logger.getLogger(LOGIN_WINDOW.class.getName()).log(Level.SEVERE, null, ex);
            }   
    }
    
}
