package com.design.patterns.dp.FlyWeight;

public class Rectangle extends Shape{
//    private int length;
//    private int breadth;
//    private String fillStyle;
    private String label;

    public Rectangle() {
        System.out.println("drawing a rectangle");
        label="rectangle";
    }

    @Override
    public void draw(int length ,int breadth, String fillStyle) {



        System.out.println( "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", fillStyle='" + fillStyle + '\'' +
                ", label='" + label + '\'' +
                '}');
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


}
