package com.alose.module1.module4;

/**
 * Interface for shapes that can rotate
 */
interface Rotate {
    /**
     * Rotate the shape by 90 degrees
     */
    public void rotate90();
    /**
     * Rotate the shape by 180 degrees
     */
    public void rotate180();

    /**
     * Rotate the shape by angle degrees
     * @param angle is a double representing the number of degrees
     */
    public void rotate(double angle);

}
