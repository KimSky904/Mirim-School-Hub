package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean2;

@Configuration
@ComponentScan(basePackages = {"kr.hs.study.beans","kr.hs.study.beans2"})
public class BeanConfigClass {
	
	@Bean(name="t3")
	public TestBean2 t3() {
		return new TestBean2();
	}
	

}
