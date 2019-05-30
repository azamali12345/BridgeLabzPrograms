package com.bridgelabz.constructor;
public class Student 
{
	private int id;
	private String studentName;
	public Student(int id) 
	{
		this.id = id;
	}
	public Student(int id, String studentName)
	{
		this.id = id;
		this.studentName = studentName;
	}
	public void displayStudentInfo()
	{
		System.out.println("Student Name Is... "+studentName+" Student ID is... "+id);
	}
}
