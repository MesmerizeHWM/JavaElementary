package org.java.elementary;

import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {

        int oddCounter = 0;
        Random random = new Random();
        ArrayList<Integer> testingList = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            testingList.add(random.nextInt(200) + 1);
        }
        System.out.println("Initial list " + Arrays.toString(testingList.toArray()));

        Iterator iterator = testingList.listIterator();
        ArrayList<Integer> elementsToRemove = new ArrayList<Integer>();

        while (iterator.hasNext()) {
            Integer i = (Integer) iterator.next();
            if (i % 2 == 0) {
                elementsToRemove.add(i);
            } else {
                oddCounter++;
            }
        }
        testingList.removeAll(elementsToRemove);

        System.out.println("Number of odd numbers in the list is " + oddCounter);
        System.out.println("Final list " + Arrays.toString(testingList.toArray()));
    }
}
