package advanceJavaProgramming.factoryDesignPattern;
import java.util.Scanner;
public class TestLight 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Type Of Light...");
		String type=sc.next();
		sc.close();
		ISwitch isw=LightFactory.getLight(type);
		if(isw!=null)
		{
			isw.turnOn();
		}
	}
}
