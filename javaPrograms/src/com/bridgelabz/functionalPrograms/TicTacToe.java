package com.bridgelabz.functionalPrograms;

import java.util.Scanner;
/**
 * @author swati
 * tictactoe game
 */
public class TicTacToe{
    static int player = 0;
    static int[][] BOARD = new int[3][3];
    static boolean isEmpty = true;
    static int putVal_count = 0;

    /**
     * intialize board
     */
    static void initBoard() {
        System.out.println("TIC TAC TOE GAME\nComputer player X\nHuman Player 0 ");
        for (int i = 0; i < BOARD.length; i++) {
            for (int j = 0; j < BOARD.length; j++) {
                BOARD[i][j] =-10;
            }
        }
        dispBoard();
    }
    /**
     * display board
     */
    static void dispBoard() {
        int count = 0;
        for (int i = 0; i < BOARD.length; i++) {
            System.out.println("---------------");
            System.out.print("||");
            for (int j = 0; j < BOARD.length; j++) {
                if (BOARD[i][j] == 0) {
                    count++;
                    System.out.print(" 0 |");
                } else if (BOARD[i][j] == 1) {
                    count++;
                    System.out.print(" x |");
                } else
                    System.out.print("   |");
            }
            System.out.println("|");
        }
        if (count == 9) {
            isEmpty = false;
        }
        System.out.println("---------------");
    }

    /**
     * * generate random and use it as one input
     */
    static void putVal() {
        int i,j;
        if (putVal_count < 9) {
            if (player % 2 == 1) {
                i = (int) (Math.random() * 10) % 3;
                j = (int) (Math.random() * 10) % 3;
            } else {
                Scanner s = new Scanner(System.in);
                System.out.println("enter value of x and y by space");
                i = s.nextInt();
                j = s.nextInt();
            }
            if (BOARD[i][j] == -10) {
                putVal_count++;
                System.out.println("putVa 0l_count "+ putVal_count);
                if (player % 2 == 0) {
                    BOARD[i][j] = 0;
                } else {
                    System.out.println("Computer Choosing " + i + " " + j);
                    BOARD[i][j] = 1;
                }
            } else
                putVal();
        }
        else{
            System.out.println("got Draw!!!!!!!!!!!");
            System.exit(0);
        }
    }
    /**
     * @return winner of the game
     */
    static boolean win() {
        return ((BOARD[0][0] + BOARD[0][1] + BOARD[0][2] == player * 3)
                || (BOARD[1][0] + BOARD[1][1] + BOARD[1][2] == player * 3)
                || (BOARD[2][0] + BOARD[2][1] + BOARD[2][2] == player * 3)
                || (BOARD[0][0] + BOARD[1][0] + BOARD[2][0] == player * 3)
                || (BOARD[0][1] + BOARD[1][1] + BOARD[2][1] == player * 3)
                || (BOARD[0][2] + BOARD[1][2] + BOARD[2][2] == player * 3)
                || (BOARD[0][0] + BOARD[1][1] + BOARD[2][2] == player * 3)
                || (BOARD[2][0] + BOARD[1][1] + BOARD[0][2] == player * 3));

    }
    /**
     * play ticTacToe game
     */
    static void play() {
        initBoard();
        while (isEmpty) {
            System.out.println("Players turn");
            putVal();
            dispBoard();
            if (win()) {
                System.out.println("Human Player won");
                return;
            }
            player = 1;
            System.out.println("Computers turn");
            putVal();
            dispBoard();
            if (win()) {
                System.out.println("Computer player won");
                return;
            }
            player = 0;
        }
    }
    public static void main(String[] args) {
        play();
    }
}