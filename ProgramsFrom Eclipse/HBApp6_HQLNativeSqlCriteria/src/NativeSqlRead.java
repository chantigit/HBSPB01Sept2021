import java.util.Iterator;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NativeSqlRead {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//select * from customers
		/*
		SQLQuery query = session.createSQLQuery("select * from customers").addEntity(Customer.class);
		List list1 = query.list();
		Iterator iterator1 = list1.iterator();
		while(iterator1.hasNext())
			System.out.println(iterator1.next());
		*/
		
		SQLQuery query=session.createSQLQuery("select name,password from customers")
				.addScalar("name",Hibernate.STRING)
				.addScalar("password",Hibernate.STRING);
		
		List list = query.list();
		List<Object[]> rows=query.list();
		for(Object[] row:rows)
		{
			Customer customer=new Customer();
			customer.setCustomerName(row[0].toString());
			customer.setPassword(row[1].toString());
			System.out.println(customer.getCustomerName()+","+customer.getPassword());
		}
		 
		session.close();
		factory.close();

	}

}
