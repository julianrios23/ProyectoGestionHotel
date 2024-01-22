package conexion;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian Development
 */
public class InsertarActualizarEliminar {

    public static void setData(String consulta, String mje) {

        Connection con = null;
        Statement sta = null;
        try {
            con = Conexion.getConnection();
            sta = con.createStatement();
            sta.executeUpdate(consulta);
            if (!mje.equals("")) {
                JOptionPane.showMessageDialog(null, mje);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        } finally {

        }
        try {
            con.close();
            sta.close();
        } catch (Exception e) {

        }
    }

   
}
