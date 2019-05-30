package com.bridgelabz.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args) {  
	    ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");  
	    A a=context.getBean("a",A.class);  
	    a.display();  
	}  
}
