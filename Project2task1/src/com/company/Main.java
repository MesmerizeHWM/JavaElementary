package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Random random = new Random();
	    int[] arr1 = new int[random.nextInt(100) + 1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(9900) + 100;
        }
        int max = arr1[0];
        int min = arr1[0];
        for (int element : arr1) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
