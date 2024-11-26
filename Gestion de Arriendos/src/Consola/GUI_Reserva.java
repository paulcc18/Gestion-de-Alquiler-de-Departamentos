package Consola;

import Dominio.Reserva;
import Util.ValidarReserva;
import java.util.Scanner;

public class GUI_Reserva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reserva reserva = new Reserva(); // Crear una nueva instancia de Reserva

        String fechaInicio;
        String fechaFin;
        String disponibilidad;

        // Validar fecha de inicio
        while (true) {
            System.out.print("Ingresa la fecha de inicio (YYYY-MM-DD): ");
            fechaInicio = scanner.nextLine();
            if (ValidarReserva.esFechaValida(fechaInicio)) {
                reserva.setFechaInicio(fechaInicio);
                break;
            } else {
                System.out.println("Fecha inválida. Por favor ingresa la fecha en formato YYYY-MM-DD.");
            }
        }

        // Validar fecha de fin
        while (true) {
            System.out.print("Ingresa la fecha de fin (YYYY-MM-DD): ");
            fechaFin = scanner.nextLine();
            if (ValidarReserva.esFechaValida(fechaFin)) {
                reserva.setFechaFin(fechaFin);
                break;
            } else {
                System.out.println("Fecha inválida. Por favor ingresa la fecha en formato YYYY-MM-DD.");
            }
        }

        // Validar disponibilidad
        while (true) {
            System.out.print("Ingresa la disponibilidad (Si/No): ");
            disponibilidad = scanner.nextLine();
            if (ValidarReserva.esDisponibilidadValida(disponibilidad)) {
                reserva.setDisponibilidad(disponibilidad);
                break;
            } else {
                System.out.println("Disponibilidad inválida. Por favor ingresa 'Si' o 'No'.");
            }
        }

        // Mostrar confirmación
        System.out.println("\nReserva guardada exitosamente:");
        System.out.println("Fecha de inicio: " + reserva.getFechaInicio());
        System.out.println("Fecha de fin: " + reserva.getFechaFin());
        System.out.println("Disponibilidad: " + reserva.getDisponibilidad());

        scanner.close();
    }
}
