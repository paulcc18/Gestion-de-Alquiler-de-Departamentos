package Consola;

public class Submenu1 extends Submenu {
    public Submenu1() {
        super("H1.2 Gestionar Usuario");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Opciones del Submenu 'Gestionar Usuario':");
        System.out.println("- H1.2.1 Crear Usuario");
        System.out.println("- H1.2.2 Modificar Usuario");
        System.out.println("- H1.2.3 Eliminar Usuario");
    }
}
