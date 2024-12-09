package com.geometry;


import com.geometry.Shape;

public class GeometryUtils {

    public static Integer getCommonSquare(Shape shape1, Shape shape2) {
        return shape1.getSquare() + shape2.getSquare();
    }
}
