package com.company;

public class Main {

    public static void main(String[] args) {
        // Take class average, drop lowest, state if they are passign 70%+


        int[][] gradebook = {

                {100, 90, 70, 85},
                {80, 100, 95, 80},
                {50, 85, 90, 100}

        };


        int totalGrades = 0;

        int numberOfStudents = gradebook.length;

        int lowestGrade = gradebook[0][0];


        for (int r = 0; r < gradebook[0].length; r++) {

            if (gradebook[0][r] < lowestGrade) {
                lowestGrade = gradebook[0][r];
            }


        }

        System.out.println(lowestGrade);

        for (int i = 0; i < gradebook[0].length; i++) {

            totalGrades += gradebook[0][i];


        }


        double average = (totalGrades-lowestGrade+100)/gradebook[0].length;

        System.out.println(average);



    }

}

