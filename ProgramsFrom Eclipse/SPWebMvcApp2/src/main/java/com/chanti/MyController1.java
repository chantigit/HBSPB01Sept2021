package com.chanti;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController1 {

	@RequestMapping("/")   //Landing Page URL: http://localhost:8081/SPWebMvcApp2/
	public String home(Model model) {
		Student student=new Student();
		model.addAttribute("student", student);
		return "home";    //ViewName
	}
	@RequestMapping("main")   //Landing Page URL: http://localhost:8081/SPWebMvcApp2/main
	public String homeUrl() {

		return "home";    //ViewName
	}
	@RequestMapping("url1") 		//http://localhost:8081/SPWebMvcApp2/url1
	public String handler1() {

		return "view1";
	}
	@RequestMapping("url2") 		//http://localhost:8081/SPWebMvcApp2/url2
	public String handler2(HttpServletRequest req,Model model) {
		//Read data from html form
		String name = req.getParameter("personName");
		String city = req.getParameter("personCity");
		String age = req.getParameter("personAge");
		//Attaching name to view 
		//ModelAndView mav=new ModelAndView();
		//mav.addObject("key1", name);
		//mav.setViewName("person_view");
		//model.addAttribute("name", name);
		req.setAttribute("k1", name);
		req.setAttribute("k2", city);
		req.setAttribute("k3", age);
		return "person_view";
	}
	
	@RequestMapping("url3")
	public String handler3(@RequestParam String empName,@RequestParam String empAge,@RequestParam String empCity,Model m) {
		m.addAttribute("k1",empName);
		m.addAttribute("k2",empAge);
		m.addAttribute("k3",empCity);
		return "emp_view";
	}
	
	@RequestMapping("url4")
	public String handler4(@ModelAttribute Student student,Model model) {
		model.addAttribute("student", student);
		return "student_view";
	}
}







