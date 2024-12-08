package Consola;

public class Submenu3 extends Submenu {
    public Submenu3() {
        super("3. Gestionar Reservas");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Opciones del Submenu 'Gestionar Reservas':");
        System.out.println("- 3.1 Verificar Disponibilidad");
        System.out.println("- 3.2 Modificar Reserva");
        System.out.println("- 3.3 Crear Reserva");
        System.out.println("- 3.4 Eliminar Reserva");
    }
}
