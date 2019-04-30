package org.bridgelabz.dataStructure;
public class QueueLink<T> 
{
	SingleLinkedList list=new SingleLinkedList();
	public void  enqueue(T element) 
	{
		list.insertAtLast(element);
	}
	public int dequeue() 
	{
		return(int)list.deletefirst();
	}
	public char dequeue1() 
	{
		return (char)list.deletefirst();
	}
	public String dequeu() 
	{
		return (String)list.deletefirst();
	}
	public void display() 
	{
		list.getlast();
	}
	public boolean isEmpty() 
	{
		return list.isEmpty();
	}
}
