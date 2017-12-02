package com.george;

import java.util.Arrays;

public class Captcha {
    public int inverseCaptcha(String captcha) {
        int total = 0;
        int[] integerArray = splitString(captcha);
        int length = integerArray.length - 1;

        for (int i = 0; i < length; i++) {
            if (integerArray[i] == (integerArray[i + 1])) {
                total += integerArray[i + 1];
            }
        }
        if (integerArray[0] == integerArray[length]) {
            total += integerArray[0];
        }

        return total;
    }

    private int[] splitString(String captcha) {
        String[] stringArray = captcha.split("");
        return Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();
    }
}
