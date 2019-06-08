package org.java.project8task4;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * 4)создать класс Test2 {
 *
 *    int intField;
 *
 *    String stringField;
 *
 * }
 *
 * - сделать чтобы этот класс implements Comparable
 *
 * - создать TreeMap
 *
 * - создать любое количество объектов класса тест2 и добавить их в три-мап
 *
 * - выdести на консоль значение всех ключей и значений с помощью метода entrySet()
 *
 * - вывести на консоль значение всех ключей и значений с помощью метода keySet()
 */

public class DemoTreeMap {

    public static void main(String[] args) {

        final int NUMBEROFENTRIES = 9;

        Map testMap = new TreeMap<>();

        for (int i = 0; i < NUMBEROFENTRIES; i++) {
            testMap.put(new Test2(i + 1, "String " + (i + 1)),
                    new Test2(i * 2 + 1, "String " + (i * 2 + 1)));
        }

        System.out.println("Values " + Arrays.toString(testMap.entrySet().toArray()));

        testMap.keySet().forEach( Object-> System.out.println(Object + ", " + testMap.get(Object)));
    }
}
