package Test;
import Dominio.Propiedad;
public class TestPropiedad {
    public static void testCrearPropiedad() {
        // Crear una instancia de Propiedad con datos de prueba
        Propiedad propiedad = new Propiedad(1, "Casa grande", "Calle Falsa 123", "$120,000", "Ana Pérez", "Disponible");

        // Imprimir los valores de la propiedad
        System.out.println("ID Propiedad: " + propiedad.getIdPropiedad());
        System.out.println("Descripción: " + propiedad.getDescripcion());
        System.out.println("Dirección: " + propiedad.getDireccion());
        System.out.println("Precio: " + propiedad.getPrecio());
        System.out.println("Propietario: " + propiedad.getPropietario());
        System.out.println("Disponibilidad: " + propiedad.getDisponibilidad());
    }

    public static void main(String[] args) {
        testCrearPropiedad();
    }
}