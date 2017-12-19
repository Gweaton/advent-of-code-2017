package com.george.Day6;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MemoryReallocationTest {
    MemoryReallocation memoryReallocation;
    
    @Before
    public void setUp() throws Exception {
        memoryReallocation = new MemoryReallocation();
    }

    @Test
    public void shouldCountNumberOfStepsBeforeDuplicatedCombination() throws Exception {
        Integer[] banksArray = { 0, 2, 7, 0};
        ArrayList<Integer> banks = new ArrayList<>(Arrays.asList(banksArray));
        assertEquals(5, memoryReallocation.partOne(banks));
    }

    @Test
    public void shouldCountNumberOfCyclesSinceLastSeenCombination() throws Exception {
        Integer[] banksArray = { 0, 2, 7, 0};
        ArrayList<Integer> banks = new ArrayList<>(Arrays.asList(banksArray));
        assertEquals(4, memoryReallocation.partTwo(banks));
    }
}