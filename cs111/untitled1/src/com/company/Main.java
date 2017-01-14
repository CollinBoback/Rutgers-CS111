package com.company;

public class Main {

    public static void main(String[] args) {

        //for loop to print out stars

//        int max = 10;
//
//        for (int i = 0; i < max; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//
//            System.out.println();
//
//
//        }
//
//        String testString = "no lemon, no melon";
//
//        testString = testString.replace(',', ' ');
//        testString = testString.replace(' ', '\0');
//
//        System.out.println(testString);


        System.out.println(decode("NFFU NF BU 23 JO UIF CFMM UPXFS"));

        System.out.println((double)5/2);


    }


    public static boolean isPalindrome(String a) {


        boolean isAPalindrone = false;

        for (int i = 0; i <= a.length() / 2; i++) {

            if (a.charAt(i) == a.charAt(a.length() - i - 1)) {
                isAPalindrone = true;
            } else {
                isAPalindrone = false;
                break;
            }
        }


        return isAPalindrone;
    }

    //Your program should take a string that has been encoded using a "secret"
    // code, and decode it. The code works as follows:

//    Each letter is decoded using the letter immediately preceding it in the
// alphabet. "b" becomes "a", "c" becomes "b", etc.
//    The letter "a" becomes "z".
//    Each digit is decoded using the preceding digit. "1" becomes "0", "2"
// becomes "1", etc.
//    The digit "0" becomes "9".
//    Characters that are neither letters nor digits are unchanged.
//    Regardless of whether the input string contains upper- or lowercase
// characters, the output (one string) should be in all lowercase.
//
//    Example:

    public static String decode(String a) {


        a = a.toLowerCase();
        String b = "";


        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) == 'a') {

                b += 'z';

            } else if (a.charAt(i) == '0') {
                b += (char)'9';
            } else if (a.charAt(i) == ' ') {
                b += (char)' ';
            } else {
                b += (char)(a.charAt(i) - 1);
            }


        }


        return b;


    }

//    Problem 3
//
//    Ask the user for a sentence. Output a sentence containing the same words, but in reverse order.
//    You may assume that the input sentence contains no punctuation
//    except for a period at the end. The output sentence should be properly capitalized and ended with a period.

    public static String reverseSentence(String a){

        String reversedSentence = "";
        String temp;


        for(int i = a.length()-1; i>0;--){

            if(a.charAt(i)==' '){


                temp = a.substring(i,a.length()-1);

                System.out.println(temp);



            }
        }




        return reversedSentence;
    }
}
