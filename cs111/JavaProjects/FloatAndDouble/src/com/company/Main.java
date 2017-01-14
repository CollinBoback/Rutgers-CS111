package com.company;

public class Main {

    public static void main(String[] args) {
	// Float = single precision, Double = double precision

        int myIntValue = 5/3; //1
        // width of int = 32 (4 bytes)
        float myFloatValue = 5f/3f; //1.666666
        // width of float = 32 (4 bytes)
        double myDoubleValue = 5d/3d; //1.66666666667
        // width of double = 64 (8 bytes)
        // Use as default bc Faster, built-in math fn, far more precise

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);


        double myPounds = 200d;
        double myKilos = myPounds * 0.45359237d;
        System.out.println(myKilos);

        double pi = 3.131_592_7d;



    }
}
