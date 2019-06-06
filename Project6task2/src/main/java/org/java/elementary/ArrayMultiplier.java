package org.java.elementary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayMultiplier {

    public static void main(String[] args) {

        ArrayList<Integer> firstList = new ArrayList<Integer>();
        ArrayList<Integer> secondList = new ArrayList<Integer>();
        ArrayList<Integer> multipliedList = new ArrayList<Integer>();

        Random random = new Random();
        int firstListSize = random.nextInt(100) + 100;
        int secondListSize = random.nextInt(100) + 100;
        int multipliedListSize = Math.max(firstListSize, secondListSize);

        for (int i = 0; i < firstListSize; i++) {
            firstList.add(random.nextInt(200));
        }
        for (int i = 0; i < secondListSize; i++) {
            secondList.add(random.nextInt(200));
        }


        for (int i = 0; i < multipliedListSize; i++) {
            multipliedList.add(
                    (firstListSize > i ? firstList.get(i) : 1) *
                            (secondListSize > i ? secondList.get(i) : 1));
        }

        System.out.println("First List " + Arrays.toString(firstList.toArray()));
        System.out.println("Second List " + Arrays.toString(secondList.toArray()));
        System.out.println("Multiplied List " + Arrays.toString(multipliedList.toArray()));
    }
}
