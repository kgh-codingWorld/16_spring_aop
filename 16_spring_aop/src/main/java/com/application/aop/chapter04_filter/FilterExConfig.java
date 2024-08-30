package com.application.aop.chapter04_filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterExConfig {

	@Bean
    public FilterRegistrationBean<FilterEx> sampleFilter() { 										// Filter 객체생성 메서드를 생성하여 Filter기능을 구현한다.
       
        FilterRegistrationBean<FilterEx> registrationBean = new FilterRegistrationBean<>();		// Filter등록 객체 생성
        registrationBean.setFilter(new FilterEx());			 									// Filter클래스를 지정
        registrationBean.addUrlPatterns("/*"); 															// Filter를 적용할 URL 패턴 지정
        
        return registrationBean;						
    
    }
}
