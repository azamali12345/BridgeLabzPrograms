package org.bridgelabz.algorithmProgram;
import java.util.*;
class ToBinary
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("ENTER VALUE...");
    	int n=sc.nextInt();
    	String res=Utility.toBinary(n);
    	System.out.println(res);
    }
}
