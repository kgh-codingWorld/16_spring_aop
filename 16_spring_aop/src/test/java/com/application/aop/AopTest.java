package com.application.aop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.application.aop.chapter01_aop.Boss;
import com.application.aop.chapter01_aop.Employee;
import com.application.aop.chapter01_aop.Manager;

@SpringBootTest
public class AopTest {

	@Autowired
	private Boss boss;
	
	@Autowired
	private Manager manager;
	
	@Autowired
	private Employee employee;
	
	
	@Test
	void workTest() {
		
		boss.work();
		manager.work();
		employee.work();
		
	}
	
	@Test
	void getWorkingTimeTest() {
		
		boss.getWorkingTime();
		manager.getWorkingTime();
		employee.getWorkingTime();
		
	}
	
	@Test
	void getInfoTest() {
		boss.getInfo("사장", 1000);
		manager.getInfo("관리자", 700);
		employee.getInfo("직원", 300);
	}
	
	@Test
	void getException() {
		boss.getException();
		manager.getException();
		employee.getException();
	}
}
