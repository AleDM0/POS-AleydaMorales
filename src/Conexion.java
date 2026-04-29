package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;
    public Connection getConnection() {
        try {
            String myBD= "jdbc:mariadb://localhost:3306/sistemaventas";
         con= DriverManager.getConnection(myBD,"root","aleydam0d");
         return con;
        } catch (SQLException e){
         System.out.println(e.toString());
        }
        return null;
    }

}
