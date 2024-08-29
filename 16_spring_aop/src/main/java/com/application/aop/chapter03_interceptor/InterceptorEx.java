package com.application.aop.chapter03_interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class InterceptorEx implements HandlerInterceptor { // HandlerInterceptor인터페이스를 구현하여 Interceptor 클래스로 사욯한다. 
	
	/*
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle: 요청을 처리하기 전에 실행됩니다. 요청 URL: " + request.getRequestURI());
        // 인증, 권한 체크 등을 수행할 수 있음
        // return false; // 요청을 중단하고 싶을 경우
        return true; // 계속 진행하고 싶을 경우
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle: 요청을 처리한 후 실행됩니다.");
        // 컨트롤러에서 반환한 모델과 뷰를 조작할 수 있음
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion: 모든 요청 처리가 완료된 후 실행됩니다.");
        // 리소스 정리 등의 작업을 수행할 수 있음
    }
    */
}