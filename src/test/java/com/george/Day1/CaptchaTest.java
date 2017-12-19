package com.george.Day1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaptchaTest {
    private Captcha captcha;

    @Before
    public void setUp() throws Exception {
        captcha = new Captcha();
    }

    @Test
    public void shouldSumConsecutiveValues() throws Exception {
        int expectedValue = 4;
        assertEquals(captcha.inverseCaptchaPartOne("111223"), expectedValue);
    }

    @Test
    public void shouldAddFirstElementIfSameAsLastValue() throws Exception {
        int expectedValue = 1;
        assertEquals(captcha.inverseCaptchaPartOne("121"), expectedValue);
    }

    @Test
    public void shouldAddElementToTotalIfHalfwayAroundList() throws Exception {
        assertEquals(captcha.inverseCaptchaPartTwo("1212"), 6);
        assertEquals(captcha.inverseCaptchaPartTwo("1221"), 0);
        assertEquals(captcha.inverseCaptchaPartTwo("123123"), 12);
    }
}
