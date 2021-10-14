package com.chanti;

public final class Addition3 {
	
	private final int num1,num2;
	public Addition3(int num1, int num2) {
		this.num1 = num1;
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
		Addition3 ob=new Addition3(10,20);
		System.out.println(ob.getNum1());
		System.out.println(ob.getNum2());
		System.out.println(ob.doSum());
		
		Addition3 ob1=new Addition3(100,200);
	}
	
	

}
