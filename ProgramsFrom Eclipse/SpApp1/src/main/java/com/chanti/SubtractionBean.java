package com.chanti;

public class SubtractionBean {
	//Dependency in the form of primitive
	private int num1,num2;
	//Constructor to inject the values to the bean object
	public SubtractionBean(int num1, int num2) {
		System.out.println("SubtractionBean.SubtractionBean(-,-)");
		this.num1 = num1;
		this.num2 = num2;
	}
	//Business Method
	public int doSub() {
		System.out.println("SubtractionBean.doSub()");
		return num1-num2;
	}
}
