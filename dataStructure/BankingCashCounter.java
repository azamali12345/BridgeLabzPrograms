package org.bridgelabz.dataStructure;
public class BankingCashCounter 
{
	static QueueLink Queue=new QueueLink();
	public static  int Start=0;
	public static int End=0;
	public static int BankBal=50000;
	public static int size=0;

	//METHOD FOR DEPOSTE MONEY...
	public static void deposit(int amount)
	{
		BankBal+=amount;
  	}

	//METHOD FOR WITHDRWA MONEY...
	public static void withdraw(int amount) 
	{
		if(amount<BankBal)
		{
			BankBal-=amount;
		}
		else
		{
			System.out.println("SORRY...INSUFFICIENT AMOUNT...");
		}
	}
	
	//METHOD FOR ASKING OPTION...
	public static  void option()
	{
		if(End<Start)
		{
			System.out.println("QUEUE IS EMPTY...");
		}
		else
		{
			System.out.println("ENTER 1... FOR DEPOSITE...");
			System.out.println("ENTER 2... FOR WITHDRAW...");
			int Transcation=Utility.getInt();//TAKE INPUT FROM USER...
			if(Transcation==1) 
			{
				System.out.println("ENTER THE AMOUNT TO BE DEPOSITED...");
				int amount=Utility.getInt();
				deposit(amount);//CALLING DEPOSITE METHOD...

			} 
			else if(Transcation==2)
			{
				System.out.println("ENTER THE AMOUNT TO BE WITHDRAW...");
				int amount=Utility.getInt();
				withdraw(amount);//CALLING WITHDRWAL METHOD...
			}
			Start++;
		}
	}
	
	//METHOD FOR PRINT BANK BALANCE...
	public static void print() 
	{
		System.out.println("BANK BALANCE IS..."+BankBal);
	}
	
	//METHOD FOR FIND QUEUE SIZE...
	public static void length() 
	{
		System.out.println("SIZE OF QUEUE IS..."+(End-Start));
	}
	
	//METHOD FOR ADDING PERSON IN QUEUE...
	public static int enterInQueue(int range)
	{
		End=End+range;
		System.out.println("PERSON ADDED IN QUEUE ARE..."+range);
		return range;
	}
	
	//MAIN METHOD...
	public static void main(String args[]) 
	{
		int choice=0;
		int choice2=0;
		int choice3=0;
		System.out.println();
		System.out.println("-----------BANKING CASH COUNTER-----------");
		System.out.println("1.FOR ADDING THE PERSONS IN THE BANK Queue...");
		System.out.println("4.EXIT...");
		System.out.println();
		System.out.println("ENTER YOUR CHOICE...");
		choice =Utility.getInt();
		while(choice<=5 || choice<=0)
		{
			if(choice==1)
			{
				System.out.println("ENTER THE PERSONS TO BE ADDED TO QUEUE...");
				int person=enterInQueue(Utility.getInt());
				Queue.enqueue(person);
				print();
				for(int i=1;i<=person;i++)//LOOP FOR PERSONS ENTERED INTO QUEUE...
				{
					System.out.println("TRANSACTION FOR..."+i+"PERSON...");
					System.out.println("2.FOR PERFORMING TRANSACTION WITHDRAW/DEPOSITE...");
					System.out.println("3.FOR CHECKING NUMBER OF PEOPLE IN THE QUEUE...");
					print();
					choice2=Utility.getInt();
					if(choice2==2)
					{
						option();
						print();
					}
					else if(choice2==3)
					{
						Queue.dequeue();
						length();
						break;
					}
				}
			}
			else if(choice==4)
			{
				System.out.println("YOU HAVE BEEN REMOVED FROM THE QUEUE...");
				break;
			}
		}
	}
}
