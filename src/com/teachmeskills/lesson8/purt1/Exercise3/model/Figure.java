package com.teachmeskills.lesson8.purt1.Exercise3.model;

public sealed abstract class Figure permits Circle, Cube, Rectangle, Triangle {
    private double sumOfPerimeters;

    public abstract void areaFigure();

    public abstract double perimeterFigure();

    public void array(Figure[] figures) {
        for (Figure figure : figures) {
            figure.areaFigure();
            sumOfPerimeters += figure.perimeterFigure();
        }
        System.out.println("----------------------");
        System.out.println("Sum of perimeter: " + sumOfPerimeters);
    }
}