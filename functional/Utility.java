package org.bridgelabz.functional;
import java.util.*;
import java.io.*;
public class Utility 
{
	static Scanner sc=new Scanner(System.in);
	
	//METHOD FOR INPUT STRING...
	public static String getString() 
	{
		System.out.println("ENTER STRING...");
		String s=sc.nextLine();
		return s;
	}

	//METHOD FOR INPUT INTEGER...
	public static int getInt() 
	{
		System.out.println("ENTER INTEGER VALUE...");
		int number=sc.nextInt();
		return number;
	}

	//METHOD FOR INPUT DOUBLE...
	public static double getDouble() 
	{
		System.out.println("ENTER DOUBLE VALUE...");
		double number=sc.nextDouble();
		return number;
	}
	
	//METHOD TO PRINT THE POWER TABLE OF 2 n TIMES OF TWO IS PRINTED...
	static void printPowerTable(int pow) 
	{
		int val=1;
		for (int i=1;i<=pow;i++) 
		{
			val=val*2;
			System.out.println(val);
		}
	}
	
	//METHOD TO CALCULATE THE VALUE OF DISTANCCE...
	//ARGUMENT x IS THE x AXIS...
	//ARGUMENT y IS THE y AXIS...
	static void calculate(int x, int y) 
	{
		System.out.println("DISTANCE IS..."+Math.sqrt(x*x+y*y));
	}
	
	
	//METHOD TO CALCULATE NTH HARMONIC NUMBER...
	static double harm(int n) 
	{
		double h=0;
		for(double i=1;i<=n;i++) 
		{
			h=h+1/i;
		}
		return h;
	}
	
	//METHOD TO FIND ALL PERMUTATION OF STRING...
	static int c=0;
	static void perm(String s1,String s2) 
	{
		if(s2.length()<=1) 
		{
			c++;
			System.out.println(s1+s2);
		} 
		else 
		{
			for(int i=0;i<s2.length();i++) 
			{
				String x=s2.substring(i,i+1);
				String y=s2.substring(0,i);
				String z=s2.substring(i+1);
				perm(s1+x,y+z);
			}
		}
	}
	
	
	//METHOD TO CHECK IF THE NUMBER IS PRIME OR NOT..
	//ARGUMENT n IS THE NUMBER TO CHECK FOR PRIME...
	public static boolean isPrime(int n) 
	{
		for (int i=2;i<=n/2;i++) 
		{
			if(n%i==0) 
			{
			return false;
			}
		}
	return true;
	}
	
