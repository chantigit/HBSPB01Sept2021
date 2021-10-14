package com.chanti;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//@ComponentScan(basePackages = "com.chanti")
//@ComponentScan(basePackages = {"com.chanti","com.yakub"})
//@ComponentScan("com.chanti")
//@ComponentScan({"com.chanti","com.yakub"})
@ComponentScan(basePackages = {"com.chanti"}, 
	excludeFilters={  @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, value=NotNeededBean.class)})
public class TestApp 
{
	public TestApp() {
		System.out.println("TestApp.TestApp()");
	}
	
	public static void main( String[] args )
	{
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(TestApp.class);
		EmployeeBean emp1=ctx.getBean(EmployeeBean.class);
		emp1.showEmpInfo();
	
	}
}











