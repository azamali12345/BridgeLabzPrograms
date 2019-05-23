package org.bridgeLabz.objectOriented.commercialData;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * 
 * @author Azam Ali
 *
 */
public class StockUtility 
{
	public static ObjectMapper objM = new ObjectMapper();
	public static void addAccount(String fileName)
	{
		fileName = "/home/admin1/eclipse-workspace/BridgeLabz/src/org/bridgeLabz/objectOriented/commercialData/"
					+ fileName;
		Scanner sc=new Scanner(System.in);
		try 
		{
			List<Customer> customerList = objM.readValue(new File(fileName), new TypeReference<List<Customer>>() 
			{
			});
			StockAccount stockA = new StockAccount();
			System.out.println("ENTER CUSTOMER'S NAME...");
			String custName =sc.next().toUpperCase();
			if(searchCustomerIndex(custName, customerList) == -1)
			{
				Customer newCustomer = new Customer(custName);
				customerList.add(newCustomer);
				System.out.println("\nNEW CUSTOMER ADDED..." + custName + "\n");
				
				stockA.save(fileName, customerList);	
				System.out.printf("\n%-15s %-20s %-20s %-20s\n", "CUSTOMER NAME", "AIRTEL(SHARES)", "JIO(SHARES)", "IDEA(SHARES)");
				System.out.println("-----------------------------------------------------------------------------");
				System.out.println(customerList.get(searchCustomerIndex(custName, customerList)).toString());
			}
			else
			{
				System.out.println("\nCUSTOMER ALLREADY EXIST...");
			}
		}
		catch (IOException e)
		{
				e.printStackTrace();
		}
	}
	public static int searchCustomerIndex(String searchName, List<Customer> customerList)
	{
		int count = 0;
		int index = -1;
		for(int i = 0; i < customerList.size(); i++)
		{
			count = 0;
			String custName = customerList.get(i).getName();
			if(searchName.compareTo(custName) == 0)
			{
				index = i;
				break;
			}
			else
			{
				count++;
			}
		}
		if(count != 0)
		{
			System.out.println("CUSTOMER NOT FOUND...");
		}
		return index;
	}
	public static int searchSharesBySymbol(String symbol, List<CompanyShares> companySharesList)
	{
		int count = 0;
		int index = -1;
		for(int i = 0; i < companySharesList.size(); i++)
		{
			count = 0;
			String companySymbol = companySharesList.get(i).getStockSymbol();
			if(symbol.compareTo(companySymbol) == 0)
			{
				index = i;
				break;
			}
			else
			{
				count++;
			}
		}
		if(count != 0)
		{
			System.out.println("CUSTOMER NOT FOUND...");
		}
		return index;
	}
}
