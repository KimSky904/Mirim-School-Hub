package kr.hs.study.beans;

public class TestBean3 {
	private DataBean3 data6;
	private DataBean3 data7;
	private DataBean3 data8;
	
	public TestBean3() {
		System.out.println("TestBean3의 기본생성자");
	}
	public TestBean3(DataBean3 data6,DataBean3 data7,DataBean3 data8) {
		System.out.println("TestBean3의 매개변수가 있는 생성자");
		this.data6 = data6;
		this.data7 = data7;
		this.data8 = data8;
	}

	public void Print() {
		System.out.println("data6 : "+data6);
		System.out.println("data7 : "+data7);
		System.out.println("data8 : "+data8);
	}
	
}
