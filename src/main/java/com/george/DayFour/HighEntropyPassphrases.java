package com.george.DayFour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class HighEntropyPassphrases {
    public long passphraseSolverPartOne(String[] input) {
        return Arrays.stream(input).filter(this::validatePassphrase).count();
    }

    private boolean validatePassphrase(String passphrase) {
        String[] passwords = passphrase.split(" ");
        Set<String> uniquePasswords = new HashSet<>(Arrays.asList(passwords));

        return uniquePasswords.size() == passwords.length;
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
}
