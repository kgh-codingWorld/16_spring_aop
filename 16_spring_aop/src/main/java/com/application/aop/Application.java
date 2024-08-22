package com.application.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*

	@EnableAspectJAutoProxy
	
	- proxy (대변인,대변자) 
	- Spring Framework에게 AOP Proxy를 사용시키도록 하는 애노테이션
	
	[ 예시 ]
	
	Client > Request > Real Subject
	Client > Request > [ Proxy > Request ] > Real Subject

*/


@SpringBootApplication
@EnableAspectJAutoProxy
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
