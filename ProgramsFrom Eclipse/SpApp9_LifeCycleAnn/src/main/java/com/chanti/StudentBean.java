package com.chanti;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Scope("singleton")
//@Scope("prototype")
//@Scope("request")
//@Scope("session")
//@Scope("application")
public class StudentBean				
{
	private int rollNumber;
	private float percentage;
	private String studentName;
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public StudentBean() {
		System.out.println("StudentBean.StudentBean()");
	}

	@PostConstruct
	public void myInit() {
		System.out.println("StudentBean.myInit()");
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("StudentBean.myDestroy()");
	}
}











