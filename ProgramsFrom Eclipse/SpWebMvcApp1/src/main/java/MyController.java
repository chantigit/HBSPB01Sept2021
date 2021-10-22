import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController implements Controller
{
	public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		//Constructor1:  ModelAndView(viewname)
		//Constructor2:  ModelAndView(viewname,modelkey,modelvalue)
		//case1:returning view name
		//return new ModelAndView("success");
		//case2:returning model with view name
		String parameter1 = req.getParameter("firstName");
		String parameter2 = req.getParameter("lastName");
		String myName=parameter2+" "+parameter1;
		return new ModelAndView("success","key1",myName);
	}
}