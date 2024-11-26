package Util;

import java.util.Scanner;

public class ValidarPropiedad {

    public static int validarIdPropiedad(Scanner scanner) {
        int idPropiedad = 0;
        while (true) {
            System.out.print("ID Propiedad : ");
            if (scanner.hasNextInt()) {
                idPropiedad = scanner.nextInt();
                if (idPropiedad > 0) break;
                else System.out.println("El ID debe ser un número entero positivo.");
            } else {
                System.out.println("Entrada no válida. Debe ser un número entero.");
                scanner.next(); // Limpiar entrada incorrecta
            }
        }
        scanner.nextLine(); // Limpiar el buffer
        return idPropiedad;
    }

    public static String validarTextoNoVacio(Scanner scanner, String mensaje) {
        String texto = "";
        while (texto.isBlank()) {
            System.out.print(mensaje + " (no vacío): ");
            texto = scanner.nextLine().trim();
            if (texto.isBlank()) {
                System.out.println("El campo no puede estar vacío.");
            }
        }
        return texto;
    }

    public static double validarPrecio(Scanner scanner) {
        double precio = 0.0;
        while (true) {
            System.out.print("Precio (cualquier número positivo): ");
            if (scanner.hasNextDouble()) {
                precio = scanner.nextDouble();
                if (precio > 0) break;
                else System.out.println("El precio debe ser un número positivo.");
            } else {
                System.out.println("Entrada no válida. Debe ser un número.");
                scanner.next(); // Limpiar entrada incorrecta
            }
        }
        scanner.nextLine(); // Limpiar el buffer
        return precio;
    }

    public static String validarDisponibilidad(Scanner scanner) {
        String disponibilidad = "";
        while (true) {
            System.out.print("Disponibilidad (Disponible/Ocupado): ");
            disponibilidad = scanner.nextLine().trim();
            if (disponibilidad.equalsIgnoreCase("Disponible") || disponibilidad.equalsIgnoreCase("Ocupado")) {
                disponibilidad = disponibilidad.substring(0, 1).toUpperCase() + disponibilidad.substring(1).toLowerCase();
                break;
            } else {
                System.out.println("La disponibilidad debe ser 'Disponible' o 'Ocupado'.");
            }
        }
        return disponibilidad;
    }
}