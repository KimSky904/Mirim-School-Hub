package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean obj1 = ctx.getBean("t1",TestBean.class);
		System.out.println(obj1.getP1().getName()+"   "+obj1.getP1().getAge());
		System.out.println(obj1.getP2().getName()+"   "+obj1.getP2().getAge()+"\n");
		ctx.close();
		
		
		/*
		GenericXmlApplicationContext ctx2 = new GenericXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean obj2 = ctx2.getBean("t2",TestBean.class);
		System.out.println(obj2.getP1().getName()+"   "+obj2.getP1().getAge());
		System.out.println(obj2.getP2().getName()+"   "+obj2.getP2().getAge());
		ctx2.close();
		*/
	}
}
