package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidarReserva {

    // Método para validar el formato de la fecha
    public static boolean esFechaValida(String fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        formatoFecha.setLenient(false);
        try {
            formatoFecha.parse(fecha);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    // Método para validar la disponibilidad
    public static boolean esDisponibilidadValida(String disponibilidad) {
        return disponibilidad.equalsIgnoreCase("Si") || disponibilidad.equalsIgnoreCase("No");
    }
}
