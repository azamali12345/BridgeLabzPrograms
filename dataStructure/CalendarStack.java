package org.bridgelabz.dataStructure;
public class CalendarStack 
{
	static StackLink<Integer> stack=new  StackLink<Integer>();
	static StackLink<Integer> stack1=new  StackLink<Integer>();
	static	int Calendar[][]=new int[6][7];
	static String[] months= {" ","January", "February", "March","April","May","June","July","August","September","Octomber","November","December"};
	public static void main(String args[]) 
	{
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		int dayInMonth=0;
		int days=Utility.day(month,year);
		
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			dayInMonth=31;
		}
		else if(month==4||month==6||month==9||month==12)
		{
			dayInMonth=30;
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
		System.out.println("WELCOME TAO CALENDAR...");
		System.out.println();
		System.out.println(months[month]+" "+year);
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		int count=1;
		for(int i=0;i<6;i++) 
		{
			for(int j=days;j<7;j++) 
			{
				if(count<=dayInMonth) 
				{ 
					Calendar[i][j]=count;
					stack.push(Calendar[i][j]);
					count++;
				} 
				else 
				{
					break;
				}
			}
			days=0;	
		}
		for(int i=1;i<=dayInMonth;i++)
		{
			stack1.push(stack.pop());
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
					int val=(int)stack1.pop();
					System.out.print(" "+val +"\t");
				} 
				else 
				{ 
					int val=(int)stack1.pop();
					System.out.print(" "+val +"\t");
				}
			}
			System.out.println();
		}
	}
}
