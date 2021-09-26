import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NativeSqlUpdateDelete {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		//Update operation
		//SQLQuery query = session.createSQLQuery("update customers set name= :name where id= :id");
		//query.setParameter("name","James");
		//query.setParameter("id",109);
		SQLQuery query = session.createSQLQuery("delete from customers where id= :id");
		query.setParameter("id",109);
		int res = query.executeUpdate();
		tx.commit();
		System.out.println(res);
		session.close();
		factory.close();

	}

}
