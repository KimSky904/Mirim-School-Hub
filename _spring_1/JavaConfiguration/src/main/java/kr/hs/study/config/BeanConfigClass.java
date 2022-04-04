package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

@Configuration //자바로 객체를 생성하라고 명령하는 설정파일임
// 여러개의 자바파일중 설정파일임을 명시
public class BeanConfigClass {
	
	//<bean class="kr.hs.study.beans.TestBean1" id="t1"/>
	@Bean //아래의 메서드를 실행해서 TestBean1의 객체를 만들거야
	public TestBean1 java1() { //java1 : 객체 이름
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	public TestBean1 java2() {
		return new TestBean1();
	}
	
	@Bean
	public TestBean1 java3() {
		return new TestBean1();
	}
	
	@Bean(name="test")
	@Lazy
	@Scope("prototype")
	public TestBean2 java4() {
		return new TestBean2();
	}
	

}
