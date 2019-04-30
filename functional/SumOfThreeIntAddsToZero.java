package org.bridgelabz.functional;
import java.util.Random;
import java.util.Scanner;
public class SumOfThreeIntAddsToZero 
{
	//MAIN METHOD...
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		System.out.println("ENTER ARRAY SIZE...");
		int n=sc.nextInt();
		int arr[]=new int[n];
		String str[]=new String[n*n];
		System.out.println("ENTER THE ARRAY EMENETS...");
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		int triplets=0,l=0;
		for(int i=0;i<n-2;i++) 
		{
			for(int j=i+1;j<n-1;j++) 
			{
				for(int k=j+1;k<n;k++) 
				{
					if(arr[i]+arr[j]+arr[k]==0) 
					{
						triplets++;
						str[l++]=arr[i]+" "+arr[j]+" "+arr[k];
					}
				}
			}
		}
		
		System.out.println("THE NUMBER OF TRIPLETS ARE..."+triplets);
			
		System.out.println("PRINTING THE TRIPLETS...");
			
		for(int i=0;i<str.length;i++) 
		{
			if(str[i]!=null)
				System.out.println(str[i]);
		}
	}
}
