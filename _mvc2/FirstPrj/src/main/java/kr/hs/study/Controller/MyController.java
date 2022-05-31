package kr.hs.study.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String test1() {
		return "index";
	}
	@GetMapping("/login")
	public String login1() {
		return "result"; 
	}
	@PostMapping("/login")
	public String login2() {
		return "result"; 
	}
}
