
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Divya
 */
public class P_SALE {

    private int id;
    private int propertyId;
    private int clientId;
    private String finalPrice;
    private String sellingDate;
    
    public P_SALE(){}
    
    public P_SALE(int ID, int PROPERTY_ID, int CLIENT_ID, String FINAL_PRICE, String SELLING_DATE)
    {
        this.id = ID;
        this.propertyId = PROPERTY_ID;
        this.clientId = CLIENT_ID;
        this.finalPrice = FINAL_PRICE;
        this.sellingDate = SELLING_DATE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(String sellingDate) {
        this.sellingDate = sellingDate;
    }
    
    
    // create a function to add a new sale
    public boolean addNewSale(P_SALE sale)
    {
        PreparedStatement ps;
       
        String addQuery = "INSERT INTO `sale`(`property_id`, `client_id`, `final_price`, `sale_date`, `flg_auth`) VALUES (?,?,?,?,?)";
       
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            ps.setInt(1, sale.getPropertyId());
            ps.setInt(2, sale.getClientId());
            ps.setString(3, sale.getFinalPrice());
            ps.setString(4, sale.getSellingDate());
            ps.setString(5, "I");
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    // create a function to edit the selected sale data
    public boolean editSale(P_SALE sale)
    {
        PreparedStatement ps;
        
        String editQuery = "UPDATE `sale` SET `property_id`=?,`client_id`=?,`final_price`=?,`sale_date`=? WHERE `id`=?";
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
            ps.setInt(1, sale.getPropertyId());
            ps.setInt(2, sale.getClientId());
            ps.setString(3, sale.getFinalPrice());
            ps.setString(4, sale.getSellingDate());
            ps.setInt(5, sale.getId());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean addSale(P_SALE sale)
    {
        PreparedStatement ps;
        
        String editQuery = "UPDATE `sale` SET `property_id`=?,`client_id`=?,`final_price`=?,`sale_date`=? WHERE `id`=?";
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
            ps.setInt(1, sale.getPropertyId());
            ps.setInt(2, sale.getClientId());
            ps.setString(3, sale.getFinalPrice());
            ps.setString(4, sale.getSellingDate());
            ps.setInt(5, sale.getId());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    // create a function to delete the selected sale
    public boolean deleteSale(int saleId)
    {
        PreparedStatement ps;
        
        String deleteQuery = "DELETE FROM `sale` WHERE `id`=?";
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
            
            ps.setInt(1, saleId);
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    
 
    // create a unction to return an arraylist of sales
    public ArrayList<P_SALE> salesList()
    {
        ArrayList<P_SALE> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        
        String selectQuery = "SELECT * FROM `sale` WHERE flg_auth = \"A\"";
        
        try {
            
            st = THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            P_SALE sale;
            
            while (rs.next()) {
                
                sale = new P_SALE(rs.getInt(1),
                                    rs.getInt(2), 
                                    rs.getInt(3),
                                    rs.getString(4), 
                                    rs.getString(5));
                
                list.add(sale);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
    public ArrayList<P_SALE> salesListIntrested()
    {
        ArrayList<P_SALE> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        
        String selectQuery = "SELECT * FROM `sale` WHERE flg_auth = 'I'";
        
        try {
            
            st = THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            P_SALE sale;
            
            while (rs.next()) {
                
                sale = new P_SALE(rs.getInt(1),
                                    rs.getInt(2), 
                                    rs.getInt(3),
                                    rs.getString(4), 
                                    rs.getString(5));
                
                list.add(sale);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
    
}
