package com.alose.module1.module4;

import static org.junit.Assert.*;

public class CircleTest {

    @org.junit.Test
    public void testGetArea() {
        double delta = 0.000000001;

        Circle postiveCircle = new Circle(10, Colour.BLUE);
        assertEquals(314.0, postiveCircle.getArea(), delta);

        Circle zeroCircle = new Circle(0, Colour.BLUE);
        assertEquals(0.0, zeroCircle.getArea(), delta);

        Circle negativeCircle = new Circle(-10, Colour.BLUE);
        assertEquals(314.0, negativeCircle.getArea(), delta);

        Circle maxDoubleCircle = new Circle(Double.MAX_VALUE, Colour.BLUE);
        assertEquals(Double.POSITIVE_INFINITY, maxDoubleCircle.getArea(), delta);

        Circle minDoubleCircle = new Circle(Double.MIN_VALUE, Colour.BLUE);
        assertEquals(0.0, minDoubleCircle.getArea(), delta);
    }
}