package com.george.Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Captcha {
    public int inverseCaptchaPartOne(String captcha) {
        int total = 0;
        int[] integerArray = stringToIntArray(captcha);
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

    public int inverseCaptchaPartTwo(String captcha) {
        int total = 0;
        int[] integerArray = stringToIntArray(captcha);
        int length = integerArray.length;
        int halfIndex = length / 2;

        for (int i = 0; i < length; i++) {
            if (i + halfIndex > length - 1) {
                if (integerArray[i] == integerArray[halfIndex + (i - length)]) {
                    total += integerArray[i];
                }
            } else if (integerArray[i] == integerArray[i + halfIndex]) {
                total += integerArray[i];
            }
        }
        return total;
    }

    private int[] stringToIntArray(String captcha) {
        String[] stringArray = captcha.split("");
        return Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();
    }

    public String getInput() throws FileNotFoundException {
        Scanner infile = new Scanner(new File("src/resources/Day1Input.txt"));
        return infile.nextLine();
    }
}
