import org.aopalliance.intercept.*;
public class TimerAdvice implements MethodInterceptor
{
	public Object invoke(MethodInvocation mi)throws Throwable
	{
		long x=0,y=0,z=0;
		try
		{
			x=System.currentTimeMillis();
			Object o=mi.proceed();
			return o;
		}
		finally
		{
			y=System.currentTimeMillis();
			z=(y-x)/1000;
			System.out.println("Time taken="+z+"seconds");
		}
	}
}