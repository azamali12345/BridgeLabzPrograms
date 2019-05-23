package org.bridgeLabz.objectOriented.inventoryDataManagement;
import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
/**
 * 
 * @author Azam Ali
 *
 */
public class InventoryManagement 
{
	public static void main(String args[])  
	{
		String path="/home/admin1/eclipse-workspace/BridgeLabz/src/org/bridgeLabz/objectOriented/inventoryDataManagement/JsonFile.json";//SOURCE FILE PATH CONTAIN JSON DATA...
		ObjectMapper mapper=new ObjectMapper();//CREATION OF OBJECT MAPPER REFERENCE...
		File file=new File(path);//FOR FILE REFERENCE...
		int totalValue=0;//FOR CHOICE IN SELECTION OF INVENTORY...
	
		try 
		{
			JsonNode jsondata=mapper.readTree(file);//READING DATA OF JSON IN TREE STRUCTURE...
			JsonNode inventory = jsondata.findPath("RICE");//SEARCHING FOR SPECIFIC DATA...
			System.out.println(" ---------------------------------RICE-------------------------------");
			System.out.println();
			for (JsonNode node : inventory) 
			{
				String name=node.findPath("name").asText();//ACCESSING NAME VALUE...
				int weight=node.findPath("weight").asInt();//ACCESSING WEIGHT VALUE...
				int price=node.findPath("price").asInt();//ACCESSING PRICE VALUE...
	
				System.out.println("name\t:"+name+"\nprice\t:"+price+"\nweight\t:"+weight);//PRINTING THE ACCESSED VALUE...
				totalValue+=(price*weight);
			}	
	
			System.out.println("THE TOTAL VALUE OF RICE..."+totalValue);
			totalValue=0;
			System.out.println(" ---------------------------------PULSES--------------------------------");
			inventory = jsondata.findPath("PULSES");
			for (JsonNode node1 : inventory) 
			{
				String name1=node1.findPath("name").asText();//ACCESSING NAME VALUE... 
				int weight1=node1.findPath("weight").asInt();//ACCESSING WEIGHT VALUE...
				int price1=node1.findPath("price").asInt();//ACCESSING PRICE VALUE...
		
				System.out.println("name\t:"+name1+"\nprice\t:"+price1+"\nweight\t:"+weight1);//printing the accessed value
				totalValue+=(price1*weight1);
			}
			
			System.out.println("THE TOTAL VALUE OF PULSES..."+totalValue);
			totalValue=0;
			System.out.println(" ---------------------------------WHEAT-------------------------------");
			inventory = jsondata.findPath("WHEATS");
			for (JsonNode node2 : inventory) 
			{
				String name2=node2.findPath("name").asText();//ACCESSING NAME VALUE... 
				int weight2=node2.findPath("weight").asInt();//ACCESSING WEIGHT VALUE...
				int price2=node2.findPath("price").asInt();//ACCESSING PRICE VALUE...
				
				System.out.println("name\t:"+name2+"\nprice\t:"+price2+"\nweight\t:"+weight2);//printing the accessed value
				totalValue+=(price2*weight2);
			}
				
			System.out.println("THE TOTAL VALUE OF WHEAT... "+totalValue);
		}
		catch (IOException e) 
		{
			System.out.println("ERROR OCCURED WHILE PARSING A FILE...");
		}
		
	}
}
