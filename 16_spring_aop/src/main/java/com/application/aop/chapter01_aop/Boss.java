package com.application.aop.chapter01_aop;

import org.springframework.stereotype.Component;

// 테스트 클래스
@Component // Spring이 사용하는 Bean으로 등록하기 위해 사용한다.
public class Boss {

	public void work() {
		System.out.println("사장의 일을 한다.");
	}
	
	public void getWorkingTime() {
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public String getInfo(String title, int salary) {
		
		return "(return) title : " + title + " / salary : " + salary;
	}
	
	public void getException() {
		
		//System.out.println(0/0);
		throw new ArithmeticException();
	}
}
