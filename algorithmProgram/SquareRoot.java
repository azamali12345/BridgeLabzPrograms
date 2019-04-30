//PROGRAM TO FIND SQURAE ROOT...
package org.bridgelabz.algorithmProgram;
import java.util.Scanner;
public class SquareRoot 
{
	//MAIN METHOD...
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			System.out.println("ENTER NUMBER TO FIND SQUARE ROOT...");
			double no=sc.nextDouble();
			System.out.println("SQUARE ROOT IS..."+Utility.sqrt(no));
		} 
		catch(Exception e) 
		{
			System.out.println("ENTER INTEGER VALUE..."+e.getMessage());
		}
		finally
		{
			sc.close();
		}
	}
}
