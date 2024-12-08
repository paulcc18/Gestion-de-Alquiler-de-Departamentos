package Dominio;

public class TestEstudiante {
    private static Estudiante estudiante;

    public static void main(String[] args) {
        testConstructor();

        testCrearEstudiantes();

        System.out.println("Lista de estudiantes inicial:");
        testConsultarEstudiantes();

        System.out.println("\nEditar Estudiante:");
        testEditarEstudiante();

        System.out.println("\nDetalles del estudiante editado:");
        testConsultarEstudiante(0);

        System.out.println("\nEliminar Estudiantes:");
        testEliminarEstudiante();
    }

    public static void testConstructor() {
        estudiante = new Estudiante();
    }

    public static void testCrearEstudiantes() {
        Estudiante.crearEstudiante("Juan", "Perez", "juan.perez@mail.com", "contraseña123", "2024-12-01", 20, "Universidad Central", 1728027883);
        Estudiante.crearEstudiante("Maria", "Lopez", "maria.lopez@mail.com", "contraseña456", "2024-12-02", 22, "Universidad Central", 1615509893);
    }

    public static void testConsultarEstudiantes() {
        Estudiante.consultarEstudiantes();
    }

    public static void testEditarEstudiante() {
        Estudiante.editarEstudiante(0, "Juan", "Perez Editado", "juan.perez@nuevomail.com", "nuevacontraseña123", "2024-12-03", 21, "Universidad Politecnica", 1728027883);
    }

    public static void testConsultarEstudiante(int pos) {
        Estudiante.consultarEstudiante(pos);
    }

    public static void testEliminarEstudiante() {
        Estudiante.eliminarEstudiante(0);
        System.out.println("\nLista de estudiantes después de eliminar el primero:");
        Estudiante.consultarEstudiantes();
    }
}
