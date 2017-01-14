package com.company;

public class Main {

    public static void main(String[] args) {

//        int value = 3;
//        if(value == 1){
//            System.out.println("Value was 1");
//        }else if(value == 2){
//            System.out.println("Value was 2");
//        }else{
//            System.out.println("Was not 1 or 2");
//        }

        //Good for testing the same variable


        int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
            case 100:
                System.out.println("Was 3, 4, or 5");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;


        }


        //byte, short, char, int, String


        char variable = 'G';

        switch(variable){
            case 'A':
                System.out.println("You got A");
                break;
            case 'B':
                System.out.println("You got B");
                break;
            case 'C':
                System.out.println("You got C");
                break;
            case 'D':
                System.out.println("You got D");
                break;
            case 'E':
                System.out.println("You got E");
                break;
            case 'F':case 'G':
                System.out.println(variable + " was found");
                break;
            default:
                System.out.println("You did not get A, B, C, D, or E");
                break;

        }

        //JDK 7 now allows Strings

        String month = "feBrUary";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Happy New year!");
                break;
            case "february":
                System.out.println("Happy Valentine's Day!");
                break;
            default:
                System.out.println("oy vey");
                break;
        }//"January is different than january, so we use .toLowerCase method

    }
}
