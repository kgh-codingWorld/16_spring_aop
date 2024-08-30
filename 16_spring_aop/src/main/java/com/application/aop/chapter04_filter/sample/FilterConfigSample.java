package com.application.aop.chapter04_filter.sample;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration																							// Filter 설정 클래스로 지정
public class FilterConfigSample {
	/*
    @Bean
    public FilterRegistrationBean<FilterExSample> sampleFilter() { 										// Filter 객체생성 메서드를 생성하여 Filter기능을 구현한다.
       
        FilterRegistrationBean<FilterExSample> registrationBean = new FilterRegistrationBean<>();		// Filter등록 객체 생성
        registrationBean.setFilter(new FilterExSample());			 									// Filter클래스를 지정
        registrationBean.addUrlPatterns("/*"); 															// Filter를 적용할 URL 패턴 지정
        
        return registrationBean;						
    
    }
    */
  
    
}