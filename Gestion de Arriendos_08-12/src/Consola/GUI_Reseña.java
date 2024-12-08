package Consola;

import Dominio.Reseña;
import Util.Validaciones;
import java.util.Scanner;

public class GUI_Reseña {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validar nombre de usuario como texto no vacío
        String nombreUsuario = Validaciones.validarTextoNoVacio(scanner, "Ingrese el nombre de usuario");

        // Validar comentario como texto no vacío
        String comentario = Validaciones.validarTextoNoVacio(scanner, "Ingrese el comentario");

        // Validar fecha usando el método de Validaciones
        String fecha = Validaciones.validarFecha(scanner, "Ingrese la fecha (formato YYYY-MM-DD)");

        // Crear el objeto Reseña con los datos ingresados
        Reseña reseña = new Reseña(nombreUsuario, comentario, fecha);

        // Mostrar los datos del método toString()
        System.out.println("\n=== Datos de la Reseña ===");
        System.out.println(reseña.toString());

        scanner.close();
    }
}
