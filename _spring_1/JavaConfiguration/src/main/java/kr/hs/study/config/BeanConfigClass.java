package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

@Configuration //�ڹٷ� ��ü�� �����϶�� ����ϴ� ����������
// �������� �ڹ������� ������������ ���
public class BeanConfigClass {
	
	//<bean class="kr.hs.study.beans.TestBean1" id="t1"/>
	@Bean //�Ʒ��� �޼��带 �����ؼ� TestBean1�� ��ü�� ����ž�
	public TestBean1 java1() { //java1 : ��ü �̸�
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
