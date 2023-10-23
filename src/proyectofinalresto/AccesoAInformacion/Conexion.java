package proyectofinalresto.AccesoAInformacion;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
     private static final String url = "jdbc:mariadb://localhost:3306/";
     private static final String user = "root";
     private static final String password = "";
     private static final String db = "restaurante";
    
     public static Connection ConexcionDB(){
     
      Connection  conexion= null;
        
       try{
       Class.forName("org.mariadb.jdbc.Driver");
       conexion = DriverManager.getConnection(url + db+ "?useLegacyDatetimeCode=false&serverTimezone=UTC",user,password);
      
       }catch(ClassNotFoundException fe){
       JOptionPane.showMessageDialog(null," Error al cargar el driver");
       }catch(SQLException se){
       JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos");}
   
   return conexion;
  
}
   public static void cerrarConeccion(Connection conexion){
       if(conexion!= null){
       try{
       
           conexion.close();
       
       }catch(SQLException se){
       
           JOptionPane.showMessageDialog(null,"Error al cerrar la conexion");
       }
       }
    
   }
}
