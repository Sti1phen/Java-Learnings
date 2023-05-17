package main.java.org.example.chapter7;

import java.security.SecureRandom;

/*
declare array board 8 by 8
declare and initialize two one-D arrays horizontal and vertical
current position of Knight is board[currentRow][currentColumn]
initialize currentRow and currentColumn to
currentRow is +=vertical[moveNumber]
currentColumn is +=horizontal[moveNumber]

Moving Knight through the chessboard
For Statement  from 1 to 64
Generate numbers from 0 to 7 that represent each knight move
currentRow is +=vertical[moveNumber]
currentColumn is +=horizontal[moveNumber]

if (board[currentRow][currentColumn] = true
        skip
    write board[currentRow][currentColumn] equals count
Test that movement is not out of board
Put the statement into a try and catch statement and print ArrayOutOfBounds

 */
public class KnightsTour {

    private static final SecureRandom generateMove = new SecureRandom();

    public static void main(String[] args) {
        int[][] board = new int[8][8];
        int[] vertical = new int[8];
        int[] horizontal = new int[8];
        int currentRow = 3, currentColumn = 4;

        horizontal[0] = 2;
        horizontal[1] = 1;
        horizontal[2] = -1;
        horizontal[3] = -2;
        horizontal[4] = -2;
        horizontal[5] = -1;
        horizontal[6] = 1;
        horizontal[7] = 2;
        vertical[0] = -1;
        vertical[1] = -2;
        vertical[2] = -2;
        vertical[3] = -1;
        vertical[4] = 1;
        vertical[5] = 2;
        vertical[6] = 2;
        vertical[7] = 1;

        for (int count = 1; count <= 64; count++) {
            int moveNumber = generateMove.nextInt(8);
//            for (int moveNumber = 0; moveNumber < 8; moveNumber++) {


//            System.out.println(moveNumber);
            try {
                if ((board[currentRow += vertical[moveNumber]][currentColumn += horizontal[moveNumber]]) >= 0 && (board[currentRow += vertical[moveNumber]][currentColumn += horizontal[moveNumber]]) <= 64)

                    /////////////(revisit)

                    board[currentRow += vertical[moveNumber]][currentColumn += horizontal[moveNumber]] = count;


            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("board [%d][%d]\n", currentRow, currentColumn);
            }

        }
        displayTwoDimensionalArray(board);

    }

    public static void displayTwoDimensionalArray(int [][] array) {
        System.out.print(" \t");
        for (int columnHeader = 0; columnHeader < array[0].length; columnHeader++) {
            System.out.printf("%d\t", columnHeader);
        }
        System.out.println();
        for (int row = 0; row < array.length; row++) {
            System.out.printf("%d\t", row);

            for (int column = 0; column < array[0].length; column++)
                System.out.printf("%d\t", array[row][column]);
            System.out.println();
        }
    }
}