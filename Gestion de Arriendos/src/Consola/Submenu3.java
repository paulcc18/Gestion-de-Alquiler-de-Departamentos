package Consola;

public class Submenu3 extends Submenu {
    public Submenu3() {
        super("H1.4 Gestionar Reservas");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Opciones del Submenu 'Gestionar Reservas':");
        System.out.println("- H1.4.1 Verificar Disponibilidad");
        System.out.println("- H1.4.2 Modificar Reserva");
        System.out.println("- H1.4.3 Crear Reserva");
        System.out.println("- H1.4.4 Eliminar Reserva");
    }
}
