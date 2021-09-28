import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_Read {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		/*
		Query namedQuery1 = session.getNamedQuery("q1");
		namedQuery1.setParameter("tvar1", 30000F);
		List list1 = namedQuery1.list();
		Iterator iterator1 = list1.iterator();
		while(iterator1.hasNext())
			System.out.println(iterator1.next());
		*/
		
		Query namedQuery2 = session.getNamedQuery("q2");
		namedQuery2.setParameter("tvar2", 508);
		int res = namedQuery2.executeUpdate();
		System.out.println(res+" object is deleted");
		Transaction tx = session.beginTransaction();
		tx.commit();
		session.close();
		factory.close();

	}

}
