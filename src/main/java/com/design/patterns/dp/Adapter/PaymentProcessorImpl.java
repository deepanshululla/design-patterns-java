package com.design.patterns.dp.Adapter;

public class PaymentProcessorImpl implements PaymentProcessor{
    @Override
    public void pay(int dollars) {
        System.out.println("Processed amount paid in dollars: "+dollars);
    }
}
