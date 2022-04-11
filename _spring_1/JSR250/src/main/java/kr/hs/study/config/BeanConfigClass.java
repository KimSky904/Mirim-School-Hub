package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean1;

@Configuration
public class BeanConfigClass {
	@Bean(name="data1")
	public DataBean1 d1() {
		return new DataBean1();
	}
	@Bean(name="data2")
	public DataBean2 data2() {
		return new DataBean2();
	}
	@Bean(name="t1")
	public TestBean1 d3() {
		return new TestBean1();
	}
}
