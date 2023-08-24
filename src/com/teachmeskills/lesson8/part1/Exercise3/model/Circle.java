package com.teachmeskills.lesson8.part1.Exercise3.model;

public non-sealed class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void areaFigure() {
        double area = 3.14 * (radius * radius);
        System.out.println("Area of a circle: " + area);
    }

    @Override
    public double perimeterFigure() {
        return 2 * 3.14 * radius;

    }
}

