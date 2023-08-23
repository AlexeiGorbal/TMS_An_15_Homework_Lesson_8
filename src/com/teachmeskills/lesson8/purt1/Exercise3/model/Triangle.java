package com.teachmeskills.lesson8.purt1.Exercise3.model;

public non-sealed class Triangle extends Figure {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle() {
    }

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public void areaFigure() {
        if (firstSide == secondSide && secondSide == thirdSide) {
            double area = (secondSide * secondSide * Math.sqrt(3)) / 4;
            System.out.println("Area of an equilateral triangle: " + area);
        } else if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {

            if (firstSide == thirdSide) {
                thirdSide = secondSide;
                secondSide = firstSide;
            } else if (secondSide == thirdSide) {
                thirdSide = firstSide;
                firstSide = secondSide;
            }

            //TODO
            double actionOne = 4 * (firstSide * firstSide);
            double actionTwo = thirdSide * thirdSide;
            double area = (thirdSide / 4) * Math.sqrt(actionOne - actionTwo);
            System.out.println("Area of an isosceles triangle: " + area);

        } else {
            boolean examination = true;

            while (examination) {
                if (firstSide + secondSide > thirdSide) {
                    double area = (firstSide * secondSide) / 2;
                    System.out.println("Area of a right triangle: " + area);
                    examination = false;
                } else {
                    secondSide = thirdSide;
                }
            }
        }
    }

    @Override
    public double perimeterFigure() {
        return firstSide + secondSide + thirdSide;
    }
}
