package com.design.patterns.dp.Adapter;

public class PaymentApp {
    void pay(int rupees){
        System.out.println("Paying amount paid in ruppes: "+rupees);
        PaymentAdapter paymentAdapter=new PaymentAdapter();
        paymentAdapter.pay(rupees);
    }

    public static void main(String[] args) {
        PaymentApp paymentApp=new PaymentApp();
        paymentApp.pay(650);
    }
}
