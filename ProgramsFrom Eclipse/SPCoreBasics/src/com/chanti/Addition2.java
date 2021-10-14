package com.chanti;

public class Addition2 {
	//R1:
	private static final Addition2 ob=new Addition2();
	//R2:
	private Addition2() {}
	//R3:
	public static Addition2 getAdditionObject() {
		return ob;
	}
	
	private int num1,num2;
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
	
	
	public static void main(String[] args) 
	{
		Addition2 obj1 = Addition2.getAdditionObject();
		Addition2 obj2 = Addition2.getAdditionObject();
		Addition2 obj3 = Addition2.getAdditionObject();
		Addition2 obj4 = Addition2.getAdditionObject();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
	}
	
	

}
