import org.springframework.context.*;
import org.springframework.context.support.*;
public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Object o=ctx.getBean("id4");
		TestInt tb=(TestInt)o;
		System.out.println("**************************");
		tb.m1();
		System.out.println("**************************");
		tb.m2();	
		System.out.println("**************************");
		tb.m3();
		System.out.println("**************************");
		/*
		tb.sayHi();
		System.out.println("**************************");
		tb.sayBye();
		System.out.println("**************************");
		tb.wishMsg();
		System.out.println("**************************");
		tb.wishWelcomeMsg();
		*/
	}
}
