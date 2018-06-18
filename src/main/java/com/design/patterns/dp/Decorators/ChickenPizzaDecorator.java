package com.design.patterns.dp.Decorators;

public class ChickenPizzaDecorator extends PizzaDecorator {
    public ChickenPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Adding chicken toppings");
    }
}
