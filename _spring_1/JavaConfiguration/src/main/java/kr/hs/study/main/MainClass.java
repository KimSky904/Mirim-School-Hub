package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		
		//설정파일 : BeanConfigClass
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 obj1 = ctx.getBean("java1",TestBean1.class);
		System.out.println("obj1 : "+obj1);
		
		TestBean1 obj2 = ctx.getBean("java2",TestBean1.class);
		System.out.println("obj2 : "+obj2);
		
		TestBean1 obj3 = ctx.getBean("java3",TestBean1.class);
		System.out.println("obj3 : "+obj3);
		
	}
}
