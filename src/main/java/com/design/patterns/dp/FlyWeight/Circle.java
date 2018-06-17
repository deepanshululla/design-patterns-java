package com.design.patterns.dp.FlyWeight;

public class Circle extends Shape{
    private String label;

    public Circle() {
        System.out.println("drawing a circle with params ");
        label="circle";
    }

    @Override
    public void draw(int radius, String lineColor, String fillColor) {


        System.out.println("Circle{" +
                "label='" + label + '\'' +
                ", radius=" + radius +
                ", fillColor='" + fillColor + '\'' +
                ", lineColor='" + lineColor + '\'' +
                '}');
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


}