	//METHOD TO FIND THE PRIME FACTORS OF GIVEN NUMBER AND PRINT IT...
	//ARGUMENT n NUMBER FOR WHICH to FIND THE PRIME FACTORS...
	static void primeFactors(int n) 
	{
		for (int i=2;i<=n;i++) 
		{
			int t=n%i;
				if(t==0) 
				{
					if(isPrime(i))
						System.out.println(i+ " ");
				}
		}
	}
	
	
	//USE STATIC VARIABLE FOR STORE THE VALUE start AND end TIME...
	static double start=0;
	static double stop=0;
	//METHOD TO PUT START TIME AND PRINT IT...
	static void startTime() 
	{
		start=System.currentTimeMillis();
		System.out.println("STARTED AT..."+start);
	}
	//METHOD TO PUT STOP TIME AND PRINT IT...
	static void stopTime() 
	{
		stop = System.currentTimeMillis();
		System.out.println("STOPPED AT..."+stop);
	}
	//METHOD TO CALCULATE ELAPESED TIME AND PRINT IT...
	static void elapsedTime() 
	{
		System.out.println("ELAPESED TIME IS..."+(stop-start)/1000);
	}
	
	
	//METHOD FOR 2D ARRAY..
	//METHOD FOR INTEGER ARRAY...
	public static int[][] arrayInt(int m,int n) 
	{
		int a[][]= new int[m][n];
		System.out.println();
		System.out.println("INTEGER ARRAY");
		for(int i=0;i<m;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	
	//METHOD FOR DOUBLE ARRAY...
	public static double[][] arrayDouble(int m,int n) 
	{
		double b[][]=new double[m][n];
		System.out.println();
		System.out.println("DOUBLE ARRAY");

		for(int i=0;i<m;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				b[i][j]=sc.nextDouble();
			}
		}
		return b;
	}
	
	//METHOD FOR BOOLEAN ARRAY...
	public static String[][] arrayBoolean(int m,int n) 
	{
		String c[][]=new String[m][n];
		System.out.println();
		System.out.println("BOOLEAN ARRAY");
		

		for (int i=0;i<m;i++) 
		{
			for (int j=0;j<n;j++) 
			{
				if(i==0&&j==0) 
				{
					c[i][j]=sc.nextLine();
					c[i][j]=sc.nextLine();
				}
				else 
				{
					c[i][j]=sc.nextLine();
				}
			}
		}
		return c;
	}
	
	//METHOD FOR DISPLAY THE ARRAY...
	public static void display(int[][] a,double[][] b,String[][] c,int m,int n) 
	{
		PrintWriter pw=new PrintWriter(System.out,true);
		//FOR PRINT INTEGER...
		System.out.println();
		pw.println("2D ARRAY INTEGER");

		for (int i=0;i<m;i++) 
		{
			for (int j=0;j<n;j++) 
			{
				pw.print("\t"+a[i][j]+" ");
			}
			pw.println("\t");
		}
		
		//FOR PRINT DOUBLE...
		System.out.println();
		pw.println("2D ARRAY DOUBLE");

		for (int i=0;i<m;i++) 
		{
			for (int j=0;j<n;j++) 
			{
				pw.print("\t"+b[i][j]+" ");
			}
			pw.println("\t");
		}
		
		//FOR PRINT BOOLEAN...
		System.out.println();
		pw.println("2D ARRAY BOOLEAN");

		for (int i=0;i<m;i++) 
		{
			for (int j=0;j<n;j++) 
			{
				pw.print("\t"+c[i][j]+" ");
			}
			pw.println("\t");
		}
	}
	
	//GENERIC METHOD FOR DISPLAYING 2D ARRAY...
	<t>void displayArray(t[][] arr) 
	{
		PrintWriter pw=new PrintWriter(System.out);
		//DISPLAY INTEGER...
		System.out.println();
		for (int i=0;i<arr.length; i++) 
		{
			for (int j=0;j<arr[i].length;j++) 
			{
				pw.print("\t"+arr[i][j]+" ");
			}
			pw.println("\t");
		}
	}
	
	
	//METHOD FOR CHECKING YEAR IS LEAP OR NOT...
	public static void isLeapOrNot(int year) 
	{
		if(String.valueOf(year).length()==4)
		{	
			if((year%4==0 && year%100!=0 )||(year%400==0)) 
			{  
				System.out.println(year+ " IS LEAP YEAR..."); 
			}
			else 
			{
				System.out.println(year+ " IS NOT A LEAP YEAR..."); 
			}
		}
		else 
		{
			System.out.println("PLEASE ENTER 4 DIGIT YEAR ONLY...");  
		}
	}
	
	
	//METHOD TO FIND THE ROOTS OF EQUATION AND PRINT IT...
	static void roots(int a,int b,int c) 
	{
		//CALCULATING DELTA VALUE...
		int delta=Math.abs(b*b-4*a*c);
		double x=(-b+Math.sqrt(delta))/(2*a);
		double y=(-b-Math.sqrt(delta))/(2*a);
		System.out.println("VALUE OF x IS... "+x);
		System.out.println("VALUE OF y IS... "+y);
	}
	
	
	//METHOD TO CALCULATE WINDCHILL...
	//ARGUMENT f IS THE double VALUR OF TEMPRATURE IN FAHREINHEIT...
	//ARGUMENT ws IS THE double VALUE OF WINDSPEED IN MILE PER HOUR...
	static void windChill(double f,double ws) 
	{
		double w=35.74+0.62158*f+(0.4275*f-35.75)*Math.pow(ws,0.16);
		System.out.println(w);
	}
}
