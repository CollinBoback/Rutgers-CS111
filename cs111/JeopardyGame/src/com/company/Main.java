package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Jeopardy!");

        Board jeopardy = new Board();

        String category;
        String prizeAmount;

        while (jeopardy.canPlay(jeopardy.getAnswers())) {

            System.out.println("Pick a category!");
            category = IO.readString();
            System.out.println("Pick a prize amount? (not inc $)");
            prizeAmount = IO.readString();

            System.out.println("You selected " + category + " for " + "$" + prizeAmount);
            jeopardy.play(category, prizeAmount);

        }


    }


}


