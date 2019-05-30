package com.bridgelabz.autowiring;
public class A 
{  
	B b;  
	A()
	{
		System.out.println("A Class Constructor is created...");
	}  
	public B getB() 
	{  
		return b;  
	}  
	public void setB(B b) 
	{  
		this.b = b;  
	}  
	void print()
	{
		System.out.println("Hello A Class print()method...");
	}  
	void display()
	{  
		print();  
		b.print();  
	}  
}  
