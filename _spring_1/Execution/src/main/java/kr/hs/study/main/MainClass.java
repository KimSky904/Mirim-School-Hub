package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

public class MainClass {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("t1",TestBean1.class);
		t1.method1();
		t1.method1(5); 
		t1.method1("spring 5");
		t1.method1(2,40);
		t1.method1(1,"twh");
		t1.method3();
		t1.method2();
		TestBean2 t2 = ctx.getBean(TestBean2.class);
		t2.method1();
		TestBean3 t3 = ctx.getBean(TestBean3.class);
		t3.method1();
		
		
		
		ctx.close();
		
	}
}
