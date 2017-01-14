package com.company;

public class Main {

    public static void main(String[] args) {


        IO.outputIntAnswer(countLuckyNines(IO.readInt(), IO.readInt()));


    }

    public static int countLuckyNines(int lowerEnd, int upperEnd) {


        int nine = 0;
        int e;
        int power;
        while (true)

        {
            lowerEnd = IO.readInt();
            upperEnd = IO.readInt();
            if (upperEnd == 0) {
                upperEnd++;
            }
            e = (int) (Math.log10(Math.abs(upperEnd))) + 1;
            if (lowerEnd > upperEnd) {
                return -1;
            } else
                break;
        }
        for (
                int i = lowerEnd;
                i <= upperEnd; i++)

        {

            for (int d = 1; d <= e; d++) {
                power = (int) Math.pow(10, d);
                if (Math.abs(i % power) == 7) {

                    nine++;
                }
            }

        }
        if (nine == 0)

        {
            nine = 0;
        } else if (nine != 1 && lowerEnd >= 0 && upperEnd >= 0)
            nine = nine - 1;
        else if (lowerEnd < 0 && upperEnd > 0)

        {
            nine = nine - 2;
        }

        nine = Math.abs(nine);

        return nine;




    }

}




