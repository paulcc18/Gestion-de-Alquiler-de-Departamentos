package Dominio;

public class Propietario extends Usuario {
    private int numeroPropiedades;
    private String propiedades;

    public Propietario() {

    }

    public Propietario(String nombre, String apellido, String correo, String contraseña, String fechaRegistro, int numeroPropiedades, String propiedades) {
        super(nombre, apellido, correo, contraseña, fechaRegistro);
        this.numeroPropiedades = numeroPropiedades;
        this.propiedades = propiedades;
    }

    public int getNumeroPropiedades() {
        return numeroPropiedades;
    }

    public void setNumeroPropiedades(int numeroPropiedades) {
        this.numeroPropiedades = numeroPropiedades;
    }

    public String getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(String propiedades) {
        this.propiedades = propiedades;
    }
}
