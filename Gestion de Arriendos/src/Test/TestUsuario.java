package Test;

import Dominio.Usuario;
public class TestUsuario {
        public static void testCrearUsuario() {
            Usuario usuario = new Usuario("Carlos", "López", "carlos@gmail.com", "12345", "2024-11-20");

            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Apellido: " + usuario.getApellido());
            System.out.println("Correo: " + usuario.getCorreo());
            System.out.println("Contraseña: " + usuario.getContraseña());
            System.out.println("Fecha de registro: " + usuario.getFechaRegistro());
        }

        public static void main(String[] args) {
            testCrearUsuario();
        }
}
