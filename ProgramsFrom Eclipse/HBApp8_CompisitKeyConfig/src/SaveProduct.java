import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveProduct {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Product product=new Product(101,"Iphone",150000D);
		session.save(product);
		
		System.out.println("Object saved into DB successfully");
		tx.commit();
		session.close();
		factory.close();

	}

}
