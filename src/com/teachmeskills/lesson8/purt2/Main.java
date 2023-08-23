package com.teachmeskills.lesson8.purt2;

import com.teachmeskills.lesson8.purt2.model.Utils;

import java.util.Arrays;

/**
 * Class output the multiplication of two matrices from the method (creatingATwoDimensionalArrayFromArrayOneAndArrayTwo).
 */

public class Main {
    public static void main(String[] args) {
        int[][] arrayOne = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arrayTwo = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int[] newArrayOne = Utils.creatingAOneDimensionalArrayFromArrayOne(arrayOne);
        System.out.println(Arrays.toString(newArrayOne));

        int[] newArrayTwo = Utils.creatingAOneDimensionalArrayFromArrayTwo(arrayTwo);
        System.out.println(Arrays.toString(newArrayTwo));

        int[][] array = Utils.creatingATwoDimensionalArrayFromArrayOneAndArrayTwo(newArrayOne, newArrayTwo);

        Utils.displayingTheMatrix(array);
    }
}