package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your high score is " + highScore);

        score = 1000;
        levelCompleted = 10;
        bonus = 10000;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your second round received a score of " + highScore);

        highScore = calculateScore(true, 1000, 10, 10000);
        System.out.println("Your third round received a score of " + highScore);

        theLongWay();

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;

        } else {
            return -1;
        }
    }

    public static void theLongWay() { //VOID means no info will be returned

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your long way score was " + finalScore);


        }
    }



}