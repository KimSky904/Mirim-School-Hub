package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/result")
	public String result() {
		return "result";
	}
	
	@GetMapping("/test1")
	public String test1() {	
		return "redirect:/result";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "forward:/result";
	}
	
}
