package Util;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidarReseña {

    // Validar la fecha (formato YYYY-MM-DD)
    
    public static boolean validarFecha(String input) {
        String regex = "^\\d{4}-\\d{2}-\\d{2}$";  
        Pattern pattern = Pattern.compile(regex);  
        Matcher matcher = pattern.matcher(input);  
        return matcher.matches();  
    }
}
