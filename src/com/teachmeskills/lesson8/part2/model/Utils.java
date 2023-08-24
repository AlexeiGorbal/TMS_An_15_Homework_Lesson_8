package com.teachmeskills.lesson8.part2.model;

import java.util.Arrays;

public class Utils {
    public static void displayingTheMatrix(int[][] multiplicationResult) {
        for (int[] i : multiplicationResult) {
            System.out.print(Arrays.toString(i) + " ");
        }

        System.out.println();
    }

    public static int[][] matrixMultiplication(int[][] arrayOne, int[][] arrayTwo) {
        int[][] multiplicationResult = new int[arrayOne.length][arrayTwo[0].length];

        int matrixComponent = 0, sum = 0, l = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int k = 0; k < arrayOne.length; k++) {
                for (int j = 0; j < arrayOne.length; j++) {
                    matrixComponent += arrayOne[i][j] * arrayTwo[j][k];
                    sum += matrixComponent;
                    matrixComponent = 0;
                }
                multiplicationResult[i][k] = sum;
                sum = 0;
            }
        }

        return multiplicationResult;
    }
}

