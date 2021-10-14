package com.chanti;

import org.springframework.beans.factory.annotation.Required;

public class StudentBean				
{
	private int rollNumber;
	private float percentage;
	private String studentName;
	private DobBean dob;	
	@Required
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
	public void setDob(DobBean dob) {
		System.out.println("StudentBean.setDob()");
		this.dob = dob;
	}
	public StudentBean(DobBean dob) {
		System.out.println("StudentBean.StudentBean(-)");
		this.dob = dob;
	}
	//toString()
	@Override
	public String toString() {
		return "StudentBean [rollNumber=" + rollNumber + ", percentage=" + percentage + ", studentName=" + studentName
				+ ", dob=" + dob + "]";
	}
	


}
