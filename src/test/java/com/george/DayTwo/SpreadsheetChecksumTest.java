package com.george.DayTwo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpreadsheetChecksumTest {
    private SpreadsheetChecksum checkSum;

    @Before
    public void setUp() throws Exception {
        checkSum = new SpreadsheetChecksum();
    }

    @Test
    public void shouldReturnSumOfDifferenceBetweenHighestAndLowestValueOfEachArray() throws Exception {
        String[] sampleInput = new String[]{"1 2 3", "4 5 6"};
        assertEquals(4, checkSum.checkSumPartOne(sampleInput));
    }

    @Test
    public void shouldReturnSumOfDivisibleElementsInEachArray() throws Exception {
        String[] sampleInput = new String[]{"5 9 2 8", "9 4 7 3", "3 8 6 5"};
        assertEquals(9, checkSum.checkSumPartTwo(sampleInput));
    }
}