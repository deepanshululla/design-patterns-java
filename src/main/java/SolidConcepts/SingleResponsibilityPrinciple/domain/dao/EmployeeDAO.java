package SolidConcepts.SingleResponsibilityPrinciple.domain.dao;

import SolidConcepts.SingleResponsibilityPrinciple.database.DatabaseConnectionManager;
import SolidConcepts.SingleResponsibilityPrinciple.domain.Employee;

public class EmployeeDAO {
    DatabaseConnectionManager connectionManager;


    public void saveEmployee(Employee employee){
        /**
         DatabaseConnectionManager databaseConnection = DatabaseConnectionManager
         .getManagerInstance();
         databaseConnection.connect();

         DatabaseConnectionManager.getManagerInstance().getConnectionObject()
         .prepareStatement("some sql... ");
         databaseConnection.disconnect();
         */
    }
    public void removeEmployee(Employee employee){

    }
}
