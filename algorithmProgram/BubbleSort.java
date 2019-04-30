//PROGRAM TO SORT ELEMENT USING BUBBLE SORT...
package org.bridgelabz.algorithmProgram;
import java.util.Scanner;
public class BubbleSort 
{
	public static void main(String args[]) 
	{
	    //THIS IS BUBBLE SORT FOR INTEGER...
	    int arr[]={66,55,22,99,77,33,11};
	    System.out.println("*****BUBBLE SORT FOR INTEGER*****");
        System.out.println("-----BEFORE BUBBLE SORT-----");  
        for(int i=0;i<arr.length;i++)
        {  
        	System.out.print(arr[i]+" ");  
        }  
        System.out.println();
        bubbleSortInteger(arr);
        System.out.println("-----AFTER BUBBLE SORT-----");  
        for(int i=0;i<arr.length;i++)
        {  
        	System.out.print(arr[i]+" ");  
        }
	}
	//METHOD FOR BUBBLE SORT FOR INTEGER...
	public static void bubbleSortInteger(int[] arr)
	{  
        int len=arr.length;  
        int temp;
        for(int i=0;i<len;i++)
        {  
        	for(int j=1;j<(len-i);j++)
        	{  
        		if(arr[j-1]>arr[j])
        		{  
        			//SWAP ELEMENTS...
                    temp=arr[j-1];  
                    arr[j-1]=arr[j];  
                    arr[j]=temp;  
                }  
             }  
         }
	}
}
