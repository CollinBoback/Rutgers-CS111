package com.company;

public class Main {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Collin", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Mike", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Trevor", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Maddy", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Daddy", position);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
