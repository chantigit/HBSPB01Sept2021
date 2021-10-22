import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController3 implements Controller
{
	public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		return new ModelAndView("success3","wish","Welcome to Controller3");
	}
}