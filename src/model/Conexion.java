package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Wilson Rueda
 */
public class Conexion {
    private final String usuario="pruebasenmicrud";
    private final String clave="Pruebasconjava";
    private final String url="jdbc:mysql://db4free.net/dbpersonas9876?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    Connection conn = null;
    
    public Connection getConexion(){
        try{
            //obtiene el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                //obtiene la conexion
                conn = DriverManager.getConnection(url,usuario,clave);
                if(conn != null){
                    JOptionPane.showMessageDialog(null, "Conexión a base de datos éxitosa");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error SQLException" + ex.getMessage());
            }
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error en ClassNotFoundException" +" "+ e.getMessage());
        }
        return conn;
    }    
}
