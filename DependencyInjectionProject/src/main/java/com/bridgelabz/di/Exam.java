package com.bridgelabz.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		  ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		  
		  Student azam=context.getBean("azam",Student.class);
		  azam.displayStudentInfo();
		  
		  Student ali=context.getBean("ali",Student.class);
		  ali.displayStudentInfo();
	}
}
