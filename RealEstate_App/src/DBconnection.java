/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diksharawat
 */
public class DBconnection {
    
    private static String servername = "localhost";
    private static String dbname = "";
    private static String username = "";
    private static Integer portnumber = 00;
    private static String password = ""; //no password
    
    
    //create a dfunction to get the connection
    public static Connection getDBconnection()
    {
        Connection connection = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setDatabaseName(dbname);
        datasource.setUser(username);
        datasource.setPortNumber(portnumber);
        datasource.setPassword(password);
        
        
        try{
          connection = datasource.getConnection();
        }
        catch (SQLExecption ex){
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null. ex);
        }
        
        return connection;
        
    }
            
    
    
}
