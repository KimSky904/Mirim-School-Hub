package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;

@Configuration
public class BeanConfigClass {

	@Bean(name="abc")
	@Lazy
	@Scope("prototype")
	public TestBean1 t1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
}
