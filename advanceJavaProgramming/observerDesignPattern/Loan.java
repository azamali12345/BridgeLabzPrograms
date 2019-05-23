package advanceJavaProgramming.observerDesignPattern;

import java.util.ArrayList;

public class Loan implements ISubject 
{
       private ArrayList<IObserver> obs= new ArrayList<IObserver>();
       private String type;
       private float interest;
       private String bank;

       public Loan(String type, float interest, String bank) 
       {
              this.type = type;
              this.interest = interest;
              this.bank = bank;
       }

       public float getInterest() 
       {
              return interest;
       }

       public void setInterest(float interest) 
       {
              this.interest = interest;
              notifyObservers();
       }

       public String getBank() 
       {
              return this.bank;
       }

       public String getType() 
       {
              return this.type;
       }

       @Override
       public void registerObserver(IObserver observer) 
       {
              obs.add(observer);
       }

       @Override
       public void removeObserver(IObserver observer) 
       {
              obs.remove(observer);
       }

       @Override
       public void notifyObservers() 
       {
              for (IObserver ob : obs) 
              {
                     System.out.println("Notifying Observers on change in Loan interest rate");
                     ob.update(this.interest);
              }
       }
}