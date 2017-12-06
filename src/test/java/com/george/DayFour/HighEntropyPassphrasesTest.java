package com.george.DayFour;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HighEntropyPassphrasesTest {
    HighEntropyPassphrases passphrases;
    
    @Before
    public void setUp() throws Exception {
        passphrases = new HighEntropyPassphrases();
    }

    @Test
    public void shouldGetNumberOfValidPassphrasesWithoutDuplicates() throws Exception {
        String[] input = new String[] { "aa bb cc dd ee", "aa bb cc dd aa "};
        assertEquals(1L, passphrases.passphraseSolverPartOne(input));
    }

    @Test
    public void shouldGetNumberOfValidPassphrasesWithoutAnagrams() throws Exception {
        String[] input = new String[] { "abcde fghij", "abcde xyz ecdab" };
        assertEquals(1L, passphrases.passphraseSolverPartTwo(input));
    }
}