package com.application.aop.chapter03_interceptor.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // 스프링 애플리케이션 설정 클래스로 등록한다.
public class InterceptorSampleConfig implements WebMvcConfigurer {   // WebMvcConfiguerer 인터페이스를 구현하여 Interceptor 설정 클래스로 사용한다.
	
	/*
    @Autowired
    private InterceptorSample interceptorSample;	// Interceptor로직을 사용할 객체생성

    @Override
    public void addInterceptors(InterceptorRegistry registry) { // addInterceptors 메서드로 Interceptor 설정 지정
        registry.addInterceptor(interceptorSample)			 	// Interceptor로직을 사용할 객체를 지정
        		.order(1)                                    	// Interceptor 우선순위를 지정
                .addPathPatterns("/**") 					 	// Interceptor를 적용할 URL 패턴을 지정
                .excludePathPatterns("/login", "/register"); 	// Interceptor를 제외할 URL 패턴을 지정
    }
	*/
	
}
