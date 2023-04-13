package conexion;

import java.sql.*;
//Patron Singleton (instancia única)

public class Conexion {
    // Para que no se puedan crear objetos
private Conexion(){
    
}
// Creamos una variable en la cual vamos a guardar el estado de la conexión a la base de datos.

    private static Connection conexion;

// Creamos una variable para crear una sola instancia
    private static Conexion instancia;

// Creamos las variables para poder conectarnos a la base de datos
    private static final String URL = "jdbc:mysql://localhost/bd_estacion_meteorologica";  // Guardamos la direccion de la base de datos
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // cargar el driver

            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD); // obtenemos la conexión a la base de datos
            System.out.println("Conexion exitosa");
            return conexion;

        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return conexion;
    }

    // Metodo para cerrar la conexión
    public void cerrarConexion() throws SQLException {
        try {
            conexion.close();
            System.out.println("Se desconecto de la base de datos");

        } catch (Exception e) {
            System.out.println("Error:" + e);
            conexion.close();

        } finally {
            conexion.close();

        }
    }
    // Patron Singleton
    
    public static Conexion getInstance(){
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
}
