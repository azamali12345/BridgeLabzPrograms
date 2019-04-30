//THERE IS 1,2,5,10,20,50,100,200,500,1000,2000 RS NOTES WHICH CAN BE RETURNED BY VENDING MACHINE...
package org.bridgelabz.algorithmProgram;
import java.util.Scanner;
public class VendingMachine 
{
	//MAIN METHOD...
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE AMOUNT...:");
		int amount=sc.nextInt();
		Utility.calculateMinNoNote(amount);
		System.out.println("MINIMUM NUMBER OF NOTES REQUIRED IS..."+Utility.mNote);
	}
}
