package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        final int LINES = 10;
        final int COLUMNS = 20;

        Random random = new Random();
        int[][] firstArray = new int[LINES][COLUMNS];
        int[][] secondArray = new int[LINES][COLUMNS];
        int[][] resultArray = new int[LINES][COLUMNS];

        for (int i = 0; i < LINES; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                firstArray[i][j] = random.nextInt(100);
                secondArray[i][j] = random.nextInt(100);
            }
            System.out.println(Arrays.toString(firstArray[i]));
        }

        System.out.print("\n");
        for (int i = 0; i < LINES; i++) {
            System.out.println(Arrays.toString(secondArray[i]));
        }

        System.out.print("\n");
        for (int i = 0; i < LINES; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                resultArray[i][j] = firstArray[i][j] * secondArray[i][j];
            }
            System.out.println(Arrays.toString(resultArray[i]));
        }
    }
}
