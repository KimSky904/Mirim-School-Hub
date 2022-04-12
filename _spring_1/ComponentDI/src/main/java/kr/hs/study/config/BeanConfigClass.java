package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;

@Configuration
@ComponentScan(basePackages="kr.hs.study.beans")
public class BeanConfigClass {
	
	@Bean(name="obj2")
	public DataBean2 d2() {
		return new DataBean2();
	}
	@Bean(name="obj3")
	public DataBean3 d3() {
		return new DataBean3();
	}
	@Bean(name="obj4")
	public DataBean4 d4() {
		return new DataBean4();
	}
	
	
}
