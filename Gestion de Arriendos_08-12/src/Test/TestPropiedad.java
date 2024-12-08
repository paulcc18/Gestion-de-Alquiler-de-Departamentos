package Test;

import Dominio.Propiedad;

public class TestPropiedad {

    // Método original de prueba
    public static void testCrearPropiedad() {
        // Crear una instancia de Propiedad con datos de prueba
        Propiedad propiedad = new Propiedad(1, "Casa grande - 2 cuartos", "AV. America", "$120,000", "Carlos Joel", true); // true = Disponible

        // Llamar al método getDetalles() de la propiedad para imprimir todos los detalles
        System.out.println(propiedad.getDetalles());
    }

    // Nuevos métodos para probar los CRUD
    public static void testCrearPropiedadesCRUD() {
        // Crear varias propiedades usando el método estático
        Propiedad.crearPropiedad(1, "Casa grande - 2 cuartos", "AV. America", "$120,000", "Carlos Joel", true);
        Propiedad.crearPropiedad(2, "Departamento céntrico", "Calle Principal 123", "$85,000", "Maria Perez", false);
        Propiedad.crearPropiedad(3, "Chalet con jardín", "Av. Los Álamos", "$150,000", "Juan López", true);
        System.out.println("Propiedades creadas exitosamente.");
    }

    public static void testListarPropiedades() {
        // Consultar todas las propiedades
        System.out.println("Listado de propiedades:");
        Propiedad.listarPropiedades();
    }

    public static void testEditarPropiedad() {
        // Editar la propiedad en la posición 1 (segunda propiedad)
        System.out.println("Editando la propiedad en la posición 1...");
        Propiedad.editarPropiedad(1, 2, "Departamento remodelado", "Calle Secundaria 456", "$90,000", "Maria Perez Actualizada", true);
        System.out.println("Propiedad editada.");
    }

    public static void testEliminarPropiedad() {
        // Eliminar la propiedad en la posición 0 (primera propiedad)
        System.out.println("Eliminando la propiedad en la posición 0...");
        Propiedad.eliminarPropiedad(0);
        System.out.println("Propiedad eliminada.");
    }

    public static void main(String[] args) {
        // Probar método original
        System.out.println("Probando método original:");
        testCrearPropiedad();

        // Probar métodos CRUD
        System.out.println("\nProbando creación de propiedades:");
        testCrearPropiedadesCRUD();

        System.out.println("\nProbando listado de propiedades:");
        testListarPropiedades();

        System.out.println("\nProbando edición de propiedades:");
        testEditarPropiedad();
        testListarPropiedades();

        System.out.println("\nProbando eliminación de propiedades:");
        testEliminarPropiedad();
        testListarPropiedades();
    }
}

