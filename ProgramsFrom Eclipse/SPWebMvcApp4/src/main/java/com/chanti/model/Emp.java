package com.chanti.model;

public class Emp {
	private int id;    
	private String name;    
	private float salary;    
	private String designation;
	//create table sevenamdb1.emp(id int primary key auto_increment,name varchar(20) not null,salary float not null,designation varchar(20) not null)
	public Emp() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Emp(int id, String name, float salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	} 
	
}
