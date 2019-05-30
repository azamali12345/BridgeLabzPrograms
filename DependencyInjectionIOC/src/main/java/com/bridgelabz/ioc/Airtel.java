package com.bridgelabz.ioc;
public class Airtel  implements Sim
{

	@Override
	public void calling() 
	{
		System.out.println("Airtel Sim Calling...");
	}
	@Override
	public void data() 
	{
		System.out.println("Airtel Data Used...");
	}

}
