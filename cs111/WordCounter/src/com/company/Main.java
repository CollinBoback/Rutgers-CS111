package com.company;

public class Main {

    public static void main(String[] args) {


    }


    public static int countWords(String original, int minLength) {


        String[] a = original.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        int wordCount = 0;


        for (int i = 0; i < a.length; i++) {


            System.out.println(a[i]);


            String wordToTest = a[i];

            if (wordToTest.length() >= minLength) {

                wordCount++;
            }


        }


        return wordCount;




    }
}
