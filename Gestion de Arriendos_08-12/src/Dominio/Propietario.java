package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Propietario extends Usuario {
    private int numeroPropiedades;
    private Propiedad[] propiedades;

    public Propietario(int numeroPropiedades, int maxPropiedades) {
        this.numeroPropiedades = numeroPropiedades;
        this.propiedades = new Propiedad[maxPropiedades];
    }

    // Constructor con parámetros adicionales
    public Propietario(String nombre, String apellido, String correo, String contraseña, String fechaRegistro, int numeroPropiedades, int maxPropiedades) {
        super(nombre, apellido, correo, contraseña, fechaRegistro);
        this.numeroPropiedades = numeroPropiedades;
        this.propiedades = new Propiedad[maxPropiedades];
    }

    // Constructor con referencia a una propiedad
    public Propietario(String nombre, String apellido, String correo, String contraseña, String fechaRegistro, Propiedad propiedad) {
        super(nombre, apellido, correo, contraseña, fechaRegistro);
        this.numeroPropiedades = 1;
        this.propiedades = new Propiedad[1];
        this.propiedades[0] = propiedad;
    }

    // Getters y setters
    public int getNumeroPropiedades() {
        return numeroPropiedades;
    }

    public void setNumeroPropiedades(int numeroPropiedades) {
        this.numeroPropiedades = numeroPropiedades;
    }

    public Propiedad[] getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(Propiedad[] propiedades) {
        this.propiedades = propiedades;
    }

    // Método para agregar una propiedad
    public void agregarPropiedad(Propiedad propiedad) {
        for (int i = 0; i < propiedades.length; i++) {
            if (propiedades[i] == null) {
                propiedades[i] = propiedad;
                numeroPropiedades++;
                break;
            }
        }
    }
/*
    // Métodos CRUD

    // Crear
    public static void crearPropietario(Propietario propietario) {
        propietarios.add(propietario);
        System.out.println("Propietario creado: " + propietario.getNombre() + " " + propietario.getApellido());
    }

    // Leer
    public static Propietario leerPropietario(int index) {
        if (index >= 0 && index < propietarios.size()) {
            return propietarios.get(index);
        } else {
            System.out.println("Índice fuera de rango.");
            return null;
        }
    }

    // Actualizar
    public static void actualizarPropietario(int index, Propietario nuevoPropietario) {
        if (index >= 0 && index < propietarios.size()) {
            propietarios.set(index, nuevoPropietario);
            System.out.println("Propietario actualizado: " + nuevoPropietario.getNombre() + " " + nuevoPropietario.getApellido());
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    // Eliminar
    public static void eliminarPropietario(int index) {
        if (index >= 0 && index < propietarios.size()) {
            Propietario eliminado = propietarios.remove(index);
            System.out.println("Propietario eliminado: " + eliminado.getNombre() + " " + eliminado.getApellido());
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    // Listar todos los propietarios
    public static void listarPropietarios() {
        if (propietarios.isEmpty()) {
            System.out.println("No hay propietarios registrados.");
        } else {
            for (int i = 0; i < propietarios.size(); i++) {
                System.out.println("Índice " + i + ": " + propietarios.get(i).getDetalles());
            }
        }
    }*/

    // Método getDetalles
    public String getDetalles() {
        StringBuilder detalles = new StringBuilder();
        detalles.append("Propietario: ").append(getNombre()).append(" ").append(getApellido()).append("\n")
                .append("Correo: ").append(getCorreo()).append("\n")
                .append("Fecha de Registro: ").append(getFechaRegistro()).append("\n")
                .append("Número de Propiedades: ").append(numeroPropiedades).append("\n")
                .append("Propiedades: \n");

        for (Propiedad propiedad : propiedades) {
            if (propiedad != null) {
                detalles.append(propiedad.toString()).append("\n");
            }
        }
        return detalles.toString();
    }
}
