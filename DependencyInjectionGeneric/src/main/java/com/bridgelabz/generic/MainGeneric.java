package com.bridgelabz.generic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainGeneric 
{
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Question que=context.getBean("que",Question.class);
		que.diplayInfo();
	}
}