package com.design.patterns.dp.singleton;

public class DateUtilwithHelperClass {
    private static DateUtilwithHelperClass instance1;

    private DateUtilwithHelperClass() {
    }
    private static class SingletonHelper {
        // nested class is referenced after getInstance() is called
        private static final DateUtilwithHelperClass instance1=new DateUtilwithHelperClass();

    }
    public static DateUtilwithHelperClass getInstance(){
        return SingletonHelper.instance1;
    }

}
