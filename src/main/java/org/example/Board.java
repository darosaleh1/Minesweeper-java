package org.example;

import java.util.Arrays;

public class Board {

    private String difficulty;
    private String[][] board;

    public Board(String difficulty) {
        this.difficulty = difficulty;
        switch(this.difficulty) {
            case "easy":
                this.board = new String[9][9];
                break;
            case "medium":
                this.board = new String[16][16];
                break;
            case "hard":
                this.board = new String[30][30];
                break;
        }

//        initialise board

        for (int i = 0; i < board.length; i++){
            Arrays.fill(board[i], " -");

        }

    }

    public String[] getRow(int i) {
        return board[i];
    }

    public int getBoardSize() {
        return board[0].length;
    }


}
