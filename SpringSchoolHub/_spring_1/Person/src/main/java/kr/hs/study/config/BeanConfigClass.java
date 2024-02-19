package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.Person;
import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

@Configuration
public class BeanConfigClass {
	
	@Bean(name="d1")
	public Person a() {
		return new Person("Kim",30);
	}
	
	@Bean(name="d2")
	public Person b() {
		return new Person("Lee",15);
	}
	
	@Bean(name="t1")
	public TestBean c() {
		return new TestBean();
	}
	
	
	
}
