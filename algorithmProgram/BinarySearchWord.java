//PROGRAM TO FIND WORD USING BINARY SEARCH...
package org.bridgelabz.algorithmProgram;
public class BinarySearchWord 
{
	public static void main(String args[])
	{
		//THIS IS FOR STRING BINARY SEARCH...
		String arr[]={"Welcome","Azam","To","Bridge","Labz","In","Mumbai"}; 
		System.out.println("*****BINARY SEARCH FOR STRING*****");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		String x="Bridge";
		System.out.println("I WANT TO SEARCH 'Bridge' ELEMENT...WHAT IS POSTION OF 'BRIDGE'...");
		int result=binarySearchString(arr,x); 
		if(result==-1) 
		{
			System.out.println("ELEMENT NOT PRESENT..."); 
		}
		else
		{
			System.out.println("ELEMENT FOUND AT INDEX..."+result); 
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
	        // IF x GREATER, IGNORE LEFT HALF...
	        if(res>0) 
	            left=mid+1; 
	        // IF x IS SMALLER, IGNORE RIGHT HALF...
	        else
	        	right=mid-1; 
	      } 
	    return -1; 
	}
}
