package kr.hs.study.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.beans.DataBean;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.DataBean3;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map) {
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		System.out.println(data1+", "+data2);
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2(@RequestParam Map<String, String> map,
			@RequestParam List<String> data3) {
				
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		System.out.println(data1+", "+data2);
		for(String str : data3) {
			System.out.println(str);
		}
		
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(@ModelAttribute DataBean bean) {
		// bean객체에 요청한 데이터 값을 자동주입(autowired) 해라
		System.out.println(bean.getData1());
		System.out.println(bean.getData2());
		System.out.println(bean.getData3());
		return "result";
	}
	
	@GetMapping("/test4")
	public String test4(@ModelAttribute DataBean bean) {
		// bean객체에 요청한 데이터 값을 자동주입(autowired) 해라
		System.out.println(bean.getData1());
		System.out.println(bean.getData2());
		// 배열로 받을 경우
		for(int value : bean.getData3()) {
			System.out.println(value);
		}
		return "result";
	}
	
	@GetMapping("/test4")
	public String test4(@ModelAttribute DataBean2 bean2, @ModelAttribute DataBean3 bean3) {
		System.out.println(bean2.toString());
		System.out.println(bean3.toString());
		return "result";
	}
}
