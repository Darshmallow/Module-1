package com.alose.module1.module4;

/**
 * Creates a TwoDShape
 */
public abstract class TwoDShape {
    public double width;
    public double height;
    public Colour color;

    /**
     * Constructor of TwoDShape
     * @param width and height represents the dimensions of the shape; requires width, height > 0
     * @param color is a COLOUR enum that represents the color of the TwoDShape; includes RED, GREEN, BLUE, and NONE
     */
    public TwoDShape(double width, double height, Colour color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    /**
     * Default constructor of TwooDShape
     * @param color is a COLOUR enum that includes RED, GREEN, BLUE, and NONE
     */
    public TwoDShape(Colour color){
        this.color = color;
    }

    /**
     * Calculates the area of each shape according to the area formula
     * Abstract method as each shape has different area formula
     * @return the area of the shape
     */
    abstract double getArea();

    /**
     * Setter method for height
     * @param height > 0 is the height of the triangle
     */
    public void setHeight(double height){
        this.height = height;
    }

    /**
     * Getter method for width
     * @return width > 0 is the width of the TwoDShape
     */
    public double getWidth(){
        return this.width;
    }

    /**
     * Getter method for height
     * @return height > 0 is the height of the TwoDShape
     */
    public double getHeight(){
        return this.height;
    }
}
