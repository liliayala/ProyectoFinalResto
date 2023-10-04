
package proyectofinalresto.Entidades;


public class Pedido {
    
    private int idPedido;
    private Mesa mesa;
    private Mesero mesero;
    private Producto producto;
    private double valorTotal;

    public Pedido(int idPedido, Mesa mesa, Mesero mesero, Producto producto, double valorTotal) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.mesero = mesero;
        this.producto = producto;
        this.valorTotal = valorTotal;
    }

    public Pedido() {
    }

    public Pedido(Mesa mesa, Mesero mesero, Producto producto, double valorTotal) {
        this.mesa = mesa;
        this.mesero = mesero;
        this.producto = producto;
        this.valorTotal = valorTotal;
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

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return  idPedido + ", mesa=" + mesa + ", mesero=" + mesero + ", producto=" + producto + ", valorTotal=" + valorTotal;
    }
    
    
}
