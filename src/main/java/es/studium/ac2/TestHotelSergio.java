package es.studium.ac2;

public class TestHotelSergio {
    public static void main(String[] args) {
        // Crear clientes y obtener sus respectivos IDs generados automáticamente
        int idCliente1 = ClientePersistenciaSergio.crearCliente("Juan", "Pérez", "juan@hotel.com", "12345678A", "clave1");
        int idCliente2 = ClientePersistenciaSergio.crearCliente("Maria", "Lopez", "maria@hotel.com", "87654321B", "clave2");
        int idCliente3 = ClientePersistenciaSergio.crearCliente("Sergio", "García", "sergio@hotel.com", "23456789C", "clave3");

        // Leer los campos de los clientes creados (nombre, apellidos, email)
        System.out.println("Cliente 1, Nombre: " + ClientePersistenciaSergio.leerCliente(idCliente1, "nombre"));
        System.out.println("Cliente 2, Apellidos: " + ClientePersistenciaSergio.leerCliente(idCliente2, "apellidos"));
        System.out.println("Cliente 3, Email: " + ClientePersistenciaSergio.leerCliente(idCliente3, "email"));

        // Actualizar el nombre del cliente 1
        boolean actualizado = ClientePersistenciaSergio.actualizarCliente(idCliente1, "nombre", "Juan Carlos");
        System.out.println("Cliente 1 actualizado: " + actualizado);

        // Eliminar el cliente 2
        boolean eliminado = ClientePersistenciaSergio.eliminarCliente(idCliente2);
        System.out.println("Cliente 2 eliminado: " + eliminado);
    }
}
