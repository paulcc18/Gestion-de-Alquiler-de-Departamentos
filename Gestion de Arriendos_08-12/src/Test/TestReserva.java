package Test;

import Dominio.Reserva;

public class TestReserva {

    public static void testCrearReserva() {
        // Crear un objeto de la clase Reserva utilizando el constructor con parámetros
        Reserva reserva = new Reserva("2024-11-20", "2024-11-25", "Disponible");

        // Llamar al método crearReserva para añadirla a la lista
        Reserva.crearReserva(reserva);

        // Mostrar la reserva creada
        System.out.println("Reserva creada:");
        System.out.println(reserva.getDetalles());
    }

    public static void testDuplicarReserva() {
        // Crear un objeto de la clase Reserva utilizando el constructor con parámetros
        Reserva reservaOriginal = new Reserva("2024-11-20", "2024-11-25", "Disponible");

        // Crear una copia de la reserva usando el constructor con referencia a otro objeto
        Reserva reservaCopia = new Reserva(reservaOriginal);

        // Llamar al método crearReserva para añadir la copia
        Reserva.crearReserva(reservaCopia);

        // Mostrar la reserva duplicada
        System.out.println("Reserva duplicada:");
        System.out.println(reservaCopia.getDetalles());
    }

    public static void testLeerReserva() {
        // Leer la reserva en el índice 0
        Reserva reserva = Reserva.leerReserva(0);

        if (reserva != null) {
            System.out.println("Reserva leída:");
            System.out.println(reserva.getDetalles());
        }
    }

    public static void testActualizarReserva() {
        // Crear una nueva reserva para actualizar
        Reserva nuevaReserva = new Reserva("2024-12-01", "2024-12-10", "No disponible");

        // Actualizar la reserva en el índice 0
        Reserva.actualizarReserva(0, nuevaReserva);

        // Mostrar la reserva actualizada
        System.out.println("Reserva actualizada:");
        System.out.println(nuevaReserva.getDetalles());
    }

    public static void testEliminarReserva() {
        // Eliminar la reserva en el índice 0
        Reserva.eliminarReserva(0);

        // Listar todas las reservas restantes
        System.out.println("Lista de reservas después de eliminar:");
        Reserva.listarReservas();
    }

    public static void testListarReservas() {
        // Listar todas las reservas actuales
        System.out.println("Lista de reservas:");
        Reserva.listarReservas();
    }

    public static void main(String[] args) {
        // Ejecutar pruebas CRUD

        // Crear y listar reservas
        System.out.println("=== Crear y listar reservas ===");
        testCrearReserva();
        testCrearReserva();
        testListarReservas();

        // Leer una reserva
        System.out.println("\n=== Leer una reserva ===");
        testLeerReserva();

        // Actualizar una reserva
        System.out.println("\n=== Actualizar una reserva ===");
        testActualizarReserva();

        // Listar reservas después de actualizar
        System.out.println("\n=== Listar reservas después de actualizar ===");
        testListarReservas();

        // Eliminar una reserva
        System.out.println("\n=== Eliminar una reserva ===");
        testEliminarReserva();

        // Listar reservas después de eliminar
        System.out.println("\n=== Listar reservas después de eliminar ===");
        testListarReservas();

        // Duplicar una reserva
        System.out.println("\n=== Duplicar una reserva ===");
        testDuplicarReserva();
        testListarReservas();
    }
}
