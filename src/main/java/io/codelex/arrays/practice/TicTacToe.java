package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static final char[][] board = new char[3][3];
    private static boolean isX = true;
    private static boolean winnerFound = false;


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        initBoard();
        displayBoard();
        while (!winnerFound && !checkDraw()) {
            if (isX) {
                System.out.println("X, choose your location (row, column):");
            } else {
                System.out.println("O, choose your location (row, column):");
            }
            addToBoard(keyboard.nextInt(), keyboard.nextInt());
            displayBoard();
            checkWinner();
        }
        if (checkDraw()) {
            System.out.println("Game over with a tie!");
        }
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';

    }

    public static void addToBoard(int row, int col) {
        if (board[row][col] == ' ') {
            if (isX) {

                board[row][col] = 'X';
                isX = false;
            } else {
                board[row][col] = 'O';
                isX = true;
            }
        } else {
            System.out.println("The space is already taken");
        }

    }

    public static void checkWinner() {
        char relevantValue;
        if (isX) {
            relevantValue = 'O';
        } else {
            relevantValue = 'X';
        }
        //horizontal and vertical
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == relevantValue && board[i][1] == relevantValue && board[i][2] == relevantValue) {
                System.out.println("Winner is: " + relevantValue);
                winnerFound = true;
            }
            if (board[0][i] == relevantValue && board[1][i] == relevantValue && board[2][i] == relevantValue) {
                System.out.println("Winner is: " + relevantValue);
                winnerFound = true;
            }
        }
        //diagonals
        if ((board[0][0] == relevantValue && board[1][1] == relevantValue && board[2][2] == relevantValue) ||
                (board[2][0] == relevantValue && board[1][1] == relevantValue && board[0][2] == relevantValue)) {
            System.out.println("Winner is: " + relevantValue);
            winnerFound = true;
        }
    }

    public static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}