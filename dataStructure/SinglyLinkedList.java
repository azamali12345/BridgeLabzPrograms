package org.bridgelabz.dataStructure;
public class SinglyLinkedList<T> 
{
	class Node
	{
		String data;
		Node next;
		Node(String data)
		{
			this.data=data;
		}
	}
	
	Node head;
	
	//MEATHOD FOR ADD NEW NODE IN LINKED LIST...
	public boolean add(String data)
	{
		Node n=new Node(data);
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
		while(temp.next!=null) 
		{
			temp=temp.next;
		}
		temp.next=n;
		return true;
	}

	//DISPLAYING THE DATA OF LINKED LIST...
	public void display()
	{
		Node node = head;
		String res="";
		while(node!=null)
		{
			res=res+node.data+" ";
			node=node.next;
		}
		System.out.println(res);
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

	//METHOD FOR REMOVE ELEMENTS
	public String remove(int pos) 
	{
		Node temp,temp1;
		temp=head;
		if(head==null) 
		{
			System.out.println("NO ELEMENT IS THERE...");
			return null;
		} 
		else 
		{
			if(pos==1)
			{
				head=temp.next;
				return temp.data;
			}
			else
				while(temp.next.next!=null && pos>1) 
				{
					pos--;
					temp=temp.next;
				}
			temp1=temp.next;
			temp.next=temp1.next;
		}
		return temp1.data;
	}
	
	//METHOD FOR CONVERT LINKED LIST TO STRING ARRAY...
	public String[] toArray() 
	{
		Node temp;
		temp=head;
		String obj[]=new String[size()];
		int i=0;
		while(temp!=null) 
		{
			obj[i]=temp.data;
			temp=temp.next;
			i++;
		}
		return obj;
	}

	//METHOD FOR SORT THE LINKED LIST IN ASSENDING ORDER BASED ON DATA...
	public void sort()
	{
		Node temp;
		temp=head;
		int p=size();
		while(p>0) 
		{
			temp=head;
			while(temp.next!=null)
			{
				if((temp.data).compareTo(temp.next.data) > 0) 
				{
					String t=temp.data;
					temp.data=temp.next.data;
					temp.next.data=t;
				}
				temp=temp.next;
			}
			p--;
		}
	}

	//METHOD FOR CHECKING LINKED LIST IS EMPTY OR NOT...
	public boolean isEmpty() 
	{
		if(head == null)
			return true;
		else
			return false;
	}

	//METHOD FOR SEARCHING ITEM IS THERE OR NOT IN LINKED LIST...
	public int search(T data) 
	{
		Node temp;
		temp=head;
		int pos=1;
		if(head==null) 
		{
			System.out.println("NO ELEMENT IS THERE...");
			return 0;
		} 
		else 
		{
			while ((temp.next != null) && (!temp.data.equals(data))) 
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
	public boolean search2(T pos2)
	{
		int indexPos=search(pos2);
		if(indexPos>0)
			return true;
		else
			return false;
	}
	
	//METHOD FOR TAKING INDEX POSITION...
	public int getIndex(T data) 
	{
		Node temp=head;
		for(int i=0;i<size();i++) 
		{
			if(temp.data.equals(data)) 
			{
				return i ;
			}
			temp=temp.next;
		}
		return -1;
	}
}

