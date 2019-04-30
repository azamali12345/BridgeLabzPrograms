package org.bridgelabz.dataStructure;
import java.io.IOException;
public class LinkedListInt 
{
	public static void orderedList(String num,String s) throws IOException 
	{
		String wordArray[]=s.split(" ");
		//System.out.println(wordArray);
		SinglyLinkedList<String> noList=new SinglyLinkedList<String>();
		for(int i=0;i<wordArray.length;i++) 
		{
			noList.add(wordArray[i]);
		}
		System.out.print("SORTED LIST OF NUMBERS...");
		//System.out.println("----------"+word);
		noList.sort();
		noList.display();
		if(noList.search2(num)) 
		{
			System.out.print("THIS WORD IS ALREADY IN THE LIST SO REMOVE IT...");
			int index=noList.getIndex(num);
			noList.remove(index);
			noList.display();
		} 
		else 
		{
			System.out.print("THIS WORD IS NOT IN THE LIST SO ADD IT...");
			noList.add(num);
			noList.display();
		}
	}
}

