package org.bridgelabz.functional;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TicTacToe 
{
	static Scanner sc;
	static String board[];
	static String turn;
	//MAIN METHOD...
	public static void main(String[] args) 
	{
		sc=new Scanner(System.in);
		board=new String[9];
		turn="X";
		String winner=null;
		populateEmptyBoard();

		System.out.println("WELCOME TO 2 PLAYERS TIC TAC TOE...");
		System.out.println("-----------------------------------");
		printBoard();
		System.out.println("X's WILL PLAY FISRT. ENTER A SLOT NUMBER TO OLACE X IN...");

		while(winner==null) 
		{
			int numInput;
			try 
			{
				numInput=sc.nextInt();
				if(!(numInput>0 && numInput<= 9)) 
				{
					System.out.println("INVALID INPUT --- RE-ENTER SLOT NUMBER...");
					continue;
				}
			} 
			catch(InputMismatchException e) 
			{
				System.out.println("INVALID INPUT --- RE-ENTER SLOT NUMBER...");
				continue;
			}
			if(board[numInput-1].equals(String.valueOf(numInput))) 
			{
				board[numInput-1]=turn;
				if(turn.equals("X")) 
				{
					turn="O";
				} 
				else 
				{
					turn="X";
				}
				printBoard();
				winner=checkWinner();
			} 
			else 
			{
				System.out.println("SLOT ALREADY TAKEN --- RE-ENTER SLOT NUMBER...");
				continue;
			}
		}
		
		if(winner.equalsIgnoreCase("DRAW!!!")) 
		{
			System.out.println("ITS'S A DRAW!!! THANKS FOR PLAYING...");
		} 
		else 
		{
			System.out.println("CONGRATULATIONS!!! "+winner+"'s HAVE WON!!! THANKS FOR PLAYING...");
		}
	}

	static String checkWinner() 
	{
		for(int a=0;a<8;a++) 
		{
			String line=null;
			switch(a) 
			{
			case 0:
				line=board[0]+board[1]+board[2];
				break;
			case 1:
				line=board[3]+board[4]+board[5];
				break;
			case 2:
				line=board[6]+board[7]+board[8];
				break;
			case 3:
				line=board[0]+board[3]+board[6];
				break;
			case 4:
				line=board[1]+board[4]+board[7];
				break;
			case 5:
				line=board[2]+board[5]+board[8];
				break;
			case 6:
				line=board[0]+board[4]+board[8];
				break;
			case 7:
				line=board[2]+board[4]+board[6];
				break;
			}
			if(line.equals("XXX")) 
			{
				return "X";
			} 
			else if(line.equals("OOO")) 
			{
				return "O";
			}
		}

		for(int a=0;a<9;a++) 
		{
			if(Arrays.asList(board).contains(String.valueOf(a+1))) 
			{
				break;
			}
			else if(a==8) 
				{
				return "draw";
				}
		}

		System.out.println(turn+"'s TURN --- ENTER A SLOT NUMBER TO PLACE "+turn+" IN...");
		return null;
	}
	//PRINT THE BOARD...
	static void printBoard() 
	{
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("/---|---|---\\");
	}
	static void populateEmptyBoard() 
	{
		for(int a=0;a<9;a++) 
		{
			board[a]=String.valueOf(a+1);
		}
	}
}
