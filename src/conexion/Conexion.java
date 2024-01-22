
package conexion;


import java.sql.*;

/**
 
 * @author Julian Development
 */
public class Conexion {
    
    public static Connection getConnection(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_hotel","root","root");
        } catch (Exception e)  {
            return null;
        }
        
    }

}
