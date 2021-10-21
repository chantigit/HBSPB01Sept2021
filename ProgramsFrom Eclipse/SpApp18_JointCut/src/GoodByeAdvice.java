import org.springframework.aop.*;
import org.springframework.aop.framework.*;
import java.lang.reflect.*;
public class GoodByeAdvice implements AfterReturningAdvice
{
	public void afterReturning(Object returnvalue,Method m,Object args[],Object target)throws Exception
	{
		System.out.println("i am afterAdvice to "+m.getName());
	}
}