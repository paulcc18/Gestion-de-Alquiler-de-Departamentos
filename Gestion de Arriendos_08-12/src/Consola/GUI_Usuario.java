package Consola;

import Dominio.Usuario;
import Util.Validaciones;
import java.util.Scanner;

public class GUI_Usuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del usuario:");

        // Validar nombre como texto no vacío
        String nombre = Validaciones.validarTextoNoVacio(scanner, "Nombre");
        String apellido = Validaciones.validarTextoNoVacio(scanner, "Apellido");
        String correo = Validaciones.validarTextoNoVacio(scanner, "Correo");

        // Validar contraseña
        String contraseña = "";
        while (!Validaciones.esContraseñaValida(contraseña)) {
            System.out.print("Contraseña (al menos 8 caracteres, 1 mayúscula, 1 minúscula, 1 número): ");
            contraseña = scanner.nextLine();
            if (!Validaciones.esContraseñaValida(contraseña)) {
                System.out.println("La contraseña debe tener al menos 8 caracteres, incluir al menos una letra mayúscula, una minúscula y un número.");
            }
        }
        
        String fechaRegistro = Validaciones.validarTextoNoVacio(scanner, "Fecha de registro");

        // Crear el objeto Usuario
        Usuario usuario = new Usuario(nombre, apellido, correo, contraseña, fechaRegistro);
        
        System.out.println("\nUsuario creado:");
        System.out.println(usuario.toString()); // Llamada al toString()
    }
}
