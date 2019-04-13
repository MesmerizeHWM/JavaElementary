package org.intutils.demo;

import java.util.Random;

public class IntUtils {

    private IntUtils() {
    }

    static int plus(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int pow(int number, int pow) {
        if (pow < 0) {
            int result = 1;
            for (int i = 0; i < pow; i++) {
                result = 1 / (result * number);
            }
            return result;

        } else if (pow > 0) {
            int result = 1;
            for (int i = 0; i < pow; i++) {
                result = result * number;
            }
            return result;
        }
        return 1;
    }

    static int getRandomInt(int minBound, int maxBount){
        Random random = new Random();
        return random.nextInt(maxBount - minBound) + minBound;
    }
}
