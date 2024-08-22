package com.application.aop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.application.aop.chapter02_logger.LoggerTestClass;

@SpringBootTest
public class LoggerTest {

	@Autowired
	private LoggerTestClass loggerTestClass;
	
	@Test
	public void testMethod() {
		
		loggerTestClass.testMethod1();
		loggerTestClass.testMethod2();
		loggerTestClass.testMethod3();
		loggerTestClass.testMethod4();
		loggerTestClass.testMethod5();
		
	}
		
	
}
