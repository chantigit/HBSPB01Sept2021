package com.chanti;

public class AdditionBean {
	
	//Dependency in the form of primitive
	private int num1,num2;
	public AdditionBean() {
		System.out.println("AdditionBean.AdditionBean()");
	}
	//SETTERS to inject the values to the bean object
	public void setNum1(int num1) {
		System.out.println("AdditionBean.setNum1()");
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		System.out.println("AdditionBean.setNum2()");
		this.num2 = num2;
	}
	//Business Method
	public int doSum() {
		System.out.println("AdditionBean.doSum()");
		return num1+num2;
	}
}
