package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private String fechaInicio;
    private String fechaFin;
    private String disponibilidad;
    private Estudiante estudiante;
    private Propiedad propiedad;
    // Constructor por defecto
    public Reserva() {
        this.fechaInicio = "";
        this.fechaFin = "";
        this.disponibilidad = "";
    }

    // Constructor con parámetros
    public Reserva(String fechaInicio, String fechaFin, String disponibilidad) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.disponibilidad = disponibilidad;
    }

    // Tercer constructor: Constructor por referencia a otro objeto Reserva
    public Reserva(Reserva reserva) {
        this.fechaInicio = reserva.fechaInicio;
        this.fechaFin = reserva.fechaFin;
        this.disponibilidad = reserva.disponibilidad;
    }

    // Getters y Setters
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

    // Método getDetalles
    public String getDetalles() {
        return "Reserva:\n" +
                "Fecha Inicio: " + fechaInicio + "\n" +
                "Fecha Fin: " + fechaFin + "\n" +
                "Disponibilidad: " + disponibilidad;
    }

    // Método toString para depuración
    @Override
    public String toString() {
        return "Reserva{" +
                "fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", disponibilidad='" + disponibilidad + '\'' +
                '}';
    }

    // Métodos CRUD


}