package com.company;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50;

        //Statement is entire line (myVarable =50 is expression)

        //More statement examples:

        myVariable++;
        System.out.println("This is a test");

        //Doesn't have to be one line:

        System.out.println("This is" +
                "another" +
                "still more");

        //Can be on the same line, but it can get confusing

        int anotherVariable = 50; myVariable--;System.out.println("This is another one");

        //WHITESPACE: space in between expression (ex: space b/w int and myVariable)
        //Can be 1 space or 20 spaces.
        //Ex: Space between variable and operator

        //Indentation: Makes code more readable; code blocks; Code -> reformat

            if(myVariable == 50){
                System.out.println("Oh my stars");
            }


    }
}
