package org.bridgelabz.algorithmProgram;
import java.util.Scanner;
public class SearchingSorting 
{
	//MAIN METHOD...
	public static void main(String args[])
	{  
		//THIS IS FOR INTEGER BINARY SEARCH...
		int arr[]={10,20,30,40,50};
		System.out.println("*****BINARY SEARCHING FOR INTEGER*****");
		for(int i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
		System.out.println();
		int key=30;  
		int last=arr.length-1;
		System.out.println("I WANT TO SEARCH 30 ELEMENT...WHAT IS POSTION OF 30...");
		Utility.binarySearchInteger(arr,0,last,key);
		System.out.println();
	    System.out.println();
		
		//THIS IS FOR STRING BINARY SEARCH...
	    String arr2[]={"Welcome","Azam","To","Bridge","Labz","In","Mumbai"}; 
	    System.out.println("*****BINARY SEARCH FOR STRING*****");
	    for(int i=0;i<arr2.length;i++)
	    {
	    	System.out.print(arr2[i]+" ");
	    }
	    System.out.println();
	    String x="Bridge";
	    System.out.println("I WANT TO SEARCH 'BRIDGE' ELEMENT...WHAT IS POSTION OF 'BRIDGE'...");
	    int result=Utility.binarySearchString(arr2,x); 
	    if (result==-1) 
	    {
	    	System.out.println("ELEMENT NOT PRESENT..."); 
	    }
	    else
	    {
	    	System.out.println("ELEMENT FOUND AT INDEX..."+result); 
	    }
	    System.out.println();
	    System.out.println();
	    
	    //THIS IS INSERSION SORT FOR INTEGER...
	    int arr3[]={25,65,35,5,15};
	    int n=arr3.length;
	    System.out.println("*****INSERTION SORT FOR INTEGER*****");
        System.out.println("-----BEFORE INSERTION SORT-----"); 
        for(int i=0;i<arr3.length;i++)
	    {
	    	System.out.print(arr3[i]+" ");
	    }
        System.out.println();
        System.out.println("-----AFTER INSERTION SORT-----"); 
	    Utility.insertionSortInteger(arr3);
	    for(int i=0;i<n;i++)
	    {
	    	System.out.print(arr3[i]+" ");
	    }
	    System.out.println();
	    System.out.println();
	    
	    //THIS IS INSERTION SORT FOR STRING...
	    String arr4[]={"Welcome","Azam","To","Bridge","Labz","In","Mumbai"};
	    System.out.println();
	    System.out.println("*****INSERTION SORT FOR STRING*****");
        System.out.println("-----BEFORE INSERTION SORT-----"); 
        for(int i=0;i<arr4.length;i++)
	    {
	    	System.out.print(arr4[i]+" ");
	    }
        System.out.println();
        System.out.println("-----AFTER INSERTION SORT-----"); 
	    String sortedArray[]=Utility.insertionSortString(arr4,arr4.length);
	    
	    for(int i=0;i<sortedArray.length;i++)
	    {
	    	System.out.print(sortedArray[i]+" ");
	    }
	    System.out.println();
	    System.out.println();
	    
	    //THIS IS BUBBLE SORT FOR INTEGER...
	    int arr5[]={66,55,22,99,77,33,11};
	    System.out.println();
	    System.out.println("*****BUBBLE SORT FOR INTEGER*****");
        System.out.println("-----BEFORE BUBBLE SORT-----");  
        for(int i=0;i<arr5.length;i++)
        {  
        	System.out.print(arr5[i]+" ");  
        }  
        System.out.println();
        Utility.bubbleSortInteger(arr5);  
        System.out.println("-----AFTER BUBBLE SORT-----");  
        for(int i=0;i<arr5.length;i++)
        {  
        	System.out.print(arr5[i]+" ");  
        }
        System.out.println();
        System.out.println();
        
        //THIS IS BUBBLE SORT FOR STRING...
        String arr6[]={"Welcome","Azam","To","Bridge","Labz","In","Mumbai"};
        System.out.println();
        System.out.println("*****BUBBLE SORT FOR STRING*****");
        System.out.println("-----BEFORE BUBBLE SORT-----");
        for(int i=0;i<arr6.length;i++)
        {  
        	System.out.print(arr6[i]+" ");  
        }
        System.out.println();
        Utility.bubbleSortString(arr6);
        System.out.println("-----AFTER BUBBLE SORT-----"); 
        for(int i=0;i<arr6.length;i++)
        {
        	System.out.print(arr6[i]+" ");
        }
        	        
	}  
}
