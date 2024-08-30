package com.application.aop.chapter04_filter.sample;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FilterExSample implements Filter { // (중요) implements Filter를 구현하여 사용
    
	@Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 필터 초기화 작업 수행
    }
    

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    
    	/*
		    
		    필터 로직 수행
		    
		    # chain.doFilter(request, response);
		    
		    doFilter 호출은 현재 필터의 처리가 끝났음을 나타내며 요청(request)과 응답(response)을 다음 필터로 넘기거나
	    	필터 체인의 마지막 필터라면 요청을 최종 목적지(즉 서비스된 리소스나 컨트롤러)로 포워딩한다.
   		
   		*/
   		chain.doFilter(request, response);
   
    }

  
    @Override
    public void destroy() {
        // 필터 종료 작업 수행
    }
  
    
}
