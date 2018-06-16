package com.design.patterns.dp.AbstractFactory;

public class DBEmplDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving Employee to DB");
    }
}
