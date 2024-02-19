package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component //이름이 없음 <bean class="kr.hs.study.beans.TestBean1"/>과 동일
public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1의 기본생성자");
	}
}
