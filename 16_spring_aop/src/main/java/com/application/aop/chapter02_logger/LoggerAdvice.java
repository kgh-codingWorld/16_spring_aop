package com.application.aop.chapter02_logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/* 

	# 스프링부트 로깅 구현방법 

	1) build.gradle 파일에서 관련 의존성 확인 
	
	  -  스프링부트에 이미 logback,log4j,slf4j관련 모듈이 포함되어 있다.
	
	
	2) src/main/resources경로 아래 logback.xml 파일을 생성하고 로그 관련 설정을 지정한다.
	
	
	3) 로그를 사용하고 싶은 클래스 안에 Logger 객체를 생성하고 사용한다.
		
		import org.slf4j.Logger;
		import org.slf4j.LoggerFactory;
	
	 	private static final Logger logger = LoggerFactory.getLogger(클래스이름.class);
	
*/

@Aspect
@Component
public class LoggerAdvice {

	private static final Logger logger = LoggerFactory.getLogger(LoggerAdvice.class);
	
	@Around("execution(public void com.application.aop.chapter02_logger.LoggerTestClass.*())")
	public void aroundLoggerTest(ProceedingJoinPoint pjp) throws Throwable {
		
		long startTime = System.currentTimeMillis();
		pjp.proceed();
		long endTime = System.currentTimeMillis();
		
		System.out.println(pjp.getSignature().getName() + " 메서드 동작시간 : " + (endTime - startTime) / 1000.0 + "초");
		logger.trace(pjp.getSignature().getName() + " 메서드 동작시간 : " + (endTime - startTime) / 1000.0 + "초");
		logger.debug(pjp.getSignature().getName() + " 메서드 동작시간 : " + (endTime - startTime) / 1000.0 + "초");
		logger.info(pjp.getSignature().getName() + " 메서드 동작시간 : " + (endTime - startTime) / 1000.0 + "초");
		logger.warn(pjp.getSignature().getName() + " 메서드 동작시간 : " + (endTime - startTime) / 1000.0 + "초");
		logger.error(pjp.getSignature().getName() + " 메서드 동작시간 : " + (endTime - startTime) / 1000.0 + "초");
		
	}
	
	
	
}

