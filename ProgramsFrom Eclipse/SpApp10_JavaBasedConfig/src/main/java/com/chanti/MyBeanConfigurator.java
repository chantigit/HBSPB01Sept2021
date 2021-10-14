package com.chanti;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyBeanConfigurator
{
	public MyBeanConfigurator() {
		System.out.println("MyBeanConfigurator.MyBeanConfigurator()");
	}
	@Bean("id1")
	public StudentBean createStudent() 	{
		System.out.println("MyBeanConfigurator.createStudent()");
		Address address=new Address();
		StudentBean bean=new StudentBean();
		bean.setAddress(address);
		bean.setRollNumber(501);
		return bean;
	}
	@Bean("id2")
	@Scope("prototype")
	public EmployeeBean createEmployee()	{
		System.out.println("MyBeanConfigurator.createEmployee()");
		return new EmployeeBean();
	}
	@Bean("id3")
	@Scope("singleton")
	public CustomerBean createCustomer()	{
		System.out.println("MyBeanConfigurator.createCustomer()");
		return new CustomerBean();
	}
}
