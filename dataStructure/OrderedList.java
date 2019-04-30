package org.bridgelabz.dataStructure;
import java.io.FileReader;
import java.io.IOException;
public class OrderedList 
{
	public static void main(String args[]) throws IOException 
	{
		{ 
			FileReader fr=null ;
			String s="";
			System.out.println("FILE ARRAY...");  
			try
			{	
				fr=new FileReader("/home/admin1/Desktop/TextFile/Ordered.txt");
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
			String num=Utility.getString();
			LinkedListInt.orderedList(num, s);
		}
	}
}
