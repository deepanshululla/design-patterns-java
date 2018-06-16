package com.design.patterns.dp.singleton;


import java.io.Serializable;

public class DateUtilNotCloneable implements Serializable, Cloneable{
    // to make sure our object is not cloneable, we implement cloneable
    private static final long serialVersionUID = 1L;
    private static volatile DateUtilNotCloneable instance1;

    private DateUtilNotCloneable() {
    }

    // to handle deserialization correctly we need to implement a method
    // called getResolve()
    protected Object readResolve(){
        return instance1;
    }
    public static DateUtilNotCloneable getInstance(){
        if(instance1==null){
            synchronized(DateUtilLazySynchronized.class) {
                if(instance1==null) {
                    instance1 = new DateUtilNotCloneable();
                    System.out.println("Created a new instance of the class");
                }
            }
        } else{
            System.out.println("instance already exists");
        }


        return instance1;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
