package Util;

public class ValidarEstudiante {
    
    public static boolean esNumero(String input) {
        try {
            Integer.parseInt(input); 
            return true; 
        } catch (NumberFormatException e) {
            return false; 
        }
    }
}
