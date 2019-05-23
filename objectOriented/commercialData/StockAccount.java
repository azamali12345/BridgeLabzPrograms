package org.bridgeLabz.objectOriented.commercialData;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * 
 * @author Azam Ali
 *
 */
public class StockAccount implements StockInterface 
{
	Stack stack = new Stack(100);
	LinkedList ls = new LinkedList();
	StackList ls1 = new StackList();
	Queue queue = new Queue(100);
	QueueList ls2 = new QueueList();
	public static ObjectMapper objM = new ObjectMapper();
	File customerFile = new File("/home/admin1/eclipse-workspace/BridgeLabz/src/org/bridgeLabz/objectOriented/commercialData/CustomerShares.json");
	File compSharesFile = new File("/home/admin1/eclipse-workspace/BridgeLabz/src/org/bridgeLabz/objectOriented/commercialData/CompanyShares.json");
	public StockAccount() 
	{
	}
	public StockAccount(String fileName) 
	{
		StockUtility.addAccount(fileName);
	}
	@Override
	public double valueOf() 
	{
		Scanner sc = new Scanner(System.in);
		try 
		{
			List<Customer> customerList = objM.readValue(customerFile,new TypeReference<List<Customer>>() 
			{
			});
			List<CompanyShares> companySharesList = objM.readValue(compSharesFile,new TypeReference<List<CompanyShares>>() 
			{
			});
			System.out.println("ENTER THE PERSON NAME...");
			String searchName = sc.next().toUpperCase();
			int index = StockUtility.searchCustomerIndex(searchName, customerList);
			if (index != -1) 
			{
				Customer customer = new Customer();
				customer = customerList.get(index);
				int airtelShares = companySharesList.get(0).getPrice() * customer.getAirtelShares();
				int jioShares = companySharesList.get(1).getPrice() * customer.getJioShares();
				int ideaShares = companySharesList.get(2).getPrice() * customer.getIdeaShares();
				int totalValue = airtelShares + jioShares + ideaShares;
				System.out.print("\nTotal Value of Stock: ");
				return (double) totalValue;
			} 
			else 
			{
				return -1;
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			return 0;
		}
	}
	@Override
	public void buy(int amount, String symbol) 
	{
		Scanner sc = new Scanner(System.in);
		try 
		{
			List<CompanyShares> companySharesList = objM.readValue(compSharesFile,new TypeReference<List<CompanyShares>>() 
			{
			});
			List<Customer> customerList = objM.readValue(customerFile,new TypeReference<List<Customer>>() 
			{
			});
			System.out.println("ENTER THE PERSON NAME...");
			String searchName = sc.next().toUpperCase();
			int custIndex = StockUtility.searchCustomerIndex(searchName, customerList);
			int stockIndex = StockUtility.searchSharesBySymbol(symbol, companySharesList);
			String stackSymbol = null;
			CompanyShares companyShares = null;
			if (custIndex != -1) 
			{
				companyShares = companySharesList.get(stockIndex);
				int noOfShares = companyShares.getNoOfShares();
				companyShares.setNoOfShares(noOfShares - amount);
				stackSymbol = companyShares.getStockSymbol();
				Customer customer = customerList.get(custIndex);
				if (stockIndex == 0) 
				{
					int value = customer.getAirtelShares();
					customer.setAirtelShares(value + amount);
				}
				if (stockIndex == 1) 
				{
					int value = customer.getJioShares();
					customer.setJioShares(value + amount);
				}
				if (stockIndex == 2) 
				{
					int value = customer.getIdeaShares();
					customer.setIdeaShares(value + amount);
				}
			} 
			else 
			{
				System.out.println("STOCK NOT FOUND...");
			}
			objM.writerWithDefaultPrettyPrinter().writeValue(compSharesFile, companySharesList);
			objM.writerWithDefaultPrettyPrinter().writeValue(customerFile, customerList);
			System.out.println("\n----------STOCK DETAILS----------");
			System.out.printf("%-15s %-20s %-20s\n", "COMPANY NAME", "NO OF STOCKS", "PRICE");
			System.out.println("------------------------------------------------------------------");
			System.out.println(companySharesList.get(stockIndex).toString());

			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "CUSTOMER NAME...", "AIRTEL(SHARES)", "JIO(SHARES)",
					"IDEA(SHARES)");
			System.out.println("-------------------------------------------------------------------");
			System.out.println(customerList.get(custIndex).toString());
			System.out.println("==================IN LIST==================");
			System.out.println("COMPANY SHARES IN LIST...");
			ls.print();
			System.out.println("---------------------------------------------");
			stack.push(stackSymbol);
			System.out.println("COMPANY SYSMBOL IN STACK LIST...");
			ls1.print();
			System.out.println("-------------------------------------------");
			String str = "";
			Date currentDate = new Date();
			str = currentDate.toString();
			queue.enqueue(str);
			queue.push(str);
			ls2.print();
			System.out.println("");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void sell(int amount, String symbol) 
	{
		Scanner sc = new Scanner(System.in);
		try 
		{
			List<CompanyShares> companySharesList = objM.readValue(compSharesFile,new TypeReference<List<CompanyShares>>() 
			{
			});
			List<Customer> customerList = objM.readValue(customerFile,new TypeReference<List<Customer>>() 
			{
			});
			int stockIndex = StockUtility.searchSharesBySymbol(symbol, companySharesList);
			System.out.println("ENTER THE PERSON NAME...");
			String searchName = sc.next().toUpperCase();
			int custIndex = StockUtility.searchCustomerIndex(searchName, customerList);
			String stackSymbol = "";
			CompanyShares companyShares = null;
			if (custIndex != -1) 
			{
				companyShares = companySharesList.get(stockIndex);
				int noOfShares = companyShares.getNoOfShares();
				companyShares.setNoOfShares(noOfShares + amount);
				System.out.println("");
				stackSymbol = companyShares.getStockSymbol();
				Customer customer = customerList.get(custIndex);
				if (stockIndex == 0) 
				{
					int value = customer.getAirtelShares();
					customer.setAirtelShares(value - amount);
				}
				if (stockIndex == 1) 
				{
					int value = customer.getJioShares();
					customer.setJioShares(value - amount);
				}
				if (stockIndex == 2) 
				{
					int value = customer.getIdeaShares();
					customer.setIdeaShares(value - amount);
				}
			} 
			else 
			{
				System.out.println("STOCK NOT FOUND...");
			}
			objM.writerWithDefaultPrettyPrinter().writeValue(compSharesFile, companySharesList);
			objM.writerWithDefaultPrettyPrinter().writeValue(customerFile, customerList);
			System.out.println("\n----------STOCK DETAIL----------");
			System.out.printf("%-15s %-20s %-20s\n", "COMPANY NAME", "NO OF STOCKS", "PRICE");
			System.out.println("---------------------------------------------------------------------");
			System.out.println(companySharesList.get(stockIndex).toString());
			System.out.println("\n----------CUSTOMER DETAILS----------");
			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "CUSTOMER NAME", "AIRTEL(SHARES)", "JIO(SHARES)",
					"IDEA(SHARES)");
			System.out.println("----------------------------------------------------------------------");
			System.out.println(customerList.get(custIndex).toString());
			System.out.println("==================IN LIST==================");
			System.out.println("COMPANY SHARES IN LIST...");
			ls.print();
			System.out.println("---------------------------------------------");
			stack.push(stackSymbol);
			System.out.println("COMPANY SYMBOL IN STACK LIST...");
			ls1.print();
			System.out.println("-------------------------------------------");
			String str = "";
			Date currentDate = new Date();
			str = currentDate.toString();
			queue.enqueue(str);
			queue.push(str);
			ls2.print();
			System.out.println("");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void save(String fileName, List<Customer> customerList) 
	{
		try 
		{
			objM.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), customerList);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	@Override
	public void printReport() 
	{
		try 
		{
			List<CompanyShares> companySharesList = objM.readValue(compSharesFile,new TypeReference<List<CompanyShares>>() 
			{
			});
			List<Customer> customerList = objM.readValue(customerFile,new TypeReference<List<Customer>>() 
			{
			});
			System.out.println("\n----------STOCK DETAIL----------");
			System.out.printf("%-15s %-20s %-20s\n", "COMPANY NAME", "NO OF STOCKS", "PRICE");
			System.out.println("-----------------------------------------------------------------");
			for (int i = 0; i < companySharesList.size(); i++) 
			{
				System.out.println(companySharesList.get(i).toString());
			}
			System.out.println("\n----------CUSTOMER DETAILS----------");
			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "CUSTOMER NAME", "AIRTEL(SHARES)", "JIO(SHARES)",
					"IDEA(SHARES)");
			System.out.println("----------------------------------------------------------------------");
			for (int i = 0; i < customerList.size(); i++) 
			{
				System.out.println(customerList.get(i).toString());
			}
		} 
		catch (IOException e) 
		{
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}
	}
}
