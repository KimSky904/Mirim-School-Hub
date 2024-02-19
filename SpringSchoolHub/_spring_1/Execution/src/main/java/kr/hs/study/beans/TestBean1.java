package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("method1 호출");
	}
	public void method1(int a) {
		System.out.println("int method1 호출, "+a);
	}
	public void method1(String a) {
		System.out.println("String method1 호출, "+a);
	}
	public void method1(int a,int b) {
		System.out.println("int 2개 method1 호출, "+a+" "+b);
	}
	public void method1(int a,String b) {
		System.out.println("int, String method1 호출, "+a+" "+b);
	}
	public void method1(String a,String b) {
		System.out.println("String, String method1 호출, "+a+" "+b);
	}
	public int method3() {
		System.out.println("int return method1 호출");
		return 1;
	}
	public void method2() {
		System.out.println("method2 호출");
	}
}
