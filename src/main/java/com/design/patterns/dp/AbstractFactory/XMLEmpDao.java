package com.design.patterns.dp.AbstractFactory;

public class XMLEmpDao implements Dao {
    @Override
    public void save() {
        System.out.println("saving Employee to XML");
    }
}
