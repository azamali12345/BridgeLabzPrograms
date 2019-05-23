package advanceJavaProgramming.observerDesignPattern;
public class ObserverExample
{
	public static void main(String args[]) 
    {
		//THIS WILL MAINTAIN ALL LOAND INFORMATION...
        Newspaper printMedia=new Newspaper();
        Internet onlineMedia=new Internet();
        Loan personalLoan=new Loan("Personal Loan", 12.5f,"Standard Charterd");
        personalLoan.registerObserver(printMedia);
        personalLoan.registerObserver(onlineMedia);
        personalLoan.setInterest(3.5f);
    }
}
