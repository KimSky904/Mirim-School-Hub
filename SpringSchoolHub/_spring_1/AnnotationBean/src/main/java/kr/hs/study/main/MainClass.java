package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("kr/hs/study/config/config.xml");
		
//		TestBean1 obj1 = ctx.getBean("t1",TestBean1.class);
//		System.out.println("[obj1] data1 : "+obj1.getData1());
//		System.out.println("[obj1] data2 : "+obj1.getData2());
		
		
		TestBean2 obj2 = ctx.getBean("t2",TestBean2.class);
		System.out.println("[obj2] data1 : "+obj2.getData1());
		System.out.println("[obj2] data2 : "+obj2.getData2());
		
		
		TestBean3 obj4 = ctx.getBean("t3",TestBean3.class);
		System.out.println("[obj4] data1 : "+obj4.getData1());
		System.out.println("[obj4] data2 : "+obj4.getData2());
		System.out.println("[obj4] data3 : "+obj4.getData3());
		System.out.println("[obj4] data4 : "+obj4.getData4());
		
		ctx.close();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean2 obj3 = ctx2.getBean("t3",TestBean2.class);
		System.out.println("[obj3] data1 : "+obj3.getData1());
		System.out.println("[obj3] data2 : "+obj3.getData2());
		
		
		ctx2.close();
	}
}
