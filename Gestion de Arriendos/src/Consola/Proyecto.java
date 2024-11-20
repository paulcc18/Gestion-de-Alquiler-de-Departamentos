package Consola;

public class Proyecto {
    public static void main(String[] args) {
            Menu menu = new Menu();
            System.out.println("Opciones del Menú:");
            System.out.println(menu.getGestionarUsuario());
            System.out.println(menu.getGestionarAlojamiento());
            System.out.println(menu.getGestionarReservas());
            System.out.println(menu.getGestionarResenia());
    }
}

