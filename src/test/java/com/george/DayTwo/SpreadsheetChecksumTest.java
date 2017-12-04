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
        assertEquals(4, checkSum.checkSum(sampleInput));
    }
}