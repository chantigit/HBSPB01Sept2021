package com.chanti;
import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_Save {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("com\\chanti\\hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee employee=new Employee();
		employee.setEmployeeId(501);
		employee.setEmployeeName("Ajay");
		employee.setEmployeeSalary(45000);
		
		Serializable result = session.save(employee);  //Prepare insert query
		System.out.println("result="+result);
		
		System.out.println("Object saved into DB successfully");
		tx.commit();
		session.close();
		factory.close();

	}

}
