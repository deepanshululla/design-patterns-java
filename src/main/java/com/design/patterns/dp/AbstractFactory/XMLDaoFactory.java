package com.design.patterns.dp.AbstractFactory;

public class XMLDaoFactory extends DaoAbstractFactory {
    @Override
    public Dao createDao(String type) {
       Dao dao=null;
       if(type.equals("empl")){
           dao=new XMLEmpDao();
       } else {
           dao=new XMLDeptDao();
       }
       return dao;
    }
}
