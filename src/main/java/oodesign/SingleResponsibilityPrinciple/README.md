1)	Employee is a POJO(plain old java object)

2)	The EmployeeDAO(DAO stands for Data Access Object) is responsible for all operations for operations (saving and deleting eployees) on employees to  the db.
The DAO class has a dependency relationship with the employee class. Also The DAO class has a aggregration association relation with the DatabaseConnectionManager.
DAO object “has a” connection manager object. Both connection manager and DAO object have their own object lifetimes.

3) The EmployeeReportFormatter class has a aggregration dependency on the employee class.
EmployeeReportFormatter has an Employee object. 

The solid arrow represents inheritance. So Report formatter is the parent class where we implement all the formatting. The EmployeeReportFormatter simply inherits the ReportFormatter and all methods from it.

