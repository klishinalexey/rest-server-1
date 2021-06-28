package com.test;

import java.util.Random;

public class Utils {

    public static long random(int max) {
        Random rand = new Random(); //instance of random class
        int upperbound = max;       //generate random values from 0-max
        long random = rand.nextInt(upperbound);
        return random;
    }
}
