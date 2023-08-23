package com.teachmeskills.lesson8.purt1.Exercise1.model;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void areaFigure() {
        double area = firstSide * secondSide;
        System.out.println("Area of rectangle: " + area);
    }

    @Override
    public double perimeterFigure() {
        return (firstSide + secondSide) * 2;
    }
}
