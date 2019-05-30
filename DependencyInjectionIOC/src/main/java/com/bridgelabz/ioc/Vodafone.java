package com.bridgelabz.ioc;

public class Vodafone implements Sim
{
	@Override
	public void calling() 
	{
		System.out.println("Vodafone Sim Calling...");
	}
	@Override
	public void data() 
	{
		System.out.println("Vodafone Data Udes...");
	}
	
}
