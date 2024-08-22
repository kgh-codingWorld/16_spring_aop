package com.application.aop.chapter02_logger;

import org.springframework.stereotype.Component;

@Component
public class LoggerTestClass {
	
	public void testMethod1() {
		try {Thread.sleep(100);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public void testMethod2() {
		try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public void testMethod3() {
		try {Thread.sleep(300);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public void testMethod4() {
		try {Thread.sleep(400);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public void testMethod5() {
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
}
