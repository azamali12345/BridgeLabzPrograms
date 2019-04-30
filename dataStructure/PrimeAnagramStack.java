package org.bridgelabz.dataStructure;
import java.util.ArrayList;
public class PrimeAnagramStack 
{
	static String array[][]=new String[168][168];
	public static void main(String args[]) 
	{
		System.out.println("PRIME NUMBERS ARE...");
		StackLink sl=new StackLink();
		ArrayList<Integer> primenum=Utility.primeRange(1000);
		Integer arr[]=new Integer[primenum.size()];

		//ARRAYLIST TO ARRAY CONVERSION...
		for(int i=0;i<primenum.size();i++)
		{
			arr[i]=primenum.get(i).intValue();
		}
		for (Integer x:arr)
		{
			System.out.print(x+" ");
		}
		int count=0;
		System.out.println("\n");
		System.out.println("ANAGRAMNUMBERS ARE...");
		for(int i=0;i<=arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++) 
			{
				String str1=arr[i].toString();
				String str2=arr[j].toString();
				boolean status = Utility.isAnagram(str1, str2);
				if(status)
				{
					array[i][j]=arr[j]+" "+arr[i] ;
					sl.push(array[i][j]);
					count++;
				}
			}
		}
		while(count>0) 
		{
			System.out.println(sl.pop());
			count--;
		}
	}
}
