package Consola;

import Dominio.Propiedad;
import Util.Validaciones; // Importar la clase Validaciones
import java.util.Scanner;

public class GUI_Propiedad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de constructor para la propiedad:");
        System.out.println("1. Constructor vacío (por defecto)");
        System.out.println("2. Constructor con parámetros (precio como double)");
        System.out.println("3. Constructor con parámetros (precio como String)");

        // Leer la elección del usuario
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Propiedad propiedad = null;

        switch (opcion) {
            case 1:  // Constructor vacío (por defecto)
                propiedad = new Propiedad();  // Usamos el constructor vacío
                System.out.println("Propiedad creada con el constructor vacío.");
                break;

            case 2:  // Constructor con parámetros (precio como double)
                // Validaciones
                int idPropiedad = Validaciones.validarIdPropiedad(scanner);
                String descripcion = Validaciones.validarTextoNoVacio(scanner, "Ingrese la descripción de la propiedad");
                String direccion = Validaciones.validarTextoNoVacio(scanner, "Ingrese la dirección de la propiedad");
                double precio = Validaciones.validarPrecio(scanner);
                String propietario = Validaciones.validarTextoNoVacio(scanner, "Ingrese el nombre del propietario");
                boolean disponibilidad = Validaciones.validarDisponibilidad(scanner); // Devuelve un booleano

                // Crear el objeto Propiedad
                propiedad = new Propiedad(idPropiedad, descripcion, direccion, precio, propietario, disponibilidad);
                System.out.println("Propiedad creada con el constructor con parámetros (precio como double).");
                break;

            case 3:  // Constructor con parámetros (precio como String)
                // Validaciones
                idPropiedad = Validaciones.validarIdPropiedad(scanner);
                descripcion = Validaciones.validarTextoNoVacio(scanner, "Ingrese la descripción de la propiedad");
                direccion = Validaciones.validarTextoNoVacio(scanner, "Ingrese la dirección de la propiedad");
                String precioStr = Validaciones.validarTextoNoVacio(scanner, "Ingrese el precio de la propiedad (como texto)");
                propietario = Validaciones.validarTextoNoVacio(scanner, "Ingrese el nombre del propietario");
                disponibilidad = Validaciones.validarDisponibilidad(scanner); // Devuelve un booleano

                // Crear el objeto Propiedad
                propiedad = new Propiedad(idPropiedad, descripcion, direccion, precioStr, propietario, disponibilidad);
                System.out.println("Propiedad creada con el constructor con parámetros (precio como String).");
                break;

            default:
                System.out.println("Opción no válida. Se creará una propiedad con el constructor vacío.");
                propiedad = new Propiedad();  // Usamos el constructor vacío por defecto
        }

        // Mostrar los datos de la propiedad
        System.out.println("\nPropiedad creada:");
        System.out.println(propiedad); // Imprime usando el método toString() de Propiedad

        scanner.close();
    }
}
