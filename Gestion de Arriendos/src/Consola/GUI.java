package Consola;

import Dominio.*;

import java.util.Scanner;

public class GUI {
    private Scanner scanner;

    public GUI() {
        scanner = new Scanner(System.in);
    }

    public Usuario ingresarUsuario() {
        System.out.println("=== Ingreso de Datos del Usuario ===");
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el correo: ");
        String correo = scanner.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String contraseña = scanner.nextLine();

        System.out.print("Ingrese la fecha de registro: ");
        String fechaRegistro = scanner.nextLine();

        return new Usuario(nombre, apellido, correo, contraseña, fechaRegistro);
    }

    public void mostrarUsuario(Usuario usuario) {
        System.out.println("\n=== Datos del Usuario ===");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Contraseña: " + usuario.getContraseña());
        System.out.println("Fecha de Registro: " + usuario.getFechaRegistro());
    }

    public Estudiante ingresarEstudiante() {
        System.out.println("=== Ingreso de Datos del Estudiante ===");
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Ingrese la universidad: ");
        String universidad = scanner.nextLine();

        System.out.print("Ingrese el número de cédula: ");
        int numeroCedula = scanner.nextInt();

        return new Estudiante(edad, universidad, numeroCedula);
    }

    public void mostrarEstudiante(Estudiante estudiante) {
        System.out.println("\n=== Datos del Estudiante ===");
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Universidad: " + estudiante.getUniversidad());
        System.out.println("Número de Cédula: " + estudiante.getNumeroCedula());
    }

    public Propietario ingresarPropietario() {
        System.out.println("=== Ingreso de Datos del Propietario ===");
        System.out.print("Ingrese el número de propiedades: ");
        int numeroPropiedades = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Ingrese la lista de propiedades: ");
        String propiedades = scanner.nextLine();

        return new Propietario(numeroPropiedades, propiedades);
    }

    public void mostrarPropietario(Propietario propietario) {
        System.out.println("\n=== Datos del Propietario ===");
        System.out.println("Número de Propiedades: " + propietario.getNumeroPropiedades());
        System.out.println("Propiedades: " + propietario.getPropiedades());
    }

    public Reserva ingresarReserva() {
        System.out.println("=== Ingreso de Datos de la Reserva ===");
        System.out.print("Ingrese la fecha de inicio: ");
        String fechaInicio = scanner.nextLine();

        System.out.print("Ingrese la fecha de fin: ");
        String fechaFin = scanner.nextLine();

        System.out.print("Ingrese la disponibilidad: ");
        String disponibilidad = scanner.nextLine();

        return new Reserva(fechaInicio, fechaFin, disponibilidad);
    }

    public void mostrarReserva(Reserva reserva) {
        System.out.println("\n=== Datos de la Reserva ===");
        System.out.println("Fecha de Inicio: " + reserva.getFechaInicio());
        System.out.println("Fecha de Fin: " + reserva.getFechaFin());
        System.out.println("Disponibilidad: " + reserva.getDisponibilidad());
    }

    public Propiedad ingresarPropiedad() {
        System.out.println("=== Ingreso de Datos de la Propiedad ===");
        System.out.print("Ingrese el ID de la propiedad: ");
        int idPropiedad = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Ingrese la descripción: ");
        String descripcion = scanner.nextLine();

        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingrese el precio: ");
        String precio = scanner.nextLine();

        System.out.print("Ingrese el propietario: ");
        String propietario = scanner.nextLine();

        System.out.print("Ingrese la disponibilidad: ");
        String disponibilidad = scanner.nextLine();

        return new Propiedad(idPropiedad, descripcion, direccion, precio, propietario, disponibilidad);
    }

    public void mostrarPropiedad(Propiedad propiedad) {
        System.out.println("\n=== Datos de la Propiedad ===");
        System.out.println("ID de la Propiedad: " + propiedad.getIdPropiedad());
        System.out.println("Descripción: " + propiedad.getDescripcion());
        System.out.println("Dirección: " + propiedad.getDireccion());
        System.out.println("Precio: " + propiedad.getPrecio());
        System.out.println("Propietario: " + propiedad.getPropietario());
        System.out.println("Disponibilidad: " + propiedad.getDisponibilidad());
    }

    public static void main(String[] args) {
        GUI gui = new GUI();

        Usuario usuario = gui.ingresarUsuario();
        gui.mostrarUsuario(usuario);

        Estudiante estudiante = gui.ingresarEstudiante();
        gui.mostrarEstudiante(estudiante);

        Propietario propietario = gui.ingresarPropietario();
        gui.mostrarPropietario(propietario);

        Reserva reserva = gui.ingresarReserva();
        gui.mostrarReserva(reserva);

        Propiedad propiedad = gui.ingresarPropiedad();
        gui.mostrarPropiedad(propiedad);
    }
}
