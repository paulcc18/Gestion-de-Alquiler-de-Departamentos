package Consola;

import Dominio.Reserva;
import Util.Validaciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GUI_Reserva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Reserva> reservas = new ArrayList<>(); // Lista para almacenar las reservas
        boolean continuar = true;

        while (continuar) {
            System.out.println("¿Deseas hacer una nueva reserva?");
            System.out.println("1. Hacer una nueva reserva.");
            System.out.println("2. Duplicar la última reserva.");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer del scanner

            Reserva reserva;

            if (opcion == 1) {
                // Crear una nueva instancia de Reserva
                reserva = new Reserva();

                String fechaInicio;
                String fechaFin;
                String disponibilidad;

                // Validar fecha de inicio
                while (true) {
                    System.out.print("Ingresa la fecha de inicio (YYYY-MM-DD): ");
                    fechaInicio = scanner.nextLine();
                    if (Validaciones.esFechaValida(fechaInicio)) {
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
                    if (Validaciones.esFechaValida(fechaFin)) {
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
                    if (Validaciones.esDisponibilidadValida(disponibilidad)) {
                        reserva.setDisponibilidad(disponibilidad);
                        break;
                    } else {
                        System.out.println("Disponibilidad inválida. Por favor ingresa 'Si' o 'No'.");
                    }
                }

                // Guardar la nueva reserva
                reservas.add(reserva);
                System.out.println("\nReserva guardada exitosamente:");
                System.out.println(reserva.getDetalles());
            } else if (opcion == 2 && !reservas.isEmpty()) {
                // Duplicar la última reserva
                Reserva ultimaReserva = reservas.get(reservas.size() - 1);
                reserva = new Reserva(ultimaReserva); // Usar el constructor que toma una referencia a otro objeto

                System.out.println("\nReserva duplicada exitosamente:");
                System.out.println(reserva.getDetalles());
                reservas.add(reserva); // Agregar la reserva duplicada a la lista
            } else {
                System.out.println("Opción no válida o no hay reservas previas para duplicar.");
            }

            // Preguntar si desea continuar
            System.out.print("\n¿Deseas realizar otra acción? (Si/No): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("Si")) {
                continuar = false;
            }
        }

        scanner.close();
    }
}
