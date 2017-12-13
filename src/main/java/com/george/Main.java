package com.george;

import com.george.DayFive.Maze;
import com.george.DayFour.HighEntropyPassphrases;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Maze maze = new Maze();
        System.out.println(maze.howManySteps(maze.getInput()));
    }
}