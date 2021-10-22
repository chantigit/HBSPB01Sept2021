import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController1 implements Controller
{
	public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		String parameter1 = req.getParameter("city");
		String parameter2 = req.getParameter("age");
		String details="City="+parameter2+",Age= "+parameter1;
		return new ModelAndView("success1","key1",details);
	}
}