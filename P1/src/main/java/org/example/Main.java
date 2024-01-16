package org.example;

//import code.Conexion;
import java.sql.*;
/**
 *
 * @author victo
 */
public class Main {
    public static void main(String[] args) {
        Connection connection = Conexion.getConnection();
        if (connection != null) {
            System.out.println("Conexión exitosa a la base de datos.");
        } else {
            System.out.println("Error al conectar a la base de datos.");
        }
    }
}
