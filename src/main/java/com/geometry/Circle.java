package com.geometry;

public class Circle implements Shape {

    private final Integer radius;

    public Circle(Integer radius) {
        this.radius = radius;
    }

    @Override
    public Integer getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public Integer getSquare() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public String getType() {
        return "Circle";
    }
}
