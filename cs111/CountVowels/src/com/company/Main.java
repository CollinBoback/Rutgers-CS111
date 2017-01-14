package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(countVowels("000000jj=hjhgfdghyt56yuijhbvyuioooooooo"));

        String s = "Collin is a great pal";

        System.out.println(s.indexOf(" "));

    }

    public static int countVowels(String s) {

        String t = s.toLowerCase();
        int length = t.length();
        int numOfVowels = 0;

        for (int i = 0; i < length; i++) {

            char test = t.charAt(i);

            if (test == 'a' || test == 'e' || test == 'i' || test == 'o' || test == 'u') {

                numOfVowels++;

            }


        }

        return numOfVowels;





    }
}
