package com.company;

public class HumanPlayer implements Player {
//do not change the line above

    //Define your fields here

    public int playerID;
    public Board a;
    private int cols;


    //constructor takes the player id for this player, and the number of
    // rows and columns of the board we're playing on
    public HumanPlayer(int playerID, int row, int col) {

        this.playerID = playerID;
        this.cols = col;

        a = new Board(row, col);


    }

    //used to notify your AI player of the other players last move
    public void lastMove(int c) {

        a.play(playerID, c);

    }

    //returns column of where to play a token
    public int playToken() {

        System.out.println("Next move! Enter column: ");

        int nextColumn = IO.readInt();
        boolean isValidColumn;


        // Check if entry is within bounds
        while (nextColumn >= cols || nextColumn < 0) {
            System.out.println("Invalid entry! Try again!");
            nextColumn = IO.readInt();
        }

        //Check if game is finished

        if (a.isFinished() == playerID) {
            return -1;
        }

        //Check if play if possible (true or false)

        isValidColumn = a.play(playerID, nextColumn);

        while (isValidColumn == false) {
            System.out.println("Invalid. Try another column!");
            nextColumn = IO.readInt();
            isValidColumn = a.play(playerID, nextColumn);
        }

        return nextColumn;


    }

    //get this player's id
    public int getPlayerID() {

        return playerID;

    }

    //resets the state of the player in preparation for a new game
    public void reset() {

        a = new Board();

    }


}
