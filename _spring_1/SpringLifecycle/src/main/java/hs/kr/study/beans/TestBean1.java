package hs.kr.study.beans;

public class TestBean1 {
	public TestBean1(){
		System.out.println("TestBean1의 기본생성자");
	}
	public void initMethod() {
		System.out.println("init method 호출");
	}
	public void destroyMethod() {
		System.out.println("destroy method 호출");
	}
}
