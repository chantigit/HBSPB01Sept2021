import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_Update {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		//Load the object from DB
		Employee employee=(Employee) session.load(Employee.class, 502);	//select * from employee where empid=502
		//Set new values to that object
		employee.setEmployeeName("Chandhu");
		employee.setEmployeeSalary(660000);
		//call update()
		session.update(employee);									//update employees set 
		tx.commit();
		System.out.println("Object modified successfully");
		session.close();
		factory.close();

	}

}
