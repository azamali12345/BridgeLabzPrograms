package org.bridgelabz.dataStructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Utility 
{
	static Scanner sc=new Scanner(System.in);
	
	//METHOD FOR TAKING INPUT AS A STRING...
	public static String getString() 
	{
		System.out.println("ENTER STRING...");
		String s=sc.next();
		return s;
	}

	//METHOD FOR TAKING INPUT AS A INTEGER...
	public static int getInt() 
	{
		System.out.println("ENTER  INTEGER...");
		int number=sc.nextInt();
		return number;
	}

	//METHOD FOR TAKING INPUT AS A DOUBLE...
	public static double getDouble() 
	{
		System.out.println("ENTER A DOUBLE...");
		double number=sc.nextDouble();
		return number;
	}
	
	//METHOD FOR DAYOF WEEK
	public static int dayOfWeek(int d,int m,int y)
	{
		int y0=y-(14-m)/12;
		int  x=y0+y0/4-y0/100+y0/400;
		int m0=m+12*((14-m)/12)-2;
		int d0=(d+x+31*m0/12)%7;
		return d0;
	}
	
	//METHOD FOR FIND STRING IS ANAGRAM OR NOT...
	public static boolean isAnagram(String str1, String str2)
	{
		String s1=str1.replaceAll("\\s", "");
		String s2=str2.replaceAll("\\s", "");
		boolean status=false;
		if(s1.length()!=s2.length())
		{
			status=false;
		}
		char arrs1[]= s1.toLowerCase().toCharArray();
		char arrs2[]= s2.toLowerCase().toCharArray();
		Arrays.sort(arrs1);
		Arrays.sort(arrs2);
		status=Arrays.equals(arrs1, arrs2);
		return status;
	}
	
	//METHOD FOR TAKING PRIME RANGE...
	public static ArrayList<Integer> primeRange(int numbers) 
	{

		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		int i=0;
		int num=0;

		for(i=1;i<=numbers;i++) 
		{
			int counter=0;
			for (num=i;num>=1;num--) 
			{
				if(i%num==0) 
				{
					counter=counter+1;
				}
			}
			if(counter==2) 
			{
				//APPENDED THE PRIME NUMBER TO STRING...
				arraylist.add(i);
			}
		}
		return arraylist;
	}
	
	//METHOD FOR FIND PRIME NUMBER...
	public static int prime(int number)
	{
		int flag=0;
		for(int j=2;j<number;j++)
		{
			if(number%j==0)
			{
				flag=1;
			}
		}
		return flag;	
	}
	
	//METHOD FOR FIND LEAP YEAR OR NOT...
	public static boolean isLeapyear(int year)
	{
		if((year%4==0) && (year%100!=0)) 
			return true;
		if(year%400==0) 
			return true;
		return true;
	}
	
	//METHOD TO FIND DAY...
	public static int day(int month, int year) 
	{
		int day=1;
		int y=year-(14-month)/12;
		int x=y+y/4-y/100+y/400;
		int m=month+12*((14-month)/12)-2;
		int d=((day+x+(31*m)/12)%7);
		return d;
	}
	
	//METHOD FOR GETTING FACTORIAL NUMBER...
	public static long factnumber(int num)
	{
		long x=2*num;
		x=factorial(x);
		long y=num+1;
		y=factorial(y);				
		long z=factorial(num);

		long possiblevalue=x/(y*z);
		return possiblevalue;
	}

	//METHOD FOR FINDING THE FACTORIAL OF A NUMBER...
	public static long factorial(long y)
	{
		long fact=1;
		for(long i=1;i<=y;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}

