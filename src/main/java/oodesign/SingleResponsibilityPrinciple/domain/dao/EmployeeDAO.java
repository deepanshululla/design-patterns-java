package oodesign.SingleResponsibilityPrinciple.domain.dao;

import oodesign.SingleResponsibilityPrinciple.database.DatabaseConnectionManager;
import oodesign.SingleResponsibilityPrinciple.domain.Employee;

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
