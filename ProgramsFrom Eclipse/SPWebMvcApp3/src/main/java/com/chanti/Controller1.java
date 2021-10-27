package com.chanti;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller1 {
	
	//http://localhost:8081/SPWebMvcApp3/url1
	//@RequestMapping("/url1")
	@RequestMapping(value="/url1",method = RequestMethod.GET)
	@ResponseBody
	public String handler() {
		return "welcome";
	}
	//http://localhost:8081/SPWebMvcApp3/url2/Chanti
	@RequestMapping("/url2/{personName}")
	@ResponseBody
	public String handler(@PathVariable(value = "personName") String personName) {
		return "Your name is:"+personName;
	}
	//http://localhost:8081/SPWebMvcApp3/url3/Apple/Red/30
	@RequestMapping("/url3/{fruitName}/{fruitColor}/{fruitCost}")
	@ResponseBody
	public String handler(@PathVariable String fruitName,@PathVariable String fruitColor,@PathVariable Integer fruitCost) {
		return "Fruit Info is:"+fruitName+","+fruitColor+","+fruitCost;
	}
	//http://localhost:8081/SPWebMvcApp3/url4/{chanti}/{30}/address/{ameerpet}/{hyd}/{5000018}/account/{sbi}/{15000045}
	@RequestMapping("/url4/{name}/{age}/address/{street}/{city}/{zip}/account/{bankName}/{accountNumber}")
	@ResponseBody
	public String handler(@PathVariable Map<String,String> params) {
		
		StringBuilder sb=new StringBuilder();
		
		for(Map.Entry<String, String> e: params.entrySet())
		{
			sb.append(e.getKey()+","+e.getValue());
		}
		
		return sb.toString();
	}
	//http://localhost:8081/SPWebMvcApp3/url5/red,green,blue/orange,banana,mango
	@RequestMapping("/url5/{colorNames}/{fruitNames}")
	@ResponseBody
	public String handler(@PathVariable String[] colorNames,@PathVariable List<String> fruitNames ) {
		return "Fruit Names are:"+fruitNames+", Color Names:"+Arrays.asList(colorNames);
	}
	
	//http://localhost:8081/SPWebMvcApp3/url6/{date}/{time}
	//http://localhost:8081/SPWebMvcApp3/url6/2021-10-26/08:06:55
	@RequestMapping("/url6/{date}/{time}")
	@ResponseBody
	public String handler(
			@DateTimeFormat(pattern = "yyyy-MM-dd") @PathVariable("date") LocalDate date,
			@DateTimeFormat(pattern = "HH:mm:ss") @PathVariable("time") LocalTime time) {
		
		return "Date & Time="+date+":"+time;
	}
	
}
