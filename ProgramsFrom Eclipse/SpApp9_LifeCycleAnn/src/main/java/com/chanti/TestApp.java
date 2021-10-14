package com.chanti;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp 
{
	public static void main( String[] args )
	{
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
		StudentBean bean1=(StudentBean) ctx.getBean("student1");
		System.out.println(bean1);
		StudentBean bean2=(StudentBean) ctx.getBean("student1");
		System.out.println(bean2);
		ctx.close();
	}
}











