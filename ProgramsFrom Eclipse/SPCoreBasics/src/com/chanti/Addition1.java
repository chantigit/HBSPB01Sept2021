package com.chanti;

public class Addition1 {
	private int num1,num2;
	
	public Addition1() {
	}
	public Addition1(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int doSum() {
		return num1+num2;
	}
	
	public static void main(String[] args) {
		Addition1 obj1=new Addition1(10,20);
		Addition1 obj2=new Addition1(100,200);
		System.out.println(obj1); //obj1.toString()
		System.out.println(obj2); //obj2.toString()
	}
}
