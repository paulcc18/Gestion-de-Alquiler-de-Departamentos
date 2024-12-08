package Dominio;

public class Estudiante extends Usuario {
    private int edad;
    private String universidad;
    private int numeroCedula;



    // Constructor por defecto
    public Estudiante() {
        super();  // Llama al constructor de Usuario
        this.edad = 0;
        this.universidad = "";
        this.numeroCedula = 0;
    }

    // Constructor con parámetros básicos
    public Estudiante(int edad, String universidad, int numeroCedula) {
        super();
        this.edad = edad;
        this.universidad = universidad;
        this.numeroCedula = numeroCedula;
    }

    // Constructor completo
    public Estudiante(String nombre, String apellido, String correo, String contraseña, String fechaRegistro, int edad, String universidad, int numeroCedula) {
        super(nombre, apellido, correo, contraseña, fechaRegistro); // Llama al constructor de Usuario
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

    /**
     * METODOS CRUD
     */

   /* public static void crearEstudiante(String nombre, String apellido, String correo, String contraseña, String fechaRegistro, int edad, String universidad, int numeroCedula) {
        if (contador < estudiantes.length) {
            Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, correo, contraseña, fechaRegistro, edad, universidad, numeroCedula);
            estudiantes[contador] = nuevoEstudiante;  // Agrega al arreglo
            contador++;  // Incrementa el contador
        } else {
            System.out.println("No se pueden agregar más estudiantes");
        }
    }

    public static void editarEstudiante(int pos, String nombre, String apellido, String correo, String contraseña, String fechaRegistro, int edad, String universidad, int numeroCedula) {
        if (pos >= 0 && pos < contador) {
            Estudiante estudiante = estudiantes[pos];
            estudiante.setNombre(nombre);
            estudiante.setApellido(apellido);
            estudiante.setCorreo(correo);
            estudiante.setContraseña(contraseña);
            estudiante.setFechaRegistro(fechaRegistro);
            estudiante.setEdad(edad);
            estudiante.setUniversidad(universidad);
            estudiante.setNumeroCedula(numeroCedula);
        } else {
            System.out.println("Posición no válida");
        }
    }

    public static void eliminarEstudiante(int pos) {
        if (pos >= 0 && pos < contador) {
            for (int i = pos; i < contador - 1; i++) {
                estudiantes[i] = estudiantes[i + 1];
            }
            estudiantes[contador - 1] = null;  // Elimina el último estudiante
            contador--;
        } else {
            System.out.println("Posición no válida");
        }
    }

    public static void consultarEstudiantes() {
        if (contador > 0) {
            for (int i = 0; i < contador; i++) {
                System.out.println(estudiantes[i].toString());
            }
        } else {
            System.out.println("No hay estudiantes registrados");
        }
    }

    public static void consultarEstudiante(int pos) {
        if (pos >= 0 && pos < contador) {
            System.out.println(estudiantes[pos].toString());
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                ", fechaRegistro='" + getFechaRegistro() + '\'' +
                ", edad=" + edad +
                ", universidad='" + universidad + '\'' +
                ", numeroCedula=" + numeroCedula +
                '}';
    }

    public String getDetalles() {
        return "Estudiante: " + getNombre() + " " + getApellido() + "\n" +
                "Correo: " + getCorreo() + "\n" +
                "Fecha de Registro: " + getFechaRegistro() + "\n" +
                "Edad: " + edad + "\n" +
                "Universidad: " + universidad + "\n" +
                */
}