package Consola;

import Dominio.Usuario;
import Util.ValidarUsuario;
import java.util.Scanner;

public class GUI_Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del usuario:");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Correo: ");
        String correo = scanner.nextLine();


        String contraseña = "";
        while (!ValidarUsuario.esContraseñaValida(contraseña)) {
            System.out.print("Contraseña (al menos 8 caracteres, 1 mayúscula, 1 minúscula, 1 número): ");
            contraseña = scanner.nextLine();
            if (!ValidarUsuario.esContraseñaValida(contraseña)) {
                System.out.println("La contraseña debe tener al menos 8 caracteres, incluir al menos una letra mayúscula, una minúscula y un número.");
            }
        }

        System.out.print("Fecha de registro: ");
        String fechaRegistro = scanner.nextLine();

        Usuario usuario = new Usuario(nombre, apellido, correo, contraseña, fechaRegistro);
        
        System.out.println("\nUsuario creado:");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Contraseña: " + usuario.getContraseña());
        System.out.println("Fecha de registro: " + usuario.getFechaRegistro());
    }
}
