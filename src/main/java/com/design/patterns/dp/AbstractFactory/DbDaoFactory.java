package com.design.patterns.dp.AbstractFactory;

public class DbDaoFactory extends DaoAbstractFactory {
    @Override
    public Dao createDao(String type) {
       Dao dao=null;
       if(type.equals("empl")){
           dao=new DBEmplDao();
       } else {
           dao=new DBDeptDao();
       }
       return dao;
    }
}
