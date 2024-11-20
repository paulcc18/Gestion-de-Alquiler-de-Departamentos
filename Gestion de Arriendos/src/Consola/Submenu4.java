package Consola;

public class Submenu4 extends Submenu {
    public Submenu4() {
        super("H1.5 Gestionar Reseñas");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Opciones del Submenu 'Gestionar Reseñas':");
        System.out.println("- H1.5.1 Crear Reseña");
        System.out.println("- H1.5.2 Modificar Reseña");
        System.out.println("- H1.5.3 Responder Reseña");
    }
}
