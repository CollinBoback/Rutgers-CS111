package com.company;

public class Main {

    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus); //ARGUMENTS AS VARIABLES
        System.out.println("Your final score " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score " + highScore);


    }

    //public static *void* calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { //PARAMETERS!!!!!!

    //VOID MEANS: DON'T SEND ANY VALUE BACK!!

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static int displayHighScorePosition(int score){
        
    }
}
