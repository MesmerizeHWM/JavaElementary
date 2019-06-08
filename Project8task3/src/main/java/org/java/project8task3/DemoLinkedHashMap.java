package org.java.project8task3;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *3)
 *
 * - создать linkedhashmap, занести в нее любые 10 пар ключ - значение (типа String)
 *
 * - выdести на консоль значение всех ключей и значений с помощью метода entrySet()
 *
 * - вывести на консоль значение всех ключей и значений с помощью метода keySet()
 */
public class DemoLinkedHashMap {

    public static void main(String[] args) {

        Map testMap = new LinkedHashMap();

        for (int i = 1; i < 11; i++) {
            testMap.put("Key " + i, "Value " + i);
        }

        System.out.println("Values " + Arrays.toString(testMap.entrySet().toArray()));

        testMap.keySet().forEach( Object-> System.out.println(Object + ", " + testMap.get(Object)));
    }
}
