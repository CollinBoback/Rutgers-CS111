package com.company;

public class Main {

    public static void main(String[] args) {



//        for(init; termination; increment)

        for(int i=8; i>=2; i--){
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));


        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (10000 * (interestRate / 100));
    }



}
