package com.teachmeskills.lesson8.part2;

import com.teachmeskills.lesson8.part2.model.Utils;

/**
 * Class output the multiplication of two matrices from the method (creatingATwoDimensionalArrayFromArrayOneAndArrayTwo).
 */

public class Main {
    public static void main(String[] args) {
        int[][] arrayOne = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arrayTwo = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        Utils.displayingTheMatrix(arrayOne);
        Utils.displayingTheMatrix(arrayTwo);

        int[][] multiplicationResult = Utils.matrixMultiplication(arrayOne, arrayTwo);
        Utils.displayingTheMatrix(multiplicationResult);
    }
}