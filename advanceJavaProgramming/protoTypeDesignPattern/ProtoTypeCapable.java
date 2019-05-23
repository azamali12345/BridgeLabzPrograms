package advanceJavaProgramming.protoTypeDesignPattern;
public interface ProtoTypeCapable extends Cloneable
{
    public ProtoTypeCapable clone() throws CloneNotSupportedException;
}