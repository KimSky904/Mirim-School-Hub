package kr.hs.study.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("충고 advice 횡단관심사");
	}
	public void adterMethod() {
		System.out.println("충고 advice 횡단관심사");
	}
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("충고 advice 횡단관심사");
		pjp.proceed();
		System.out.println("충고 advice 횡단관심사");
	}
	public void afterthrowingMethod() {
		System.out.println("충고 advice 횡단관심사");
	}
	public void afterreturningMethod() {
		System.out.println("충고 advice 횡단관심사");
	}
}
