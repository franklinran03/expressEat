package expresseatapp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConnection {

    private static Connection conn;

    static {
        // URL base para conexion bd
        String urlDatabase = "jdbc:postgresql://localhost:5432/ExpressEatDB";
        String userDB = "postgres";
        String passwordDB = "Holamundo03";

        
        //prueba de conexion
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(urlDatabase, userDB, passwordDB);
            System.out.println("¡Conexión exitosa a la base de datos!");
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    
    public static Connection getConnection() {
        return conn;
    }

    
    
    // Método para cerrar la conexión
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

