package com.CSC1302;
import java.util.*;
//Name: Talha Ansari
public class TicTac {
//this program allows two users to play tictactoe in the console using a printed 2d array to visualize the game
    static char[][] board = {
            {' ', '1', ' ', '|', ' ', '2', ' ', '|', ' ', '3', ' '},
            {'-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-'},
            {' ', '4', ' ', '|', ' ', '5', ' ', '|', ' ', '6', ' '},
            {'-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-'},
            {' ', '7', ' ', '|', ' ', '8', ' ', '|', ' ', '9', ' '}
    };
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Welcome to TicTacToe! Behold the BOARD.");
        printBoard();
        System.out.println("Player 1 has the X and Player 2 has the O.");
        while (true) {
            int player = 1;
            System.out.println("Player 1, enter the box number you wish to choose.");
            int box = console.nextInt();
            position(box, player);
            if (checkWin(box)) {
                System.out.println("Player 1 wins!");
                break;
            }
            player = 2;
            System.out.println("Player 2, enter the box number you wish to choose.");
            box = console.nextInt();
            position(box, player);
            if (checkWin(box)) {
                System.out.println("Player 2 wins!");
                break;
            }
        }

    }
    public static void printBoard() {
        for (char[] row : board) {
            for (char c : row)
                System.out.print(c);
            System.out.println();
        }
    }

    public static void position(int box, int player) {
        char piece = 'X';
        if (player == 2)
            piece = 'O';
        switch (box) {
            case 1 -> board[0][1] = piece;
            case 2 -> board[0][5] = piece;
            case 3 -> board[0][9] = piece;
            case 4 -> board[2][1] = piece;
            case 5 -> board[2][5] = piece;
            case 6 -> board[2][9] = piece;
            case 7 -> board[4][1] = piece;
            case 8 -> board[4][5] = piece;
            case 9 -> board[4][9] = piece;
        }
        printBoard();
    }

    public static boolean checkWin(int box) {
        if (board[0][1] == board [0][5]
        && board[0][5] == board[0][9])
            return true;
        if (board[2][1] == board [2][5]
                && board[2][5] == board[2][9])
            return true;
        if (board[4][1] == board [4][5]
                && board[4][5] == board[4][9])
            return true;
        if (board[0][1] == board [2][1]
                && board[0][1] == board[4][1])
            return true;
        if (board[0][5] == board [2][5]
                && board[0][5] == board[4][5])
            return true;
        if (board[0][9] == board [2][9]
                && board[0][9] == board[4][9])
            return true;
        if (board[0][1] == board [2][5]
                && board[0][1] == board[4][9])
            return true;
        if (board[4][1] == board [2][5]
                && board[4][1] == board[1][9])
            return true;
        return false;
    }
}
