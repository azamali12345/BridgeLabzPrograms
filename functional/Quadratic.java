package org.bridgelabz.functional;
import java.util.Scanner;
public class Quadratic 
{
	//MAIN METHOD...
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			System.out.println("ENTER a VALUE...");
			int a= sc.nextInt();
			System.out.println("ENTER b VALUE");
			int b= sc.nextInt();
			System.out.println("ENTER c VALUE");
			int c= sc.nextInt();
			Utility.roots(a,b,c);
		} 
		catch (Exception e) 
		{
			System.out.println("ENTER CORRECT INPUT...");
		}
		finally 
		{
		sc.close();
		}
	}
}
