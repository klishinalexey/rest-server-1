package com.test;

import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;


class UtilsTest {


    @Test
    void randomNotNull() {
        int max = 100;
        long rnd = Utils.random(max);
        AssertionErrors.assertNotNull("недолжне быть null", rnd);
    }

    @Test
    void randomMoreZero() {
        int max = 100;
        long rnd = Utils.random(max);
        AssertionErrors.assertTrue("меньше или равно 0", rnd>0);
    }
    @Test
    void randomLessMAX() {
        int max = 100;
        long rnd = Utils.random(max);
        AssertionErrors.assertTrue("больше max", rnd<max);
    }

}