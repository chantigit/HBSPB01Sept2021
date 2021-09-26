import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlUpdateDelete {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		/*
		Query query = session.createQuery("update Customer set phoneNumber = :phone where customerId = :id");
		query.setParameter("phone",9988998899L);
		query.setParameter("id", 110);
		int result = query.executeUpdate();
		System.out.println(result+ " Object updated into DB successfully");
		*/
		Query query = session.createQuery("delete from Customer where customerId = :id");
		query.setParameter("id", 110);
		int result = query.executeUpdate();
		System.out.println(result+ " Object deleted from DB successfully");
		tx.commit();
		session.close();
		factory.close();

	}

}
