package com.george.Day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RecursiveCircus {
    private List<Program> programs;

    public RecursiveCircus(List<String> programs) {
        this.programs = initializePrograms(programs);
    }

    public String partOne() {
        return getBottomLevelProgram().name;
    }

    private Program[] getProgramsWithTowersOnTop() {
        return programs.stream().filter(program -> program.towersOnTop.length > 0)
                .toArray(Program[]::new);
    }

    private Program getBottomLevelProgram() {
        Program[] midLevelPrograms = getProgramsWithTowersOnTop();
        List<String> allBalancedTowerNames = new ArrayList<>();

        for (Program program : midLevelPrograms) {
            Collections.addAll(allBalancedTowerNames, program.towersOnTop);
        }

        return Arrays.stream(midLevelPrograms)
                .filter(program -> !allBalancedTowerNames.contains(program.name))
                .findFirst()
                .orElse(new Program("", 0, new String[]{}));
    }

    private List<Program> initializePrograms(List<String> input) {
        this.programs = new ArrayList<>();
        for (String programString : input) {
            String[] splitInput = programString.split("-> ");
            String[] nameAndWeight = splitInput[0].split(" ");
            String name = nameAndWeight[0];
            int weight = Integer.parseInt(nameAndWeight[1].replaceAll("[()]", ""));
            String[] towersOnTop = (splitInput.length == 2)
                    ? splitInput[1].split(", ") : new String[]{};
            programs.add(new Program(name, weight, towersOnTop));
        }
        return programs;
    }

    public static List<String> getInput() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src/resources/Day7Input.txt"));
        String str;

        List<String> list = new ArrayList<>();
        while ((str = in.readLine()) != null) {
            list.add(str);
        }

        return list;
    }
}
