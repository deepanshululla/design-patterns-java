package com.design.patterns.dp.singleton;



public class DateUtilLazy {
    private static DateUtilLazy instance1;
    private DateUtilLazy() {
    }
    public static DateUtilLazy getInstance(){
        // Lazy initialization
        if(instance1==null){
            instance1=new DateUtilLazy();
            System.out.println("Created a new instance of the class");
        } else{
            System.out.println("instance already exists");
        }

        return instance1;
    }
}
