package com.design.patterns.dp.FlyWeight;

public class PaintApp {
    /*
     The below is the problem. We have to create seperate objects which all take lot of memory.

     */

    public void render(int numberOfShapes){
        Shape[] shapes=new Shape[numberOfShapes+1];

        for(int i=0;i<=numberOfShapes;i++){
            if(i%2==0){
                shapes[i]=ShapeFactory.getShape("circle");
                shapes[i].draw(i,"red","white");

            } else{
                shapes[i]=ShapeFactory.getShape("rectangle");
                shapes[i].draw(i,i*2,"dotted");

            }
        }
    }
}
