package com.company;

public class Main {

    public static void main(String[] args) {


        int[][] arr = {
                {0, 1, 0, 1, 0},
                {1, 0, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 1TakT





                kdlasdlsd}
        };

        int sumOfOnes = 0;
        int sumofZeroes = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int k = 0; k < arr[0].length; k++) {

                if (arr[i][k] == 0) {
                    sumofZeroes++;
                } else if (arr[i][k]==1) {

                    sumOfOnes++;

                }

            }
        }

        System.out.println("Zeroes: "+sumofZeroes);
        System.out.println("Ones: "+sumOfOnes);


    }
}
