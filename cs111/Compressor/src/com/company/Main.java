package com.company;

public class Main {

    public static void main(String[] args) {



    }


    public static String compress(String original) {

        StringBuilder compressed = new StringBuilder();
        char testLetter = 0;
        int count = 1;
        for (int i = 0; i < original.length(); i++) {
            if (testLetter == original.charAt(i)) {
                count = count + 1;
            } else {
                compressed = count != 1 ? compressed.append(count) : compressed;
                compressed.append(testLetter);
                testLetter = original.charAt(i);
                count = 1;
            }
        }

        compressed = count != 1 ? compressed.append(count) : compressed;
        compressed.append(testLetter);
        return compressed.toString().trim();

    }
}





