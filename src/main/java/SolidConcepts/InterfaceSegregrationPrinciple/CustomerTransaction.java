package SolidConcepts.InterfaceSegregrationPrinciple;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting , Reporting {

    private List<Product> productsList;
    private Customer customer;

    public CustomerTransaction(List<Product> productsList, Customer customer) {
        this.productsList = productsList;
        this.customer = customer;
    }

    // methods for reporting
    @Override
    public String getName(){
        return customer.getName();
    }
    @Override
    public Date getDate(){
        return new Date();
    }
    @Override
    public String productBreakDown(){
        return productsList.toArray().toString();
    }
    // a/c rcvd methods
    @Override
    public void chargeCustomer(){
        System.out.println("Charged Customer");
    }
    @Override
    public void prepareInvoice(){
        System.out.println("prepring invoice");
    }
}
