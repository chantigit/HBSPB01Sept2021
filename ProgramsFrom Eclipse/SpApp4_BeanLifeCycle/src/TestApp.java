import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp 
{
	public static void main( String[] args )
	{
		System.out.println("TestApp.main():Entry");
		/*
		Resource resource=new ClassPathResource("spconfig.xml");  
		BeanFactory factory=new XmlBeanFactory(resource);  
		*/
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("spconfig.xml");
		
		MyBean ob=(MyBean)context.getBean("id1");
		ob.showMsg();
		context.close();
		System.out.println("TestApp.main():Exit");

	}
}


//Spring IOC container types:		1.BeanFactory (Core)   2.ApplicationContext/ConfigurableApplicationContext (Advanced)







