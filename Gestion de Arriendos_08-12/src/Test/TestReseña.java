package Test;

import Dominio.Reseña;

public class TestReseña {
    public static void main(String[] args) {
        // Inicializar datos
        Reseña.inicializar();
        Reseña.listarReseñas();

        // Agregar reseñas
        Reseña.agregarReseña("Pedro", "Todo excelente.", "2024-12-04");
        System.out.println("\nDespués de agregar:");
        Reseña.listarReseñas();

        // Editar una reseña
        Reseña.editarReseña(1, "Ana María", "Me encantó el lugar.", "2024-12-05");
        System.out.println("\nDespués de editar:");
        Reseña.listarReseñas();

        // Eliminar una reseña
        Reseña.eliminarReseña(2);
        System.out.println("\nDespués de eliminar:");
        Reseña.listarReseñas();
    }
}
