import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_Delete {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		//Load the object from DB
		Employee employee=(Employee) session.load(Employee.class, 502);	//select * from employee where empid=502
		
		//call delete()
		session.delete(employee);									//delete from employees ...
		tx.commit();
		System.out.println("Object delete successfully");
		session.close();
		factory.close();

	}

}
