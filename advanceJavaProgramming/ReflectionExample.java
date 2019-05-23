package advanceJavaProgramming;
import java.lang.reflect.Method; 
import java.lang.reflect.Field; 
import java.lang.reflect.Constructor; 
  
// class whose object is to be created 
class Reflection
{ 
    // creating a private field 
    private String str; 
    public Reflection()  
    {  
    	str="Reflection Class Constructor..."; 
    } 
    public void print()  
    { 
        System.out.println("The String Is..." +str); 
    } 
    public void print2(int n)  
    { 
        System.out.println("Public method print2..."+n); 
    } 
    private void print3() 
    { 
        System.out.println("Private method print3..."); 
    } 
} 
  
class ReflectionExample
{ 
    public static void main(String args[]) throws Exception 
    { 
    	Reflection ob= new Reflection(); 
  
        //CREATION CLASS OBJECT FROM THE OBJECT USING getClass()METHOD...
        Class cls= ob.getClass(); 
        System.out.println("The Name Of Class Is..." + cls.getName()); 
  
        //GETTING THE CONSTRUCTOR OF THE CLASS THROUGH THE OBJECT OF THE CLASS BY USING getConstructor()METHOD...
        Constructor construct=cls.getConstructor(); 
        System.out.println("The Name Of Constructor Is..." +construct.getName()); 
  
        System.out.println("THE ALL PUBLIC METHODS ARE..."); 
        //GETTING METHODS OF THE CLASS THROUGH THE OBJECT OF THE CLASS BY USING getMethods()METHOD...
        Method methods[]= cls.getMethods(); 
        //PRINTING METHODS NAMES... 
        for (Method method:methods) 
            System.out.println(method.getName()); 
  
        //CREATES OBJECT OF DESIRED METHOD BBY PROVIDING THE METHOD NAME & PARAMETER CLASS AS ARGUMENT TO THE getDeclaredMethod()METHOD...
        Method m1= cls.getDeclaredMethod("print2",int.class); 
  
        //INVOKES THE METHOD AT RUNTIME... 
        m1.invoke(ob,50); 
  
        //CREATES OBJECT OF THE DESIRED FIELD BY PROVIDING THE NAME OFFIELD AS ARGUMENT TO THE getDeclaredField() METHOD...
        Field field=cls.getDeclaredField("str"); 
  
        //ALLOW THE OBJECT TO ACCESS THE FIELD IRRESPECTIVE OF THE ACCESS SPECIFIER USED WITH THE FIELD...
        field.setAccessible(true); 
  
        //TAKES OBJECT AND THE NEW VALUE TO BE ASSIGNED TO THE FILED AS ARGUMENT...
        field.set(ob,"AZAM"); 
  
        //CREATES OBJECT OF DESIRED METHOD BY PROVIDING THE METHOD NAME AS ARGUMENT TO THE getDeclaredMethod()METHOD...
        Method m2= cls.getDeclaredMethod("print"); 
  
        //INVOKES THE METHOD AT RUNTIME...
        m2.invoke(ob); 
  
        // Creates object of the desired method by providing 
        // the name of method as argument to the  
        // getDeclaredMethod method 
        //CREATES OBJECT OF THE DESIRD METHOD BY PROVIDING THE NAME OF METHOD AS ARGUMENT TO THE getDeclaredMethod()METHOD...
        Method m3= cls.getDeclaredMethod("print3"); 
  
        //ALLOW THE OBJECT TO ACCESS THE METHOD IRRESPECTIVE OF THE ACCESS SPECIFIIR USED WITH METHOD...
        m3.setAccessible(true); 
  
        //INVOKES THE METHOD AT RUNTIME...
        m3.invoke(ob); 
    } 
} 