package com.company;

public class Main {

    public static void main(String[] args) {
        // Grade book with a 2D Array Data Structure.
        // calculate overall average for the entire class.
        // gb.length = number of rows (students)
        // gb[1].length = number of columns (assignments)
        // gb[0][0].length not legal b/c it is an int not an array

        double[][] gb = new double[][]{
                {80.0, 95.0},
                {100.0, 87.0}
//                {70.0, 85.0, 90.0, 100.0}

        };

        System.out.println(classAverage(gb));

    }

    public static double classAverage(double[][] gradebook) {

        double sum = 0;

        for (int j = 0; j < gradebook.length; j++) {

            for(int k = 0; k<gradebook[k].length; k++){

                sum += gradebook[0][k];

            }

        }
        return sum / (gradebook.length * gradebook[0].length);
    }
}
