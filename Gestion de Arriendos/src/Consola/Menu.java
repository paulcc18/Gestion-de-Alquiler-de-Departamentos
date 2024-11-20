package Consola;

public class Menu {
    private String gestionarUsuario;
    private String gestionarAlojamiento;
    private String gestionarReservas;
    private String gestionarResenia;

    public Menu() {
        this.gestionarUsuario = "H0.1 Gestionar Usuario";
        this.gestionarAlojamiento = "H0.2 Gestionar Alojamiento";
        this.gestionarReservas = "H0.3 Gestionar Reservas";
        this.gestionarResenia = "H0.4 Gestionar Reseña";
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
