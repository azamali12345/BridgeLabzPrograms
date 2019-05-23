package advanceJavaProgramming.singleToneDesignPattern;
class SingletonObject 
{
	//CREATE AN OBJECT OF SINGLETON CLASS...
	private static SingletonObject instance=null;

	//MAKE THE CONSTRUCTOR PRIVATE SO THAT THIS CLASS CANNOT BE INSTANTIATE...
	private SingletonObject()
	{}

	//GET THE ONLY OBJECT AVAILABLE...Get the only object available
	public static SingletonObject getInstance()
	{
		if(instance==null)
		{
			instance=new SingletonObject();
		}
		return instance;
	}

	public void showMessage()
	{
		System.out.println("Instance Is Created...");
	}	
}
