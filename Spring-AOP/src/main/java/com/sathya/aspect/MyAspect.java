package com.sathya.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class MyAspect {
	@Pointcut("execution(*  com.sathya.service..*.deposit(..))")
	private void  ok() {
	}
	
	@Before("ok()")
	public  void  doBeforeLogging(JoinPoint  jp) {
		String businessMethodName = jp.getSignature().getName();
		Object[]  arguments=jp.getArgs();
		System.out.println("Before Logging on :"+businessMethodName+" with arguments values :"+arguments[0]+","+arguments[1]);
	}
	
	@After("ok()")
	public  void  doAfterLogging(JoinPoint  jp) {
		String businessMethodName = jp.getSignature().getName();
		Object[]  arguments=jp.getArgs();
		System.out.println("After Logging on :"+businessMethodName+" with arguments values :"+arguments[0]+","+arguments[1]);
	}
}









