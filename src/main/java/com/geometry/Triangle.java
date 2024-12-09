package com.geometry;

public class Triangle implements Shape {
    private final Integer side;

    public Triangle(Integer side) {
        this.side = side;
    }

    @Override
    public Integer getPerimeter() {
        return 3 * side;
    }

    @Override
    public Integer getSquare() {
        return (int) (Math.sqrt(3) /4 * side);
    }
}
