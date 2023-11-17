package com.alose.module1.module2;


class Circle extends TwoDShape {
    public final double PI = 3.14;
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle with " +
                " radius = " + radius +
                ", area = " + getArea();
    }

    public double getArea(){
        double area = Math.pow(radius, 2)*PI;
        return area;
    }
}
