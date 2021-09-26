import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HqlRead {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//select * from customers
		//Query query = session.createQuery("from Customer ");
		//select * from customers where id=105
		Query query = session.createQuery("from Customer where customerId= :x");
		query.setParameter("x",105);
		//query.setFirstResult(5);
		//query.setMaxResults(3);
		List list1 = query.list();
		Iterator iterator1 = list1.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		
		session.close();
		factory.close();

	}

}
//query.setParameter("id",102);