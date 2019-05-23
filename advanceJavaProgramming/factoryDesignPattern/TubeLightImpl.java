package advanceJavaProgramming.factoryDesignPattern;
public class TubeLightImpl implements ISwitch
{
	@Override
	public void turnOn() 
	{
		System.out.println("TubeLight Is On!!!...");
	}

	@Override
	public void turnOff() 
	{
		System.out.println("TubeLight Is Off!!!...");
	}
}
