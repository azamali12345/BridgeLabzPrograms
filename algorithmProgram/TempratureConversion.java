//PROGRAM TO COVERT TEMPRATURE IN FAHRENHEIT TO CELSIUS...
package org.bridgelabz.algorithmProgram;
import java.util.Scanner;
public class TempratureConversion 
{
	//MAIN METHOD...
	public static void main(String args[]) 
	{
		try 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER TEMPRATURE IN 'N' 'C' 'OR' 'F'");
			int temp=sc.nextInt();
			char t=sc.next().charAt(0);
			if(t!='f' && t!='F' && t!='c' && t!='C') 
			{
				System.out.println("ENTER CORRECT INPUT...");
				main(args);
				return;
			}
			temp=Utility.temperaturConversion(temp,t);
			System.out.println("CONVERTED TEMP IS... "+temp);
		} 
		catch (Exception e) 
		{
			System.out.println("TEMPRATURE MIN IN FORMAT 45 c");
		}
	}
}
