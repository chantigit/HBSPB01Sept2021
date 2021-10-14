package com.chanti;

import org.springframework.beans.factory.annotation.Autowired;
//@Autowired can be used in 3 levels :::  1.Field Level 2.Setter Level  3.Constructor Level
public class StudentBean				
{
	private int rollNumber;
	private float percentage;
	private String studentName;
	@Autowired		//==========>   autowire="byName" 	 :: FIELD INJECTION / AUTOWIRING
	private DobBean dob;				
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
	//@Autowired			//==========>   autowire="byType"    or  autowire="autodetect"
	/*public void setDob(DobBean dob) {
		System.out.println("StudentBean.setDob()");
		this.dob = dob;
	}*/
	//@Autowired           //==========>   autowire="constructor"   or  autowire="autodetect"
	/*public StudentBean(DobBean dob) {
		System.out.println("StudentBean.StudentBean(-)");
		this.dob = dob;
	}*/
	//toString()
	@Override
	public String toString() {
		return "StudentBean [rollNumber=" + rollNumber + ", percentage=" + percentage + ", studentName=" + studentName
				+ ", dob=" + dob + "]";
	}
	


}
