package com.george.DayFour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class HighEntropyPassphrases {
    public long passphraseSolverPartOne(String[] input) {
        return Arrays.stream(input).filter(this::validatePassphraseForDuplicateValues).count();
    }

    public long passphraseSolverPartTwo(String[] input) {
        return Arrays.stream(input).filter(this::validateForAnagrams).count();
    }

    public String[] getInput() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src/resources/dayFourInput.txt"));
        String str;

        List<String> list = new ArrayList<>();
        while((str = in.readLine()) != null){
            list.add(str);
        }

        return list.toArray(new String[0]);
    }

    private boolean validatePassphraseForDuplicateValues(String passphrase) {
        String[] passwords = passphrase.split(" ");
        Set<String> uniquePasswords = new HashSet<>(Arrays.asList(passwords));

        return uniquePasswords.size() == passwords.length;
    }

    private boolean validateForAnagrams(String input) {
        String[] splitInput = input.split(" ");
        List<String> sortedStrings = new ArrayList<>();

        createListOfSortedStrings(splitInput, sortedStrings);

        Set<String> uniquePasswords = new HashSet<>(sortedStrings);
        return uniquePasswords.size() == sortedStrings.size();
    }

    private void createListOfSortedStrings(String[] splitInput, List<String> sortedStrings) {
        for(String word : splitInput) {
            char[] characters = word.toCharArray();
            Arrays.sort(characters);
            String sortedWord = new String(characters);
            sortedStrings.add(sortedWord);
        }
    }
}
