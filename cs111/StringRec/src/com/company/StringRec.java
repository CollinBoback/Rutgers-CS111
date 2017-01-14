package com.company;


/**
 * Created by collinboback on 12/16/16.
 */
public class StringRec {


    public static String recStringBuilder(char chars, int num) {
        if (num == 0 || num == 1) {
            return chars + "";
        } else {
            num--;
            return chars + recStringBuilder(chars, num);
        }
    }

    public static String decompress(String compressedText) {
        int length = compressedText.length();

        if (length <= 1) {
            return compressedText;
        } else {
            int i;
            int num;
            char chars = compressedText.charAt(0);
            if (Character.isLetter(compressedText.charAt(1))) {
                i = 1;
                num = 1;
            } else {
                i = 2;
                num = compressedText.charAt(1) - '0';
            }

            String decompressedString = recStringBuilder(chars, num);

            return decompressedString + decompress(compressedText.substring(i));
        }
    }


}
