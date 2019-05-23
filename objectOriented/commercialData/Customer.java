package org.bridgeLabz.objectOriented.commercialData;
/**
 * 
 * @author Azam Ali
 *
 */
public class Customer 
{
	private String name;
	private int airtelShares;
	private int jioShares;
	private int ideaShares;
	public Customer()
	{
	}
	public Customer(String custName)
	{
		this.name = custName;
	}
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-15s %-20d %-20d %-20d\n", name, airtelShares, jioShares, ideaShares));
		return sb.toString();
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAirtelShares() 
	{
		return airtelShares;
	}
	public void setAirtelShares(int airtelShares) 
	{
		this.airtelShares = airtelShares;
	}
	public int getJioShares() 
	{
		return jioShares;
	}
	public void setJioShares(int jioShares)
	{
		this.jioShares = jioShares;
	}
	public int getIdeaShares() 
	{
		return ideaShares;
	}
	public void setIdeaShares(int ideaShares) 
	{
		this.ideaShares = ideaShares;
	}
}
