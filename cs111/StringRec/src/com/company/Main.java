package com.company;

public class Main {

    public static void main(String args[]) {


        int[] array = new int[10];


        array[0] = 2;
        array[1] = 2;
        array[2] = 2;
        array[3] = 2;
        array[4] = 2;
        array[5] = 2;

        insertionSort(array, 6, 1);


    }

    public void selectionSort(int[] array) {

        for (int lastPlace = array.length - 1; lastPlace > 0; lastPlace--) {

            int locationOfMax = 0;

            for (int j = 1; j <= lastPlace; j++) {

                if (array[j] > array[lastPlace]) {
                    locationOfMax = j;
                }

            }

            int temp = array[locationOfMax];
            array[locationOfMax] = array[lastPlace];
            array[lastPlace] = temp;
        }


    }


    public static int binarySearch(int[] array, int N) {

        int lowIndex = 0;
        int highIndex = array.length - 1;
        int runs = 0;


        while (highIndex >= lowIndex) {
            int middleIndex = (lowIndex + highIndex) / 2;

            if (array[middleIndex] == N) {
                return middleIndex;
            } else if (array[middleIndex] > N) {
                highIndex = middleIndex - 1;
                runs++;

            } else {
                lowIndex = middleIndex + 1;
                runs++;
            }
        }


        return -1;

    }

    static void insertionSort(int[] array, int itemsInArray, int newItem) {

        int location = itemsInArray - 1;


        while (location >= 0 && array[location] > newItem) {
            array[location + 1] = array[location];
            location--;
        }

        array[location + 1] = newItem;


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
