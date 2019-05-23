package advanceJavaProgramming.observerDesignPattern;
public class Newspaper implements IObserver 
{
       @Override
       public void update(float interest) 
       {
              System.out.println("Newspaper: Interest Rate updated, new Rate is: "+ interest);
       }
}
