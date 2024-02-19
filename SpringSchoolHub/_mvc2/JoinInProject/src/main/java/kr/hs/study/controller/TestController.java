package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.dto.DataBean;
import kr.hs.study.service.dataInterface;

@Controller
public class TestController {
	
	@Autowired
	private dataInterface service;
	
	@GetMapping("/user_list")
	public String user_list(Model model) {
		List<DataBean> list = service.select();
		model.addAttribute("list",list);
		return "result";
	}
	
	@GetMapping("/sign_up")
	public String sign_up() {
		return "sign_up_data";
	}
	
	@PostMapping("/sign_up_data")
	public String sign_up_data(@ModelAttribute DataBean bean, Model model) {
		service.insert(bean);
		List<DataBean> list = service.select();
		model.addAttribute("list",list);
		return "result";
	}
	
	@GetMapping("/delete_user")
	public String delete_user(@RequestParam("userId") String userId, Model model) {
		service.delete(userId);
//		List<DataBean> list = service.select();
//		model.addAttribute("list",list);
		return "result";
	}
	

}
