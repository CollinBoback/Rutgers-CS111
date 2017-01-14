package com.company;

public class Main {

    public static void main(String[] args) {
        // Calls upon it self until it gets to the base case (smaller) then goes back out to get the answer


        System.out.println(reverseString("Hello"));


    }

    public int factorial(int n) {
        //simplest base case = 1

        if (n == 1) { //BASE CASE
            return 1;
        } else {
            return n * (factorial(n - 1)); //RECURSIVE CALL
        }

        /*
        n = 3
        A) 3*fact(3-1)
        B) 2*fact(2-1)
        C) 1
        -------
        C) 1
        B) 2*1=2
        C) 3*2=6
        */


    }

    public static String reverseString(String s) {
        //BASE CASE: 1 LETTER OR 0 LETTERS

        if (s.length() == 1) {
            return s;
        } else {
            return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
        }

        /*
        s = "cat"

        A)t + rev(ca)
        B)a + rev(c)
        C)c

        ------------

        C) c
        B) a+c
        A) t+a+c
         */

    }
}

