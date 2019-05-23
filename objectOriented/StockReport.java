package org.bridgeLabz.objectOriented;
import java.io.Serializable;
/**
 * 
 * @author Azam Ali
 *
 */
public class StockReport implements Serializable 
{
	private String stockName;
	private int numberOfShare;
	private double sharePrice;
	public String getStockName() 
	{
		return stockName;
	}
	public void setStockName(String stockName) 
	{
		this.stockName = stockName;
	}
	public int getNumberOfShare() 
	{
		return numberOfShare;
	}
	public void setNumberOfShare(int numberOfShare) 
	{
		this.numberOfShare = numberOfShare;
	}
	public double getSharePrice() 
	{
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) 
	{
		this.sharePrice = sharePrice;
	}
	@Override
	public String toString() 
	{
		return "StockReport [stockName=" + stockName + ", numberOfShare=" + numberOfShare + ", sharePrice=" + sharePrice
				+ "]";
	}
}