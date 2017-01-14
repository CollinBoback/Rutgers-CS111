package com.company;

/**
 * Created by collinboback on 12/17/16.
 */
public class Board {

    private String[][] answers;
    private String[][] questions;


    public Board() {

        Board jeopardy = new Board();
        jeopardy.setAnswers();
        jeopardy.setQuestions();


    }

    public String[][] getAnswers() {

        // Retrieves the 2D Array with the Answers that will be prompted to the user.
        return answers;
    }

    public void setAnswers() {

        //History of Computing -- Prompts for player
        this.answers[0][0] = "The first person to debug a computer";
        this.answers[1][0] = "Founder of Microsoft";
        this.answers[2][0] = "Founders of Apple";
        this.answers[3][0] = "Developed a mechanical tabulator and founder of IBM";
        this.answers[4][0] = "First Computer Programmer";

        //Intro To Computer Hardware -- Prompts for Player

        this.answers[0][1] = "RAM stands for";
        this.answers[1][1] = "Where everything in the computer lives";
        this.answers[2][1] = "The highways of the computer";
        this.answers[3][1] = "CPU stands for";
        this.answers[4][1] = "RISC stands for";

        //Computer Networks -- Prompts for player

        this.answers[0][2] = "Broadcasts packets, uses a dumb switch";
        this.answers[1][2] = "OSI stands for";
        this.answers[2][2] = "FTP";
        this.answers[3][2] = "Address assigned to device to define where it is on the network";
        this.answers[4][2] = "HTTP stands for";

    }


    public String[][] getQuestions() {
        return questions;
    }

    public void setQuestions() {

        //History of Computing
        this.questions[0][0] = "Who is Grace Hopper?";
        this.questions[1][0] = "Who is Bill Gates?";
        this.questions[2][0] = "Who is Steve Jobs and Steve Wozniak?";
        this.questions[3][0] = "Who is Herman Hollerith?";
        this.questions[4][0] = "Who is Ada Lovelace?";

        //Intro to Computer Hardware

        this.questions[0][1] = "What is Random Access Memory?";
        this.questions[1][1] = "What is the motherboard?";
        this.questions[2][1] = "What are buses?";
        this.questions[3][1] = "What is a central process unit?";
        this.questions[4][1] = "What is Reduced Instruction Set computing?";

        //Computer Network

        this.questions[0][2] = "What is a hub?";
        this.questions[1][2] = "What is Open System Interconnection?";
        this.questions[2][2] = "What is File Transfer Protocol?";
        this.questions[3][2] = "What is an IP address?";
        this.questions[4][2] = "What is Hypertext Transfer Protocol?";

    }

    public boolean checkInput(String userInput, int row, int col) {

        System.out.println("You entered: " + userInput);

        if (userInput.equalsIgnoreCase(questions[row][col])) {
            answers[row][col] = "";
            return true;
        } else {
            return false;
        }


    }

    public boolean canPlay(String[][] answers) {

        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[0].length; j++) {
                if (answers[i][j] != "") {
                    count++;
                }
            }
        }

        if (count > 0) {
            return true;
        } else {
            System.out.println("Game Over!!");
            return false;
        }
    }

    public void play(String category, String prizeAmount) {


    }
}
