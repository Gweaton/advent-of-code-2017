package com.george;

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
        assertEquals(captcha.inverseCaptcha("111223"), expectedValue);
    }

    @Test
    public void shouldAddFirstElementIfSameAsLastValue() throws Exception {
        int expectedValue = 1;
        assertEquals(captcha.inverseCaptcha("121"), expectedValue);
    }
}
