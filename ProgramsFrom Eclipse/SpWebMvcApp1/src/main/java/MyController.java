import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController implements Controller
{
	public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		//case1:returning view name
		return new ModelAndView("success");
	}
}