package Test;

import Dominio.Reserva;

public class TestReserva {
    public static void testCrearReserva() {
        // Crear un objeto de la clase Reserva utilizando el constructor con parámetros
        Reserva reserva = new Reserva("2024-11-20", "2024-11-25", "Disponible");

        // Mostrar los valores de los atributos usando los getters
        System.out.println("Fecha de Inicio: " + reserva.getFechaInicio());
        System.out.println("Fecha de Fin: " + reserva.getFechaFin());
        System.out.println("Disponibilidad: " + reserva.getDisponibilidad());
    }

    public static void main(String[] args) {
        testCrearReserva();
    }
}
