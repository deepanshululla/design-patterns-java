package com.design.patterns.dp.singleton;

public class DateUtilEager {
    // eager utilization way of doing it
    //useful when we are sure we will have one atleast one class who will call it
    private static DateUtilEager instance1=new DateUtilEager();
    private DateUtilEager() {
    }
    public static DateUtilEager getInstance(){
        // Eager initialization
        if(instance1==null){
            // this will never run
            System.out.println("Craeted a new instance of the class");
        } else{
            System.out.println("instance already exists");
        }

        return instance1;
    }
}
