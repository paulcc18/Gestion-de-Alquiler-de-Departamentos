package Consola;

public class Submenu4 extends Submenu {
    public Submenu4() {
        super("4. Gestionar Reseñas");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Opciones del Submenu 'Gestionar Reseñas':");
        System.out.println("- 4.1 Crear Reseña");
        System.out.println("- 4.2 Modificar Reseña");
        System.out.println("- 4.3 Responder Reseña");
    }
}
