package com.design.patterns.dp.AbstractFactory;

public class TestAbstractFactory {


    public static void main(String[] args) {
        DaoAbstractFactory daoAbstractFactory=DaoFactoryProducer.produceFactory("xml");
        Dao dao=daoAbstractFactory.createDao("empl");
        dao.save();
    }

}
