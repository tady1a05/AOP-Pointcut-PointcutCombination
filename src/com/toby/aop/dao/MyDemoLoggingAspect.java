package com.toby.aop.dao;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	/*@Before("execution(public * com.toby.aop.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("add ur mother");
	}*/
	
	@Pointcut("execution(public * com.toby.aop.dao.*.*(..))")
	private void allInDao() {}
	
	@Pointcut("execution(public * com.toby.aop.dao.*.get*(..))")
	private void getter() {}
	
	@Pointcut("execution(public * com.toby.aop.dao.*.set*(..))")
	private void setter() {}
	
	@Before("allInDao() && !(getter() || setter())")
	private void test() {
		System.out.println("nmsl");
	}
}
