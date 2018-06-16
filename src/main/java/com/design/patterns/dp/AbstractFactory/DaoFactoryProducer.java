package com.design.patterns.dp.AbstractFactory;
/*
Fatcory of factories
 */
public class DaoFactoryProducer {
    public static DaoAbstractFactory produceFactory(String factoryType){
        DaoAbstractFactory daf=null;
        if(factoryType.equals("xml")){
            daf=new XMLDaoFactory();

        } else {
            daf=new DbDaoFactory();
        }
        return daf;
    }

}

