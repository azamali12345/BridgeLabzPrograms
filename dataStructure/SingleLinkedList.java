package org.bridgelabz.dataStructure;
class Node<T>
{
	T data;
	Node next;
}
//IT IS GENERIC TYPE...
public class SingleLinkedList<T>
{
	Node head=null;
	
	//METHOD FOR PRINTING THE LIST...
	public void printlist() 
	{
		Node n=head;
		while(n.next!=null) 
		{
			System.out.print(n.data+" ");
			n=n.next;
			System.out.println("IN ENQUEUE METHOD...");
		}
		System.out.println(n.data+" ");
	}
	
	//METHOD FOR CHECKING LIST IS EMPTY OR NOT...
	public boolean isEmpty() 
	{
		if(head==null) 
		{
			return true;
		}
		return false ;
	}
	
	//METHOD FOR INSERT DATA AT LAST...
	public <T> void insertAtLast(T data)
	{
		Node node=new Node();
		node.data=data;
		if(head==null)
		{
			head=node;
			node.next=null;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			node.next=null;
			n.next=node;
		}
	}
	
	//METHOD FOR DELETE ELEMENT AT POSTION
	public <T> void delete(T element) 
	{
		Node n=head;
		Node prev=head;
		if(n.data.equals(element)) 
		{
			head=n.next;
			return;
		}
		while(n.next!=null) 
		{
			{
				if(element.equals(n.data)) 
				{
					prev.next=n.next;
					return;
				}
				prev=n;
				n=n.next;
			}
		}
		prev.next=null;
	}
	
	//METHOD FOR DELETE FIRST ELEMENT...
	public <T> T deletefirst() 
	{
		T item;
		Node n=head;
		head=n.next;
		item=(T) n.data;
		return item;
	}
	
	//METHOD FOR DELETE LAST ELEMENT...
	public <T>  T deleteAtlast() 
	{
		if(head==null) 
			return null;
		else 
		{
			Node n=head;
			Node prev=head;
			while(n.next!=null) 
			{
				prev=n;
				n=n.next;
			}

			T data=(T)n.data;
			prev.next=null;
			return data;
		}
	}
	
	//METHOD FOR SEARCH ELEMENT...
	public <T> boolean search(T element) 
	{
		Node n=head;
		while(n!=null) 
		{
			if(element.equals(n.data)) 
			{
				return true;
			}
			n=n.next; 
		}
		return false;
	}
	
	//METHOD FOR SORT THE LIST...
	public void sortList()
	{
		Node n=head;
		Node prev;
		prev=n.next;
		while(n.next!=null)
		{
			while(prev!=null)
			{
				int a=Integer.parseInt((String)n.data);
				int b=Integer.parseInt((String)prev.data);
				if (a>b) 
				{
					int t=a;
					n.data=String.valueOf(b);
					prev.data=String.valueOf(t);
				}
				prev=prev.next;
			}	
			n=n.next;
			prev=n.next;
		}
	}
	public <T> T getlast() 
	{
		Node temp=head;
		while(temp.next==null) 
		{
			temp=temp.next;
		}
		System.out.println(temp.data+"RETURNING...");
		return (T)temp.data;
	}
	public <T> T get() 
	{
		Node n=head;
		if(n.next==null) 
		{
			return (T)n.data;
		}
		head=n.next;
		return (T)n.data;

	}

	public boolean add(int data)
	{
		Node n=new Node();
		Node temp;
		if(head==null)
		{
			head=n;
			return true;
		}
		else
		{
			temp=head;
		}
		while (temp.next!=null) 
		{
			temp=temp.next;
		}
		temp.next=n;
		return true;

	}
	
	//METHOD FOR DISPLAYING
	public void display()
	{
		Node n=head;
		//	 
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);

	}
	
	//METHOD FOR LENGTH
	public int size()
	{
		Node temp;
		temp=head;
		int count=0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		return count;
	}
	
	//METHOD FOR FINDING ELEMENT...
	public int find(T data) 
	{
		Node temp;
		temp=head;
		int pos=1;
		if (head==null) 
		{
			System.out.println("NO ELEMENT IS THERE...");
			return 0;
		}
		else 
		{
			while ((temp.next!=null) && (!temp.data.equals(data))) 
			{
				temp=temp.next;
				pos++;
			}
			if (pos==size() && (!temp.data.equals(data)))
				return 0;
			else
				return pos;
		}
	}
}
