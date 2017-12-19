package com.george.Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SpreadsheetChecksum {
    public int checkSumPartOne(String[] input) {
        int[] finalValues = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            finalValues[i] = subtractMinFromMax(getMinAndMaxValue(stringToIntArray(input[i])));
        }

        return IntStream.of(finalValues).sum();
    }

    public int checkSumPartTwo(String[] input) {
        int[] finalValues = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            finalValues[i] = getResultOfDivisibleNumbersInArray(stringToIntArray(input[i]));
        }

        return IntStream.of(finalValues).sum();

    }

    private int getResultOfDivisibleNumbersInArray(int[] intArray) {
        int total = 0;

        for (int currentNumber : intArray) {
            for (int numberToCheckAgainst : intArray) {
                if (currentNumber != numberToCheckAgainst && currentNumber % numberToCheckAgainst == 0) { //if divisible
                    total = currentNumber / numberToCheckAgainst;
                }
            }
        }

        return total;
    }

    private int[] stringToIntArray(String integerString) {
        return Arrays.stream(integerString.split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    private int[] getMinAndMaxValue(int[] intArray) {
        int[] minAndMax = new int[2];
        minAndMax[0] = Arrays.stream(intArray).min().getAsInt();
        minAndMax[1] = Arrays.stream(intArray).max().getAsInt();

        return minAndMax;
    }

    private int subtractMinFromMax(int[] intArray) {
        return intArray[1] - intArray[0];
    }

    public String[] getInput() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src/resources/Day2Input.txt"));
        String str;

        List<String> list = new ArrayList<>();
        while((str = in.readLine()) != null){
            list.add(str);
        }

        return list.toArray(new String[0]);
    }
}
