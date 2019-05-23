package advanceJavaProgramming;
import java.util.*;

@FunctionalInterface
interface Car
{
	void engine();
	//void speed();//WE CANT DECLARE SECOND METHOD...
}
class Swift implements Car
{
	@Override
	public void engine() 
	{
		System.out.println("Swift Engine...");
	}
}
class Animal
{  
	void eatSomething()
	{
		System.out.println("Eating Something...");
	}  
	
	  
	@Deprecated  
	void sleep()
	{
		System.out.println("Ignore This Method It Is Old Version..."); 
	}  
} 
class Dog extends Animal
{  
	@Override  
	void eatSomething()//SHOULD BE eatSomething
	{
		System.out.println("Eating Foods...");
	}  
}  
public class AnnotationExample 
{
	@SuppressWarnings("unchecked")  
	public static void main(String args[])
	{
		Animal a=new Dog();  
		a.eatSomething(); 
		a.sleep();
		Car c=new Swift();
		c.engine();
		ArrayList list=new ArrayList();  
		list.add("Azam");  
		list.add("Ali");  
		list.add("Bhilwara");  
		Iterator it=list.iterator();
		while (it.hasNext()) 
			System.out.print(it.next() + " "); 
	}
}
