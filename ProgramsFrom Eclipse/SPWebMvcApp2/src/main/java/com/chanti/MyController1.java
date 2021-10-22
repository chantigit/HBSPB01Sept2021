package com.chanti;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController1 {

	@RequestMapping("/")   //Landing Page URL: http://localhost:8081/SPWebMvcApp2/
	public String home() {

		return "home";    //ViewName
	}
	@RequestMapping("main")   //Landing Page URL: http://localhost:8081/SPWebMvcApp2/main
	public String homeUrl() {

		return "home";    //ViewName
	}
	@RequestMapping("url1") 		//http://localhost:8081/SPWebMvcApp2/url1
	public String handler2() {

		return "view1";
	}

}
