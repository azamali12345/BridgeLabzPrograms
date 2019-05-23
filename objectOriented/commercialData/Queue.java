package org.bridgeLabz.objectOriented.commercialData;
/**
 * 
 * @author Azam Ali
 *
 */
public class Queue<T> 
{
	QueueList<T> ls=new QueueList<T>();
	private Object arr[] ;         
	private int front;        
	public int rear;        
	public static int capacity;      
	private int count;        
	public Queue(int size )
	{
		arr =new Object[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	} 
	public static class Node<T>
	{
		T data;
		T next;
		Node(T d)
		{
			data=d;
			next=null;
		}
	}
	public int size()
	{
		return count;
	}
	public Boolean isEmpty()
	{
		return (size() == 0);
	}
	public Boolean isFull()
	{
		return (size() == capacity);
	}
	public void dequeue()
	{
		if (isEmpty())
		{
			System.out.println("UNDER FLOW\nPROGRAM TERMINATED...");
			System.exit(1);
		}
		else
		{
		System.out.println("REMOVING..." + arr[front]);
		front = (front + 1) % capacity;
		count--;
		}
	}
	public void enqueue(T new_data)
	{
		if (isFull())
		{
			System.out.println("OVER FLOW\nPROGRAM TERMINATED...");
			System.exit(1);
		}
		rear = (rear + 1) % capacity;
		arr[rear] =new_data;
		count++;
	}
	public void push(T new_data)
	{
		Node<T> new_node=new Node<T>(new_data);
		if (isFull())
		{
			System.out.println("OVER FLOW\nPROGRAM TERMINATED...");
			System.exit(1);
		}
		rear = (rear + 1) % capacity;
		arr[rear] =ls.last(new_data);
		count++;
	}
	public void pop()
	{
		if (isEmpty())
		{
			System.out.println("UNDERV FLOW\nPROGRAM TERMINATED...");
			System.exit(1);
		}
		else
		{
		System.out.println("Removing " + arr[front]);
		front = (front + 1) % capacity;
		count--;
		}
	}
}
