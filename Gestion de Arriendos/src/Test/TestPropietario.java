package Test;

import Dominio.Propietario;

public class TestPropietario {
        public static void testCrearPropietario() {
            Propietario propietario = new Propietario(3, "Departamento1,Departamento2, Departamento3");
            System.out.println("Número de propiedades: " + propietario.getNumeroPropiedades());
            System.out.println("Propiedades: " + propietario.getPropiedades());
        }

        public static void main(String[] args) {
            testCrearPropietario();
        }
}
