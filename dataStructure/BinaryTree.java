package org.bridgelabz.dataStructure;
import java.util.Scanner;
public class BinaryTree 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		//ENTER THE LIMITS SO THAT THEY CAN FIND THE POSSIBLE NUMBERS nTH TIMES...
		System.out.println("ENTER THE LIMITS...");
		int limit=sc.nextInt();
		int number[]= new int[limit];
		//LOOP WILL WORK TILL THE ENTERED NUMBERS OF LIMITS...
		for(int i=0;i<limit;i++)
		{
			System.out.println("ENTER A NUMBER...");
			number[i]=sc.nextInt();
			//WE ARE CALLING THE METHOD factNumber WHICH IS BEEN CREATED IN CLASS FACTORIAL...
			long x=Utility.factnumber(number[i]);
			System.out.println("POSSIBLE NUMBER OF..."+number[i]+" NODE IS..."+x);
		}
	}

}
