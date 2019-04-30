//PROGRAM TO FIND DAY OF CALENDAR...
package org.bridgelabz.algorithmProgram;
import java.util.Scanner;
public class CalendarDay 
{
	//MAIN METHOD...
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER DAY...");
		int day=sc.nextInt();
		System.out.println("ENTER MONTH...");
		int month=sc.nextInt();
		System.out.println("ENTER YEAR...");
		int year=sc.nextInt();
		//FUNCTION TO CALL PRINT DAY OF THE WEEK...
		System.out.println(Utility.dayOfWeek(day,month,year));
	}
}
