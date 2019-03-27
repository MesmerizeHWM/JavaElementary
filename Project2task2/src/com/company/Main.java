package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int var = random.nextInt(10) + 1;

        int factorial1 = 1;
        int factorial2 = 1;
        int factorial3 = 1;
        for (int i = 1; i <= var; i++) {
            factorial1 *= i;
        }

        int j = 1;
        while (j <= var) {
            factorial2 *= j;
            j++;
        }

        int k = 1;
        do {
            factorial3 *= k;
            k++;
        } while (var >= k);

        System.out.println(var);
        System.out.println(factorial1);
        System.out.println(factorial2);
        System.out.println(factorial3);
    }
}
