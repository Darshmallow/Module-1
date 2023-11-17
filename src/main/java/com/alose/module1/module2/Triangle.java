package com.alose.module1.module2;

class Triangle extends TwoDShape {
    double side1;
    double side2;
    double side3;

    Triangle(double width, double height){
        super(width, height);
    }

    Triangle(double side1, double side2, double side3){
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        super.height = heronsHeight();
        super.width = side1;
    }

    @Override
    public String toString() {
        return "Triangle with" +
                " width = " + super.width +
                ", height = " + super.height +
                ", area = " + getArea();
    }

    public double heronsHeight(){
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        double height = 2*(area/side1);
        return height;
    }

    public double getArea() {
        return (super.height*super.width)/2;
    }
}
