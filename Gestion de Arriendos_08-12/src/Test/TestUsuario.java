package Test;

import Dominio.Usuario;

public class TestUsuario {
    public static void main(String[] args) {
        System.out.println("Crear usuario:");
        testAgregarUsuario();

        System.out.println("\nLista de usuarios:");
        testConsultarUsuarios();

        System.out.println("\nEditar usuario:");
        testEditarUsuario();

        System.out.println("\nLista de usuarios después de editar:");
        testConsultarUsuarios();

        System.out.println("\nEliminar usuario:");
        testEliminarUsuario();

        System.out.println("\nLista de usuarios después de eliminar:");
        testConsultarUsuarios();
    }

    public static void testAgregarUsuario() {
        Usuario nuevoUsuario = new Usuario("Carlos", "Lopez", "carlos@correo.com", "1234", "2024-01-01");
        Usuario.agregarUsuario(nuevoUsuario);
        System.out.println("Usuario agregado: " + nuevoUsuario);
    }

    public static void testConsultarUsuarios() {
        System.out.println(Usuario.consultarUsuarios());
    }

    public static void testEditarUsuario() {
        // Intentar editar el primer usuario
        System.out.println("Editar primer usuario:");
        Usuario.editarUsuario(0, new Usuario("Juan", "Martinez", "juan@correo.com", "abcd", "2024-02-01"));
        Usuario.consultarUsuarios();
    }

    public static void testEliminarUsuario() {
        if (Usuario.consultarUsuarios().length() > 0) {
            boolean success = Usuario.eliminarUsuario(0);
            if (success) {
                System.out.println("Usuario eliminado.");
            } else {
                System.out.println("Error al eliminar el usuario.");
            }
        }
    }
}