package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 900;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

            //When you create a variable within a code block, you can access
            //previous variables, you cant access it outside the codeblock

        }//EXAMPLE OF SCOPE: ACCESSIBILITY OF VARIABLES IN DIFFERENT CODE BLOCKS

        //int savedFinalScore = finalScore; //Cant access outside code block

        //Challenge:

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if (newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your second final score was " + finalScore);
        }


    }
}
