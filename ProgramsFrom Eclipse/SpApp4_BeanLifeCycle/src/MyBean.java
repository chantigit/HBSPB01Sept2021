public class MyBean 
{	
	private int x;
	private String y;
	//0arg- constructor
	public MyBean() {
		System.out.println("MyBean.MyBean()");
	}
	//business method
	public void showMsg() {
		System.out.println("MyBean.showMsg():: welcome to autowiring");
	}

	public void setX(int x) {
		System.out.println("MyBean.setX()");
		this.x = x;
	}
	public void setY(String y) {
		System.out.println("MyBean.setY()");
		this.y = y;
	}
	//Life Cycle methods
	public void myAfterPropertiesSet() throws Exception {
		System.out.println("MyBean.afterPropertiesSet()");
	}
	public void myDestroy() throws Exception {
		System.out.println("MyBean.destroy()");
	}
}
