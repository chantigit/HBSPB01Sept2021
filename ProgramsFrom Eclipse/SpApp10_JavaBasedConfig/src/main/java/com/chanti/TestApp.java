package com.chanti;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp 
{
	public static void main( String[] args )
	{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(MyBeanConfigurator.class);
		
		StudentBean studentBean=(StudentBean)ctx.getBean("id1");
		System.out.println(studentBean.getRollNumber());
		
		
		EmployeeBean empBean1=(EmployeeBean)ctx.getBean("id2");
		EmployeeBean empBean2=(EmployeeBean)ctx.getBean("id2");
		EmployeeBean empBean3=(EmployeeBean)ctx.getBean("id2");
		
		System.out.println(empBean1);
		System.out.println(empBean2);
		System.out.println(empBean3);
		
		CustomerBean custBean1=(CustomerBean)ctx.getBean("id3");
		CustomerBean custBean2=(CustomerBean)ctx.getBean("id3");
		CustomerBean custBean3=(CustomerBean)ctx.getBean("id3");
		
		System.out.println(custBean1);
		System.out.println(custBean2);
		System.out.println(custBean3);
	}
}











