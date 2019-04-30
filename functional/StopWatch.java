package org.bridgelabz.functional;
import java.util.Scanner;
public class StopWatch 
{
	//MAIN METHOD...
	public static void main(String args[]) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER 1 TO START...");
		sc.next();
		Utility.startTime();
		System.out.println("ENTER 1 TO STOP...");
		sc.next();
		Utility.stopTime();
		Utility.elapsedTime();
	}
}
