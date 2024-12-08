package Consola;

public class Submenu2 extends Submenu {
    public Submenu2() {
        super("2. Gestionar Alojamiento");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Opciones del Submenu 'Gestionar Propiedad':");
        System.out.println("- 2.1 Crear Propiedad");
        System.out.println("- 2.2 Eliminar Propiedad");
        System.out.println("- 2.3 Modificar Propiedad");
        System.out.println("- 2.4 Consultar Propiedad");
    }
}
