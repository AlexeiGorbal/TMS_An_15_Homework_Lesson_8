package purt1.Exercise3;

import purt1.Exercise3.model.*;

/**
 * Used the Sealed modifier for the "Shape" class.
 */

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.3, 5.5);
        Triangle triangle1 = new Triangle(4, 6, 12);
        Triangle triangle2 = new Triangle(5, 5, 3);
        Triangle triangle3 = new Triangle(5, 5, 5);
        Circle circle = new Circle(5);
        Cube cube=new Cube(5);

        Figure[] figures = new Figure[6];
        figures[0] = rectangle;
        figures[1] = triangle1;
        figures[2] = triangle3;
        figures[3] = triangle2;
        figures[4] = circle;
        figures[5] = cube;

        Figure test=new Triangle();
        test.array(figures);
    }
}
