package org.bridgelabz.functional;
import java.util.Scanner;
public class Gambler 
{
	public static void main(String args[]) 
	{	
		//INPUT $stake,$goal AND no OF TIMES TO GAMBLE...
		Scanner sc=new Scanner(System.in);
		int no,$stake,$goal;
		System.out.println("ENTER STAKE AMOUNT...");
		$stake=sc.nextInt();
		System.out.println("ENTER GOAL AMOUNT...");
		$goal=sc.nextInt();
		System.out.println("ENTER NUMBER OF TIMES TO GAMBLE...");
		no=sc.nextInt();
		game(no,$stake,$goal);
	}
	static void game(int noOfTimes,int $Stakes,int $Goals) 
	{
		int bets=0;
		int wins=0;
		for (int i=0;i<noOfTimes;i++) 
		{
			int cash=$Stakes;
			while(cash>0 && cash<$Goals) 
			{
				bets++;
				if(Math.random()<0.5)
					cash++;//WIN $1...
				else
					cash--;//LOSE $1...
			}
			if(cash==$Goals)
				wins++;//TO FIND NUMBERS OF WINS...
		}
		System.out.println();
		System.out.println(wins+" WINS OUT OF "+noOfTimes);
		System.out.println("PERCENTAGE OF GAME WON = "+100.0*wins/noOfTimes);
		System.out.println("PERCENTAGE OF GAME LOSE = "+100.0*(noOfTimes-wins)/noOfTimes);
	}

}
