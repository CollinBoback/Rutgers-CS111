public class Board {

    private int numRows;
    private int numCols;
    private char playerOne;
    private char playerTwo;
    private boolean canPlay;
    private boolean play;
    private int isFinished;
    private char token;
    public char[][] gameBoard;


    //----- BOARD CONSTRUCTOR-----//


    public Board() {
        this.gameBoard = new char[6][7];

        this.numRows = 6;
        this.numCols = 7;

        for (int i = 0; i < this.gameBoard.length; i++) {
            for (int j = 0; j < this.gameBoard[0].length; j++) {
                this.gameBoard[i][j] = ' ';
            }
        }


    }

    public Board(int row, int col) {

        this.numCols = col;
        this.numRows = row;

        this.gameBoard = new char[this.numCols][this.numRows];

        for (int i = 0; i < this.gameBoard.length; i++) {
            for (int j = 0; j < this.gameBoard[0].length; j++) {
                this.gameBoard[i][j] = ' ';
            }
        }


    }


    //-----SETTERS-----//


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

    public void setCanPlay(boolean canPlay) {
        this.canPlay = canPlay;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public void setIsFinished(int isFinished) {
        this.isFinished = isFinished;
    }

    //--------GETTERS------------------//


    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public char getPlayerOne() {
        return playerOne;
    }

    public char getPlayerTwo() {
        return playerTwo;
    }

    public boolean canPlay() {

        canPlay = false;

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                if (gameBoard[i][j] == ' ') {
                    this.canPlay = true;
                    break;
                }
            }
        }

        return canPlay;

    }


    public boolean play(int p, int c) {
        return play;
    }

    public int isFinished() {





        return 1;
    }


    //-------------GAMEPLAY-------//

    public char getToken(int row, int col) {
        try {
            return this.board[row][col];
        } catch (ArrayIndexOutOfBoundsException ex) {
            return '\0';
        }
    }

}










