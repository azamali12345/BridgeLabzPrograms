//PROGRAM TO FIND THE PRIME FACTORS OF GIVEN NUMBER...
package org.bridgelabz.functional;
import java.util.Scanner;
public class PrimeFactor 
{
	//MAIN METHOD...
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER TO FIND FACTORS...");
		int no=sc.nextInt();
		System.out.println("PRIME FACTORS ARE");
		Utility.primeFactors(no);
	}
}
