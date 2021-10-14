import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestApp 
{
	public static void main( String[] args )
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spconfig.xml");
		
		MyBean ob1=(MyBean)context.getBean("id1");
		MyBean ob2=(MyBean)context.getBean("id1");
		
		ob1.showMsg();
		ob2.showMsg();
		
		System.out.println(ob1);
		System.out.println(ob2);
	}
}


//Servlet Scope :	request,session,context  
//Jsp Scope		:	page,request,session,application
//Bean Scope	:	singleton,prototype,request,session,global-session


