package kr.hs.study.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@GetMapping("/result1/{a}/{b}/{c}")
	public String result() {
		System.out.println("a : "+a);
		return "result";
	}
}
