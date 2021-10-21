import org.springframework.context.*;
import org.springframework.context.support.*;
public class Client
{
	public static void main(String[] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
		Object o=ctx.getBean("id4");
		TestInter ti=(TestInter)o;
		ti.doCalc(10,2);
		System.out.println("=================");
		ti.doCalc(10,0);
	}
}