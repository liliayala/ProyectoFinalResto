
package proyectofinalresto.AccesoAInformacion;
import java.sql.Connection;
import proyectofinalresto.Entidades.Mesero;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AccesoMesero {
    private Connection connection = null;

    public AccesoMesero() {
        connection = Conexion.ConexcionDB();
    }
    
    public Mesero buscarMeseroPorId(int idM){
         Mesero mesero = null;
        String sql = " SELECT nombre,apellido,dniMesero FROM mesero WHERE idMesero = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idM);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                mesero = new Mesero();
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombreMesero(rs.getString("nombre"));
                mesero.setApellido(rs.getString("apellido"));
                mesero.setDniMsero(rs.getInt("dniMesero")); 
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo ingresar a los datos");
        }catch(NullPointerException ne){
            JOptionPane.showMessageDialog(null, "El ID ingresado no existe!");
        }
        return mesero;
        
        
    }
    
    
    public Mesero buscarMeseroPorDni(int dni){
         Mesero mesero = null;
        String sql = "SELECT idMesero,nombre,apellido,dniMesero FROM mesero WHERE dniMesero = ?";
        PreparedStatement ps = null;
        try {
           ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                mesero = new Mesero();
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombreMesero(rs.getString("nombre"));
                mesero.setApellido(rs.getString("apellido"));
                mesero.setDniMsero(rs.getInt("dniMesero")); 
            }
            ps.close();
        } 
        catch (SQLException ex) {
          
        }catch(NullPointerException ne){
            JOptionPane.showMessageDialog(null, "El Documento ingresado no existe!");
        }
        return mesero;
    }
    
    public List<Mesero> listarMesero(){
    List<Mesero> meseros = new ArrayList<>();
        
        String sql = "SELECT idMesero,nombre,apellido FROM mesero";
        try {
            PreparedStatement ps =  connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            Mesero mesero = new Mesero();
             mesero.setIdMesero(rs.getInt("idMesero"));
             mesero.setNombreMesero(rs.getString("nombre"));
             mesero.setApellido(rs.getString("apellido"));
             meseros.add(mesero);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo acceder a la informacion de meseros");
        }
        return meseros;
    } 
    
}
