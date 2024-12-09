package com.geometry;

public class Cube implements ThreeDimensionalShape {
    private final Integer sideLength;

    public Cube(Integer sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public Integer getVolume() {
        return sideLength;
    }

    @Override
    public String getType() {
        return "Cube";
    }
}
