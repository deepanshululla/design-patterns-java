package com.design.patterns.dp.singleton;


import java.io.Serializable;

public class DateUtilSerialization implements Serializable{

    private static final long serialVersionUID = 1L;
    private static volatile DateUtilSerialization instance1;

    private DateUtilSerialization() {
    }

    // to handle deserialization correctly we need to implement a method
    // called getResolve()
    protected Object readResolve(){
        return instance1;
    }
    public static DateUtilSerialization getInstance(){
        if(instance1==null){
            synchronized(DateUtilLazySynchronized.class) {
                if(instance1==null) {
                    instance1 = new DateUtilSerialization();
                    System.out.println("Created a new instance of the class");
                }
            }
        } else{
            System.out.println("instance already exists");
        }


        return instance1;
    }

}
