package com.company;

public class Main {

    public static void main(String[] args) {

    // my code
        byte testByte = 10;
        short testShort = 20;
        int testInt = 50;
        long testLong = (long) (50000 + ((testByte + testShort + testInt) * 10));
        System.out.println(testLong);

    // professor's code
        long testLong1 = 50000L + 10L * (testByte + testShort + testInt);
        System.out.println(testLong1);
    }
}
