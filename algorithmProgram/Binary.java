package org.bridgelabz.algorithmProgram;
import java.util.*;
public class Binary 
{	
	//MAIN METHOD...
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int n=0;
		while(true) 
		{
			System.out.println("ENTER THE VALUE BETWEEN 0 TO 128...");
			n=sc.nextInt();
			if(n>=0 && n<=128)
				break;
			else
				System.out.println("NUMBER IS INVALID PLEASE ENTER VALUE BETWEEN 0 TO 128...");
		}
		String bin=Utility.decToBin(n);
		System.out.println(bin);
		String swapnib=Utility.swapNibbles(bin);
		System.out.println(swapnib);
		int dec=Utility.binToDec(swapnib);
		System.out.println(dec);
	}
}

