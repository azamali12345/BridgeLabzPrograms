package org.bridgelabz.algorithmProgram;
public class Palindrome 
{
	public static void main(String args[]) 
	{
		int num=Utility.getInt();
		System.out.println("PRIME AND ANAGRAM AND PALINDROME NUMBER UPTO..."+num);
		for(int i=2;i<=num;i++)
		{
			if(Utility.isprime(i) && Utility.isNumberAnagram(i) && Utility.isNumberPalindrome(i))

			{
				System.out.println(i+" ");

			}
		}
	}
}