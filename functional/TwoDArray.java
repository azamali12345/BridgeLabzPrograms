package org.bridgelabz.functional;
public class TwoDArray 
{
	//MAIN METHOD...
	public static void main(String args[]) 
	{
		System.out.println("ENTER NUMBER OF ROWS...");
		int m=Utility.sc.nextInt();
		System.out.println("ENTER NUMBER OF COLUMNS...");
		int n=Utility.sc.nextInt();

		//CALLING METHODS STATEMENTS...
		int a[][]=Utility.arrayInt(m,n);
		double b[][]=Utility.arrayDouble(m,n);
		String c[][]=Utility.arrayBoolean(m,n);
		Utility.display(a,b,c,m,n);
	}
}
