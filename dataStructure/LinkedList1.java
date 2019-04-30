package org.bridgelabz.dataStructure;
import java.io.IOException;
public class LinkedList1 
{
	public static void unorderedList(String word,String s) throws IOException
	{
		String wordArray[]=s.split(" ");
		SinglyLinkedList<String> wordList=new SinglyLinkedList<String>();
		for (int i=0;i<wordArray.length;i++) 
		{
			wordList.add(wordArray[i]);
		}
		wordList.display();
		if(wordList.search2(word)) 
		{
			System.out.println("THIS WORD IS ALREADY IN THE LIST SO REMOVE IT...");
			int index=wordList.getIndex(word);
			wordList.remove(index);
			wordList.display();

		} 
		else 
		{
			System.out.println("THIS WORD IS NOT IN THE LIST SO ADD IT...");
			wordList.add(word);
			wordList.display();
		}
	}
}

