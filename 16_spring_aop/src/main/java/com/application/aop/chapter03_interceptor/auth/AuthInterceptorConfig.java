package com.application.aop.chapter03_interceptor.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AuthInterceptorConfig implements WebMvcConfigurer {

	@Autowired
	private AuthInterceptorAdmin authInterceptorAdmin;
	
	@Autowired
	private AuthInterceptorUser authInterceptorUser;
	
	String[] adminAccessModiferList = {"/admin/*" , "/management/*"};
	String[] userAccessModiferList = {"/user/*" , "/post/*"};
	
	
	@Override
    public void addInterceptors(InterceptorRegistry registry) { // addInterceptors 메서드로 Interceptor 설정 지정
        registry.addInterceptor(authInterceptorAdmin)			// Interceptor로직을 사용할 객체를 지정
        		.order(1)                                    	// Interceptor 우선순위를 지정
                .addPathPatterns(adminAccessModiferList);		// Interceptor를 적용할 URL 패턴을 지정
                //.excludePathPatterns("/login" , "/register"); // Interceptor를 제외할 URL 패턴을 지정
   
        registry.addInterceptor(authInterceptorUser)			// Interceptor로직을 사용할 객체를 지정
				.order(2)                                    	// Interceptor 우선순위를 지정
		        .addPathPatterns(userAccessModiferList)			// Interceptor를 적용할 URL 패턴을 지정
		        .excludePathPatterns("/user/menu1" ); 			// Interceptor를 제외할 URL 패턴을 지정 (/user/menu1을 제외하고 다른 링크는 안 들어가짐)
        
	}
	
	
	
	
	
}
