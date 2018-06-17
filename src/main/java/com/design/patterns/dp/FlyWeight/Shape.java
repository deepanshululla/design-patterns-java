package com.design.patterns.dp.FlyWeight;

/*
Basically instead of implementing shape as an interface we can
implement as an abstract class.
 */

//public interface Shape {
//    void draw();
//}


public abstract class Shape {
    public void draw(int radius,String lineColor, String fillColor){
        // this is for circle
        // this should be overridden by child class
    }

    public void draw(int length ,int breadth, String fillStyle){
        // this is for rectangle
        // this should be over ridden by rectangle child class
    }


}