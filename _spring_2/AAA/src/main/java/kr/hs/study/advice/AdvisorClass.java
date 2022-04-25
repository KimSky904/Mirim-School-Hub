package kr.hs.study.advice;	

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("before메소드 호출");
	}
	public void afterMethod() {
		System.out.println("after메소드 호출");
	}
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around메소드 호출");
		pjp.proceed();
		System.out.println("around메소드 호출");
	}
	public void afterThrowingMethod() {
		System.out.println("afterThrowingMethod메소드 호출");
	}
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod메소드 호출");
	}
}	
