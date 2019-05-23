package org.bridgeLabz.objectOriented;
/**
 * 
 * @author Azam Ali
 *
 */
public class DeckOfCard 
{
	public static void main(String args[]) 
	{
		String suit[]= {"clubs","diamonds","hearts","spades"};
		String rank[]= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		int number=suit.length*rank.length;
		String card[]=new String[number];
		for(int i=0;i<suit.length;i++)
		{
			for(int j=0;j<rank.length;j++)
			card[rank.length*i+j]=rank[j]+""+suit[i];
		}
		
		for(int i=0;i<card.length-1;i++)
		{
			int random=(int) (Math.random()*card.length);
			
			for(int j=0;j<card.length;j++)
			{
				card[i]=card[j];
				card[j]=card[random];
				card[random]=card[i];
			}
		}
		
		int k=0;
		String string[]=new String[9];
		String dis[]=new String[4];
		for(int i=1;i<=4;i++)
		{
			System.out.print("PLAYER..."+(i)+":");
			for(int j=0;j<9;j++)
			{
				string[j]=card[k];
				System.out.print(" "+card[k]+""+" ");
				k++;
			}
			
			System.out.println(); 
		}
		
	}

}