package org.bridgeLabz.objectOriented.commercialData;
import java.util.Scanner;
/**
 * 
 * @author Azam Ali
 *
 */
public class Runnable 
{
	public static void main(String args[]) 
	{
		Scanner scint=new Scanner(System.in);
		Scanner scstr=new Scanner(System.in);
		boolean value = true;
		while(value)
		{
			StockAccount stockA = new StockAccount();
			System.out.println("ENTER THE CHOICE...");
			System.out.println("1. ADD STOCK ACCOUNT...");
			System.out.println("2. GET TOTAL VALUE OF STOCK...");
			System.out.println("3. BUY SHARES...");
			System.out.println("4. SALE SHARES...");
			System.out.println("5. PRINT REPORT...");
			System.out.println("6. EXIT...");
			int n=scint.nextInt();
			switch(n)
			{
				case 1:StockAccount newStock = new StockAccount("CustomerShares.json");
						break;
			
				case 2:	double totalValue = stockA.valueOf();
						if(totalValue >= 0)
						{
							System.out.println(totalValue);
						}
						break;
				case 3: System.out.println("ENTER THE SHARES...");
						int shares = scint.nextInt();
						System.out.println("ENTER THE SYMBOL...");
						String symbol = scstr.next().toUpperCase();
						stockA.buy(shares, symbol);
						break;
				case 4: System.out.println("ENTER THE SHARES...");
						shares = scint.nextInt();
						System.out.println("ENTER THE SYMBOLS...");
						symbol = scstr.next().toUpperCase();
						stockA.sell(shares, symbol);
						break;
				case 5: stockA.printReport();
						break;
				case 6: value = false;
						break;
				default: System.out.println("INVALID CHOICE...");
			}			
		}
	}
}
