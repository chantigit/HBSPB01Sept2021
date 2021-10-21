public class TestBean implements TestInter
{
	public void doCalc(int a,int b)
	{
		try
		{
			Thread.sleep(5000);
			int c=a/b;
			Thread.sleep(4000);
			System.out.println("result="+c);
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
}