package com.george.Day7;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RecursiveCircusTest {
    RecursiveCircus circus;
    List<String> programs;

    @Before
    public void setUp() throws Exception {
        String input = "pbga (66)\n" +
                "xhth (57)\n" +
                "ebii (61)\n" +
                "havc (66)\n" +
                "ktlj (57)\n" +
                "fwft (72) -> ktlj, cntj, xhth\n" +
                "qoyq (66)\n" +
                "padx (45) -> pbga, havc, qoyq\n" +
                "tknk (41) -> ugml, padx, fwft\n" +
                "jptl (61)\n" +
                "ugml (68) -> gyxo, ebii, jptl\n" +
                "gyxo (61)\n" +
                "cntj (57)";
        String[] splitInput = input.split("\\n");
        programs = new ArrayList<>();
        for (String program : splitInput) {
            programs.add(program);
        }
        circus = new RecursiveCircus(programs);
    }

    @Test
    public void shouldGetNameOfBottomProgram() throws Exception {
        assertEquals("tknk", circus.partOne());
    }
}