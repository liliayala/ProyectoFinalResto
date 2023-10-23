package proyectofinalresto.AccesoAInformacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinalresto.Entidades.Mesa;

public class AccesoMesa {
    Connection connection = null;

    public AccesoMesa() {
        connection = Conexion.ConexcionDB();
    }
    
    public void guardarMesa(Mesa mesa){
        
        String sql = "INSERT INTO mesa (numero, capacidad, estado)VALUES(?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getNumero());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
            ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();
             
             if(rs.next()){
                 mesa.setIdMesa(1);
                 JOptionPane.showMessageDialog(null, "Mesa Ingresado Exitosamente");
             }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error! intente nuevamente");
        }
    }
    
    public void modificarCapacidadMesa(int idM){
        String sql = "UPDATE mesa SET capacidad = ? WHERE idMesa = ? AND estado = 1";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
             ps.setInt(1,idM);
            int fila = ps.executeUpdate();
            if(fila == 1){
            JOptionPane.showMessageDialog(null, "Capacidad de mesa modificada exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al intentar actualizar, vuelva a intentarlo");
        }catch(NullPointerException ne){
             JOptionPane.showMessageDialog(null,"El id ingresado no existe!");
        }
        
    }
    
    
   public void modificarEstadoMesa(int idM){
        String sql = "UPDATE mesa SET estado = ? WHERE idMesa = ? ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
             ps.setInt(1,idM);
            int fila = ps.executeUpdate();
            if(fila == 1){
            JOptionPane.showMessageDialog(null, "Estado modificado exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al intentar actualizar, vuelva a intentarlo");
        }catch(NullPointerException ne){
             JOptionPane.showMessageDialog(null,"El id ingresado no existe!");
        }
        
    } 
   
   public Mesa buscarMesa(int idM){
       Mesa mesa = null;
       String sql = " SELECT numero,capacidad,estado WHERE idMesa = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idM);
           ResultSet rs = ps.executeQuery();
            if(rs.next()){
               mesa = new Mesa();
               mesa.setIdMesa(idM);
               mesa.setNumero(rs.getInt("numero"));
               mesa.setCapacidad(rs.getInt("capacidad"));
               mesa.setEstado(true);
           }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Ocurrio un error en la busqueda");
        }catch(NullPointerException ne){
         JOptionPane.showMessageDialog(null, "Id ingresado no existe! O la mesa seleccionada no esta en funcionamiento");
        }
        return mesa;
   }
   
   public List<Mesa> ListarMesa(){
        List<Mesa> mesas = new ArrayList<>();
        
        String sql = "SELECT idMesa, numero,capacidad,estado FROM mesa";
        try {
            PreparedStatement ps =  connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            Mesa mesa = new Mesa();
             mesa.setIdMesa(rs.getInt("idMesa"));
             mesa.setNumero(rs.getInt("numero"));
             mesa.setCapacidad(rs.getInt("capacidad"));
             mesa.setEstado(rs.getBoolean("estado"));
             mesas.add(mesa);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo acceder a la informacion de mesas");
        }
        return mesas;
    }
}
