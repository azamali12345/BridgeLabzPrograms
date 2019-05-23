package advanceJavaProgramming.singleToneDesignPattern;
public class SingletonMain 
{
	public static void main(String args[])
	{
	    //Compile Time Error: The constructor SingleObject() is not visible
	    //SingleObject object = new SingleObject();
	    SingletonObject ob= SingletonObject.getInstance();
	    ob.showMessage();		
	}
}
