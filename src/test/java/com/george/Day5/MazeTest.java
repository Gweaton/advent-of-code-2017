package com.george.Day5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MazeTest {
    Maze maze;

    @Before
    public void setUp() throws Exception {
        maze = new Maze();
    }

    @Test
    public void shouldCountNumberOfEscapesNeededToEscapeTheMaze() throws Exception {
        int[] jumpOffsets = new int[] { 0, 3, 0, 1, -3 };
        assertEquals(5, maze.howManyStepsPartOne(jumpOffsets));
    }

    @Test
    public void shouldCountNumberOfEscapesNeededToEscapePart2OfTheMaze() throws Exception {
        int[] jumpOffsets = new int[] { 0, 3, 0, 1, -3 };
        assertEquals(10, maze.howManyStepsPartTwo(jumpOffsets));

    }
}