package Consola;

import Dominio.Estudiante;
import Util.ValidarEstudiante;
import java.util.Scanner;

public class GUI_Estudiante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = 0;

        System.out.println("Ingrese los datos del estudiante:");

        boolean edadValida = false;
        while (!edadValida) {
            System.out.print("Edad: ");
            String inputEdad = scanner.nextLine();

            if (ValidarEstudiante.esNumero(inputEdad)) {
                edad = Integer.parseInt(inputEdad);
                edadValida = true;
            } else {
                System.out.println("La edad debe ser un número. Intente nuevamente.");
            }
        }

        System.out.print("Universidad: ");
        String universidad = scanner.nextLine();


        System.out.print("Número de cédula: ");
        String inputCedula = scanner.nextLine();
        int numeroCedula = Integer.parseInt(inputCedula);

        Estudiante estudiante = new Estudiante(edad, universidad, numeroCedula);

        System.out.println("\nEstudiante creado:");
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Universidad: " + estudiante.getUniversidad());
        System.out.println("Número de cédula: " + estudiante.getNumeroCedula());
    }
}
