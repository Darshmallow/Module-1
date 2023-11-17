package com.alose.module1.module4;

/**
 * Represents a Triangle
 * Inherits the superclass TwoDShape
 */
class Triangle extends TwoDShape implements Rotate {

    private double side1;
    private double side2;
    private double side3;
    private double angle;

    /**
     * A constructor for TwoDShape Triangle
     * @param width > 0 is the base of the triangle
     * @param height > 0 is the height of the triangle relative to the base
     * @param color is a Colour enum that represents the color of the triangle; includes RED, GREEN, BLUE, and NONE
     */
    Triangle(double width, double height, Colour color){
        super(width, height, color);
    }

    /**
     * A constructor for TwoDShape Triangle
     * @param side1 > 0 is the first side length of the triangle
     * @param side2 > 0 is the second side length of the triangle
     * @param side3 > 0 is the third side length of the triangle
     * @param color is a Colour enum that represents the color of the triangle; includes RED, GREEN, BLUE, and NONE
     */
    Triangle(double side1, double side2, double side3, Colour color){
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        super.height = heronsHeight();
        super.width = side1;
    }

    /**
     * ToString method of a triangle
     * @return a string that includes information about the color, width, height and area of the triangle
     */
    @Override
    public String toString() {
        return super.color + " triangle with" +
                " width = " + super.width +
                ", height = " + super.height +
                ", area = " + getArea();
    }

    /**
     * Calculates the height of the triangle given the 3 side lengths by Heron's Formula
     * @return the height of the triangle
     */
    public double heronsHeight(){
        double s = (this.side1 + this.side2 + this.side3)/2;
        double area = Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
        double height = 2*(area/this.side1);
        Double testHeight = height;
        if (testHeight.equals(Double.NaN) || height == 0) {
            return 0.0;
        }
        return height;
    }

    /**
     * Calculates the area of the triangle through base and height
     * @return the double area
     */
    public double getArea() {
        return (Math.abs(super.height*super.width))/2;
    }

    /**
     * Rotates the triangle by a certain degree (angle = 0 by default)
     * @param degrees > 0 is the number of degrees to rotate
     */
    public void rotate(double degrees){
        angle = angle + degrees;
    }

    /**
     * Rotates the triangle by 90 degrees (angle = 0 by default)
     */
    public void rotate90(){
        rotate(90);
    }

    /**
     * Rotates the triangle by 180 degrees (angle = 0 by default)
     */
    public void rotate180(){
        rotate(180);
    }
}
