
public class MyBean2 				//Outer bean
{	
	private MyBean1 myBean1;		//Inner bean property name
	//setter
	public void setMyBean1(MyBean1 myBean1) {
		System.out.println("MyBean2.setMyBean1()");
		this.myBean1 = myBean1;
	}
	//1arg- constructor
	public MyBean2(MyBean1 myBean1) {
		System.out.println("MyBean2.MyBean2(_)");
		this.myBean1 = myBean1;
	}
	//0arg- constructor
	public MyBean2() {
		System.out.println("MyBean2.MyBean2()");
	}
	//business method
	public void showMsg() {
		System.out.println("MyBean2.showMsg():: welcome to autowiring");
		myBean1.showMsg1();
	}
}
