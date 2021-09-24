import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_Save {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee employee1=new Employee();
		employee1.setEmployeeId(504);
		employee1.setEmployeeName("Uday");
		employee1.setEmployeeSalary(11000);
		
		Serializable result = session.save(employee1);  //Prepare insert query
		Employee employee2=new Employee();
		employee2.setEmployeeId(505);
		employee2.setEmployeeName("Depak");
		employee2.setEmployeeSalary(12000);
		
		session.save(employee2);  //Prepare insert query
		Employee employee3=new Employee();
		employee3.setEmployeeId(506);
		employee3.setEmployeeName("Mahesh");
		employee3.setEmployeeSalary(13000);
		
		session.save(employee3);  //Prepare insert query
		
		Employee employee4=new Employee();
		employee4.setEmployeeId(507);
		employee4.setEmployeeName("SatyaDev");
		employee4.setEmployeeSalary(14000);
		
		session.save(employee4);  //Prepare insert query
		
		Employee employee5=new Employee();
		employee5.setEmployeeId(508);
		employee5.setEmployeeName("James");
		employee5.setEmployeeSalary(15000);
		
		session.save(employee5);  //Prepare insert query
		
		System.out.println("result="+result);
		
		System.out.println("Object saved into DB successfully");
		tx.commit();
		session.close();
		factory.close();

	}

}
