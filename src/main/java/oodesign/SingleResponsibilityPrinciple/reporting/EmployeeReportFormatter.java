package oodesign.SingleResponsibilityPrinciple.reporting;

import oodesign.SingleResponsibilityPrinciple.domain.Employee;
import oodesign.SingleResponsibilityPrinciple.reporting.ReportFormatter;

public class EmployeeReportFormatter extends ReportFormatter{

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormattedEmployee(){
        return getFormattedValue();
    }

}
