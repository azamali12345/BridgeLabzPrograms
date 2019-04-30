//PROGRAM TO FIND ALL PERMUTATIONS OF STRING...
package org.bridgelabz.functional;
import java.util.Scanner;
public class Permutation
{

	//MAIN METHOD...
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER A WORD...");
		String s=sc.next();
		System.out.println("THE PERMUTATIONS ARE...");
		Utility.perm("",s);
		System.out.println("TOTAL NUMBER OF PERMUTATION = "+Utility.c);
	}
}

