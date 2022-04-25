package kr.hs.study.advice;	

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("before�޼ҵ� ȣ��");
	}
	public void afterMethod() {
		System.out.println("after�޼ҵ� ȣ��");
	}
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around�޼ҵ� ȣ��");
		pjp.proceed();
		System.out.println("around�޼ҵ� ȣ��");
	}
	public void afterThrowingMethod() {
		System.out.println("afterThrowingMethod�޼ҵ� ȣ��");
	}
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod�޼ҵ� ȣ��");
	}
}	
