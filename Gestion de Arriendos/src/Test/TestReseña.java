package Test;

import Dominio.Reseña;

public class TestReseña {
    public static void testCrearReseña() {

        Reseña reseña = new Reseña("Carlos Joel", "Excelente experiencia en el departamento.", "2024-11-20");

        System.out.println("=== Datos de la Reseña ===");
        System.out.println("Nombre de Usuario: " + reseña.getNombreUsuario());
        System.out.println("Comentario: " + reseña.getComentario());
        System.out.println("Fecha: " + reseña.getFecha());
    }

    public static void main(String[] args) {
        testCrearReseña();
    }
}
