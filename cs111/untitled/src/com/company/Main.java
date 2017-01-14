package com.company;

public class Main {

    public static void main(String[] args) {


        double numToCheck = 777;
        double maxPower = Math.floor(Math.log10(numToCheck));
        int sevens = 0;
        int n = 10;

        for (int power = 1; power <= maxPower; power++) {

            if(power==0){
                if(numToCheck%7==0){
                    sevens++;
                }
            }


            if (power == 1) {
                if ((numToCheck % (Math.pow(10, power))) == 7.0) {
                    sevens++;
                }
            }

            if (power > 1) {
                if (numToCheck % (Math.pow(10, power) / n) == 7.0) {
                    sevens++;
                    System.out.println(numToCheck % (Math.pow(10, power) / n));

                }
            }

            n*=10;
        }

        System.out.println(sevens);


    }


}

