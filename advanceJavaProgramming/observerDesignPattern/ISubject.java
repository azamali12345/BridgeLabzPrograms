package advanceJavaProgramming.observerDesignPattern;
public interface ISubject 
{
       public void registerObserver(IObserver obsr);
       public void removeObserver(IObserver obsr);
       public void notifyObservers();
}
