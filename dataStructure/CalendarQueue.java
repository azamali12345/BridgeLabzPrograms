package org.bridgelabz.dataStructure;
public class CalendarQueue<T>
{
	static QueueLink Queue = new QueueLink();	
	static	int Calendar[][]=new int[6][7];
	static String[] months= {" ","January", "February", "March","April","May","June","July",
			"August","September","Octomber","November","December"};
	public static void main(String args[]) 
	{
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		int dayInMonth=0;
		int days=Utility.day(month,year);
		
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			dayInMonth = 31;
		}
		else if(month==4||month==6||month==9||month==12)
		{
			dayInMonth = 30;
		}
		else if(month==2)
		{
			if (Utility.isLeapyear(year)==true) 
			{
				dayInMonth=28;
			} 
			else 
			{
				dayInMonth=29;
			}
		}
		System.out.println("WELCOME TO CALENDAR...");
		System.out.println(months[month]+" "+year);
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		int count=1;
		for(int i=0;i<6;i++) 
		{
			for(int j=days;j<7;j++) 
			{
				if (count<=dayInMonth) 
				{ 
					Calendar[i][j]=count;
					Queue.enqueue(Calendar[i][j]);
					count++;
				} 
				else 
				{
					break;
				}
			}
			days=0;	
		}
		for(int i=0;i<6;i++) 
		{
			for(int j=0;j<7;j++) 
			{
				if(Calendar[i][j]==0) 
				{
					System.out.print("\t");
				} 
				else if(Calendar[i][j]>9) 
				{
					int val=Queue.dequeue();
					System.out.print(" "+val +"\t");
				} 
				else 
				{
					int val=Queue.dequeue();
					System.out.print(" "+val +"\t");
				}
			}
			System.out.println();
		}
	}
}

