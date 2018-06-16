package com.design.patterns.dp.singleton;

import java.io.*;

public class TestDateUtil {
    public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException{
        // the below generates an error, sicne constructor is private
        //DateUtilLazy dateUtil=new DateUtilLazy();

        // the correct way to do it is
        System.out.println("lazy initialize");
        DateUtilLazy dateUtilLazy1 = DateUtilLazy.getInstance();
        DateUtilLazy dateUtilLazy2 = DateUtilLazy.getInstance();
        System.out.println(dateUtilLazy1 == dateUtilLazy2);

        System.out.println("Eager initialize");
        DateUtilEager dateUtilEager1=DateUtilEager.getInstance();
        DateUtilEager dateUtilEager2=DateUtilEager.getInstance();
        System.out.println(dateUtilEager1==dateUtilEager2);

        System.out.println("helper class initialize");
        DateUtilwithHelperClass DateUtilwithHelperClass1=DateUtilwithHelperClass.getInstance();
        DateUtilwithHelperClass DateUtilwithHelperClass2=DateUtilwithHelperClass.getInstance();
        System.out.println(DateUtilwithHelperClass1==DateUtilwithHelperClass2);

        System.out.println("Eager initialize with static block");
        DateUtilEager2 dateUtilEager3=DateUtilEager2.getInstance();
        DateUtilEager2 dateUtilEager4=DateUtilEager2.getInstance();
        System.out.println(dateUtilEager3==dateUtilEager4);


        System.out.println("lazy initialize with synchronize");
        DateUtilLazySynchronized dateUtilLazySynchronized1 = DateUtilLazySynchronized.getInstance();
        DateUtilLazySynchronized dateUtilLazySynchronized2 = DateUtilLazySynchronized.getInstance();
        System.out.println(dateUtilLazySynchronized1 == dateUtilLazySynchronized2);



        // Serialization test
        System.out.println("testing with deserialization");
        DateUtilSerialization dateUtilSerialization1=DateUtilSerialization.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(new File("/Users/dlulla/Desktop/ser1.txt")));
        oos.writeObject(dateUtilSerialization1);
        DateUtilSerialization dateUtilSerialization2=null;
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("/Users/dlulla/Desktop/ser1.txt"));
        dateUtilSerialization2=(DateUtilSerialization) objectInputStream.readObject();
        oos.close();
        objectInputStream.close();

        System.out.println(dateUtilSerialization1 == dateUtilSerialization2);



    }
}
