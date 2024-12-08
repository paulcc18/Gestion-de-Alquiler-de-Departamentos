package Consola;

public class Menu {
    private String gestionarUsuario;
    private String gestionarAlojamiento;
    private String gestionarReservas;
    private String gestionarResenia;

    public Menu() {
        this.gestionarUsuario = "1. Gestionar Usuario";
        this.gestionarAlojamiento = "2. Gestionar Alojamiento";
        this.gestionarReservas = "3. Gestionar Reservas";
        this.gestionarResenia = "4. Gestionar Reseña";
    }

    public String getGestionarUsuario() {
        return gestionarUsuario;
    }
    public String getGestionarAlojamiento() {
        return gestionarAlojamiento;
    }
    public String getGestionarReservas() {
        return gestionarReservas;
    }
    public String getGestionarResenia() {
        return gestionarResenia;
    }
}
