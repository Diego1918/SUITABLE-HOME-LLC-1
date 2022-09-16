package conexcion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class CConexcion {
    
    Connection conectar = null;
    String usuario="root";
    String contraseña ="diegol1918";
    String bd = "bdsuitablehome";
    String ip ="localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConecxion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
             JOptionPane.showMessageDialog(null, "Se conectó correctamente a la base de datos");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se conectó a la base de datos, error: "+e.toString());
        
        }
    return conectar;
    }  
}
