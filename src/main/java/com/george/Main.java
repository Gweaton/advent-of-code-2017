package com.george;

import com.george.DayTwo.SpreadsheetChecksum;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        SpreadsheetChecksum checksum = new SpreadsheetChecksum();


        System.out.println(checksum.checkSumPartOne(checksum.getInput()));
        System.out.println(checksum.checkSumPartTwo(checksum.getInput()));
    }
}
