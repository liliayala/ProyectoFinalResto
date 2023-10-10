
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
import proyectofinalresto.Entidades.Producto;

public class AccesoProducto {
    
    private Connection connection = null;

    public AccesoProducto() {
       connection = Conexion.ConexcionDB();
    }
    
    public void nuevoProducto(Producto producto){
    String sql = "INSERT INTO producto(nombreProducto, cantidad,precio)VALUES(?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,producto.getNombreProducto());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3,producto.getPrecio());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                producto.setIdProducto(1);
            JOptionPane.showMessageDialog(null, "Producto Ingresado Exitosamente");
            }else{
            
            JOptionPane.showMessageDialog(null, "No se pudo ingresar el nuevo producto, vuelva a intentar");
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error a acceder a Producto");
        }
    
    }
        //modificar el precio
    public void modificarPrecioProducto(double precio,int idP){
        String sql = "UPDATE producto SET precio = ? WHERE idProducto = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setDouble(1, precio);
            ps.setInt(2,idP);
            int fila = ps.executeUpdate();
            if(fila == 1){
            JOptionPane.showMessageDialog(null, "Precio modificado Exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error! No se pudo acceder al precio del producto");
        }catch(NullPointerException ne){
        
        JOptionPane.showMessageDialog(null, "El id del producto ingresado no existe!");
        }
    }
    
    
    public List<Producto> ListaDeProducto(){
        List<Producto> productos = new ArrayList<>();
        
        String sql = "SELECT idProducto,nombreProducto,precio FROM producto";
        try {
            PreparedStatement ps =  connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            Producto producto = new Producto();
             producto.setIdProducto(rs.getInt("idProducto"));
             producto.setNombreProducto(rs.getString("nombreProducto"));
             producto.setPrecio(rs.getDouble("precio"));
             productos.add(producto);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo acceder a los productos");
        }
        return productos;
    }
    // METODO PARA MODIFICAR EL STOCK DE UN PRODUCTO
    public void modificarStockProducto( int cantidad,int idP){
                // consulta a base de datos
        String sql= "UPDATE producto SET cantidad = ? WHERE idProducto = ?";
        try {             //llamando a la conexion de la bese de datos
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, cantidad);
            ps.setInt(2,idP);
            int fila = ps.executeUpdate();
            if(fila == 1){
            JOptionPane.showMessageDialog(null, "Stock del producto modificado Exitosamente");
            }
            ps.close();//cerrando el preparedEstatement
        } catch (SQLException ex) { //capturando excepción 
            JOptionPane.showMessageDialog(null, "Ocurrio un error! No se pudo acceder al precio del producto");
            
        }catch(NullPointerException ne){ //capturando excepcion de, id ingresado sobrepase a la longitud
        
        JOptionPane.showMessageDialog(null, "El id del producto ingresado no existe!");
        }
    }
    
     public Producto buscarProducto(int idP){
         Producto producto = null;
     String sql = "SELECT idProducto,nombreProducto, cantidad, precio  FROM producto WHERE idProducto = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idP);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){    
             producto = new Producto();
             producto.setIdProducto(rs.getInt("idProducto"));
             producto.setNombreProducto(rs.getString("nombreProducto"));
             producto.setCantidad(rs.getInt("cantidad"));
             producto.setPrecio(rs.getDouble("precio"));
            
            }
            ps.close();
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "No se pudo ingresar a productos");
        }catch(NullPointerException ne){
        JOptionPane.showMessageDialog(null, "El id del producto ingresado no existe");
        }
        return producto;
     }
     
     
     
      public List<Producto> obtenerProducto(int idP){
        List<Producto> productos = new ArrayList<>();
        
        String sql = "SELECT idProducto,nombreProducto,precio FROM producto";
        try {
            PreparedStatement ps =  connection.prepareStatement(sql);
            ps.setInt(1, idP);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            Producto producto = new Producto();
             producto.setIdProducto(rs.getInt("idProducto"));
             producto.setNombreProducto(rs.getString("nombreProducto"));
             producto.setPrecio(rs.getDouble("precio"));
             productos.add(producto);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo acceder a los productos");
        }
        return productos;
    }
}
