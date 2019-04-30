package org.bridgelabz.algorithmProgram;
import java.util.Scanner;
public class NumberGuess 
{
	//MAIN METHOD...
	public static void main(String args[])
	{
		System.out.println("ENTER THE RANGE...");
		int num=Utility.sc.nextInt();
		Utility.find(0,num-1);
	}
}
