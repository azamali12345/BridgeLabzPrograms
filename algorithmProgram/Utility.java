package org.bridgelabz.algorithmProgram;
import java.util.*;
public class Utility 
{
	static Scanner sc=new Scanner(System.in);
	
	//METHOD FOR INPUT STRING...
	public static String getString() 
	{
		System.out.println("ENTER STRING...");
		String s=sc.nextLine();
		return s;
	}

	//METHOD FOR INPUT INTEGER...
	public static int getInt() 
	{
		System.out.println("ENTER INTEGER VALUE...");
		int number=sc.nextInt();
		return number;
	}

	//METHOD FOR INPUT DOUBLE...
	public static double getDouble() 
	{
		System.out.println("ENTER DOUBLE VALUE...");
		double number=sc.nextDouble();
		return number;
	}
	
	//METHOD FOR BINARY SEARCH FOR INTEGER...
	public static void binarySearchInteger(int arr[],int first,int last,int key)
	{  
		int mid=(first+last)/2;  
		while(first<=last)
		{  
			if(arr[mid]<key)
			{  
				first=mid+1;     
		    }
			else if(arr[mid]==key)
			{  
		        System.out.println("ELEMENT IS FOUND AT INDEX..."+mid);  
		        break;  
		    }
			else
			{  
		        last=mid-1;  
		    }  
		    mid=(first+last)/2;  
		}  
		if(first>last)
		{  
			System.out.println("ELEMENT IS NOT FOUND!!!");  
		}  
	}  
	
	//METHOD FOR BINARY SEARCH FOR STRING...
	static int binarySearchString(String arr[],String x) 
    { 
        int left=0,right=arr.length-1; 
        while(left<=right) 
        { 
            int mid=left+(right-left)/2; 
            int res=x.compareTo(arr[mid]); 
            //CHECK IF x IS PRESENT AT MID...
            if(res==0) 
                return mid; 
            //IF x GREATER, IGNORE LEFT HALF...
            if(res>0) 
                left=mid+1; 
            //IF x IS SMALLER, IGNORE RIGHT HALF...
            else
                right=mid-1; 
        } 
        return -1; 
    } 
	
