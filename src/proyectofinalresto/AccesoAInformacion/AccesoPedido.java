
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
import proyectofinalresto.Entidades.Mesero;
import proyectofinalresto.Entidades.Pedido;
import proyectofinalresto.Entidades.Producto;


public class AccesoPedido {
    
    Connection connection = null;
    AccesoProducto datoProdcuto = new AccesoProducto();
    AccesoMesero datoMesero = new AccesoMesero();
    AccesoMesa datoMesa = new AccesoMesa();
    
    public AccesoPedido() {
        connection = Conexion.ConexcionDB();
    }
    
        //insertando pedido
    public void nuevoPedido(Pedido pedido){
        
     String sql = "INSERT INTO pedido(idMesa,idMesero,idProducto,estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1, pedido.getMesa().getIdMesa());
         ps.setInt(2,pedido.getMesero().getIdMesero());
         ps.setInt(3, pedido.getProducto().getIdProducto());
         ps.setString(4, pedido.getEstado());
         ps.executeUpdate();
         ResultSet rs = ps.getGeneratedKeys();
         if(rs.next()){
         pedido.setIdPedido(rs.getInt(1));
         JOptionPane.showMessageDialog(null, "Pedido realizado exitosamente 😄😄");
         }
         ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error! vuelva a intentarlo!");
        }
    }
    
    // modificar estado
    public void modificarEstado(String estado,int idP){
        String sql = "UPDATE pedido SET estado = ? WHERE idPedido = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, estado);
            ps.setInt(2, idP);
            int fila = ps.executeUpdate();
            if(fila==1){
            JOptionPane.showMessageDialog(null, "Modificado Correctamente 😄😄");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, vulava a intentarlo!");
        }catch(NullPointerException ne){
        JOptionPane.showMessageDialog(null, "El dato ingresado es invalido! ");
        }
        
    }
    // cancelar pedido
    public void cancelarPedido(int idP){
        String sql = "UPDATE pedido SET estado = 'Cancelado' WHERE idPedido = ? ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idP);
            int fila = ps.executeUpdate();
            if(fila==1){
            JOptionPane.showMessageDialog(null, "Modificado Correctamente 😄😄");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, vulava a intentarlo!");
        }catch(NullPointerException ne){
        JOptionPane.showMessageDialog(null, "El dato ingresado es invalido! ");
        }
    }
            //lista todo los pedidos
    public List<Pedido> listarPedidos(){
 
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pedido pedido= new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                Mesa mesa = datoMesa.buscarMesa(rs.getInt("idMesa"));
                Mesero mesero = datoMesero.buscarMeseroPorId(rs.getInt("idMesero"));
                Producto prod = datoProdcuto.buscarProducto(rs.getInt("idProducto"));
                pedido.setMesa(mesa);
                pedido.setMesero(mesero);
                pedido.setProducto(prod);
                pedido.setEstado(rs.getString("estado"));
                pedidos.add(pedido);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al acceder a pedido");
        }
        return pedidos;
    }
    
    
    //join 
     public List<Pedido> infoPedido(int id){
 
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT numero,capacidad,nombre,nombreProducto,precio,pedido.estado FROM pedido JOIN mesa ON pedido.idMesa = mesa.idMesa JOIN mesero ON pedido.idMesero = mesero.idMesero JOIN producto ON pedido.idProducto = producto.idProducto WHERE idPedido = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pedido pedido= new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                
                Mesa mesa = new Mesa();
            mesa.setNumero(rs.getInt("numero"));
            mesa.setCapacidad(rs.getInt("capacidad"));
            pedido.setMesa(mesa);
                Mesero mesero = new Mesero();
            mesero.setNombreMesero(rs.getString("nombre"));
            pedido.setMesero(mesero);
                
            Producto producto = new Producto();
            producto.setNombreProducto(rs.getString("nombreProducto"));
            producto.setPrecio(rs.getDouble("precio"));
            pedido.setProducto(producto);
               pedido.setEstado(rs.getString("estado"));
            
            pedidos.add(pedido);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al acceder a pedido");
        }
        return pedidos;
    }
     
     public Pedido buscarPedido(int idP){
         Pedido pedido = null;
     String sql = "SELECT idPedido,idMesa, idMesero, idProducto,estado  FROM pedido WHERE idPedido = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idP);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){    
             pedido = new Pedido();
             pedido.setIdPedido(rs.getInt("idPedido"));
             Mesa mesa = new Mesa();
             mesa.setIdMesa(rs.getInt("idMesa"));
             pedido.setMesa(mesa);
             Mesero mesero = new Mesero();
             mesero.setIdMesero(rs.getInt("idMesero"));
             pedido.setMesero(mesero);
             Producto producto = new Producto(); 
             producto.setIdProducto(rs.getInt("idProducto"));
             pedido.setProducto(producto);
             pedido.setEstado(rs.getString("estado"));
            }
            ps.close();
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "No se pudo ingresar a productos");
        }catch(NullPointerException ne){
        JOptionPane.showMessageDialog(null, "El id del producto ingresado no existe");
        }
        return pedido;
     }
}
