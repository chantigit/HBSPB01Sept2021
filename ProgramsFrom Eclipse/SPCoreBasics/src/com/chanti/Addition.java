package com.chanti;

public class Addition {
	//R1:
	private static final Addition ob=new Addition();
	//R2:
	private Addition() {}
	//R3:
	public static Addition getAdditionObject() {
		return ob;
	}
	private int num1,num2;
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}

	public int doSum() {  
		return num1+num2;
	}
	public static void main(String[] args) 
	{
		Addition obj1 = Addition.getAdditionObject();
		obj1.setNum1(10);
		obj1.setNum2(20);
		System.out.println(obj1.doSum());
	}
}
