package kr.hs.study.beans;

public class TestBean {
	private int a;
	private double b;
	private String c;
	private DataBean d;
	private DataBean e;
	
	public TestBean(){
		System.out.println("TestBean 기본 생성자");
	}
	public TestBean(int a,double b,String c,DataBean d,DataBean e){
		System.out.println("TestBean 매개변수가 있는 생성자");
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}
	public void Print() {
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		System.out.println("e : "+e+"\n");
	}
	
}
