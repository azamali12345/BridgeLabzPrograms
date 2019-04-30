package org.bridgelabz.dataStructure;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
public class IOFile 
{
	public String readFromFile(String fileName) 
	{
		BufferedReader br;
		String str;
		try
		{
			br=new BufferedReader(new FileReader(fileName));
			str=br.readLine();
			String temp;
			while((temp=br.readLine())!=null) 
			{
				str=str+" "+temp;
			}
			br.close();
			return str;
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return "None";
	}
	//METHOD TO WRITE DATA INTO GIVEN FILE...
	public void writeToFile(LinkedList<?> list,String fileName) 
	{
		BufferedWriter bw;
		try
		{
			bw=new BufferedWriter(new FileWriter(fileName));
			PrintWriter pw=new PrintWriter(bw);
			int i=0;
			int n=list.size();
			while(i<n) 
			{
				bw.write(list.pollFirst()+" ");
				i++;
			}
			pw.flush();//GAURRANTY TO LAST CHAR IS ADDED INTO FILE...   
			pw.close();
			bw.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	//SAVE THE DATA INTO FILE...
	public void appendToFile(LinkedList<?> list,String fileName) 
	{
		try
		{
			BufferedWriter bw=new BufferedWriter(new FileWriter(fileName,true));
			PrintWriter pw=new PrintWriter(bw);
			int i=0;
			int n=list.size();
			while(i<n) 
			{
				pw.append(list.pollFirst()+" ");
				i++;
			}
			pw.flush();
			pw.close();
			bw.close();
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
