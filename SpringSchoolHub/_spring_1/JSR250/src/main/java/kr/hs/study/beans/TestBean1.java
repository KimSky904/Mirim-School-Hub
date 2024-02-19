package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.annotation.Resources;

public class TestBean1 {
	@Resource
	private DataBean1 data1; //container에 이름이 data1인 bean이 있을 경우 data1에 대입
	@Resource
	private DataBean2 data2;
	
	@PostConstruct
	public void testMethod1() {
		System.out.println("PreConstruct");
	}
	@PreDestroy
	public void testMethod2() {
		System.out.println("PreDestroy");
	}
	
	public TestBean1() {
		System.out.println("TestBean1의 기본 생성자");
	}
	public DataBean1 getData1() {
		return data1;
	}
	public DataBean2 getData2() {
		return data2;
	}
}
