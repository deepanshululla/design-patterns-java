package com.design.patterns.dp.singleton;



public class DateUtilLazySynchronized {
    private static volatile DateUtilLazySynchronized instance1;
    private DateUtilLazySynchronized() {
    }
//    public synchronized static DateUtilLazySynchronized getInstance(){
//        // Lazy initialization
//        if(instance1==null){
//            instance1=new DateUtilLazySynchronized();
//            System.out.println("Craeted a new instance of the class");
//        } else{
//            System.out.println("instance already exists");
//        }
//
//        return instance1;
//    }

    // there is  better way of doing above
//    public static DateUtilLazySynchronized getInstance(){
//        // Lazy initialization
//        synchronized(DateUtilLazySynchronized.class) {
//            // this is a class level lock
//            if(instance1==null){
//                instance1=new DateUtilLazySynchronized();
//                System.out.println("Created a new instance of the class");
//            } else{
//                System.out.println("instance already exists");
//            }
//        }
//
//
//        return instance1;
//    }

    // Further improving it
    public static DateUtilLazySynchronized getInstance(){
        // Lazy initialization

        // basically only acquire lock when creating it for the first time
        if(instance1==null){
            synchronized(DateUtilLazySynchronized.class) {
                // this is a class level lock
                if(instance1==null) {
                    // double check
                    instance1 = new DateUtilLazySynchronized();
                    System.out.println("Created a new instance of the class");
                }
            }
        } else{
            System.out.println("instance already exists");
        }



        return instance1;
    }
}
