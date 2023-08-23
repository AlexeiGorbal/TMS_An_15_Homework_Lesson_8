package com.teachmeskills.lesson8.purt1.Exercise3.model;

public final class Cube extends Figure {
    private double side;

    public Cube(double firstSide) {
        this.side = firstSide;
    }

    @Override
    public void areaFigure() {
        double area = 6 * (side * side);
        System.out.println("Cube area: " + area);
    }

    @Override
    public double perimeterFigure() {
        return 12 * side;
    }
}
