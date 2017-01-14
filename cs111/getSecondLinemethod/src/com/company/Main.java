package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getSecondLine("Hello\nhowareyou\ndildo fuck me \n"));


    }

    public static String getSecondLine(String input) {

        int firstNewLine = input.indexOf('\n');

        String restOfString = input.substring(firstNewLine+1, input.length());

        int secondNewLine = restOfString.indexOf('\n');

        String last = restOfString.substring(0,secondNewLine);


        return last;







    }
}
