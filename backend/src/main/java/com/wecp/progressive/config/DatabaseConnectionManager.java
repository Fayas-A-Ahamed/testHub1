package com.wecp.progressive.config;

<<<<<<< HEAD
public class DatabaseConnectionManager {

=======
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private static final String URL = "jdbc:mysql://localhost:3306/banksafe_wecp";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
>>>>>>> 2d91fb647876eb6e217f2aeb105bdfea96dc6e8f
}
