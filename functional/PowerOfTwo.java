//PRINT THE TABLE POWER OF TWO N TIMES OF TWO...
package org.bridgelabz.functional;
import java.util.Scanner;
public class PowerOfTwo 
{
	//MAIN METHOD...
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER TO FIND POWER OF 2 LESS THAN 32...");
		int pow=sc.nextInt();
		while(pow>31) 
		{
			System.out.println("INVALID INPUT...");
			System.out.println("ENTER THE VALUE LESS THAN 32...");
			pow=sc.nextInt();
		}
		Utility.printPowerTable(pow);
	}
}
