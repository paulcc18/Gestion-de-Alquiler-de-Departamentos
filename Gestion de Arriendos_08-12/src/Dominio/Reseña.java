package Dominio;

public class Reseña {
    private String nombreUsuario;
    private String comentario;
    private Date fecha;
    private Estudiante estudiante;
    private Propiedad propiedad;
    // Constructor por defecto
    public Reseña() {
        this.nombreUsuario = "";
        this.comentario = "";
        this.fecha = "";
    }

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

    public String getDetalles() {
        return "Reseña de " + nombreUsuario + "\n" +
                "Comentario: " + comentario + "\n" +
                "Fecha: " + fecha;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Reseña{" +
                "Nombre Usuario='" + nombreUsuario + '\'' +
                ", Comentario='" + comentario + '\'' +
                ", Fecha='" + fecha + '\'' +
                '}';
    }



}
