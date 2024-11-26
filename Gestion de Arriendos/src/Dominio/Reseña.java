package Dominio;

public class Reseña {
    private String nombreUsuario;
    private String comentario;
    private String fecha;

    // Constructor por defecto
    public Reseña() {}

    // Constructor con parámetros
    public Reseña(String nombreUsuario, String comentario, String fecha) {
        this.nombreUsuario = nombreUsuario;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    // Métodos getter y setter
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
