package Dominio;

public class Estudiante extends Usuario {
    private int edad;
    private String universidad;
    private int numeroCedula;

    public Estudiante(int edad, String universidad, int numeroCedula) {
        this.edad = edad;
        this.universidad = universidad;
        this.numeroCedula = numeroCedula;
    }

    public Estudiante(String nombre, String apellido, String correo, String contraseña, String fechaRegistro, int edad, String universidad, int numeroCedula) {
        super(nombre, apellido, correo, contraseña, fechaRegistro);
        this.edad = edad;
        this.universidad = universidad;
        this.numeroCedula = numeroCedula;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }
}

