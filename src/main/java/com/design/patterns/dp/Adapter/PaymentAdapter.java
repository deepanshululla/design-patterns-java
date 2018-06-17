package com.design.patterns.dp.Adapter;

public class PaymentAdapter {
    void pay(int rupees){
        int exchangeRate=65;
        int dollars=rupees/exchangeRate;
        PaymentProcessor paymentProcessor=new PaymentProcessorImpl();
        paymentProcessor.pay(dollars);
    }
}
