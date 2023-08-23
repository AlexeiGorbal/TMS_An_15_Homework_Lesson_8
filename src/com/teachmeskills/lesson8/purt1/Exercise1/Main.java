package com.teachmeskills.lesson8.purt1.Exercise1;

import com.teachmeskills.lesson8.purt1.Exercise1.model.Figure;
import com.teachmeskills.lesson8.purt1.Exercise1.model.Circle;
import com.teachmeskills.lesson8.purt1.Exercise1.model.Rectangle;
import com.teachmeskills.lesson8.purt1.Exercise1.model.Triangle;

/**
 * Написать иерархию классов «Фигуры».
 * Фигура -> Треугольник.
 * Фигура -> Прямоугольник.
 * Фигура -> Круг.
 * Сделать класс Фигура абстрактным, с одним абстрактным методом для подсчета площади фигуры и одним абстрактным методом
 * для подсчета периметра.
 * Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
 * периметра.
 * Создать массив из 5 фигур.
 * Поройтись циклом по массиву и для каждой фигуры из массива вывести площать на экран.
 * Вывести на экран сумму периметра всех фигур в массиве.
 */

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.3, 5.5);
        Triangle triangle1 = new Triangle(4, 6, 12);
        Triangle triangle2 = new Triangle(5, 5, 3);
        Triangle triangle3 = new Triangle(5, 5, 5);
        Circle circle = new Circle(5);

        Figure[] figures = new Figure[5];
        figures[0] = rectangle;
        figures[1] = triangle1;
        figures[2] = triangle3;
        figures[3] = triangle2;
        figures[4] = circle;

        Figure figure = new Triangle();
        figure.array(figures);
    }
}
