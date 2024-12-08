package Dominio;

import java.util.ArrayList;
import java.util.List;

public class CentroInmobiliario {
    private  Usuario[] usuarios = new Usuario[0];
    private Reserva[] reservas; // Relación uno a muchos: Un usuario tiene muchas reservas
    private  Reseña[] listaReseñas = new Reseña[0];
    private  int numeroDeReseñas = 0;
    // Lista para almacenar las reservas
    private static List<Reserva> reservas = new ArrayList<>();

    public static void agregarUsuario(Usuario nuevoUsuario) {
        Usuario[] nuevaLista = new Usuario[usuarios.length + 1];
        System.arraycopy(usuarios, 0, nuevaLista, 0, usuarios.length);
        nuevaLista[usuarios.length] = nuevoUsuario;
        usuarios = nuevaLista;
    }

    public static String consultarUsuarios() {
        String texto = "";
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null) {
                texto += usuarios[i] + "\r\n";
            }
        }
        if (texto.isEmpty()) {
            return "No hay usuarios registrados.";
        }
        return texto;
    }


    public static boolean editarUsuario(int pos, Usuario usuarioNuevo) {
        if (pos >= 0 && pos < usuarios.length) {
            usuarios[pos] = usuarioNuevo;
            return true;
        }
        return false;
    }

    public static boolean eliminarUsuario(int pos) {
        if (pos >= 0 && pos < usuarios.length) {
            Usuario[] nuevaLista = new Usuario[usuarios.length - 1];
            System.arraycopy(usuarios, 0, nuevaLista, 0, pos);
            System.arraycopy(usuarios, pos + 1, nuevaLista, pos, usuarios.length - pos - 1);
            usuarios = nuevaLista;
            return true;
        }
        return false;
    }

    // Agregar una reseña (C)
    public static void agregarReseña(String nombreUsuario, String comentario, String fecha) {
        if (numeroDeReseñas >= listaReseñas.length) {
            Reseña[] nuevaLista = new Reseña[numeroDeReseñas + 1];
            System.arraycopy(listaReseñas, 0, nuevaLista, 0, listaReseñas.length);
            listaReseñas = nuevaLista;
        }
        listaReseñas[numeroDeReseñas] = new Reseña(nombreUsuario, comentario, fecha);
        numeroDeReseñas++;
    }

    // Editar una reseña existente (U)
    public static boolean editarReseña(int pos, String nuevoNombre, String nuevoComentario, String nuevaFecha) {
        if (pos >= 0 && pos < numeroDeReseñas) {
            listaReseñas[pos] = new Reseña(nuevoNombre, nuevoComentario, nuevaFecha);
            return true; // Actualización exitosa
        }
        return false; // Índice inválido
    }

    // Eliminar una reseña por posición
    public static boolean eliminarReseña(int pos) {
        if (pos >= 0 && pos < numeroDeReseñas) {
            Reseña[] nuevaLista = new Reseña[numeroDeReseñas - 1];
            if (pos > 0) {
                System.arraycopy(listaReseñas, 0, nuevaLista, 0, pos); // Copiar antes del índice
            }
            if (pos < numeroDeReseñas - 1) {
                System.arraycopy(listaReseñas, pos + 1, nuevaLista, pos, numeroDeReseñas - pos - 1); // Copiar después del índice
            }
            listaReseñas = nuevaLista;
            numeroDeReseñas--;
            return true; // Eliminación exitosa
        }
        return false; // Índice inválido
    }

    // Obtener una reseña específica
    public static Reseña obtenerReseña(int pos) {
        if (pos >= 0 && pos < numeroDeReseñas) {
            return listaReseñas[pos];
        }
        return null; // Índice inválido
    }

    // Inicializar la lista con datos de prueba
    public static void inicializar() {
        agregarReseña("Carlos", "Excelente experiencia.", "2024-12-01");
        agregarReseña("Ana", "Muy acogedor.", "2024-12-02");
        agregarReseña("Luis", "Podría mejorar el servicio.", "2024-12-03");
    }

    // Método para listar todas las reseñas
    public static void listarReseñas() {
        System.out.println("\nLista de reseñas:");
        for (int i = 0; i < numeroDeReseñas; i++) {
            System.out.println((i + 1) + ". " + listaReseñas[i].getDetalles());
        }
    }


    // Crear
    public static void crearReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva creada: " + reserva);
    }

    // Leer
    public static Reserva leerReserva(int index) {
        if (index >= 0 && index < reservas.size()) {
            return reservas.get(index);
        } else {
            System.out.println("Índice fuera de rango.");
            return null;
        }
    }

    // Actualizar
    public static void actualizarReserva(int index, Reserva nuevaReserva) {
        if (index >= 0 && index < reservas.size()) {
            reservas.set(index, nuevaReserva);
            System.out.println("Reserva actualizada: " + nuevaReserva);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    // Eliminar
    public static void eliminarReserva(int index) {
        if (index >= 0 && index < reservas.size()) {
            Reserva eliminada = reservas.remove(index);
            System.out.println("Reserva eliminada: " + eliminada);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    // Método para listar todas las reservas
    public static void listarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas disponibles.");
        } else {
            for (int i = 0; i < reservas.size(); i++) {
                System.out.println("Índice " + i + ": " + reservas.get(i));
            }
        }
    }

}
