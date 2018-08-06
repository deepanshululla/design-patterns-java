package SolidConcepts.InterfaceSegregrationPrinciple;

public class ReportGenerator {
    private Reporting transactionObject;

    public ReportGenerator(Reporting transactionObject) {
        this.transactionObject = transactionObject;
    }
    public void createReport(){
        transactionObject.getDate();
        transactionObject.getName();
        transactionObject.productBreakDown();

    }
}
