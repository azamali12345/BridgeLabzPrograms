//STRING REPLACE PROGRAM...
package org.bridgelabz.functional;
import java.util.*;
public class StringReplace 
{
	//MAIN METHOD...
	public static void main(String args[]) 
	{
		String str=new String("Hello UserName, How are you?");
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE USERNAME");
		String name=sc.nextLine();
		str=str.replace("UserName",name);//USING THIS METHOD FOR REPLACE THE WORD(USERNAME)
		System.out.println(str);
	}
}

