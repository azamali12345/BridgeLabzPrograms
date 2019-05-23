package org.bridgeLabz.objectOriented.inventoryDataManagement;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
/**
 * 
 * @author Azam Ali
 *
 */
public class Inventory implements Serializable 
{
	public static void main(String args[])  
	{
		Scanner sc=new Scanner(System.in);		
		String path="/home/admin1/eclipse-workspace/BridgeLabz/src/org/bridgeLabz/objectOriented/inventoryDataManagement/JsonFile.json";//SOURCE FILE PATH CONTAIN JSON DATA...
		ObjectMapper mapper=new ObjectMapper();//CREATION OF OBJECT MAPPER REFERENCE...
		File file=new File(path);//FOR FILE REFERENCE... 
		int choice=0;//FOR CHOICE IN SELECTION OF INVENTORY...
		try 
		{
			JsonNode jsondata=mapper.readTree(file);//READING DATA OF JSON IN TREE STRUCTURE...
			do 
			{
				System.out.println("ENTER YOUR CHOICE...");			
				System.out.println("1.FOR RICE...2.FOR PULSES...3.FOR WHEAT...");
				try 
				{
					choice=sc.nextInt();//READING THE CHOICE INPUT...
				}
				catch(Exception e)
				{
					System.out.println("TYPE MISMATCH...");			
				}
			}while(choice<0 || choice>4);
		
			String inventoryproduct="";//THE STRING WHICH HAS CHOICE DATA...
			switch(choice)
			{
				case 1:
					inventoryproduct="RICE";
					break;
				case 2:
					inventoryproduct="PULSES";
					break;
				case 3:
					inventoryproduct="WHEATS";
					break;
				default:
					System.out.println("INVALID INPUT...");
					break;
			}
		
			JsonNode inventory = jsondata.findPath(inventoryproduct);//SEARCHING FOR SPECIFIC DATA...
			System.out.println(" --------------------------------- "+inventoryproduct+" -------------------------------");
			System.out.println();
			for (JsonNode node : inventory) 
			{
				String name=node.findPath("name").asText();//ACCESSING NAME VALUE... 
				int weight=node.findPath("weight").asInt();//ACCESSING WEIGHT VALUE...
				int price=node.findPath("price").asInt();//ACCESSING PRICE VALUE...
			
				System.out.println("name\t:"+name+"\nprice\t:"+price+"\nweight\t:"+weight);//printing the accessed value
				System.out.println("TOTAL PRICE..."+(price*weight));
				System.out.println();
			}
		}
		catch (IOException e) 
		{
			System.out.println("ERROR OCCURED WHILE PARSING A FILE...");
		}
		finally
		{
			sc.close();
		}
	}
}
