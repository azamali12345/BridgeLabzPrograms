package org.bridgelabz.dataStructure;
public class StackLink<T> 
{
	static SingleLinkedList<Integer> list=new  SingleLinkedList<Integer>();
	public void push(T element) 
	{
		list.insertAtLast(element);
	}
	public T pop() 
	{
		T deleteAtlast=(T) list.deleteAtlast();
		return deleteAtlast;
	}
	public static char peek1() 
	{
		return (char)list.getlast();
	}
	public boolean isEmpty() 
	{
		return list.isEmpty();
	}
	public int size() 
	{
		return list.size();
	}
}
