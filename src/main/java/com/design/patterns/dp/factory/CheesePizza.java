package com.design.patterns.dp.factory;

public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("preapreing cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking cheese pizza");

    }

    @Override
    public void cut() {
        System.out.println("cutting cheese pizza");
    }
}
