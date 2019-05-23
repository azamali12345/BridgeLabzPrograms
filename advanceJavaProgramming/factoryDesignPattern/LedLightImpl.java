package advanceJavaProgramming.factoryDesignPattern;
public class LedLightImpl implements ISwitch
{
	@Override
	public void turnOn() 
	{
		System.out.println("LedLight Is On!!!...");
	}

	@Override
	public void turnOff() 
	{
		System.out.println("LedLight Is Off!!!...");
	}
}
