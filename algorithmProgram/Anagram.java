//PROGRAM TO CHECK STRING ANAGRAM OR NOT...
package org.bridgelabz.algorithmProgram;
public class Anagram 
{
	public static void main(String args[]) 
	{
		System.out.println("ENTER FIRST STRING...");
		String str1=Utility.getString();
		System.out.println("ENTER SECOND STRING...");
		String str2=Utility.getString();

		char[] s1=str1.toCharArray();
		char[] s2=str2.toCharArray();
		if(Utility.isAnagram(s1,s2))
		{
			System.out.println("TWO STRING ARE ANAGRAM...");
		}
		else
		{
			System.out.println("TWO STRING ARE NOT ANAGRAM...");
		}
	}
}
