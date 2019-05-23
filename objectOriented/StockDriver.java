package org.bridgeLabz.objectOriented;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
/**
 * 
 * @author Azam Ali
 *
 */
public class StockDriver
{
	public static void main(String[] args) throws IOException, JsonMappingException, JsonParseException 
	{
		ObjectMapper obj=new ObjectMapper();
		Scanner sc=new Scanner(System.in);
		String path=("/home/admin1/eclipse-workspace/BridgeLabz/src/org/bridgeLabz/objectOriented/Stock.json");
		File file=new File(path);
		try 
		{
			JsonNode jsonnode=obj.readTree(file);
			JsonNode detail=jsonnode.get("STOCK");
			for (JsonNode node : detail) 
			{

				String name=node.path("stockName").asText();
				int share=node.path("numberOfShare").asInt();
				int price=node.path("sharePrice").asInt();
				System.out.println("NAME OF THE STOCK..." + name);
				System.out.println("NUMBER OF SHARES..." + share);
				System.out.println("PRICE OF THE SHARE..." + price);
				int total=share*price;
				System.out.println("TOTAL IS..."+total);
				System.out.println();
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
		}
	}
}
