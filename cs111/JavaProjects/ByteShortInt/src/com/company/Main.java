package com.company;

public class Main {

    public static void main(String[] args) {
        int myMinValue = -2147483648;
        int myMaxValue = 2147483647;
        int myTotal = (myMinValue/2);

        // Enough space to store -2.147 -> 2.147 B
        // Our int value is a literal, not an expression like a*b
        // Width of 32

        byte myByteValue = -128;
        byte myNewByteValue = (byte)(myByteValue/2);
        System.out.println(myNewByteValue);

        // Width of 8
        // -128 to 127
        //More efficient... uses less space

        short myShortValue = -32768;
        short myNewShortValue = (short)(myShortValue/2);

        System.out.println("My total is = " + myShortValue);


        //Width of 16
        // -32768 to 32767

        long myLongValue = 100L;

        //Width of 64 (2x int)
        //HUGE numbers

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short)(1000 + 10 * (byteValue+shortValue+intValue));

        System.out.println(longTotal);
        System.out.println(shortTotal);




    }
}
