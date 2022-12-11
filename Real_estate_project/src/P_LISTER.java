
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


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
        
        if(queryType.equals("update"))
        {
            try {
                
                ps = THE_CONNECTION.getTheConnection().prepareStatement("UPDATE `the_property` SET listed = ? WHERE id = ?");
                ps.setString(1, String.valueOf("Y"));
                ps.setString(2, String.valueOf(type.getPropertyId()));
                
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
