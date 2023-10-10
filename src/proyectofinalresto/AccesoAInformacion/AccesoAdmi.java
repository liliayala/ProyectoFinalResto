
package proyectofinalresto.AccesoAInformacion;

import java.sql.Connection;
import javax.swing.JOptionPane;
import proyectofinalresto.Entidades.Administrador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AccesoAdmi {
     private Connection connection = null;

    public AccesoAdmi() {
        connection = Conexion.ConexcionDB();
    }
     
     
    public Administrador buscarAdministrador(int dni,int id){
         Administrador admi = null;
        String sql = "SELECT codigoAdmi,nombreAdmi,dniAdmi FROM administrador WHERE  codigoAdmi= ?  AND dniAdmi = ?";
        PreparedStatement ps = null;
        try {
           ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.setInt(2,id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                admi = new Administrador();
                admi.setCodigoAdmi(rs.getInt("codigoAdmi"));
                admi.setNombreAdmi(rs.getString("nombreAdmi"));
                admi.setDniAdmi(rs.getInt("dniAdmi")); 
            }
            ps.close();
        } 
        catch (SQLException ex) {
          
        }catch(NullPointerException ne){
            JOptionPane.showMessageDialog(null, "El Documento ingresado no existe!");
        }
        return admi;
    }
    
     public Administrador buscarAdministradorPorCodigo(int id){
         Administrador admi = null;
        String sql = "SELECT codigoAdmi,nombreAdmi,dniAdmi FROM administrador WHERE  codigoAdmi= ?";
        PreparedStatement ps = null;
        try {
           ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                admi = new Administrador();
                admi.setCodigoAdmi(rs.getInt("codigoAdmi"));
                admi.setNombreAdmi(rs.getString("nombreAdmi"));
                admi.setDniAdmi(rs.getInt("dniAdmi")); 
            }
            ps.close();
        } 
        catch (SQLException ex) {
          
        }catch(NullPointerException ne){
            JOptionPane.showMessageDialog(null, "El Documento ingresado no existe!");
        }
        return admi;
    }
    
}
