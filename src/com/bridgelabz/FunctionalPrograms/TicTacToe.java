package com.bridgelabz.FunctionalPrograms;

import java.util.Scanner;
/**
 * @author swati
 * tictactoe game
 */
public class TicTacToe{
static int player = 0;
static int[][] BOARD = new int[3][3];
static boolean isEmpty = true;

/**
 * intialize board
 */
static void initBoard() {
	System.out.println("TIC TAC TOE GAME\nComputer player X\nHuman Player 0 ");
	for (int i = 0; i < BOARD.length; i++) {
		for (int j = 0; j < BOARD[i].length; j++) {
			BOARD[i][j] = -10;
		}
	}
	dispBoard();
}
/**
 * display board to enter values
 */
static void dispBoard() {
	int count = 0;
	for (int i = 0; i < BOARD.length; i++) {
		System.out.println("---------------");
		System.out.print("||");
		for (int j = 0; j < BOARD[i].length; j++) {
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

/**private void initBoard() 
 * * generate random value and use it as input 
 */
static void putVal() {
	int i;
	int j;
	if (player % 2 == 1) {
		i = (int) (Math.random() * 10)% 3;
		j = (int) (Math.random() * 10)% 3;
	} else {
		Scanner s = new Scanner(System.in);
		System.out.println("enter value of x and y by space");
		i = s.nextInt();
		j = s.nextInt();
	}
	if (BOARD[i][j] == -10) {
		if (player % 2 == 0) {
			BOARD[i][j] = 0;
		} else {
			BOARD[i][j] = 1;
			System.out.println("Coumputer Choosing " + i + " " + j);
		}
	} else
		putVal();
}
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
