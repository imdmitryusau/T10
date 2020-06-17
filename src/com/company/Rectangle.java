package com.company;

public class Rectangle implements Figure {
    double sideA, sideB;
    String str="Rectangle";

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public double getPerimeter() {
        return 2*(sideA+sideB);
    }

    @Override
    public double getArea() {
        return sideA*sideB;
    }

    @Override
    public String getType() {
        return str;
    }
}
