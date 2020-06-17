package com.company;

import Task2.Cat;
import Task3.Manager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Task1
        double radius = 3d;
        Figure circle = new Circle(radius);

        double baseSide = 10d;
        double side = 5d;
        double height = 8d;

        Figure parallelogram = new Parallelogram(baseSide, side, height);

        double sideA = 15d;
        double sideB = 10;
        Figure rectangle = new Rectangle(sideA, sideB);

        ArrayList<Figure> figures = new ArrayList<>(3);
        figures.add(circle);
        figures.add(parallelogram);
        figures.add(rectangle);


        for (Figure f : figures) {
            System.out.println(f.getType());
            System.out.println("Area: " + f.getArea() + " units.");
            System.out.println("Perimeter: " + f.getPerimeter() + " units.\n");
        }
        //Task2
        Cat mruczek = new Cat("Mruczek");
        mruczek.start();
        System.out.println(mruczek.getType());
        mruczek.stop();

        //Task3
        Manager manager = new Manager("Jan", "Kowalski", 1990, 2010, "PJATK", 2000d, 100d);
        System.out.println(manager);
    }

}
