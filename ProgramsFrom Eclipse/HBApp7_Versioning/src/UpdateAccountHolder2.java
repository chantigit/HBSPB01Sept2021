import org.hibernate.*;
import org.hibernate.cfg.*;
public class UpdateAccountHolder2 
{
	public static void main(String[] args)
	{
		 Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession();
		 Transaction tx = session.beginTransaction(); 
		 
		 Object o=session.load(AccountHolder2.class,new Integer(1));
		 AccountHolder2 s=(AccountHolder2)o;
		 
		 s.setCity("Chennai");
		 
		 tx.commit();
		 System.out.println("Object Updated successfully.....!!");
		 session.close();
		 factory.close();
	 }
}
