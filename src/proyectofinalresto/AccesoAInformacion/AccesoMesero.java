
package proyectofinalresto.AccesoAInformacion;
import java.sql.Connection;
import proyectofinalresto.Entidades.Mesero;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AccesoMesero {
    private Connection connection = null;

    public AccesoMesero() {
        connection = Conexion.ConexcionDB();
    }
    
    public Mesero buscarMeseroPorId(int idM){
         Mesero mesero = null;
        String sql = " SELECT nombreMesero,apellido,dniMesero FROM mesero WHERE idMesero = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idM);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                mesero = new Mesero();
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombreMesero(rs.getString("nombreMesero"));
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
    
    
}
