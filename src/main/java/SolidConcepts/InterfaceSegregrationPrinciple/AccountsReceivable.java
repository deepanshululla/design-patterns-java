package SolidConcepts.InterfaceSegregrationPrinciple;

public class AccountsReceivable {
    private Accounting customerTransaction;

    public AccountsReceivable(CustomerTransaction customerTransaction) {
        this.customerTransaction = customerTransaction;
    }

    public void postPayment(){
        customerTransaction.chargeCustomer();
    }

    public void sendInvoice(){
        customerTransaction.prepareInvoice();
        // sends the invoice here
    }
}
