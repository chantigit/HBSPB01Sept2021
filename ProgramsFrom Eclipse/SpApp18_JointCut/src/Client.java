import org.springframework.context.*;
import org.springframework.context.support.*;
//import org.springframework.aop.support.DefaultMethodPointcutAdvisor;
public class Client
{
	public static void main(String[] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
		Object o=ctx.getBean("id8");
		TestInter ti=(TestInter)o;
		ti.sayHello();
		System.out.println("======================");
		ti.sayBye();
		System.out.println("======================");
		ti.getData();
		System.out.println("======================");
		ti.getMyData();
		System.out.println("======================");
	}
}


