package org.bridgelabz.functional;
import java.util.Scanner;
public class WindChill 
{
	//MAIN METHOD...
	public static void main(String args[]) 
	{
		Scanner sc= new Scanner(System.in);
		try 
		{
			System.out.println("ENTER TEMPRATURE IN FAHRENHEIT...");
			double f= sc.nextDouble();
			System.out.println("ENTER WIND SPEED IN MILES PER HOUR...");
			double ws=sc.nextDouble();
			if (Math.abs(f)>50 || ws>120 || ws<3) 
			{
				System.out.println("ENTER CORRECT INPUT...");
			} 
			else 
			{
				Utility.windChill(f,ws);
			}
		} 
		catch (Exception e) 
		{
			System.out.println("ENTER PROPER INPUT...");
		}
		finally 
		{
		sc.close();
		}
	}
}
