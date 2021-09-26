import org.hibernate.*;
import org.hibernate.cfg.*;
public class UpdateAccountHolder1 
{
	public static void main(String[] args)
	{
		 Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession();
		 Transaction tx = session.beginTransaction(); 
		 
		 Object o=session.load(AccountHolder1.class,new Integer(1));
		 AccountHolder1 s=(AccountHolder1)o;
		 
		 s.setAmountInAccount(s.getAmountInAccount()-10000);
		// s.setCity("Pune");
		 
		 tx.commit();
		 System.out.println("Object Updated successfully.....!!");
		 session.close();
		 factory.close();
	 }
}
