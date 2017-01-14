package com.company;

public class Main {

    public static void main(String[] args) {




     /*   int count = 1;

        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;



        }

        System.out.println("***********************");

        count = 0;
        while(true){
            if(count == 6){
                break;
            }
            System.out.println("Count value was " + count);
            count++;


        }

        count = 1;
        do{
            System.out.println("Count value was " + count);
            count++;

            if(count > 100){
                break;
            }
        }while(count != 6);


    }*/

//        int number = 5;
//        int finishNumber = 20;
//        while(number <= finishNumber){
//            if(!isEvenNumber(number)){
//                number++;
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            number++;
//        }

        int number = 5;
        int evenNumbersFound = 0;
        int finishNumber = 20;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;

            evenNumbersFound++;
            if(evenNumbersFound >=5){
                break;
            }
        }

        System.out.println("You have found " + evenNumbersFound + " even numbers!");

    }

    public static boolean isEvenNumber(int testNumber) {
        if ((testNumber % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
