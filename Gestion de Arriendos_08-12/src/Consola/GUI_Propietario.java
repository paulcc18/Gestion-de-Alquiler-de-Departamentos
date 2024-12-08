package Consola;

import Dominio.Propietario;
import Dominio.Propiedad;
import Util.Validaciones; // Importar la clase Validaciones
import java.util.Scanner;

public class GUI_Propietario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del propietario:");

        // Datos del propietario
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Correo electrónico: ");
        String correo = scanner.nextLine();

        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();

        System.out.print("Fecha de registro (YYYY-MM-DD): ");
        String fechaRegistro = scanner.nextLine();

        // Validar número de propiedades usando Validaciones
        int numeroPropiedades = Validaciones.validarIdPropiedad(scanner);

        // Ingresar detalles de la primera propiedad (para usar el nuevo constructor)
        System.out.println("\nIngrese los detalles de la primera propiedad:");

        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();

        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Precio: ");
        String precio = scanner.nextLine();

        System.out.print("Disponibilidad (Disponible/No disponible): ");
        String disponibilidadStr = scanner.nextLine();

        // Convertir el texto de disponibilidad a un valor booleano
        boolean disponibilidad = disponibilidadStr.equalsIgnoreCase("Disponible");

        // Crear la primera propiedad
        Propiedad primeraPropiedad = new Propiedad(1, descripcion, direccion, precio, nombre + " " + apellido, disponibilidad);

        // Crear el objeto Propietario usando el nuevo constructor
        Propietario propietario = new Propietario(nombre, apellido, correo, contraseña, fechaRegistro, primeraPropiedad);

        // Agregar propiedades adicionales si el número de propiedades es mayor a 1
        for (int i = 1; i < numeroPropiedades; i++) { // Ya se agregó la primera propiedad
            System.out.println("\nIngrese los detalles de la propiedad #" + (i + 1));

            System.out.print("Descripción: ");
            String descripcionExtra = scanner.nextLine();

            System.out.print("Dirección: ");
            String direccionExtra = scanner.nextLine();

            System.out.print("Precio: ");
            String precioExtra = scanner.nextLine();

            System.out.print("Disponibilidad (Disponible/No disponible): ");
            String disponibilidadStrExtra = scanner.nextLine();

            boolean disponibilidadExtra = disponibilidadStrExtra.equalsIgnoreCase("Disponible");

            // Crear una nueva propiedad
            Propiedad propiedadExtra = new Propiedad(i + 1, descripcionExtra, direccionExtra, precioExtra, nombre + " " + apellido, disponibilidadExtra);

            // Agregar la propiedad adicional al propietario
            propietario.agregarPropiedad(propiedadExtra);
        }

        // Mostrar los datos del propietario y sus propiedades
        System.out.println("\nPropietario creado:");
        System.out.println(propietario); // Invoca automáticamente el método toString()
    }
}
