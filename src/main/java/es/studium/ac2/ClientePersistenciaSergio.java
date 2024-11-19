package es.studium.ac2;

import java.sql.*;

public class ClientePersistenciaSergio {

    // Variables de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/hotelSergio"; // URL de la base de datos
    private static final String USER = "root"; // Usuario de la base de datos
    private static final String PASSWORD = "Studium2023;"; // Contraseña de la base de datos

    // Método para crear un nuevo cliente en la base de datos
    public static int crearCliente(String nombre, String apellidos, String email, String dni, String clave) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Consulta SQL explícita para insertar los datos del cliente
            String query = "INSERT INTO clienteSergio (nombre, apellidos, email, dni, clave) " +
                           "VALUES ('" + nombre + "', '" + apellidos + "', '" + email + "', '" + dni + "', '" + clave + "')";
            // Crear una declaración para ejecutar la consulta
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS); // Ejecuta la consulta

                // Obtener el ID generado automáticamente al insertar el cliente
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1); // Devuelve el id generado
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprimir el error si ocurre una excepción
        }
        return -1; // Si algo salió mal, devuelve -1
    }

    // Método para leer un campo específico de un cliente a partir de su id
    public static String leerCliente(int idCliente, String campo) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Consulta SQL explícita para seleccionar el campo solicitado
            String query = "SELECT " + campo + " FROM clienteSergio WHERE idCliente = " + idCliente;
            // Crear una declaración para ejecutar la consulta
            try (Statement stmt = conn.createStatement()) {
                ResultSet rs = stmt.executeQuery(query); // Ejecuta la consulta
                if (rs.next()) {
                    return rs.getString(campo); // Devuelve el valor del campo solicitado
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprimir el error si ocurre una excepción
        }
        return null; // Si no se encuentra el cliente o el campo, devuelve null
    }

    // Método para actualizar un campo específico de un cliente
    public static boolean actualizarCliente(int idCliente, String campo, String nuevoValor) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Consulta SQL explícita para actualizar el campo del cliente
            String query = "UPDATE clienteSergio SET " + campo + " = '" + nuevoValor + "' WHERE idCliente = " + idCliente;
            // Crear una declaración para ejecutar la consulta
            try (Statement stmt = conn.createStatement()) {
                int rowsUpdated = stmt.executeUpdate(query); // Ejecuta la actualización
                return rowsUpdated > 0; // Devuelve true si se actualizó alguna fila
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprimir el error si ocurre una excepción
        }
        return false; // Si no se actualizó ninguna fila, devuelve false
    }

    // Método para eliminar un cliente a partir de su id
    public static boolean eliminarCliente(int idCliente) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Consulta SQL explícita para eliminar el cliente
            String query = "DELETE FROM clienteSergio WHERE idCliente = " + idCliente;
            // Crear una declaración para ejecutar la consulta
            try (Statement stmt = conn.createStatement()) {
                int rowsDeleted = stmt.executeUpdate(query); // Ejecuta la eliminación
                return rowsDeleted > 0; // Devuelve true si se eliminó alguna fila
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprimir el error si ocurre una excepción
        }
        return false; // Si no se eliminó ninguna fila, devuelve false
    }
}
