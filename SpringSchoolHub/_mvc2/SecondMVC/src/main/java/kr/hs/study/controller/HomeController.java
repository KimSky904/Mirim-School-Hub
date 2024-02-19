package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String home() {
		System.out.println("home");
		return "index";
	}
	
	@RequestMapping(value = "/add",method = RequestMethod.GET)
	public String add() {
		System.out.println("add");
		
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		return "add";
	}
}
