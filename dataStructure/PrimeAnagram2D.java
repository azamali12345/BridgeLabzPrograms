package org.bridgelabz.dataStructure;
import java.util.ArrayList;
public class PrimeAnagram2D 
{
	static Integer prime[][]= new Integer[13][13];
	static String array[][]=new String[168][168];
	static int count=0;

	public static void main(String args[]) 
	{
		System.out.println("RRIME NUMBERS ARE...");

		ArrayList<Integer> primenum=Utility.primeRange(1000);

		Integer arr[]=new Integer[primenum.size()];

		//ARRAY LIST TO ARRAY CONVERSION...
		for (int i=0;i<primenum.size();i++) 
		{
			arr[i]=primenum.get(i).intValue();
		}

		for (Integer x:arr) 
		{
			System.out.print(x+" ");
		}
		System.out.println("\n");
		System.out.println("ANAGRAM NUMBERS ARE...");

		for(int i=0;i<=arr.length;i++) 
		{
			for (int j=i+1;j<arr.length;j++) 
			{
				String str1=arr[i].toString();
				String str2=arr[j].toString();
				boolean status=Utility.isAnagram(str1,str2);
				if(status)
				{
					array[i][j]=arr[i]+"\t"+arr[j]+"\n";
					System.out.print(array[i][j]+" ");
				}
			}
		}
		System.out.println("\n");
		System.out.println("PRIME AND ANAGRAM NUMBERS IN 2D ARRAY...");
		System.out.println("\n");
		
		//ASSIGNING ELEMENTS FOR 1D ARRAY TO 2D ARRAY...
		for(int i=0;i<13;i++) 
		{
			for (int j=0;j<13;j++) 
			{
				int countA=count++;
				if(countA<168)
				{
					prime[i][j]=arr[countA];
				}
				else
				{
					break;
				}

				System.out.print(prime[i][j]+" ");
			}
			System.out.println();
		}
	}
}

