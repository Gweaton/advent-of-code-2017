package com.george;

import com.george.DaySix.MemoryReallocation;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        MemoryReallocation mem = new MemoryReallocation();
        List<Integer> input = mem.getInputList();
        System.out.println(mem.partOne(input));
        System.out.println(mem.partTwo(input));
    }

}