package Test;

import Dominio.*;

public class TestEstudiante {
    public static void testCrearEstudiante() {
        Estudiante estudiante = new Estudiante(20, "Universidad Central", 12345);
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Universidad: " + estudiante.getUniversidad());
        System.out.println("Cedula: " + estudiante.getNumeroCedula());
    }

    public static void main(String[] args) {
        testCrearEstudiante();
    }
}


