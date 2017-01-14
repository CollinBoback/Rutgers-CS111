package com.company;

/**
 * Created by collinboback on 12/2/16.
 */
public class Board {

    private int numRows;
    private int numCols;
    private char playerOne;
    private char playerTwo;
    public char[][] Board;



    //----- BOARD CONSTRUCTOR-----//


    public Board() {
        this.numRows = 6;
        this.numCols = 7;

        Board = new char[numRows][numCols];

        for (int i = 0; i < this.Board.length; i++) {
            for (int j = 0; j < this.Board[0].length; j++) {
                this.Board[i][j] = ' ';
            }
        }


    }

    public Board(int row, int col) {

        this.numCols = col;
        this.numRows = row;

        Board = new char[this.numRows][this.numCols];

        for (int i = 0; i < this.numRows; i++) {
            for (int j = 0; j < this.numCols; j++) {
                this.Board[i][j] = ' ';
            }
        }



    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public void setNumCols(int numCols) {
        this.numCols = numCols;
    }

    public void setPlayerOne(char o) {
        this.playerOne = o;
    }

    public void setPlayerTwo(char t) {
        this.playerTwo = t;
    }


    public int getNumRows() {
        return this.numRows;
    }

    public int getNumCols() {
        return this.numCols;
    }

    public char getPlayerOne() {
        return playerOne;
    }

    public char getPlayerTwo() {
        return playerTwo;
    }

    public boolean canPlay() {

        for (int i = 0; i < this.numRows; i++) {
            for (int j = 0; j < this.numCols; j++) {
                if (Board[i][j] == ' ') {
                    return true;

                }
            }
        }

        return false;

    }


    public boolean play(int p, int c) {

        if(p>=numCols || p<0 || c>=numCols || c<0){
            System.out.println("Not a valid entry!");
            return false;

        }

        for (int i = this.numRows - 1; i > 0; i--) {

            if (this.Board[i][c] == ' ') {
                if (p == 1) {

                    this.Board[i][c] = this.playerOne;
                    return true;
                } else if (p == 2) {
                    this.Board[i][c] = this.playerTwo;
                    return true;
                }
            }
        }
        return false;
    }

    public int isFinished() {

        int theWinner;

        theWinner = this.horizontalWin();
        if (theWinner != -1) {
            return theWinner;
        }
        theWinner = this.verticalWin();
        if (theWinner != -1) {
            return theWinner;
        }
        theWinner = this.diagonalWin();
        if (theWinner != -1) {
            return theWinner;
        }
        for (int i = 0; i < this.numRows; ++i) {
            for (int j = 0; j < this.numCols; ++j) {
                if (this.Board[i][j] == ' ') {
                    return 0;
                }
            }
        }
        return theWinner;
    }

    public char getToken(int row, int col) {

        char token;

        if(row < numRows && col < numCols && row >= 0 && col >= 0){
            return Board[row][col];
        }else{
            return '\0';
        }







    }


    private int horizontalWin() {


        for (int row = 0; row < this.numRows; row++) {
            int d = 0;
            for (int column = 1; column < this.numCols; ++column) {

                if (this.Board[row][column] != ' ' && this.Board[row][column] == this.Board[row][column - 1]) {
                    d++;
                } else {
                    d = 1;
                }
                if (d >= 4) {
                    if (this.Board[row][column] == this.playerOne) {
                        return 1;
                    } else if (this.Board[row][column] == this.playerTwo) {
                        return 2;
                    }
                }
            }
        }
        return -1;
    }


    private int verticalWin() {
        for (int column = 0; column < this.numCols; column++) {
            int d = 0;
            for (int row = 1; row < this.numRows; row++) {
                if (this.Board[row][column] != ' ' && this.Board[row][column] == this.Board[row - 1][column]) {
                    d++;
                } else {
                    d = 1;
                }
                if (d >= 4) {
                    // Return char of the winner
                    if (this.Board[row][column] == this.playerOne) {
                        return 1;
                    } else if (this.Board[row][column] == this.playerTwo) {
                        return 2;
                    }
                }
            }
        }
        return -1;
    }

    private int diagonalWin() {


        for (int column = 0; column < this.numCols; column++) {
            int count = 0;

            for (int row = 1; row < this.numRows; row++) {

                System.out.println("i:" + row + "j:" + column + " " + (row + column));
                if (column + row >= this.numCols) {
                    break;
                }
                if (this.Board[row][column + row] != ' ' && this.Board[row - 1][column + row - 1] == this.Board[row][column + row]) {
                    ++count;
                } else {
                    count = 1;
                }
                if (count >= 4) {
                    if (this.Board[row][column] == this.playerOne) {
                        return 1;
                    } else if (this.Board[row][column] == this.playerTwo) {
                        return 2;
                    }
                }
            }
        }

        for (int row = 0; row < this.numRows; ++row) {
            int count = 0;
            for (int column = 1; column < this.numCols; ++column) {

                if (column + row >= this.numRows) {
                    break;
                }
                if (this.Board[row + column][column] != ' ' && this.Board[row + column - 1][column - 1] == this.Board[row + column][column]) {
                    ++count;
                } else {
                    count = 1;
                }
                if (count >= 4) {
                    if (this.Board[row][column] == this.playerOne) {
                        return 1;
                    } else if (this.Board[row][column] == this.playerTwo) {
                        return 2;
                    }
                }

            }
        }

        for (int column = 0; column < this.numCols; ++column) {
            int count = 0;
            for (int row = 1; row < this.numRows; ++row) {
                if (column - row < 0) {
                    break;
                }
                if (this.Board[row][column - row] != ' ' && this.Board[row - 1][column - row + 1] == this.Board[row][column - row]) {
                    ++count;
                } else {
                    count = 1;
                }
                if (count >= 4) {
                    if (this.Board[row][column] == this.playerOne) {
                        return 1;
                    } else if (this.Board[row][column] == this.playerTwo) {
                        return 2;
                    }
                }

            }
        }

        for (int row = 0; row < this.numRows; ++row) {
            int count = 0;

            for (int column = this.numCols - 1; column >= 0; column--) {

                if (row - column < 0) {
                    break;
                }

                if (this.Board[column - row][column] != ' ' && this.Board[column - row - 1][column + 1] == this.Board[column - row][column]) {
                    ++count;
                } else {
                    count = 1;
                }
                if (count >= 4) {
                    if (this.Board[row][column] == this.playerOne) {
                        return 1;
                    } else if (this.Board[row][column] == this.playerTwo) {
                        return 2;
                    }
                }

            }
        }
        return -1;
    }


}










