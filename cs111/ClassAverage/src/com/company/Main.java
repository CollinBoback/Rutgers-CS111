package com.company;

public class Main {

    public static void main(String[] args) {


        int[][] grades = {
                {90, 80, 60, 80}, //90, 80, 100, 80
                {30, 50, 60, 85}, //100, 50, 60, 85
                {95, 80, 80, 0} //95, 80, 80, 100

                //average = 83.33
        };

        System.out.println(classAverage(replaceLowestGrade(grades)));



    }

    private static int lowestGrade(int[] gradebook) {

        int lowestGrade = gradebook[0];


        for (int i = 0; i < gradebook.length; i++) {

            if (gradebook[i] < lowestGrade) {
                lowestGrade = gradebook[i];
            }
        }


        return lowestGrade;
    }

    public static int[][] replaceLowestGrade(int[][] gradebook) {

        for (int i = 0; i < gradebook.length; i++) {

            for (int k = 0; k < gradebook[0].length; k++) {

                if (gradebook[i][k] == lowestGrade(gradebook[i])) {

                    gradebook[i][k] = 100;
                    break;
                }
            }
        }


        return gradebook;


    }

    private static double classAverage(int[][] gradebook) {

        double sum = 0;

        double n = gradebook.length * gradebook[0].length;


        for (int i = 0; i < gradebook.length; i++) {
            for (int k = 0; k < gradebook[0].length; k++) {

                sum += gradebook[i][k];
            }
        }


        return sum / n;


    }


}



