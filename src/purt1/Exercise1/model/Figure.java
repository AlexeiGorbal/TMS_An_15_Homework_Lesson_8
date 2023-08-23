package purt1.Exercise1.model;

public abstract class Figure {
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


