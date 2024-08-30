package com.application.aop.chapter04_filter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/filter")
public class FilterTestController {

	@GetMapping("/menu1")
	@ResponseBody
	public String menu1() {
		return "filter menu1 화면입니다.";
	}
	
	@GetMapping("/menu2")
	@ResponseBody
	public String menu2() {
		return "filter menu2 화면입니다.";
	}
	
	@GetMapping("/menu3")
	@ResponseBody
	public String menu3() {
		return "filter menu3 화면입니다.";
	}
	
}
