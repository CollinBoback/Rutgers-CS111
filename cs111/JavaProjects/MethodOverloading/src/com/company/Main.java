package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Collin", 500);
        System.out.println("New Score is " + newScore);

        calculateScore(75);
        calculateScore();





    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player" + " scored " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("Unnamed player" + " no score ");
        return 0;
    }

    //CHALLENGE!!!!!!!!!!!!!!!!!

    public static int calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet >= 0 && inches >=0 && inches <= 12){

            int centimeters = ((feet * 12) + inches) * 2.54:
            return centimeters;


        }else{
            return -1;
        }
    }

}
