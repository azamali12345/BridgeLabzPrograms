//PERCENTAGE OF HEAD AND TAIL PROGRAM...
package org.bridgelabz.functional;
import java.util.Scanner;
public class FlipCoin 
{
	//MAIN METHOD...
	public static void main(String args[]) 
	{
		System.out.println("ENTER NO...");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int hCount=0,tCount=0;
		for(int i=0;i<no;i++)
		{
			double res=Math.random();
			if(res<0.5)
				tCount++;
			else
				hCount++;
		}
		double hPer=(double)hCount/(double)no;
		double tPer=(double)tCount/(double)no;
		System.out.println("PERCENTAGE OF HEAD IS..."+Math.round(hPer*100));
		System.out.println("PERCENTAGE OF TAIL IS..."+Math.round(tPer*100));
	}
}
