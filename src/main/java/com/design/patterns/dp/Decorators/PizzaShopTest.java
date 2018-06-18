package com.design.patterns.dp.Decorators;

public class PizzaShopTest {
    public static void main(String[] args) {
        Pizza pizza=new PlainPizza();
        pizza.bake();

        // wrapping chicken pizza decorator around Plain Pizza
        Pizza pizza1=new ChickenPizzaDecorator(new PlainPizza());
        pizza1.bake();
    }
}
