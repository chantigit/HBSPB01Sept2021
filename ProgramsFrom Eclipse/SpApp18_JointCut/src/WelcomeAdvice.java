import org.springframework.aop.*;
import org.springframework.aop.framework.*;
import java.lang.reflect.*;
public class WelcomeAdvice implements MethodBeforeAdvice
{
	public void before(Method m,Object args[],Object target)throws Exception
	{
		System.out.println("i am beforeAdvice to "+m.getName());
	}
}