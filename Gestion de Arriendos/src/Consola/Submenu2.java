package Consola;

public class Submenu2 extends Submenu {
    public Submenu2() {
        super("H1.1 Gestionar Propiedad");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Opciones del Submenu 'Gestionar Propiedad':");
        System.out.println("- H1.1.1 Crear Propiedad");
        System.out.println("- H1.1.2 Eliminar Propiedad");
        System.out.println("- H1.1.3 Modificar Propiedad");
        System.out.println("- H1.1.5 Consultar Propiedad");
    }
}
