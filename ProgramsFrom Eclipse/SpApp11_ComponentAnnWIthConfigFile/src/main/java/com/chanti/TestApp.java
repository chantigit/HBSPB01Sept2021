package com.chanti;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp 
{
	public static void main( String[] args )
	{
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spconfig.xml");
	
	}
}











