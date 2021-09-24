import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test_Read {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//$$$$$$$$   Reading all columns $$$$$$$$$$$$$$$
		/*
		Query query = session.createQuery("from Employee");
		List<Employee> empList = query.list();
		empList.forEach(emp->{
			System.out.println(emp.getEmployeeId()+","+emp.getEmployeeName());
			
		});
		*/
		//$$$$$$$$ Reading specific columns $$$$$$$$$$$$$$$
		/*
		Query query = session.createQuery("select e.employeeId,e.employeeName from Employee e");
		List<Object[]> rows=query.list();
		for(Object[] row:rows)
		{
			Employee employee=new Employee();
			employee.setEmployeeId(Integer.parseInt(row[0].toString()));
			employee.setEmployeeName(row[1].toString());
			System.out.println(employee.getEmployeeId()+","+employee.getEmployeeName());
		}
		*/
		//$$$$$$$$ Pagination $$$$$$$$$$$$$$$
		Query query = session.createQuery("from Employee");
		//query.setMaxResults(4);
		//query.setFirstResult(3);
		
		query.setFirstResult(2);
		query.setMaxResults(4);
		
		List<Employee> empList = query.list();
		empList.forEach(emp->{
			System.out.println(emp.getEmployeeId()+","+emp.getEmployeeName());
			
		});
		session.close();
		factory.close();

	}

}
