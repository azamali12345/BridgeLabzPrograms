package org.bridgelabz.dataStructure;
public class PrimeNum2DArray 
{
	static	int primeArray[][]=new int[10][25];
	public static void main(String args[])
	{
		System.out.println("PRIME NUMBERS IN 2D ARRAY...");
		System.out.println();
		int printArray[][]=display();

		for(int i=0;i<printArray.length;i++)
		{
			for(int j=0;j<printArray[0].length;j++)
			{  
				if(printArray[i][j]!=0) 
				{
				System.out.print(printArray[i][j]+"  ");
				}
			}
			System.out.println();
		}
	}
	static public int[][] display()
	{
		int first=0,second=0,third=0,four=0,five=0,six=0,seven=0,eight=0,nine=0,ten=0;
		for(int i=2;i<1000;i++)
		{
			//int prime=PrimeNo1D2D.prime(0);
			if(Utility.prime(i)==0)
			{
				if((i>0) && (i<100))
				{
					primeArray[0][first++]=i;

				}
				else if((i>100) && (i<200))
				{
					primeArray[1][second++]=i;
				}
				else if((i>200) && (i<300))
				{
					primeArray[2][third++]=i;
				}
				else if((i>300) && (i<400))
				{
					primeArray[3][four++]=i;
				}
				else if((i>400) && (i<500))
				{
					primeArray[4][five++]=i;
				}
				else if((i>500) && (i<600))
				{
					primeArray[5][six++]=i;
				}
				else if((i>600) && (i<700))
				{
					primeArray[6][seven++]=i;
				}
				else if((i>700) && (i<800))
				{
					primeArray[7][eight++]=i;
				}
				else if((i>800) && (i<900))
				{
					primeArray[8][nine++]=i;
				}
				else if((i>900) && (i<1000))
				{
					primeArray[9][ten++]=i;
				}
			}
		}
		return primeArray;
	}

}