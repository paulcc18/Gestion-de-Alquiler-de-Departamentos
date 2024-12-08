package Consola;

import Dominio.Estudiante;
import Util.Validaciones;
import java.util.Scanner;

public class GUI_Estudiante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del estudiante:");

        // Validar texto no vacío
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

        // Validar como no vacío
        String fechaRegistro = Validaciones.validarTextoNoVacio(scanner, "Fecha de registro");

        // Validar edad mayor a 18
        int edad = 0;
        boolean edadValida = false;
        while (!edadValida) {
            System.out.print("Edad (mayor a 18): ");
            String inputEdad = scanner.nextLine();
            if (Validaciones.esNumero(inputEdad)) {
                edad = Integer.parseInt(inputEdad);
                if (edad >= 18) {
                    edadValida = true;
                } else {
                    System.out.println("La edad debe ser mayor a 18 años. Intente nuevamente.");
                }
            } else {
                System.out.println("La edad debe ser un número. Intente nuevamente.");
            }
        }

        String universidad = Validaciones.validarTextoNoVacio(scanner, "Universidad");

        int numeroCedula = 0;
        boolean cedulaValida = false;
        while (!cedulaValida) {
            System.out.print("Número de cédula (debe tener 10 dígitos): ");
            String inputCedula = scanner.nextLine();
            if (inputCedula.length() == 10 && Validaciones.esNumero(inputCedula)) {
                numeroCedula = Integer.parseInt(inputCedula);
                cedulaValida = true;
            } else {
                System.out.println("El número de cédula debe tener exactamente 10 dígitos numéricos. Intente nuevamente.");
            }
        }

        // Instanciar el objeto Estudiante
        Estudiante estudiante = new Estudiante(nombre, apellido, correo, contraseña, fechaRegistro, edad, universidad, numeroCedula);
        
        System.out.println("\nEstudiante creado:");
        System.out.println(estudiante.toString()); // Llamada al toString()
        scanner.close();
    }
}
