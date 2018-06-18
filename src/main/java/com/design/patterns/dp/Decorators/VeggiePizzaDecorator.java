package com.design.patterns.dp.Decorators;

public class VeggiePizzaDecorator extends PizzaDecorator{

    public VeggiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Adding veggie toppings");
    }
}
