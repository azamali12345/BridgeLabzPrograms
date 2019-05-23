package advanceJavaProgramming.factoryDesignPattern;
public class LightFactory 
{
	public static ISwitch getLight(String type)
	{
		if(type.equalsIgnoreCase("TubeLight"))
			return new TubeLightImpl();
		else if(type.equalsIgnoreCase("LedLight"))
			return new LedLightImpl();
		else
			System.out.println("No Light Found!!!");
		return null;
	}
}
