package com.design.patterns.dp.Decorators;

public class PlainPizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("baking plain pizza");
    }
}
