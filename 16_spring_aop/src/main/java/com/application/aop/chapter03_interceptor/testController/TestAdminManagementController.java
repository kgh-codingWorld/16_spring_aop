package com.application.aop.chapter03_interceptor.testController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*

	// 중복코드
	HttpSession session = request.getSession(); 
	String role = (String)session.getAttribute("role");
	
	if (role == null || !role.equals("권한") ) { 
		// 권한이 없을 경우 다른곳으로 이동하는 코드
	}
	
	// 권한이 있을 경우 이동하는 코드
	return "html path";
	
*/

@Controller
@RequestMapping("/management")
public class TestAdminManagementController {

	@GetMapping("/menu1")
	@ResponseBody
	public String menu1() {
		return "management menu1 화면입니다.";
	}
	
	@GetMapping("/menu2")
	@ResponseBody
	public String menu2() {
		return "management menu2 화면입니다.";
	}
	
	@GetMapping("/menu3")
	@ResponseBody
	public String menu3() {
		return "management menu3 화면입니다.";
	}
	
}
