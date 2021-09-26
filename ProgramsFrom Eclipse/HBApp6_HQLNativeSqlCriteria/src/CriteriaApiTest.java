import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

public class CriteriaApiTest {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//CASE1:  select * from Customer
		/*
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.setFirstResult(3);
		criteria.setMaxResults(3);
		List list1 = criteria.list();
		Iterator iterator1 = list1.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		*/
		//CASE2: select customerName from Customer
		/*
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.setProjection(Projections.property("customerName"));
		List list1 = criteria.list();
		Iterator iterator1 = list1.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		*/
		//CASE3: Aggregate functions using Projections class methods
		/*
		Criteria criteria = session.createCriteria(Customer.class);
		ProjectionList pl=Projections.projectionList();
		pl.add(Projections.sum("itemsInCart"));
		pl.add(Projections.avg("itemsInCart"));
		pl.add(Projections.rowCount());
		criteria.setProjection(pl);
		List l=criteria.list();
		Iterator it=l.iterator();
		if(it.hasNext())
		{
			Object[] row=(Object[])it.next();
			System.out.println(row[0]+"\t"+row[1]+"\t"+row[2]);
		}
		*/
		//CASE4:Restrictions class methods, Order class methods 
		Criteria criteria = session.createCriteria(Customer.class);

		//Criterion cn1 = Restrictions.gt("itemsInCart",new Integer(15));
		//criteria.add(cn1);
		
		//criteria.addOrder(Order.asc("itemsInCart"));
		criteria.addOrder(Order.desc("itemsInCart"));
		
		List l=criteria.list();
		Iterator it=l.iterator();
		while(it.hasNext())
		{			
			Customer c=(Customer)it.next();
			System.out.println("--------------------------------------------");
			System.out.println(c.getCustomerId()+"|"+c.getCustomerName()+"|"+c.getPhoneNumber()+"|"+c.getItemsInCart());
		}
		
		session.close();
		factory.close();

	}

}
