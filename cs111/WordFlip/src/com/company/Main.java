package com.company;

public class Main {

    public static void main(String[] args) {


        String p = "CS111 is the best!";
        char[] arr = {'t', 'e', 's', 't', 'i', 't'};

        for (int i = 0; i < p.length(); i++) {

            char c = p.charAt(i);


            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == c) {
                    arr[j] = 'X';
                    break;

                }


            }
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }


    }


}












