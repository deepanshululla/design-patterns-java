package com.design.patterns.dp.singleton;

public class DateUtilEager2 {
    // eager utilization way of doing it
    //useful when we are sure we will have one atleast one class who will call it
    private static DateUtilEager2 instance1;

    static {
        // the static block runs whenever DateUtilEager2 is called
        // runs only when the class is called for the first time.
        instance1=new DateUtilEager2();
        System.out.println("Static block called");
    }
    private DateUtilEager2() {
    }
    public static DateUtilEager2 getInstance(){
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
