import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test_Read {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Employee employee=(Employee) session.load(Employee.class, 502);	//select * from employee where empid=501
		System.out.println(employee);
		
		session.close();
		factory.close();

	}

}
