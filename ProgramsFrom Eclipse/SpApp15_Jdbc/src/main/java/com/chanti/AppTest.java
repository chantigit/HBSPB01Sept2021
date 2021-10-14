package com.chanti;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest 
{
    public static void main( String[] args )
    {
       System.out.println("AppTest.main()");
       
       ApplicationContext ctx=new ClassPathXmlApplicationContext("myconfig.xml");
       UserBean bean =(UserBean) ctx.getBean("id3");
       bean.createBookTable();
    }
}
