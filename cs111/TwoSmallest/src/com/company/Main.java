package com.company;

public class Main {

    public static void main(String[] args) {

        double smallest;
        double largest = 0;
        double numCheck;
        System.out.println("Enter a terminating value");
        double terminator = IO.readDouble();
        System.out.println("Enter your numbers: ");
        numCheck = IO.readDouble();
        if (numCheck == terminator) {
            IO.reportBadInput();
            numCheck = IO.readDouble();
        } else {

            smallest = numCheck;


            do {
                numCheck = IO.readDouble();

                if (numCheck > largest) {
                    largest = numCheck;
                }

                if (numCheck < smallest) {
                    smallest = numCheck;
                }
            } while (numCheck != terminator);
            IO.outputDoubleAnswer(largest);
            IO.outputDoubleAnswer(smallest);
        }
    }
}
