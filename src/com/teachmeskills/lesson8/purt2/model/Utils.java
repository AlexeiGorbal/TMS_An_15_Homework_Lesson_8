package com.teachmeskills.lesson8.purt2.model;

public class Utils {
    public static int[] creatingAOneDimensionalArrayFromArrayOne(int[][] arrayOne) {
        int[] newArrayOne = new int[12];

        int k = 0;
        for (int[] ints : arrayOne) {
            for (int anInt : ints) {
                newArrayOne[k++] = anInt;
            }
        }

        return newArrayOne;
    }

    public static int[] creatingAOneDimensionalArrayFromArrayTwo(int[][] arrayTwo) {
        int[] newArrayTwo = new int[12];

        int k = 0;
        for (int[] ints : arrayTwo) {
            for (int anInt : ints) {
                newArrayTwo[k++] = anInt;
            }
        }

        return newArrayTwo;
    }

    public static int[][] creatingATwoDimensionalArrayFromArrayOneAndArrayTwo(int[] one, int[] two) {
        int[][] dopArray = new int[2][12];

        for (int i = 0; i < dopArray.length; i++) {
            for (int j = 0; j < dopArray[i].length; j++) {
                if (i == 0) {
                    dopArray[i][j] = one[j];
                } else {
                    dopArray[i][j] = two[j];
                }
            }
        }

        return dopArray;
    }

    public static void displayingTheMatrix(int[][] arrays) {
        int matrixComponent = 0;
        int sum = 0;
        for (int i = 0; i < 12; i += 4) {
            for (int k = 0; k < 3; k++) {

                int b = 0;
                for (int j = 0; j < 12; j += 3) {
                    matrixComponent += arrays[0][i + b] * arrays[1][k + j];
                    sum += matrixComponent;
                    matrixComponent = 0;
                    b++;
                }

                System.out.print(sum + " ");
                sum = 0;
            }
        }
    }
}

