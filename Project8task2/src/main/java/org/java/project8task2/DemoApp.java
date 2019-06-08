package org.java.project8task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 2)
 *
 * - создать класс Test {
 *
 *    int intField;
 *
 *    String stringField;
 *
 * }
 *
 * - переопределить методы equals и hashCode
 *
 * - создать любое количество объектов класса тест
 *
 * - добавить их в HashMap в качестве ключей и значений
 *
 * - выdести на консоль значение всех ключей и значений с помощью метода entrySet()
 *
 * - вывести на консоль значение всех ключей и значений с помощью метода keySet()
 */

public class DemoApp {

    public static void main(String[] args) {

        final int NUMBEROFENTRIES = 10;

        Map testMap = new HashMap();

        for (int i = 0; i < NUMBEROFENTRIES; i++) {
            testMap.put(new Test(i + 1, "String " + (i + 1)),
                    new Test(i * 2 + 1, "String " + (i * 2 + 1)));
        }

        System.out.println("Values " + Arrays.toString(testMap.entrySet().toArray()));

        testMap.keySet().forEach( Object-> System.out.println(Object + ", " + testMap.get(Object)));
    }
}
