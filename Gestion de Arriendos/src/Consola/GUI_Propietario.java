package Consola;

import Dominio.Propietario;
import Util.ValidarPropietario;
import java.util.Scanner;

public class GUI_Propietario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroPropiedades = 0;

        System.out.println("Ingrese los datos del propietario:");

        boolean propiedadesValidas = false;
        while (!propiedadesValidas) {
            System.out.print("Número de propiedades: ");
            String inputPropiedades = scanner.nextLine(); // Leer la entrada como cadena

            // Verificar si la entrada es un número
            if (ValidarPropietario.esNumero(inputPropiedades)) {
                numeroPropiedades = Integer.parseInt(inputPropiedades); // Convertimos la entrada a un número
                propiedadesValidas = true;
            } else {
                System.out.println("El número de propiedades debe ser un valor numérico. Intente nuevamente.");
            }
        }

        System.out.print("Propiedades: ");
        String propiedades = scanner.nextLine();
        
        Propietario propietario = new Propietario(numeroPropiedades, propiedades);

        System.out.println("\nPropietario creado:");
        System.out.println("Número de propiedades: " + propietario.getNumeroPropiedades());
        System.out.println("Propiedades: " + propietario.getPropiedades());
    }
}

