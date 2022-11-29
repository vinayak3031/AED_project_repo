
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Divya
 */
public class P_LISTER {
    
    private int propertyId;
    private int ownerId;

    public P_LISTER(){}
    
    public P_LISTER(Integer PROPERTYID,Integer OWNERID)
    {
        this.propertyId = PROPERTYID;
        this.ownerId = OWNERID;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
    
    public boolean execTypeQuery(String queryType, P_LISTER type)
    {
        
        PreparedStatement ps;
        
        // add a new type
        if(queryType.equals("add"))
        {
            try {
                // query -> INSERT INTO `property_type`(`name`, `description`) VALUES (?,?)
                ps = THE_CONNECTION.getTheConnection().prepareStatement("INSERT INTO `property_listed`(`propertyId`, `ownerId`) VALUES (?,?)");
                ps.setString(1, String.valueOf(type.getPropertyId()));
                ps.setString(2, String.valueOf(type.getOwnerId()));
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Enter The Correct Query( add,edit,remove )", "Invalid Operation", 2);
            return false;
        }
        
    }
    
    
}
