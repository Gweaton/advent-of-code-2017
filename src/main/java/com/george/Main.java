package com.george;

import com.george.DayFive.Maze;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Maze maze = new Maze();
        System.out.println(maze.howManyStepsPartOne(maze.getInput()));
        System.out.println(maze.howManyStepsPartTwo(maze.getInput()));
    }
}