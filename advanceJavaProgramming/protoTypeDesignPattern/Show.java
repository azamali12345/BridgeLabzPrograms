package advanceJavaProgramming.protoTypeDesignPattern;
class Show implements ProtoTypeCapable
{
    private String name = null;
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    @Override
    public Show clone() throws CloneNotSupportedException 
    {
        System.out.println("Cloning Show object..");
        return (Show) super.clone();
    }
    @Override
    public String toString() 
    {
        return "Show";
    }
}