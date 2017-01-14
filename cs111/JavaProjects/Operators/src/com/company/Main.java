package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; //Operators = + and =
        System.out.println(result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        //Remainder operator = %

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);
        result++;

        System.out.println(result);

        //Other: ++, --, +=, -=, etc.

        result *= 4;

        System.out.println(result);

        //One = is an assignment; == is testing to see if equal

        boolean isAlien = true;

        if (isAlien == false) {
            System.out.println("It is not an alien");
        } else {
            System.out.println("This is an alien!");

        }

        int topScore = 80;
        if (topScore > 100) {
            System.out.println("You got the top score!");
        } else {
            System.out.println("TRY HARDER!");
        }

        //==, !=, >, <, <=, >=, &&, || CONDITIONAL OPERATORS
        int secondScore = 81;
        if ((topScore > secondScore) && (topScore < 100)) {
            System.out.println("Good Job!");
        }

        if ((topScore > 90) || (secondScore <= 90)) {
            System.out.println("One of these tests is true");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("T");
        }
        isCar = true;

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }


        double myNumber = 20d;
        double mySecondNumber = 80d;
        double result27 = (myNumber + mySecondNumber)*25;
        double remainderValue = result27 % 40;
        if(remainderValue <= 20){
            System.out.println("Total was over limit");
        }


    }

}
