package com.bridgelabz.generic;

import java.util.Iterator;
import java.util.List;

public class Question 
{
	private int id;
	private String name;
	private List<String>answers;
	public Question(int id, String name, List<String> answers) 
	{
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	public void diplayInfo()
	{
		System.out.println(id+"  "+name);
		System.out.println("Answers Are...");
		Iterator<String> itr=answers.iterator();
		while(itr.hasNext())
		{  
	        System.out.println(itr.next());  
	    }  
	}
}
