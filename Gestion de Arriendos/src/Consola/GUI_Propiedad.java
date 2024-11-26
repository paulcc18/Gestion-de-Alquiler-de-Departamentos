package Consola;

import Dominio.Propiedad;
import Util.ValidarPropiedad; // Importar la clase Validaciones
import java.util.Scanner;

public class GUI_Propiedad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos de la propiedad:");

        // Usar los métodos de Validaciones para validar las entradas
        int idPropiedad = ValidarPropiedad.validarIdPropiedad(scanner);
        String descripcion = ValidarPropiedad.validarTextoNoVacio(scanner, "Descripción");
        String direccion = ValidarPropiedad.validarTextoNoVacio(scanner, "Dirección");
        double precio = ValidarPropiedad.validarPrecio(scanner);
        String propietario = ValidarPropiedad.validarTextoNoVacio(scanner, "Propietario");
        String disponibilidad = ValidarPropiedad.validarDisponibilidad(scanner);

        // Crear el objeto Propiedad
        Propiedad propiedad = new Propiedad(idPropiedad, descripcion, direccion, String.valueOf(precio), propietario, disponibilidad);

        // Mostrar los datos de la propiedad
        System.out.println("\nPropiedad creada:");
        System.out.println("ID Propiedad: " + propiedad.getIdPropiedad());
        System.out.println("Descripción: " + propiedad.getDescripcion());
        System.out.println("Dirección: " + propiedad.getDireccion());
        System.out.println("Precio: " + propiedad.getPrecio());
        System.out.println("Propietario: " + propiedad.getPropietario());
        System.out.println("Disponibilidad: " + propiedad.getDisponibilidad());
    }
}