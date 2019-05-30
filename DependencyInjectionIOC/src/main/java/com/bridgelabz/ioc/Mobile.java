package com.bridgelabz.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile 
{
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("Config Loaded...");
		Sim sim=context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
	}
}
