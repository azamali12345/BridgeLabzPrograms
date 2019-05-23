package advanceJavaProgramming.protoTypeDesignPattern;

import advanceJavaProgramming.protoTypeDesignPattern.ProtoTypeFactory.ModelType;

public class ProtoTypeExample
{
    public static void main(String[] args)
    {
        try
        {
            String moviePrototype  = ProtoTypeFactory.getInstance(ModelType.MOVIE).toString();
            System.out.println(moviePrototype);
 
            String albumPrototype  = ProtoTypeFactory.getInstance(ModelType.ALBUM).toString();
            System.out.println(albumPrototype);
 
            String showPrototype  = ProtoTypeFactory.getInstance(ModelType.SHOW).toString();
            System.out.println(showPrototype);
 
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}