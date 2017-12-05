package com.george;

import com.george.DayFour.HighEntropyPassphrases;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        HighEntropyPassphrases passphrases = new HighEntropyPassphrases();
        System.out.println(passphrases.passphraseSolverPartOne(passphrases.getInput()));
    }
}
