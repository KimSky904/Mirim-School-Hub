package kr.hs.study.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("��� advice Ⱦ�ܰ��ɻ�");
	}
	public void adterMethod() {
		System.out.println("��� advice Ⱦ�ܰ��ɻ�");
	}
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("��� advice Ⱦ�ܰ��ɻ�");
		pjp.proceed();
		System.out.println("��� advice Ⱦ�ܰ��ɻ�");
	}
	public void afterthrowingMethod() {
		System.out.println("��� advice Ⱦ�ܰ��ɻ�");
	}
	public void afterreturningMethod() {
		System.out.println("��� advice Ⱦ�ܰ��ɻ�");
	}
}
