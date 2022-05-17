package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;

public class TestBean2 {
	
//  기본형에는 autowired 불가
//	@Autowired
//	private int a;
	
	@Autowired
	@Qualifier("d1") //이름이 d1인 bean을 찾아서 data1에 자동주입해라
	private DataBean1 data1; //container에 DataBean1타입의 객체(bean)가 존재할 경우 자동주입
	@Autowired
	@Qualifier("d2")
	private DataBean2 data2; //container에 DataBean2타입의 객체(bean)가 존재할 경우 자동주입
	
	
	public TestBean2() {}
	
	
	public TestBean2(DataBean1 data1, DataBean2 data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	public DataBean1 getData1() {
		return data1;
	}
	public DataBean2 getData2() {
		return data2;
	}
	
	
	
}
