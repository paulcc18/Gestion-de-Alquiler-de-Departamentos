package Util;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validaciones {

    // Validación de ID Propiedad
    public static int validarIdPropiedad(Scanner scanner) {
        int idPropiedad = 0;
        while (true) {
            System.out.print("ID Propiedad: ");
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

    // Validación de texto no vacío
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

    // Validación de precio
    public static double validarPrecio(Scanner scanner) {
        double precio = 0.0;
        while (true) {
            System.out.print("Precio (número positivo): ");
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
    // Método para validar la disponibilidad (ahora devuelve un booleano)
    public static boolean validarDisponibilidad(Scanner scanner) {
        boolean disponibilidad = false;
        while (true) {
            System.out.print("¿Está disponible la propiedad? (si/no): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("si")) {
                disponibilidad = true;
                break;
            } else if (input.equals("no")) {
                disponibilidad = false;
                break;
            } else {
                System.out.println("Por favor, ingrese 'si' o 'no'.");
            }
        }
        return disponibilidad;
    }




    // Validación de fecha
    public static String validarFecha(Scanner scanner, String mensaje) {
        String fecha = "";
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        formatoFecha.setLenient(false);

        while (true) {
            System.out.print(mensaje + ": ");
            fecha = scanner.nextLine();
            try {
                formatoFecha.parse(fecha); // Intentar parsear la fecha
                break;
            } catch (ParseException e) {
                System.out.println("Fecha inválida. Por favor ingresa la fecha en formato YYYY-MM-DD.");
            }
        }
        return fecha;
    }

    // Validación de fecha (formato correcto y no lenient)
    public static boolean esFechaValida(String fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        formatoFecha.setLenient(false);
        try {
            formatoFecha.parse(fecha);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    // Validación de disponibilidad "Sí/No"
    public static boolean esDisponibilidadValida(String disponibilidad) {
        return disponibilidad.equalsIgnoreCase("Si") || disponibilidad.equalsIgnoreCase("No");
    }

    // Validación de número
    public static boolean esNumero(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Validación de contraseña
    public static boolean esContraseñaValida(String contraseña) {
        return contraseña.length() >= 8 &&
                contraseña.matches(".*[A-Z].*") &&
                contraseña.matches(".*[a-z].*") &&
                contraseña.matches(".*[0-9].*");
    }
}
