package com.design.patterns.dp.InversionOfControl;

import org.springframework.stereotype.Component;

@Component
public class CreditCardImpl implements CreditCard {
    @Override
    public void makePayment() {
        System.out.println("payment made");
    }
}
