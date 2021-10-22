import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController2 implements Controller
{
	public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		return new ModelAndView("success2","wish","How are you");
	}
}