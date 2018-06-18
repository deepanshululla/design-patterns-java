package com.design.patterns.dp.InversionOfControl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer{
//    private CreditCard creditCard=new CreditCardImpl();

    @Autowired
    CreditCard creditCard;

    // we injected the creditcard dependency using autowired annotation in spring
    // remember the Impl class of credict card must be annotated with component

    @Override
    public void pay() {
        creditCard.makePayment();
    }
}
