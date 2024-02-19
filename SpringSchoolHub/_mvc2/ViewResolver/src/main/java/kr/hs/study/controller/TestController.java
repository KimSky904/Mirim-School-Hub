package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	@GetMapping("/test2")
	public String test2(HttpServletRequest hsr) {
//		System.out.println("data1 : "+hsr.getParameter("data1"));
//		System.out.println("data2 : "+hsr.getParameter("data2"));
		return "test2";
	}
	@GetMapping("/test3")
	public String test3(Model model) {
		model.addAttribute("data3", 300);
		model.addAttribute("data4", 400);
		return "test3";
	}
	@GetMapping("/test4")
	public ModelAndView test4(ModelAndView mv) {
		// view 이름 지정
		mv.setViewName("test4");
		
		mv.addObject("data1",1000);
		mv.addObject("data2",2000);
		
		return mv;
	}
}
