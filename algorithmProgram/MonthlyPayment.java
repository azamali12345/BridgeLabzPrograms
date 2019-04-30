package org.bridgelabz.algorithmProgram;
public class MonthlyPayment 
{
	//MAIN METHOD...
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double P=Double.parseDouble(args[0]);
		int Y=Integer.parseInt(args[1]);
		double R=Double.parseDouble(args[2]);
		double res=Utility.payment(P, Y, R);
		System.out.println("Payment is "+res);
	}
}
