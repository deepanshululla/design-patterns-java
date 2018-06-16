package com.design.patterns.dp.AbstractFactory;

public class XMLDeptDao implements Dao {
    @Override
    public void save() {
        System.out.println("saving Department to XML");
    }
}
