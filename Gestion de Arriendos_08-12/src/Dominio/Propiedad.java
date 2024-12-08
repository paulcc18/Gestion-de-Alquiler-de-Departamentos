package Dominio;

public class Propiedad {
    private int idPropiedad;
    private String descripcion;
    private String direccion;
    private String precio;
    private String propietario;
    private boolean disponibilidad;

    private Reserva[] reservas;  // Relación uno a muchos: Una propiedad tiene muchas reservas
    private Reseña[] reseñas;    // Relación uno a muchos: Una propiedad tiene muchas reseñas

    private static Propiedad[] propiedades = new Propiedad[10]; // Capacidad máxima de 10 propiedades
    private static int contador = 0;

    // Constructor vacío (por defecto)
    public Propiedad() {
        this.idPropiedad = 0;
        this.descripcion = "";
        this.direccion = "";
        this.precio = "0.0";
        this.propietario = "";
        this.disponibilidad = false;
    }

    // Constructor con parámetros (existe en el código original)
    public Propiedad(int idPropiedad, String descripcion, String direccion, double precio, String propietario, boolean disponibilidad) {
        this.idPropiedad = idPropiedad;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.precio = String.valueOf(precio); // Asegurando que el precio sea un String
        this.propietario = propietario;
        this.disponibilidad = disponibilidad;
    }

    // Constructor con parámetros (otra versión, manteniendo el precio como String)
    public Propiedad(int idPropiedad, String descripcion, String direccion, String precio, String propietario, boolean disponibilidad) {
        this.idPropiedad = idPropiedad;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.precio = precio;
        this.propietario = propietario;
        this.disponibilidad = disponibilidad;
    }

    // Constructor basado en otro objeto Propiedad (copiando datos)
    public Propiedad(Propiedad otraPropiedad) {
        this.idPropiedad = otraPropiedad.idPropiedad;
        this.descripcion = otraPropiedad.descripcion;
        this.direccion = otraPropiedad.direccion;
        this.precio = otraPropiedad.precio;
        this.propietario = otraPropiedad.propietario;
        this.disponibilidad = otraPropiedad.disponibilidad;
    }

    // Getters y setters
    public int getIdPropiedad() { return idPropiedad; }
    public void setIdPropiedad(int idPropiedad) { this.idPropiedad = idPropiedad; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getPrecio() { return precio; }
    public void setPrecio(String precio) { this.precio = precio; }
    public String getPropietario() { return propietario; }
    public void setPropietario(String propietario) { this.propietario = propietario; }
    public boolean isDisponibilidad() { return disponibilidad; }
    public void setDisponibilidad(boolean disponibilidad) { this.disponibilidad = disponibilidad; }

    // Método getDetalles que refleja el estado booleano de disponibilidad
    public String getDetalles() {
        return "Propiedad ID: " + idPropiedad + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Dirección: " + direccion + "\n" +
                "Precio: " + precio + "\n" +
                "Propietario: " + propietario + "\n" +
                "Disponibilidad: " + (disponibilidad ? "Disponible" : "No disponible");
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "ID Propiedad=" + idPropiedad +
                ", Descripción='" + descripcion + '\'' +
                ", Dirección='" + direccion + '\'' +
                ", Precio='" + precio + '\'' +
                ", Propietario='" + propietario + '\'' +
                ", Disponibilidad=" + (disponibilidad ? "Disponible" : "No disponible") +
                '}';
    }

    /**
     * MÉTODOS CRUD
     */

    // Crear
    public static void crearPropiedad(int idPropiedad, String descripcion, String direccion, String precio, String propietario, boolean disponibilidad) {
        if (contador < propiedades.length) {
            Propiedad nuevaPropiedad = new Propiedad(idPropiedad, descripcion, direccion, precio, propietario, disponibilidad);
            propiedades[contador] = nuevaPropiedad;
            contador++;
        } else {
            System.out.println("No se pueden agregar más propiedades");
        }
    }

    // Leer
    public static void listarPropiedades() {
        if (contador == 0) {
            System.out.println("No hay propiedades registradas.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(propiedades[i].toString());
            }
        }
    }

    // Actualizar
    public static void editarPropiedad(int pos, int idPropiedad, String descripcion, String direccion, String precio, String propietario, boolean disponibilidad) {
        if (pos >= 0 && pos < contador) {
            Propiedad propiedad = propiedades[pos];
            propiedad.setIdPropiedad(idPropiedad);
            propiedad.setDescripcion(descripcion);
            propiedad.setDireccion(direccion);
            propiedad.setPrecio(precio);
            propiedad.setPropietario(propietario);
            propiedad.setDisponibilidad(disponibilidad);
        } else {
            System.out.println("Posición no válida");
        }
    }

    // Eliminar
    public static void eliminarPropiedad(int pos) {
        if (pos >= 0 && pos < contador) {
            for (int i = pos; i < contador - 1; i++) {
                propiedades[i] = propiedades[i + 1];
            }
            propiedades[contador - 1] = null;
            contador--;
        } else {
            System.out.println("Posición no válida");
        }
    }
}
