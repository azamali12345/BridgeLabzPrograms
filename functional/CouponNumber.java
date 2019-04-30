//PROGRAM TO FINAD THE COUPON CODE WHICH ARE UNIQUE...
package org.bridgelabz.functional;
public class CouponNumber 
{
	//MAIN METHOD...
	public static void main(String args[])
	{
		//CHAR ARRAY TO GET CHARACTER FOR COUPON...
		char chars[]="pqrst".toCharArray();
		//LENGTH OF COUPON...
		int max=1000;
		//FOR RANDOM VALUE...
		double d=Math.random();
		int rn=(int)(d*max);
		String s="";
		System.out.println("RANDOM DOUBLE "+d+" RANDOM AT START "+rn);
		while(rn>0) 
		{
			s=s+(chars[rn%chars.length]);
			rn/=chars.length;
			rn--;
		}
		String cp=s.toString();
		System.out.println("COUPON CODE..."+cp);
	}
}
