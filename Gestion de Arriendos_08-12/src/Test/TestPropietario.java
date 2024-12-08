package Test;

import Dominio.Propietario;
import Dominio.Propiedad;
import java.util.List;

public class TestPropietario {

    // Test para crear un propietario con varias propiedades
    public static void testCrearPropietario() {
        // Crear la primera propiedad
        Propiedad propiedadInicial = new Propiedad(1, "Departamento en el centro", "Calle 123", "1000", "Juan Pérez", true);

        // Crear un propietario usando el nuevo constructor con la primera propiedad
        Propietario propietario = new Propietario("Juan", "Pérez", "juan.perez@email.com", "password", "2024-11-26", propiedadInicial);

        // Crear propiedades adicionales
        Propiedad propiedad2 = new Propiedad(2, "Departamento cerca de la universidad", "Calle 456", "800", "Juan Pérez", false); // false = No disponible
        Propiedad propiedad3 = new Propiedad(3, "Departamento con vista al mar", "Calle 789", "1200", "Juan Pérez", true); // true = Disponible

        // Agregar las propiedades adicionales al propietario
        propietario.agregarPropiedad(propiedad2);
        propietario.agregarPropiedad(propiedad3);

        // Crear el propietario en la lista
        Propietario.crearPropietario(propietario);

        // Mostrar detalles del propietario y sus propiedades
        System.out.println("Número de propiedades: " + propietario.getNumeroPropiedades());
        System.out.println("Propiedades: \n" + propietario.getDetalles());
    }

    // Test para limitar la cantidad de propiedades de un propietario
    public static void testLimiteDePropiedades() {
        // Crear un propietario con límite de 2 propiedades
        Propietario propietario = new Propietario("Ana", "Gómez", "ana.gomez@email.com", "securepass", "2024-11-26", 2, 2);

        // Crear dos propiedades
        Propiedad propiedad1 = new Propiedad(1, "Casa en las afueras", "Calle Verde", "1500", "Ana Gómez", true);
        Propiedad propiedad2 = new Propiedad(2, "Apartamento en el centro", "Calle Azul", "2000", "Ana Gómez", false);

        // Intentar agregar más propiedades de las permitidas
        Propiedad propiedad3 = new Propiedad(3, "Estudio moderno", "Calle Amarilla", "1200", "Ana Gómez", true);

        // Agregar las propiedades
        propietario.agregarPropiedad(propiedad1);
        propietario.agregarPropiedad(propiedad2);
        propietario.agregarPropiedad(propiedad3); // Esto debería ser ignorado debido al límite

        // Crear el propietario en la lista
        Propietario.crearPropietario(propietario);

        // Mostrar detalles del propietario y verificar que el límite se respeta
        System.out.println("Número de propiedades: " + propietario.getNumeroPropiedades());
        System.out.println("Propiedades: \n" + propietario.getDetalles());
    }

    // Test para leer un propietario por su índice
    public static void testLeerPropietario() {
        Propietario propietario = Propietario.leerPropietario(0);
        if (propietario != null) {
            System.out.println("Propietario encontrado: " + propietario.getDetalles());
        }
    }

    // Test para actualizar un propietario
    public static void testActualizarPropietario() {
        // Crear nuevo propietario con los mismos detalles
        Propietario propietarioNuevo = new Propietario("Juan", "Pérez", "juan.perez@email.com", "newpassword", "2024-12-01", 3, 5);

        // Actualizar el propietario en el índice 0
        Propietario.actualizarPropietario(0, propietarioNuevo);

        // Mostrar el propietario actualizado
        System.out.println("Propietario actualizado: " + propietarioNuevo.getDetalles());
    }

    // Test para eliminar un propietario
    public static void testEliminarPropietario() {
        // Eliminar propietario en el índice 0
        Propietario.eliminarPropietario(0);

        // Intentar leer al propietario eliminado
        Propietario propietario = Propietario.leerPropietario(0);
        if (propietario == null) {
            System.out.println("Propietario eliminado correctamente.");
        }
    }

    // Test para listar todos los propietarios
    public static void testListarPropietarios() {
        Propietario.listarPropietarios();
    }

    public static void main(String[] args) {
        System.out.println("Test: Crear propietario con múltiples propiedades");
        testCrearPropietario();

        System.out.println("\nTest: Limitar la cantidad de propiedades");
        testLimiteDePropiedades();

        System.out.println("\nTest: Leer propietario por índice");
        testLeerPropietario();

        System.out.println("\nTest: Actualizar propietario");
        testActualizarPropietario();

        System.out.println("\nTest: Eliminar propietario");
        testEliminarPropietario();

        System.out.println("\nTest: Listar propietarios");
        testListarPropietarios();
    }
}
