
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author jocpa
 */
public class Conexion {
    private static Connection conn = null;
    private static String usuario= "BuenosAires";
    private static String contraseña= "BuenosAires";
    private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(url,usuario,contraseña);
            if (conn != null) {
                System.out.println("Conexion Exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) 
        {
            System.out.println(e);
        }
        return conn;
    }
    
    public static void main(String[] args) {
        Conexion.getConnection();//probamos que la conexión se inicie
    }
 }

