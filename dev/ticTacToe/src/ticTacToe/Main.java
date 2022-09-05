// TicTacToe game in java
// Made by gabriel

package ticTacToe;

import java.util.Scanner;
import java.util.Random;

public class Main {
	/*
	// 0    1    2
	{"*", "*", "*"}, // 0
	{"*", "*", "*"}, // 1
	{"*", "*", "*"}  // 2
	*/
	
	static int r = 0;
	static int i = 0;
	
	static boolean firstTurn = false;
	static boolean lost = false;
	static boolean draw = false;
	static boolean won = false;
	
	static void checkLoss(String player, String computer, String[][] board) {
		for (int i = 0; i < 3; i++) {
			if (board[i][0].equals(player) && board[i][1].equals(player) && board[i][2].equals(player)) {
				won = true;
				break;
			}
			else if (board[0][i].equals(player) && board[1][i].equals(player) && board[2][i].equals(player)) {
				won = true;
				break;
			}
			else if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) {
				won = true;
				break;
			}
			else if (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)) {
				won = true;
				break;
			}
			else if (board[i][0].equals(computer) && board[i][1].equals(computer) && board[i][2].equals(computer)) {
				lost = true;
				break;
			}
			else if (board[0][i].equals(computer) && board[1][i].equals(computer) && board[2][i].equals(computer)) {
				lost = true;
				break;
			}
			else if (board[0][0].equals(computer) && board[1][1].equals(computer) && board[2][2].equals(computer)) {
				lost = true;
				break;
			}
			else if (board[0][2].equals(computer) && board[1][1].equals(computer) && board[2][0].equals(computer)) {
				lost = true;
				break;
			}
			else if (!board[i][0].equals("*") && !board[i][1].equals("*") && !board[i][2].equals("*") && !board[0][i].equals("*") && !board[1][i].equals("*") && !board[2][i].equals("*")) {
				draw = true;
				break;
			}
		}
	}
	
	// makes the computer move
	static void computerMove(String[][] board, String computer, String player) {
		boolean valid = false;
		System.out.println("Computer moving...");
		
		int cR = new Random().nextInt(3);
		int cI = new Random().nextInt(3);
		
		while (!valid) {
			if (computer.equals("X") && firstTurn) {
				board[cR][cI] = computer;
				firstTurn = false;
				break;
			}
			
			if ( (cR == r && cI == i) || (board[cR][cI].equals(computer)) || (board[cR][cI].equals(player)) ) {
					cR = new Random().nextInt(3);
					cI = new Random().nextInt(3);
			}
			else {
				board[cR][cI] = computer;
				valid = true;
			}
		}
		
		printBoard(board);
	}
	
	// prints board
	static void printBoard(String[][] board) {
		for (int i = 0; i < board.length; i++) {
			System.out.println();
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
		}
		System.out.println();
	}
	
	// game loop
	static void play(String[][] board, String player) {
		String computer;
		
		if (player.equals("X")) {
			computer = "O";
		} 
		else {
			firstTurn = true;
			computer = "X";
			computerMove(board, computer, player);
		}
		
		while (!lost && !draw && !won) {
			System.out.print("row (0 - 2): ");
			
			try {
				r = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {
				System.out.println("You did enter not a number. Quitting");
				System.exit(0);
			}
					
			System.out.print("index/column (0 - 2): ");
			
			try {
				i = (new Scanner(System.in)).nextInt();
			}
			catch (Exception e) {
				System.out.println("You did enter not a number. Quitting");
				System.exit(0);
			}
			
			if (r < 0 || r > 2 || i < 0 || i > 2) {
				System.out.println("Input valid values!");
				System.exit(0);
			}
			else {
				System.out.println("OK");
			}
		
			board[r][i] = player;
			printBoard(board);
			
			computerMove(board, computer, player);
			
			checkLoss(player, computer, board);
		}
		
		if (won) {
			System.out.println("Congratulations, you won! Here's a trophy: ");
			System.out.println("⠀⠀⠀⠀⢀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⠀⠀⠀\r\n"
							+ "⢠⣤⣤⣤⣼⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣄⣤⣤⣠\r\n"
							+ "⢸⠀⡶⠶⠾⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡷⠶⠶⡆⡼\r\n"
							+ "⠈⡇⢷⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠇⠀⢸⢁⡗\r\n"
							+ "⠀⢹⡘⡆⠀⢹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡸⠀⢀⡏⡼⠀\r\n"
							+ "⠀⠀⢳⡙⣆⠈⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠇⢀⠞⡼⠁⠀\r\n"
							+ "⠀⠀⠀⠙⣌⠳⣼⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣞⡴⣫⠞⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠈⠓⢮⣻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⣩⠞⠉⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠉⠛⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⠋⠁⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⢤⣀⠀⠀⠀⠀⢀⣠⠖⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⡇⢸⡏⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠖⠒⠓⠚⠓⠒⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⣀⣠⣞⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣙⣆⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠓⠲⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠀⠀⠀⠀⠀⠀");
		}
		else if (lost) {
			System.out.println("Sadly, you lost :( No trophy for you");
		}
		else {
			System.out.println("DRAW! You're as good as the computer, be proud of that! :D");
		}
	}

	public static void main(String[] args) {
		String player = null;
		boolean valid = false; // for checking if player is valid
		
		// board[row][index]
		String[][] board = {
			   // 0    1    2
				{"*", "*", "*"}, // 0
				{"*", "*", "*"}, // 1
				{"*", "*", "*"}  // 2
		};
		
		try (Scanner sc = new Scanner(System.in)) {
			printBoard(board);
			
			System.out.println("Welcome to TicTacToe! This will be your board ^");
			
			// initial loop
			while (!valid) {
				System.out.print("Do you want to play as X or O? ");
				
				player = sc.next();
				
				if (player.toUpperCase().equals("X") || player.toUpperCase().equals("O")) {
					player = player.toUpperCase();
					System.out.println("Starting game as " + player + "...");
					valid = true;
				}
				else if (player.equals("0")) {
					player = "O";
					System.out.println("I will count this as O... but don't type 0 the next time!");
					System.out.println("Starting game as " + player + "...");
					valid = true;
				}
				else {
					System.out.println("You did not input a valid player!");
				}
			}	
				
			if (player.equals("X")) {
				printBoard(board);
			}
			play(board, player);
		}
		
	}

}
