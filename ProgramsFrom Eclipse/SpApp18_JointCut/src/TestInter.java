public interface TestInter
{
	void sayHello();
	void sayBye();
	

	void getData();
	void getMyData();
}

//say*   			=>   	NameMatchMethodPointcut
//do*				=>		NameMatchMethodPointcut
//.*get.+Data		=>		JdkRegexpMethodPointcut

