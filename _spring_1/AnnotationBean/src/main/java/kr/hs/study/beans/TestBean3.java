package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;

public class TestBean3 {
	private int data1;
	private String data2;
	private DataBean3 data3;
	private DataBean4 data4;
	
	// public TestBean3() {} -> 실행할 경우 기본생성자가 먼저 호출되
	// config.xml에서 context를 작성했다면 Spring이 참조형 변수를 생성자에 자동으로 넣어줌 (생성자에선 @Auto~ 생략)

	public TestBean3(@Value("200") int data1,@Value("spring222") String data2, DataBean3 data3, DataBean4 data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	public int getData1() {
		return data1;
	}
	public String getData2() {
		return data2;
	}
	public DataBean3 getData3() {
		return data3;
	}
	public DataBean4 getData4() {
		return data4;
	}
	
	
}
