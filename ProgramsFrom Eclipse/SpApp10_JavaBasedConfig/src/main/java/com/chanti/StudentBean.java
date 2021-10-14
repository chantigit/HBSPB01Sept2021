package com.chanti;

public class StudentBean				
{
	private int rollNumber;
	private Address address;
	
	public StudentBean() {
		System.out.println("----StudentBean.StudentBean()----");
	}

	public void setRollNumber(int rollNumber) {
		System.out.println("StudentBean.setRollNumber()");
		this.rollNumber = rollNumber;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("StudentBean.setAddress()");
		this.address = address;
	}
	

}











