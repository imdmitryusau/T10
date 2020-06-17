package com.company;

public class Circle implements Figure{
    double r;
    String str="Circle";

    public Circle(double r) {
        this.r = r;
    }


    @Override
    public double getPerimeter() {
        return Math.PI * 2 * r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r,2);
    }

    @Override
    public String getType() {
        return str;
    }
}
