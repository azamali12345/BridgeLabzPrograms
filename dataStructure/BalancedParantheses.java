package org.bridgelabz.dataStructure;
import java.util.Scanner;
public class BalancedParantheses 
{
	//MAIN METHOD...
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE EXPRESSION...");
		char ch[]=sc.next().toCharArray();           
		if(StackMethod.isParBalanced(ch)) 
			System.out.println("EXPRESSION IS BALANCED..."); 
		else
			System.out.println("EXPRESSION IS NOT BALANCED...");   
	}
}
