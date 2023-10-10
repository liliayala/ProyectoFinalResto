
package proyectofinalresto.Entidades;


public class Administrador {
    
    private int codigoAdmi;
    private String nombreAdmi;
    private int dniAdmi;

    public Administrador() {
    }

    public Administrador(int codigoAdmi, String nombreAdmi, int dniAdmi) {
        this.codigoAdmi = codigoAdmi;
        this.nombreAdmi = nombreAdmi;
        this.dniAdmi = dniAdmi;
    }

    public Administrador(String nombreAdmi, int dniAdmi) {
        this.nombreAdmi = nombreAdmi;
        this.dniAdmi = dniAdmi;
    }

    public int getCodigoAdmi() {
        return codigoAdmi;
    }

    public void setCodigoAdmi(int codigoAdmi) {
        this.codigoAdmi = codigoAdmi;
    }

    public String getNombreAdmi() {
        return nombreAdmi;
    }

    public void setNombreAdmi(String nombreAdmi) {
        this.nombreAdmi = nombreAdmi;
    }

    public int getDniAdmi() {
        return dniAdmi;
    }

    public void setDniAdmi(int dniAdmi) {
        this.dniAdmi = dniAdmi;
    }

    @Override
    public String toString() {
        return  codigoAdmi +  nombreAdmi + dniAdmi ;
    }
    
    
}
