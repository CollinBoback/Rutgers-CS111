package com.company;

public class ConnectFour{


    public static void main(String[] args){



        //Create new board object

        Board newGame = new Board();
        CFGUI newBoard = new CFGUI(newGame, ChipColor.BLACK, ChipColor.BLUE);

        //Set player tokens for player 1 and player 2

        newGame.setPlayerOne('X');
        newGame.setPlayerTwo('Y');

        //Create Player objects
        //Note, the code below works because of the interface Player. All classes that "implement" Player can be
        // typed as Player. Makes switching from Human to AI Players really easy. For a challenge, you might
        // consider:
        //		1. asking the user whether he/she wants to play against a human or a computer
        //		2. implementing multiple AI players (easy, med, hard) that the user can choose to play against

        Player p1 = new HumanPlayer(1,6,7);
        Player p2 = new HumanPlayer(1,6,7);


        //Print your empty board






        //WHILE the board is still playable
        //	get a column to play from player 1
        //	play that token on the board
        //  print the board
        //		has anyone won yet?
        // do the above for player 2


        while(newGame.canPlay()){
            p1.playToken();
            //[print board]

            if(newGame.isFinished()==true){
                newGame.

            }

            p2.playToken();

            //[print board]

        }

        // Get the status code from the board (isFinished())

        // Print out the results of the game


    }

}