package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 t1 = ctx.getBean("abc",TestBean1.class);
		System.out.println("t1 : "+t1);
		
		TestBean1 t2 = ctx.getBean("abc",TestBean1.class);
		System.out.println("t2 : "+t2);
		
		
		ctx.close();
		
	}

}
