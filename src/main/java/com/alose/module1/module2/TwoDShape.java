package com.alose.module1.module2;

public abstract class TwoDShape {
    double width;
    double height;
    public TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
    }

    public TwoDShape(){
    }

    abstract double getArea();


    public void setHeight(double height){
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }
}
