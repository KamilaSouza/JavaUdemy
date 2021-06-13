package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue= 1000;

        int myMinInt = Integer.MIN_VALUE;
        int myMaxInt = Integer.MAX_VALUE;
        System.out.println("Integer Minimun Value = " + myMinInt);
        System.out.println("Integer Maximum Value = " + myMaxInt);
        System.out.println("Busted Max value = " + (myMaxInt + 1));
        System.out.println("Busted Min value = " + (myMinInt - 1));
        //overflow and underflow

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + myMinByte);
        System.out.println("Byte maximum value = " + myMaxByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxshort = Short.MAX_VALUE;
        System.out.println("Short minimum value = " + myMinShort);
        System.out.println("Short maximum value = " + myMaxshort);

        long myLongValue = 100L;
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("Long minimum value = " + myMinLong);
        System.out.println("Long maximum value = " + myMaxLong);

        float myMinfloat = Float.MIN_VALUE;
        float myMaxfloat = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinfloat);
        System.out.println("Float maximum value = " + myMaxfloat);
        
        double myMindouble = Double.MIN_VALUE;
        double myMaxdouble = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMindouble);
        System.out.println("Double maximum value = " + myMaxdouble);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        // casting is necessary if you dont use f, but its not recommended, better use double
        double myDoubleValue = 5d / 3;
        // double is the java default for floating numbers

        System.out.println("Int value = " + myIntValue);
        System.out.println("Float value = " + myFloatValue);
        System.out.println("Double value = " + myDoubleValue);

        int myNewInt = (myMinInt /2);
        short myNewShort = (short) (myMinShort/2);
        // the java default is integer

    }
}
