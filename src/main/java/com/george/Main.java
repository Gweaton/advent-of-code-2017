package com.george;

import com.george.DayTwo.SpreadsheetChecksum;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        SpreadsheetChecksum checksum = new SpreadsheetChecksum();


        System.out.println(checksum.checkSum(checksum.getInput()));
    }
}
