package com.application.aop.chapter01_aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*

	# 스프링부트 AOP 구현방법

	1) build.gradle 파일에 AOP 의존성을 추가한다.
	  
		// AOP
		implementation 'org.springframework.boot:spring-boot-starter-aop' 
	
	
	2) Application 클래스에 어노테이션을 추가한다.
	
		@EnableAspectJAutoProxy
	
	
	3) Advice 클래스에 @Component 및 @Aspect 어노테이션을 지정하고 사용한다.
		
		@Component
		@Aspect

*/

@Component
@Aspect
public class AopAdvice {
	
	@Pointcut("execution(public void com.application.aop.chapter01_aop.*.work())") // 중복되는 execution 명시자를 작성한다.
	public void abcde() {
		// 메서드 안에서 특정 동작은 하지 않음
	}

	// 메서드 호출 전
	@Before("execution(public void com.application.aop.chapter01_aop.*.work())")
	//@Before("abcde()")
	public void beforeWork() {
		System.out.println("(공통기능 , Before) 출근한다.");
	}

	// 메서드 호출 후
	@After("execution(public void com.application.aop.chapter01_aop.*.work())")
	//@After("abcde()")
	public void afterWork() {
		System.out.println("(공통기능 , After) 퇴근한다.\n");
	}

	// 메서드 호출 전후
	@Around("execution(public void com.application.aop.chapter01_aop.*.getWorkingTime())")
	public void aroundGetWorkingTime(ProceedingJoinPoint pjp) throws Throwable {

		// 메서드 호출 전
		long startTime = System.currentTimeMillis();

		// ProceedingJoinPoint객체의 proceed(); 메서드를 사용하여 타겟팅 메서드를 실행한다.
		pjp.proceed();

		// 메서드 호출 후
		long endTime = System.currentTimeMillis();

		System.out.println("업무 소요(메서드 실행)시간 : " + (endTime - startTime) / 1000.0 + "초");

	}

	// getInfo(..): 진짜 아무거나
	// 타켓팅 메서드가 예외없이 정상적으로 실행된 후 //getInfo(*,*)도 가능
	@AfterReturning(value="execution(public String com.application.aop.chapter01_aop.*.getInfo(String,int))", returning="returnObj")
	public void afterReturningGetInfo(JoinPoint jp, Object returnObj) { // import org.aspectj.lang.JoinPoint;

		/*
			  
			  # 기능 설명
			  
			  value: com.application.aop.chapter01_aop 패키지 내의 getInfo 메소드가 실행된 후에 이 어드바이스가
			  적용된다.
			  
			  returning: returnObj라는 이름으로 리턴 값을 참조한다. 어드바이스 메소드의 파라미터로 지정된 returnObj를 통해 리턴
			  값을 참조할 수 있다.
			  
			  JoinPoint : 메소드의 파라미터에 접근할 수 있다.
			  
			  jp.getArgs() : 메소드의 인수 배열을 반환한다.
			  
			  jp.getSignature().getName() : 메소드의 이름을 가져온다.
			  
			  jp.getTarget(): 메소드를 실행한 대상 객체를 가져온다.
		  
		  
		 */
		System.out.println("\n - get Info - \n");
		System.out.println("target object : " + jp.getTarget()); 				// 대상 객체를 반환
		System.out.println("method name : " + jp.getSignature().getName()); 	// 어드바이즈메서드에 대한 설명(description) 반환
		System.out.println("parameters : " + Arrays.toString(jp.getArgs())); 	// 메서드의 파라미터를 반환
		System.out.println("return : " + returnObj);							// 메서드의 return 데이터를 반환
		System.out.println();
	}
	
	// 타겟팅 메서드에서 예외 발생 후
	@AfterThrowing("execution (* com.application.aop.chapter01_aop.*.getException())")
	public void afterThrowingGetInfo() {
		
		System.out.println("(@AfterThrowing)메서드 호출 / 로깅 및 롤백로직 사용 등");
		System.out.println();
	}

}
