package com.chanti;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserBean {
	//field
	private JdbcTemplate template;  //DI in the form of Object
	//setter
	public void setTemplate(JdbcTemplate template) {
		System.out.println("UserBean.setTemplate()");
		this.template = template;
	}
	//business methods
	public void createBookTable() {
		template.execute("create table books(isbn int primary key,name varchar(40) not null,cost float not null)");
		System.out.println("Book table created successfully");
	}

}
