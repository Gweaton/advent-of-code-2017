package com.george;

import com.george.DaySix.MemoryReallocation;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MemoryReallocation mem = new MemoryReallocation();
        System.out.println(mem.partTwo(mem.getInputList()));
    }

}