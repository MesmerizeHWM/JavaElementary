package org.java.project8task1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * 1)
 *
 * - создать hashmap, занести в нее любые 10 пар ключ - значение (типа String)
 *
 * - выdести на консоль значение всех ключей и значений с помощью метода entrySet()
 *
 * - вывести на консоль значение всех ключей и значений с помощью метода keySet()
 */

public class DemoMap {

    public static void main(String[] args) {

        Map testMap = new HashMap();

        for (int i = 0; i < 10; i++) {
            testMap.put("key " + (i + 1), "value " + (i + 1));
        }
        System.out.println("Values " + Arrays.toString(testMap.entrySet().toArray()));

        testMap.keySet().forEach( Object-> System.out.println(Object + ", " + testMap.get(Object)));
    }
}