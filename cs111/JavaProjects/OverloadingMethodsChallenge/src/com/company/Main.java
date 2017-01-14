package com.company;

public class Main {

    public static void main(String[] args) {

        double centimeters = calcFeetAndInchesToCentimeters(7, 11);
        System.out.println("You have " + centimeters + " centimeters");

        centimeters = calcFeetAndInchesToCentimeters(10);
        System.out.println("You have " + centimeters + " centimeters");

        calculateFeetAndInchesToCentimeters();


    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {

            double centimeters = ((feet * 12) + inches) * 2.54;
            return centimeters;

        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double centimeters = inches * 2.54;
            return centimeters;
        } else {
            return -1;
        }
    }

    public static void calculateFeetAndInchesToCentimeters(){
        System.out.println("No values provided");
    }
}
