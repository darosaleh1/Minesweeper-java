package org.example;

import java.util.Arrays;

public class Main {

    public static void printColumnCoordinates(int size){
        System.out.print(' ');
        for (int i = 0; i < size; i++){
            System.out.print(" " + i);
        }
        System.out.println();
    }


    public static void main(String[] args) {

        String difficulty = "easy";
        Board boardObj = new Board(difficulty);
        int boardSize = boardObj.getBoardSize();



        /* print initial board*/
        printColumnCoordinates(boardSize);
        for (int i =0; i < boardSize; i++){
            String[] row = boardObj.getRow(i);
            System.out.print(i);
            for (String j: row) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}