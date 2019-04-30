package org.bridgelabz.dataStructure;
public class Calendar2D 
{
	public static void main(String args[]) 
	{
		int calendar[][]=new int[5][7];
		int months=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		String month[]= {" ","January","February","March","April","May","June","July",
				"August","September","Octomber","November","December"};
		int days[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("WELCOME TO CALENDAR...");
		System.out.println();
		System.out.println(month[months]+" "+year);
		System.out.println("");
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");

		if(months==2 && Utility.isLeapyear(year)) 
			days[months]=29;
		
		int d=Utility.dayOfWeek(1,months,year);
		for(int i=0;i<d;i++)
		{
			System.out.print("\t");
		}
		int day=0;
		for(int i=0; i<calendar.length; i++)//SET CALENDAR ACCORDING TO USER INPUT...
		{	
			for(int j=0; j<calendar[i].length; j++)
			{
				if(days[months]!=day)
				{
					day++;
					calendar[i][j]=day;
					if((j+d)%7==0)//TO PRINT 0-7 COLUMN...
					{
						System.out.println();
					}
					if(calendar[i][j]<9)
					{
						System.out.print(" "+calendar[i][j]+"\t");
					}
					else
						System.out.print(calendar[i][j]+"\t");
				}
			}
		}
	}
}
