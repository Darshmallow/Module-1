package com.alose.module1.module4;

/**
 * Represents a Circle
 * Inherits the superclass TwoDShape
 */
class Circle extends TwoDShape {
    public final double PI = 3.14;
    private double radius;

    /**
     * @param radius
     * @param color
     */
    Circle(double radius, Colour color){
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.color +" circle with " +
                " radius = " + radius +
                ", area = " + getArea()
                ;
    }

    /**
     * Calculates and get the area of the circle
     * @return double area
     */
    public double getArea(){
        double area = Math.pow(radius, 2)*PI;
        return area;
    }
}
