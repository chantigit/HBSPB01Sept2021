import org.hibernate.*;
import org.hibernate.cfg.*;
//import java.sql.*;
class SaveAccountHolder1 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); 
 
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        AccountHolder1 account1=new AccountHolder1(); 
        account1.setAccountHolderName("Chanti");
        account1.setAmountInAccount(50000D);
        account1.setCity("Hyd");
        account1.setPhoneNumber(8179817855L);
        session.save(account1);
        
        System.out.println("Object saved successfully.....!!");
        tx.commit();
        session.close();
        factory.close();

	}

}