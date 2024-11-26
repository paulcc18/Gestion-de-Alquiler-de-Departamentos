package Util;

public class ValidarUsuario {
    public static boolean esContraseñaValida(String contraseña) {
        return contraseña.length() >= 8 &&
                contraseña.matches(".*[A-Z].*") &&
                contraseña.matches(".*[a-z].*") &&
                contraseña.matches(".*[0-9].*");
    }
}
