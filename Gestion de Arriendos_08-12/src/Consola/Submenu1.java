package Consola;

public class Submenu1 extends Submenu {
    public Submenu1() {
        super("1. Gestionar Usuario");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Opciones del Submenu 'Gestionar Usuario':");
        System.out.println("- 1.1 Crear Usuario");
        System.out.println("- 1.2 Modificar Usuario");
        System.out.println("- 1.3 Eliminar Usuario");
        System.out.println("- 1.4 Consultar Propiedad");
    }
}
