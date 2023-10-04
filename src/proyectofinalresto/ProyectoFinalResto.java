/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinalresto;

import proyectofinalresto.AccesoAInformacion.AccesoMesa;
import proyectofinalresto.AccesoAInformacion.AccesoProducto;
import proyectofinalresto.AccesoAInformacion.Conexion;
import proyectofinalresto.Entidades.Mesa;
import proyectofinalresto.Entidades.Producto;

/**
 *
 * @author ayala
 */
public class ProyectoFinalResto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Conexion con = new Conexion();
        
//        Conexion.ConexcionDB();
        
        AccesoProducto ap = new AccesoProducto();
        
//     Producto producto1 = new Producto("Empanada jamon y queso", 30, 300);
//        Producto producto2 = new Producto("Agua mineral ", 40, 400);
//       ap.nuevoProducto(producto1);
//       ap.nuevoProducto(producto2);

        AccesoMesa am = new AccesoMesa();
        Mesa mesa1 = new Mesa(33,5,true);
        Mesa mesa2 = new Mesa(44,2,true);
       am.guardarMesa(mesa2);
                
    }
    
}
