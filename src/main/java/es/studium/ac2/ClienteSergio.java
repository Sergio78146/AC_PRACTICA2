package es.studium.ac2;

// Clase ClienteSergio que representa un cliente del hotel
public class ClienteSergio {
    // Atributos privados de la clase ClienteSergio
    private int idCliente; // Identificador único para el cliente
    private String nombre; // Nombre del cliente
    private String apellidos; // Apellidos del cliente
    private String email; // Correo electrónico del cliente
    private String dni; // Documento de identidad del cliente
    private String clave; // Clave de acceso del cliente (probablemente para acceso al sistema)

    // Constructor de la clase ClienteSergio
    // Este constructor se usa para crear un objeto ClienteSergio con los valores proporcionados
    public ClienteSergio(String nombre, String apellidos, String email, String dni, String clave) {
        this.nombre = nombre;          // Asigna el nombre al atributo nombre
        this.apellidos = apellidos;    // Asigna los apellidos al atributo apellidos
        this.email = email;            // Asigna el email al atributo email
        this.dni = dni;                // Asigna el dni al atributo dni
        this.clave = clave;            // Asigna la clave al atributo clave
    }

    // Getters y Setters para acceder y modificar los atributos de la clase

    // Método getter para obtener el idCliente
    public int getIdCliente() {
        return idCliente; // Devuelve el id del cliente
    }

    // Método setter para establecer el idCliente
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente; // Asigna el valor de idCliente al atributo
    }

    // Método getter para obtener el nombre del cliente
    public String getNombre() {
        return nombre; // Devuelve el nombre del cliente
    }

    // Método setter para establecer el nombre del cliente
    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna el valor de nombre al atributo
    }

    // Método getter para obtener los apellidos del cliente
    public String getApellidos() {
        return apellidos; // Devuelve los apellidos del cliente
    }

    // Método setter para establecer los apellidos del cliente
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos; // Asigna el valor de apellidos al atributo
    }

    // Método getter para obtener el correo electrónico del cliente
    public String getEmail() {
        return email; // Devuelve el email del cliente
    }

    // Método setter para establecer el correo electrónico del cliente
    public void setEmail(String email) {
        this.email = email; // Asigna el valor de email al atributo
    }

    // Método getter para obtener el DNI del cliente
    public String getDni() {
        return dni; // Devuelve el DNI del cliente
    }

    // Método setter para establecer el DNI del cliente
    public void setDni(String dni) {
        this.dni = dni; // Asigna el valor de dni al atributo
    }

    // Método getter para obtener la clave del cliente
    public String getClave() {
        return clave; // Devuelve la clave del cliente
    }

    // Método setter para establecer la clave del cliente
    public void setClave(String clave) {
        this.clave = clave; // Asigna el valor de clave al atributo
    }
}