	//METHOD FOR INSERTION SORT FOR INTEGER...
	public static void insertionSortInteger(int arr[])
	{
		int len=arr.length;
        int i,j,temp;
        for(i=1;i<len;i++) 
        {
            j=i;
            temp=arr[i];    
            while(j>0&&temp<arr[j-1])
            {
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;            
        }        
    }
	
	//METHOD FOR INSERTION SORT FOR STRING...
	public static String[] insertionSortString(String arr[],int f)
	{
		String temp="";
		for(int i=0;i<f;i++)
		{
			for(int j=i+1;j<f;j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	//METHOD FOR BUBBLE SORT FOR INTEGER...
	static void bubbleSortInteger(int arr[]) 
	{  
        int n=arr.length;  
        int temp = 0;  
        for(int i=0;i<n;i++)
        {  
        	for(int j=1;j<(n-i);j++)
        	{  
        		if(arr[j-1]>arr[j])
        		{  
        			//SWAPING ELEMENTS... 
                    temp=arr[j-1];  
                    arr[j-1]=arr[j];  
                    arr[j]=temp;  
                }  
             }  
         }
	}
	
	//METHOD FOR BUBBLE SORT FOR STRING...
	static void bubbleSortString(String arr[]) 
    {
    	String temp;
    	for(int i=0;i<arr.length;i++) 
    	{
    		for(int j=0;j<arr.length-1-i;j++) 
    		{
    			if(arr[j].compareTo(arr[j+1])>0) 
    			{
    				//SWAPPING ELEMENTS...
    				temp=arr[j];
    				arr[j]=arr[j+1];
    		        arr[j+1]=temp;
    		    }
    		 }
    	}
    } 
	
	//METHOD FOR CHECK PRIME NUMBER OR NOT...
	public static boolean isprime(int number)
	{
		int count=0;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				count ++;
			}
		}
		if(count>0)
		{
			return false;
		}
		return true;
	}
	
	//METHOD FOR PRIME NUMBER WITHIN RANGE...
	public static void primeNumInRange(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(isprime(i))
			{
				System.out.println(i+" ");
			}
		}

	}
	
	//METHOD FOR STRING IS ANAGRAM OR NOT...
	public static boolean isAnagram(char s1[],char s2[])
	{
		int String1length=s1.length;
		int String2length=s2.length;
		if(String1length!=String2length)
		{
			return false;
		}
		Arrays.sort(s1);
		Arrays.sort(s2);
		for(int i=0;i<String1length;i++)
		{
			if(s1[i]!=s2[i])
			{
				return false;
			}
		}
		return true;
	}
	
	//METHOD FOR IS NUMBER PALINDROME OR NOT...
	public static boolean isNumberPalindrome(int number)
	{
		int r=0,rev=0;
		int tempnumber=number;
		while(number!=0)
		{
			r=number%10;
			rev=rev*10+r;
			number=number/10;
		}
		if(tempnumber!=rev)
		{
			return true;
		}

		return false;
	}
	
	//METHOD FOR NUMBER IS ANAGRAM OR NOT...
	public static boolean isNumberAnagram(int number)
	{
		if(isNumberPalindrome(number))
		{
			return true;
		}
		return false;
	}

	
	//CONVERT DECIMAL TO BINARY decToBin() METHOD...
	static int bin[]={128,64,32,16,8,4,2,1};
	public static String decToBin(int n) 
	{
		String res="";
		for(int i=0;i<8;i++)
		{
			int t=n%2;
			res=t+res;
			n=n/2;
		}
		return res;
	}
	
	//SWAPING THROUGH swapNibbles() METHOD...
	public static String swapNibbles(String str) 
	{
		String res="";
		for(int i=str.length()/2;i<str.length();i++) 
		{
			res=res+str.charAt(i);
		}
		for(int i=0;i<str.length()/2;i++) 
		{
			res=res+str.charAt(i);
		}
		return res;
	}/* From this method we take the input from the user using
	 *  Double datatype and @return Double*/
	
	//CONVERT BINARY TO DECIMAL binToDec() METHOD...
	public static int binToDec(String str) 
	{
		int res=0;
		for(int i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
			if(ch=='1')
				res=res+(bin[i]);
		}
		return res;
	}
	
	
	//METHOD TO CALCULATE DAY OF THE WEEK AND RETURN...
	static String str[]={"Sunday","Monday","tuesday","Wednesday","Thursday","Friday","Saturday"};
	//static String str[]={"0","1","2","3","4","5","6"};
	static String dayOfWeek(int d, int m, int y) 
	{

		int y0=y-(14-m)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=m+12*((14-m)/12)-2;
		int d0=(d+x+(31*m0)/12)%7;
		return str[d0];
	}
	
	
	//METHOD TO FIND DECIMAL TO BINARY...
    public static String toBinary(int n)
    {
        String res=""+2;
        while(n!=0)
        {
            int t=n%2;
            n=n/2;
            res=t+res;
        }
    return res;
	}
	
	
	//METHOD TO CALCULATE MONTHLY PAYMENT p(PRINCIPAL), r(RATE), y(YEAR)... 
    public static double payment(double P,int Y, double R)
	{
		double n=12*Y;
		double r=R/(12*100);
		double paymentden=1-Math.pow(1+r, -n);
		double payment=(P*R)/paymentden;
		return payment;	
	}
	
	
	//METHOD TO CALCULATE SQUARE ROOT...
	static double sqrt(double c) 
	{
		double t=c;
		double epsilon=1e-15;
		while(Math.abs(t-c/t)>epsilon*t) 
		{
			t=(c/t+t)/2;
		}
		return t;
	}
	
	
	//METHOD TO COVERT TEMPRATURE IN FAHRENHEIT TO CELSIUS...
	static int temperaturConversion(int temp,char t) 
	{
		int convert;
		if (t=='c' || t=='C') 
		{
			convert=(temp*9/5)+32;
		} 
		else if(t=='f' || t=='F') 
		{
			convert=(temp-32)*5/9;
		} 
		else 
		{
			System.out.println("ENTER CORRECT INPUT...");
			return 0;
		}
		return convert;
	}
	
	//METHOD TO FIND GUESS NUMBER...
	//static Scanner sc=new Scanner(System.in);
	public static void find(int low,int up)
	{
		//DISPLAYING THE VALUE...
		if(low==up)
		{
			System.out.println("YOUR NUMBERIS : "+low);
			System.out.println("INTERMEDEDIARY IS "+(low-1)+" & "+(low+1));
			return;
		}
		//FINDING MIDDLE VALUE BETWEEN RANGE LOW AND UP...
		int mid=(low+up)/2;
		int ch;
		System.out.println("Press 1 : "+low+" - "+mid);
		System.out.println("Press 2 : "+(mid+1)+" - "+up);
		ch=sc.nextInt();
		//NUMBER IS IN FIRST HALF...
		if(ch==1)
		{
			find(low,mid);
		}
		//NUMBER IS IN SECOND HALF...
		else
		{
			find(mid+1,up);
		}
	}
	
	//METHOD OF FIND VENDING MACHINE NOTES...
	static int mNote;
	static void calculateMinNoNote(int amount)
	{
		if(amount==0)
		{
			return;
		}
		//CALCULATE 2000 RS NOTES...
		if(amount>=2000)
		{
			mNote+=((int)amount/2000);
			System.out.println("2000 RUPEES NOTES IS: "+((int)amount/2000));
			if(amount/2000==0)
				return;
			else
				calculateMinNoNote(amount%2000);
		}
		//CALCULATE 1000 RS NOTES...
		else if(amount>=1000)
		{
			mNote+=((int)amount/1000);
			System.out.println("1000 RUPEES NOTES IS: "+((int)amount/1000));
			if(amount/1000==0)
				return;
			else
				calculateMinNoNote(amount%1000);
		}
		//CALCULATE 500 RS NOTES...		
		else if(amount>=500)
		{
			mNote+=((int)amount/500);
			System.out.println("500 RUPEES NOTES IS: "+((int)amount/500));
			if(amount/500==0)
				return;
			else
				calculateMinNoNote(amount%500);
		}
		//CALCULATE 200 RS NOTES...
		else if(amount>=200)
		{
			mNote+=((int)amount/200);
			System.out.println("200 RUPEES NOTES IS: "+((int)amount/200));
			if(amount/200==0)
				return;
			else
				calculateMinNoNote(amount%200);
		}
		//CALCULATE 100 RS NOTES...
		else if(amount>=100)
		{
			mNote+=((int)amount/100);
			System.out.println("100 RUPEES NOTES IS: "+((int)amount/100));
			if(amount/100==0)
				return;
			else
				calculateMinNoNote(amount%100);
		}
		//CALCULATE 50 RS NOTES...
		else if(amount>=50)
		{
			mNote+=((int)amount/50);
			System.out.println("50 RUPEES NOTES IS: "+((int)amount/50));
			if(amount/50==0)
				return;
			else
				calculateMinNoNote(amount%50);
		}
		//CALCULATE 20 RS NOTES...
		else if(amount>=20)
		{
			mNote+=((int)amount/20);
			System.out.println("20 RUPEES NOTES IS: "+((int)amount/20));
			if(amount/20==0)
				return;
			else
				calculateMinNoNote(amount%20);
		}
		//CALCULATE 10 RS NOTES...
		else if(amount>=10)
		{
			mNote+=((int)amount/10);
			System.out.println("10 RUPEES NOTES IS: "+((int)amount/10));
			if(amount/10==0)
				return;
			else
				calculateMinNoNote(amount%10);
		}
		//CALCULATE 5 RS NOTES...
		else if(amount>=5)
		{
			mNote+=((int)amount/5);
			System.out.println("5 RUPEES NOTES IS: "+((int)amount/5));
			if(amount/5==0)
				return;
			else
				calculateMinNoNote(amount%5);
		}
		//CALCULATE 2 RS NOTES...
		else if(amount>=2)
		{
			mNote+=((int)amount/2);
			System.out.println("2 RUPEES NOTES IS: "+((int)amount/2));
			if(amount/2==0)
				return;
			else
				calculateMinNoNote(amount%2);
		}
		//CALCULATE 1 RS NOTES...
		else if(amount>=1)
		{
			mNote+=((int)amount/1);
			System.out.println("1 RUPEES NOTES IS: "+((int)amount/1));
			if(amount/1==0)
				return;
			else
				calculateMinNoNote(amount%1);
		}
	}

}
