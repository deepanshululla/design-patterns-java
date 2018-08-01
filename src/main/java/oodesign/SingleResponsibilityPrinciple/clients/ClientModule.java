package oodesign.SingleResponsibilityPrinciple.clients;

import oodesign.SingleResponsibilityPrinciple.domain.Employee;
import oodesign.SingleResponsibilityPrinciple.domain.dao.EmployeeDAO;
import oodesign.SingleResponsibilityPrinciple.reporting.EmployeeReportFormatter;
import oodesign.SingleResponsibilityPrinciple.reporting.FormatType;

public class ClientModule {
    public static void main(String args[]) {

        Employee peggy = new Employee(1, "peggy","accounting", true);
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy, FormatType.CSV);
        printEmployeeReport(peggy, FormatType.XML);

    }

    public static void hireNewEmployee(Employee employee){
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee){
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.removeEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);

        System.out.println(formatter.getFormattedEmployee());

    }

}
