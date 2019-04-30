package org.bridgelabz.dataStructure;
public class PalindromeChecker 
{
	public static void main(String args[]) 
	{
		int Og=0;
		int Rev=0;
		QueueLink<Character> ql=new QueueLink<Character>();
		String InputString=Utility.getString();
		char word[]=new char[20];//FIRST ARRAY...
		char arr[]=new char[20];//SECOND ARRAY...
		String reverse="";//EMPTY REVERSE ARRAY...
		word=InputString.toCharArray();
		System.out.println("ORIGINAL WORD IS...");
		for (char item:word)
		{
			ql.enqueue(item);
			Og=ql.dequeue1();
			System.out.println(item);
		}
		//REVERSE THE STRING...
		for(int i=InputString.length()-1;i>=0;i--) 
		{
			reverse=reverse+InputString.charAt(i);
		}
		System.out.println("REVERESE ORDER OF WORD..."+InputString+" IS..." );
		arr=reverse.toCharArray();
		for(char item1:arr) 
		{
			ql.enqueue(item1);
			Rev=ql.dequeue1();
			//System.out.print(Reversed);
			System.out.println(item1);
		}
		//COMPARING BOTH VALUE OF STRING...
		if(Og==Rev) 
		{
			System.out.println("ENTERED STRING IS PALINDROME...");
		}
		else 
		{
			System.out.println("ENTERED STRING IS NOT PALINDROME...");
		}
	}
}
