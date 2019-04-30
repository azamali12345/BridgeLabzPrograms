//PROGRAM TO SORT ELEMENT USING MERGE SORT...
package org.bridgelabz.algorithmProgram;
public class MergeSort 
{
    //MAIN METHOD...
    public static void main(String args[]) 
    { 
        int arr[]={12,11,13,5,6,7}; 
        System.out.println("Given Array"); 
        printArray(arr);
        sort(arr,0,arr.length-1);
        System.out.println("\nSorted array"); 
        printArray(arr);
    }
    //MERGES TWO SUBARRAY OF arr[] 
    //FIRST SUBARRAY IS arr[l...m] 
    //SECOND SUBARRAY IS arr[m+1...r]
    static void merge(int arr[], int l, int m, int r) 
    { 
        //FIND SIZES OF TWO SUBARRAY TO BE MERGED... 
        int n1=m-l +1; 
        int n2=r-m; 
  
        //CREATE TEMP ARRAY...
        int L[]=new int[n1]; 
        int R[]=new int[n2]; 
  
        //COPY DATA TO TEMP ARRAYS...
        for(int i=0;i<n1;++i) 
            L[i]=arr[l+i]; 
        for (int j=0;j<n2; ++j) 
            R[j]=arr[m+1+j]; 
  
        //MERGE THE TEMP ARRAYS...
        //INITIAL INDEXES OF FIRST AND SECOND SUBARRAYS... 
        int i=0,j=0; 
  
        //INITAIL INDEX OF MERGED SUBARRAY...
        int k=l; 
        while(i<n1&&j<n2) 
        { 
            if(L[i]<=R[j]) 
            { 
                arr[k]=L[i]; 
                i++; 
            } 
            else
            { 
                arr[k]=R[j]; 
                j++; 
            } 
            k++; 
        } 
        //COPY REAMAINING ELEMENTS OF L[] IF ANY...
        while(i<n1) 
        { 
            arr[k]=L[i]; 
            i++;            k++; 
        } 
  
        ////COPY REAMAINING ELEMENTS OF R[] IF ANY...
        while(j<n2) 
        { 
            arr[k]=R[j]; 
            j++; 
            k++; 
        } 
    } 
    //MAIN METHOD THAT SORTS arr[l...r] USING... 
    static void sort(int arr[],int l,int r) 
    { 
        if(l<r) 
        { 
            //FIND THE MIDDLE POINT... 
            int m=(l+r)/2; 
  
            //SORT FIRST AND SECOND HALVES...
            sort(arr,l,m); 
            sort(arr,m+1,r); 
  
            //MERGE THE SORTED HALVES...
            merge(arr,l,m,r); 
        } 
    } 
    //METHOD FOR USE PRINTING THE ARRAY...
    static void printArray(int arr[]) 
    { 
        int n=arr.length; 
        for(int i=0;i<n;++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 

}
