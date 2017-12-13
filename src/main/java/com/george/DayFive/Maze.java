package com.george.DayFive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Maze {
    public int howManyStepsPartOne(int[] jumpOffsets) {
        int arrayElementValue;
        int totalStepCount = 0;

        for (int i = 0; i < jumpOffsets.length;) {
            arrayElementValue = jumpOffsets[i];
            jumpOffsets[i] += 1;
            i += arrayElementValue;
            totalStepCount += 1;
        }

        return totalStepCount;
    }

    public int howManyStepsPartTwo(int[] jumpOffsets) {
        int arrayElementValue;
        int totalStepCount = 0;

        for (int i = 0; i < jumpOffsets.length;) {
            arrayElementValue = jumpOffsets[i];
            jumpOffsets[i] += (arrayElementValue >= 3) ?  -1 : 1;
            i += arrayElementValue;
            totalStepCount += 1;
        }

        return totalStepCount;
    }

    public int[] getInput() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src/resources/dayFiveInput.txt"));
        String str;

        List<String> list = new ArrayList<>();
        while((str = in.readLine()) != null){
            list.add(str);
        }

        return list.stream().mapToInt(Integer::parseInt).toArray();
    }
}
