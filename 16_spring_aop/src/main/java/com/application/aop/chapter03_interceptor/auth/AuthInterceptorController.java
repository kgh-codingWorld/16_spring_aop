package com.application.aop.chapter03_interceptor.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/auth")
public class AuthInterceptorController {

	@GetMapping("/login") // localhost/auth/login으로 요청시 매핑
	public String login() {
		return "login";
	}
	
	@PostMapping("/login") // login.html파일에서 submit실행시 매핑
	public String login(HttpServletRequest request, @RequestParam("role") String role) {
		
		HttpSession session = request.getSession();
		
		if(role.equals("user")) {
			session.setAttribute("role", "user"); 	// session 객체의 권한 속성에 user 데이터를 저장
		} else if(role.equals("admin")) {
			session.setAttribute("role", "admin"); 	// session 객체의 권한 속성에 admin 데이터를 저장
		}
		
		System.out.println("session role : " + session.getAttribute("role"));
		
		return "redirect:/auth/main";
	}
	
	@GetMapping("/main")
	public String main() {
		return "main";
	}
	
	@GetMapping("/logout") // localhost/auth/logout으로 요청시 매핑
	public String logout(HttpServletRequest request) {
		
		HttpSession session = request.getSession(); // session객체를 생성	
		session.invalidate();      					// session객체의 권한 속성을 삭제한다.
		return "redirect:/auth/login";  			// 로그인페이지로 이동한다.
		
	}
	
	

}
