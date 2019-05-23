package advanceJavaProgramming; 
import java.lang.annotation.*;  
import java.lang.reflect.*;  

//CREATING ANNOTATION... 
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface MyAnnotation
{  
	int value();  
}  

//APPLYING ANNOTATION...
class Hello
{  
	@MyAnnotation(value=10)  
	public void sayHello()
	{
		System.out.println("hello annotation");
	}  
}  

//ACCESSING ANNOTATION...  
class CustomAnnotationExample
{  
	public static void main(String args[])throws Exception
	{  
		Hello h=new Hello();  
		Method m=h.getClass().getMethod("sayHello");  
		MyAnnotation manno=m.getAnnotation(MyAnnotation.class);  
		System.out.println("value is: "+manno.value());  
	}
}  
