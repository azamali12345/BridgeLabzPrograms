package org.bridgelabz.dataStructure;
import java.io.FileReader;
import java.io.IOException;
public class UnorderedList 
{
	public static void main(String args[]) throws IOException 
	{
		{ 
			FileReader fr=null ;
			String s="";
			System.out.println("FILE ARRAY...");  
			try
			{	
				fr=new FileReader("/home/admin1/Desktop/TextFile/Unordered.txt");
				int j;
				while((j=fr.read())!=-1)
				{   
					System.out.print((char)j);
					s=s+(char)j;
				}
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
				fr.close();  
			}
			System.out.println("ENTR THE WORD YOU WANT TO SEACH...");
			String word=Utility.getString();
			LinkedList1.unorderedList(word, s);
		}
	}
}

