package com.design.patterns.dp.FlyWeight;

import java.util.HashMap;

public class ShapeFactory {

    public static HashMap<String,Shape> shapesMap=new HashMap<>();

    public static Shape getShape(String type){
        Shape shape=null;
        if(shapesMap.get(type)!=null){
            shape=shapesMap.get(type);
        } else {
            if(type.equals("circle")){
                shape=new Circle();
            } else if (type.equals("rectangle")) {
                shape=new Rectangle();
            }
            shapesMap.put(type,shape);
        }
        return shape;
    }
}
