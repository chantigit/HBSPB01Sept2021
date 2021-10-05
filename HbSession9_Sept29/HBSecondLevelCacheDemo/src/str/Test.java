package str;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test 
{ 
	public static void main(String[] args)
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session1 = factory.openSession();		
		Object o=session1.load(Product.class,new Integer(101));
		Product p1=(Product)o;
		System.out.println("Loaded object(first time)product name is:"+p1.getProName());		
		System.out.println("Object Loaded successfully.....!!");	
		session1.close();
		System.out.println("------------------------------");
		System.out.println("Waiting......");
		
		try{ Thread.sleep(5000);}catch (Exception e) {}		
		System.out.println("5 seconds compelted......!!!!!!!!");
		
		Session session2 = factory.openSession();		
		Object o2=session2.load(Product.class,new Integer(101));
		Product p2=(Product)o2;
		System.out.println("Loaded object(second time) product name is:"+p2.getProName());		
		System.out.println("Object loaded from the database...!!");	
		session2.close();
		
		try{ Thread.sleep(4000);}catch (Exception e) {}		
		System.out.println("4 seconds compelted......!!!!!!!!");
		
		Session session3 = factory.openSession();		
		Object o3=session3.load(Product.class,new Integer(101));
		
		try{ Thread.sleep(3000);}catch (Exception e) {}		
		System.out.println("3 seconds compelted......!!!!!!!!");
		
		Product p3=(Product)o3;
		System.out.println("Loaded object(third time) product name is:"+p3.getProName());		
		System.out.println("Object loaded from global cache successfully.....!!");	
		session3.close();
		
		
		factory.close();
	}
	
}
