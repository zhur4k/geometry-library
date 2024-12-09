package com.geometry;

public class GeometryUtils {

    public static Integer getCommonSquare(Shape shape1, Shape shape2) {
        return shape1.getSquare() + shape2.getSquare();
    }
    public static Integer getCommonPerimeter(Shape shape1, Shape shape2) {
        return shape1.getPerimeter() + shape2.getPerimeter();
    }
}
