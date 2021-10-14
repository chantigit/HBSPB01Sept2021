package com.chanti;

import java.util.HashMap;

public class TestApp 
{
	public static void main( String[] args )
	{
		/*
		//1.Load the config file into Sp container
		Resource resource=new ClassPathResource("spconfig.xml");  
		//Resource resource=new FileSystemResource("c:\\config\\spconfig.xml");  
		//2.Get high level object from Spring Core Container i.e BeanFactory
		BeanFactory factory=new XmlBeanFactory(resource);  
		AdditionBean ob1=(AdditionBean)factory.getBean("id1");
		System.out.println(ob1);
		System.out.println(ob1.doSum());
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		SubtractionBean ob2 =(SubtractionBean) factory.getBean("id2");
		System.out.println(ob2);
		System.out.println(ob2.doSub());
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		DobBean d1 =(DobBean) factory.getBean("dob1");
		System.out.println(d1);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		StudentBean student1 =(StudentBean) factory.getBean("student1");
		System.out.println(student1);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		VitsEngCollegeBean clg=(VitsEngCollegeBean)	factory.getBean("vits");
		clg.printStudentNames();
		System.out.println("-----------------------------------------");
		clg.printStudentRollNumbers();
		System.out.println("-----------------------------------------");
		clg.printBranchInfo();
		System.out.println("-----------------------------------------");
		clg.printBranchDetails();
		 */
		String[] split="The String is is done by saketh Saketh".split(" ");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for (int i=0; i<split.length; i++) {
			if (map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count+1);
			}
			else {
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
	}

}











