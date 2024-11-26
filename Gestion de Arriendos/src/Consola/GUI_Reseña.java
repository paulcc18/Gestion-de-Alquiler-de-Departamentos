package Consola;

import Dominio.Reserva;
import java.util.Scanner;


import Dominio.Reseña;
import Util.ValidarReseña;
import java.util.Scanner;

public class GUI_Reseña {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario:");
        String nombreUsuario = scanner.nextLine();

   
        System.out.println("Ingrese el comentario:");
        String comentario = scanner.nextLine();


        System.out.println("Ingrese la fecha (formato YYYY-MM-DD):");
        String fecha = scanner.nextLine();

        // Validar que la fecha tenga el formato correcto
        while (!ValidarReseña.validarFecha(fecha)) {
            System.out.println("La fecha no es válida. Ingrese nuevamente (formato YYYY-MM-DD):");
            fecha = scanner.nextLine();
        }

     
        Reseña reseña = new Reseña(nombreUsuario, comentario, fecha);

        System.out.println("\n=== Datos de la Reseña ===");
        System.out.println("Nombre de Usuario: " + reseña.getNombreUsuario());
        System.out.println("Comentario: " + reseña.getComentario());
        System.out.println("Fecha: " + reseña.getFecha());
    }
}
