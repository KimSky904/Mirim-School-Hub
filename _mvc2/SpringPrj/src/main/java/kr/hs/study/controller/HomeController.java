package kr.hs.study.controller;
import java.awt.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
	@PostMapping("/resultMU")
	public String resultMU(@RequestParam int value, Model model) {
	
		String res = "";
		for(int j=1;j<=9;j++) {
			res += Integer.toString(value)+" x "+Integer.toString(j)+" = "+value*j+"\n";
		}
		model.addAttribute("data",res);
		return "resultMU";
	}
	@PostMapping("/result2MU")
	public String resultMU(@ModelAttribute SchoolBean bean, Model model) {	
				
		String res = "";
		res += bean.getName()+"학생의 성적\n-----------------------";
		res += " 국어 : "+bean.getKuk();
		res += " 영어 : "+bean.getEng();
		res += " 수학 : "+bean.getMat();
		res += "스프링 : "+bean.getSpr();
		res += " 총점 : "+bean.getHap();
		res += " 평균 : "+bean.getHap()/4;
		model.addAttribute("data", res);
		
		return "result2MU";
	}
	
	
	
	
	@PostMapping("/result")
	public ModelAndView resultMV(@RequestParam int value, ModelAndView mv) {
		mv.setViewName("result");
		String res = "";
		for(int j=1;j<=9;j++) {
			res += Integer.toString(value)+" x "+Integer.toString(j)+" = "+value*j+"\n";
		}
		mv.addObject("data",res);
		return mv;
	}
	@PostMapping("/result2")
	public ModelAndView resultMV(@ModelAttribute SchoolBean bean, ModelAndView mv) {	
		
		mv.setViewName("result2");
		
		String res = "";
		res += bean.getName()+"학생의 성적\n-----------------------";
		res += " 국어 : "+bean.getKuk();
		res += " 영어 : "+bean.getEng();
		res += " 수학 : "+bean.getMat();
		res += "스프링 : "+bean.getSpr();
		res += " 총점 : "+bean.getHap();
		res += " 평균 : "+bean.getHap()/4;
		mv.addObject("data",res);
		
		return mv;
	}
}
