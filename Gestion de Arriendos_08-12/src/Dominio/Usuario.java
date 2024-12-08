package Dominio;

public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private String fechaRegistro;


    // Constructor por defecto
    public Usuario() {
        this.nombre = "";
        this.apellido = "";
        this.correo = "";
        this.contraseña = "";
        this.fechaRegistro = "";
    }

    // Constructor con atributos principales
    public Usuario(String nombre, String apellido, String correo, String contraseña, String fechaRegistro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.fechaRegistro = fechaRegistro;
    }

    // Constructor completo
    public Usuario(String nombre, String apellido, String correo, String contraseña, String fechaRegistro, Reseña[] reseñas, Reserva[] reservas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.fechaRegistro = fechaRegistro;
        this.reseñas = reseñas;
        this.reservas = reservas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * METODOS CRUD
     */


    @Override
    public String toString() {
        return "Usuario{" +
                "Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", Correo='" + correo + '\'' +
                ", Contraseña='" + contraseña + '\'' +
                ", Fecha Registro='" + fechaRegistro + '\'' +
                '}';
    }

}
