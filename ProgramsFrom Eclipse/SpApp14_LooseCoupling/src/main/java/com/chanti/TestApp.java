package com.chanti;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestApp 
{
	public static void main( String[] args )
	{
		
		Resource resource=new ClassPathResource("spconfig.xml");  
		BeanFactory factory=new XmlBeanFactory(resource);  
		Traveller chanti =(Traveller) factory.getBean("traveller");
		chanti.startJourney();
		
	}

}











