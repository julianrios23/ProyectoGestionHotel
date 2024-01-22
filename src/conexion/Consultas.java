
package conexion;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 
 * @author Julian Development
 */
public class Consultas {
    
    public static ResultSet getResultSet(String consulta){
        
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        try {
            con = Conexion.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            return rs;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
        
    }

}
