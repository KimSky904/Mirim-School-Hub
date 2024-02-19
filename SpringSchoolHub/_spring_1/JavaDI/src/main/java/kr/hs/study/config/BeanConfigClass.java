package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;

@Configuration
public class BeanConfigClass {

	
	@Bean
	public TestBean1 t1() {
		TestBean1 t1 = new TestBean1(100,"spring1",new DataBean1());
		return t1;
	}
	
	
	@Bean
	public TestBean1 t2() {
		TestBean1 t2  = new TestBean1();
		t2.setData1(400);
		t2.setData2("spring4");
		t2.setData3(new DataBean1());
		return t2;
	}
	
}
