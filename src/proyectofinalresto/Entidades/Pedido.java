
package proyectofinalresto.Entidades;


public class Pedido {
    
    private int idPedido;
    private Mesa mesa;
    private Mesero mesero;
    private Producto producto;
    private String estado;

    public Pedido(int idPedido, Mesa mesa, Mesero mesero, Producto producto, String estado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.mesero = mesero;
        this.producto = producto;
        this.estado = estado;
    }

    public Pedido() {
    }

    public Pedido(Mesa mesa, Mesero mesero, Producto producto, String estado) {
        this.mesa = mesa;
        this.mesero = mesero;
        this.producto = producto;
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  idPedido + ", mesa=" + mesa + ", mesero=" + mesero + ", producto=" + producto + ", valorTotal=" + estado;
    }
    
    
}
