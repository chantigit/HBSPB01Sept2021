import org.springframework.aop.*;
public class ExceptionAdvice implements ThrowsAdvice
{
	public void afterThrowing(Exception e)
	{
		System.out.println("i am throws advice with exception practies");
	}
	public void afterThrowing(ArithmeticException e)
	{
		System.out.println("i am arithmetic exception");
	}
}
