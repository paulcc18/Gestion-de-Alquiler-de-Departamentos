package Dominio;

public class Reserva {
    private String fechaInicio;
    private String fechaFin;
    private String disponibilidad;

    public Reserva() {}

    public Reserva(String fechaInicio, String fechaFin, String disponibilidad) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.disponibilidad = disponibilidad;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}

