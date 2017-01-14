//public static int countWords(String original, int minLength){}
//
//Your method should count the number of words in the sentence that meet or
//        exceed minLength (in letters). For example, if the minimum length given
//        is 4, your program should only count words that are at least 4 letters long.
//
//        Words will be separated by one or more spaces. Non-letter characters
//        (spaces, punctuation, digits, etc.) may be present, but should not count towards the length of words.
//
//        Hint: write a method that counts the number of letters (and ignores punctuation)
//        in a string that holds a single word without spaces. In your countWords method
//        , break the input string up into words and send each one to your method.

package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a string and a minimum length");

        System.out.println(countWords("Collin is a great man", 2));

    }

    private static int countWords(String original, int minLength) {

        int length = original.length();
        int wordCount = 0;

        String firstWord = original.substring(0, original.indexOf(' '));

        if (firstWord.length() >= minLength) {
            wordCount++;
        }

        for (int k = 0; k < length; k++)


            if (original.charAt(k) == ' ') {

                String restOfString = original.substring(k + 1, original.length());

                String nextWord = restOfString.substring(0, restOfString.indexOf(' '));

                System.out.println("Rest of string = " + restOfString);
                System.out.println("Next word = " + nextWord);

                if (nextWord.length() >= minLength) {
                    wordCount++;
                }


            }
        return 0;
    }
}
