package com.chanti;

public class StudentBean				//OuterBean 
{
	//Dependency in the form of primitive
	private int rollNumber;
	private float percentage;
	//Dependency in the form of String
	private String studentName;
	//Dependency in the form of Objective  
	private DobBean dob;				//InnerBean
	//Setter injection
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setDob(DobBean dob) {
		this.dob = dob;
	}
	//toString()
	@Override
	public String toString() {
		return "StudentBean [rollNumber=" + rollNumber + ", percentage=" + percentage + ", studentName=" + studentName
				+ ", dob=" + dob + "]";
	}
	


}
