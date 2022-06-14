package kr.hs.study.controller;
import java.awt.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.beans.SchoolBean;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {	
		return "index";
	}
	@GetMapping("/test1")
	public String test1() {	
		return "test1";
	}
	@GetMapping("/test2")
	public String test2() {	
		return "test2";
	}
	@PostMapping("/result")
	public String result(@RequestParam int value) {	
		for(int j=1;j<=9;j++) {
			System.out.println(value+" x "+j+" = "+value*j);
		}
		return "result";
	}
	@PostMapping("/result2")
	public String result2(@ModelAttribute SchoolBean bean) {	
		
		System.out.println(bean.getName()+"학생의 성적\n-----------------------");
		System.out.println(" 국어 : "+bean.getKuk());
		System.out.println(" 영어 : "+bean.getEng());
		System.out.println(" 수학 : "+bean.getMat());
		System.out.println("스프링 : "+bean.getSpr());
		System.out.println(" 총점 : "+bean.getHap());
		System.out.println(" 평균 : "+bean.getHap()/4);
		
		return "result2";
	}
}
