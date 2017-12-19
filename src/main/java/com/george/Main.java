package com.george;

import com.george.Day7.RecursiveCircus;

import java.io.IOException;

import static com.george.Day7.RecursiveCircus.getInput;

public class Main {
    public static void main(String[] args) throws IOException {
        RecursiveCircus circus = new RecursiveCircus(getInput());
        System.out.println(circus.partOne());
    }

}