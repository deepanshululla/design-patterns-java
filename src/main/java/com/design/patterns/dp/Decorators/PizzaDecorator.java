package com.design.patterns.dp.Decorators;

public class PizzaDecorator implements Pizza{
    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void bake() {
        pizza.bake();
    }
}
