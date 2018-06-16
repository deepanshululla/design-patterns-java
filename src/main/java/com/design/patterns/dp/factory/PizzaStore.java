package com.design.patterns.dp.factory;

public class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza p=PizzaFactory.createPizza(type);
        p.prepare();
        p.bake();
        p.cut();
        return p;

    }
}
