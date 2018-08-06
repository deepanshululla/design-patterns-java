package SolidConcepts.SingleResponsibilityPrinciple.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
this class has a private
 * constructor. That means, clients cannot create instances
 * of this class. But notice it has a method called
 * getManagerInstance() which returns an instance of this class.
 */

public class DatabaseConnectionManager {
    private Connection connection;
    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

    private DatabaseConnectionManager() {

    }

    public DatabaseConnectionManager getManagerInstance(){
        return connectionInstance;
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection("Some/Database/URL");
        System.out.println("Established Database Connection...");
    }
    public Connection getConnObject(){
        return connection;
    }
    public void disconnect() throws SQLException{
        connection.close();
        System.out.println("Disconnected from Database...");
    }

}
