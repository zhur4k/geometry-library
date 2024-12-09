package com.geometry;

public class Rectangle implements Shape{
    private final Integer a;
    private final Integer b;

    public Rectangle(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer getPerimeter() {
        return a * 2 + b * 2;
    }

    @Override
    public Integer getSquare() {
        return a * b;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}
