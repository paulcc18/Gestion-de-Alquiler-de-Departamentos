package Dominio;

public class Propiedad {
    private int idPropiedad;
    private String descripcion;
    private String direccion;
    private String precio;
    private String propietario;
    private String disponibilidad;

    public Propiedad() {}

    public Propiedad(int idPropiedad, String descripcion, String direccion, String precio, String propietario, String disponibilidad) {
        this.idPropiedad = idPropiedad;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.precio = precio;
        this.propietario = propietario;
        this.disponibilidad = disponibilidad;
    }

    public int getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(int idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
