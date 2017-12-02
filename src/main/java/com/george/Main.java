package com.george;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner infile = new Scanner(new File("src/input.txt"));
        String input = infile.nextLine();

        Captcha captcha = new Captcha();
        System.out.println("Part One: " + captcha.inverseCaptchaPartOne(input));
        System.out.println("Part Two: " + captcha.inverseCaptchaPartTwo(input));
    }
}
