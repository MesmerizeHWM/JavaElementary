package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int countOfNielRemainder = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input integer: ");

        int inputInt = scanner.nextInt();

        for (int i = 1; i <= inputInt; i++) {
            if (inputInt % i == 0) {
                System.out.println("Divider with niel remainder: " + i);
                countOfNielRemainder++;
            }
        }

        System.out.println("Count of dividers: " + countOfNielRemainder);
    }
}
