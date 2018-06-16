package com.design.patterns.dp.factory;

public class VeggiePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("preapreing veggie pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking veggie pizza");

    }

    @Override
    public void cut() {
        System.out.println("cutting veggie pizza");
    }
}
