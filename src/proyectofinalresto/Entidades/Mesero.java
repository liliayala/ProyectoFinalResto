
package proyectofinalresto.Entidades;


public class Mesero {
    private int idMesero;
    private String nombreMesero;
    private String apellido;
    private int dniMsero;

    public Mesero() {
    }

    public Mesero(int idMesero, String nombreMesero, String apellido, int dniMsero) {
        this.idMesero = idMesero;
        this.nombreMesero = nombreMesero;
        this.apellido = apellido;
        this.dniMsero = dniMsero;
    }

    public Mesero(String nombreMesero, String apellido, int dniMsero) {
        this.nombreMesero = nombreMesero;
        this.apellido = apellido;
        this.dniMsero = dniMsero;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombreMesero() {
        return nombreMesero;
    }

    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDniMsero() {
        return dniMsero;
    }

    public void setDniMsero(int dniMsero) {
        this.dniMsero = dniMsero;
    }

    @Override
    public String toString() {
        return idMesero + ", nombreMesero=" + nombreMesero + ", apellido=" + apellido + ", dniMsero=" + dniMsero;
    }
    
    
}
