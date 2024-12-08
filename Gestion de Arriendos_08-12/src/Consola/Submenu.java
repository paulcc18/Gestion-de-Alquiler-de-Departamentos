package Consola;

public abstract class Submenu {
    private String nombre;

    public Submenu(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public abstract void mostrarOpciones();
}