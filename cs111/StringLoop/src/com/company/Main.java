package com.company;

public class Main {

    public static void main(String[] args) {

        String original = "How the fuck are you doing man";


        int length = original.length();
        int wordCount = 0;
        int NextWord;
        int minimumlength = 4;

        original = original.toLowerCase();


        for (int k = 0; k < length; k++) {


            if (original.charAt(k) == ' ') {

                String restOfString = original.substring(k + 1, original.length());

                NextWord = restOfString.indexOf(' ');

                String nextTest = restOfString.substring(0, NextWord+1);

                if (nextTest.length() >= minimumlength) {
                    wordCount++;

                    System.out.println(wordCount);
                }


            }


        }


    }
}
