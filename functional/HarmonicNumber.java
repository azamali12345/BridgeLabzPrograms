//PROGRAM TO FIND HARMONIC NUMBER...
package org.bridgelabz.functional;
import java.util.Scanner;
public class HarmonicNumber 
{
	//MAIN METHOD...
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		//USING TRY AND CATCH FOR DONT TAKE THE WRONG INPUT...
		try 
		{
			System.out.println("ENTER THE HARMONIC NUMBER FIND");
			int no=sc.nextInt();
			System.out.println(Utility.harm(no));

		} 
		catch (Exception e) 
		{
			System.out.println("ENTER INTEGER ONLY");
			main(args);
		}
		finally
		{
			sc.close();
		}
	}
}
