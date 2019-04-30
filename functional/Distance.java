package org.bridgelabz.functional;
import java.util.Scanner;
public class Distance 
{
	//MAIN METHOD...
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			System.out.println("ENTER VALUE FOR x... ");
			int x=sc.nextInt();
			System.out.println("ENTER VALUE FOR y... ");
			int y=sc.nextInt();
			Utility.calculate(x,y);
			
		} 
		catch (Exception e) 
		{
			System.out.println("ENTER ONLY INTEGER VALUE...");
		}
		finally
		{
			sc.close();
		}
	}
}
