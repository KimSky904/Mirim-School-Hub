package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sub2") /* 공통되는 부분 표시 */
public class TestController {
	@GetMapping("/test5")
	public String test5() {
		return "test5";
	}
//	@GetMapping("/test1")
//	public String test1() {
//		System.out.println("test");
//		return "test1";
//	}
//	@GetMapping("/sub1/test3")
//	public String test3() {
//		System.out.println("test3");
//		return "test3";
//	}
//	@GetMapping("/sub1/test4")
//	public String test4() {
//		System.out.println("test4");
//		return "test4";
//	}
//	@GetMapping("/sub2/test5")
//	public String test5() {
//		System.out.println("test5");
//		return "test5";
//	}
//	@GetMapping("/sub2/test6")
//	public String test6() {
//		System.out.println("test6");
//		return "test6";
//	}
//	@GetMapping("/sub2/test7")
//	public String test7() {
//		System.out.println("test7");
//		return "test7";
//	}
}
